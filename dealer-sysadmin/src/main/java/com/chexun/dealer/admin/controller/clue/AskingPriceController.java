package  com.chexun.dealer.admin.controller.clue;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chexun.base.common.util.string.StringUtils;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.carinfo.mongo.bean.CarBrandMongo;
import com.chexun.carinfo.mongo.bean.CarModelMongo;
import com.chexun.carinfo.mongo.bean.CarSeriesMongo;
import com.chexun.carinfo.mongo.service.CarInfoService;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.service.clue.AskingPriceService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.vo.clue.AskingPriceVo;

@Controller
@RequestMapping("/admin/clue/askingprice")
public class AskingPriceController extends MBaseController {

	private static final Logger logger = Logger.getLogger(AskingPriceController.class);

	@Autowired
	private AskingPriceService askingPriceService;
	@Autowired
	private CarInfoService carInfoService;

	// 路径
	private String toList = "/admin/clue/askingprice_list.httl";// 列表页
	//private String toAdd = "/admin/clue/askingprice_add.httl";// 添加页面
	//private String toEdit = "/admin/clue/askingprice_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(AskingPriceVo query, @ModelAttribute("page") PageEntity page,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new AskingPriceVo();
			}
			Long state = query.getState();
			if(query.getState() != null && query.getState().intValue() == -1){
				query.setState(null);
				state = -1L;
			}
		
			dealTime(query);
			List<AskingPricePo> list = askingPriceService.queryAskingPriceByPage(query, page);
			askingPriceService.fillCityName(list);
			fillModelName(list);
			//查询已处理
			query.setState(1L);	
			Integer replyCount = askingPriceService.getAskingPriceCount(query);
			
			//查询全部 
			query.setState(null);	
			Integer tatalCount = askingPriceService.getAskingPriceCount(query);
			
			replyCount = (replyCount != null && replyCount > 0)?replyCount:0;
			tatalCount = (tatalCount != null && tatalCount > 0)?tatalCount:0;
			
			//未处理数
			Integer unReplyCount = tatalCount - replyCount;
			unReplyCount = (unReplyCount != null && unReplyCount > 0)?unReplyCount:0;
			modelAndView.addObject("state", state);
			modelAndView.addObject("tatalCount", tatalCount);
			modelAndView.addObject("replyCount", replyCount);
			modelAndView.addObject("unReplyCount", unReplyCount);
			modelAndView.addObject("query", query);
			modelAndView.addObject("askingPriceList", list);
			modelAndView.addObject("sourceList", getSourceList());
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("AskingPriceController.listAll", e);
			return getErrorView("AskingPriceController.listAll", e);
		}
		return modelAndView;
	}
	
	//处理开始结束时间
	private void dealTime(AskingPriceVo query){
		if(query != null){
			if(StringUtils.isNotEmpty(query.getTimeStart())){
				query.setTimeStart(query.getTimeStart().trim());
			}
			if(StringUtils.isNotEmpty(query.getTimeStart())){
				query.setTimeStart(query.getTimeStart().trim().substring(0, 10) + " 00:00:00");
			}
			if(StringUtils.isNotEmpty(query.getTimeEnd())){
				query.setTimeEnd(query.getTimeEnd().trim());
			}
			if(StringUtils.isNotEmpty(query.getTimeEnd())){
				query.setTimeEnd(query.getTimeEnd().trim().substring(0, 10) + " 23:59:59");
			}
		}		
	}
	
	private void fillModelName(List<AskingPricePo> list){
		if(list == null || list.size() <= 0){
			return;
		}
		for(AskingPricePo app:list){
			if(app.getModelid() != null){
				CarModelMongo model = carInfoService.getModelById(app.getModelid().intValue());
				if(model == null){
					continue;
				}
				String year = model.getYearName()!= null?model.getYearName()+"款":"";
				app.setModelname(year + model.getName());
				if(model.getSeries() != null){
					CarSeriesMongo series = carInfoService.getSeriesById(model.getSeries());
					if(series == null){
						continue;
					}
					app.setSeriesname(series.getName());
				}
				if(model.getBrandId() != null){
					CarBrandMongo brand = carInfoService.getBrandById(model.getBrandId());
					if(brand == null){
						continue;
					}
					app.setBrandname(brand.getName());
				}
			}
		}
	}
	
	//从表中获取来源
	private List<String> getSourceList(){
		List<String> sourceList = null;
		List<String> originalSourceList = askingPriceService.querySourceList();
		if(originalSourceList != null && originalSourceList.size() > 0){
			sourceList = new ArrayList<String>();
			for(String source : originalSourceList){
				if(source != null 
						&& ! source.equals("9") 
						&& ! source.endsWith("201") 
						&& ! source.equals("202") 
						&& ! source.equals("null") 
						&& ! source.equals("")){
					sourceList.add(source);
				}
			}
		}
		return sourceList;
	}

	/*
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("AskingPriceController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			AskingPrice askingPrice = askingPriceService.getAskingPriceById(id);
			modelAndView.addObject(askingPrice);
		} catch (Exception e) {
			logger.error("AskingPriceController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(AskingPrice askingPrice, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(askingPrice.getId())){
//				//askingPrice.setMtime(new Date());
//				if (seuser != null) {
//					//askingPrice.setMuser(String.valueOf(seuser.getId()));
//				}
//				askingPriceService.updateAskingPriceByObj(askingPrice);
//			}else{
//				//askingPrice.setCtime(new Date());
//				//askingPrice.setMtime(new Date());
//				if (seuser != null) {
//					//askingPrice.setCuser(String.valueOf(seuser.getId()));
//					//askingPrice.setMuser(String.valueOf(seuser.getId()));
//				}
//				askingPriceService.addAskingPrice(askingPrice);
//			}
		} catch (Exception e) {
			logger.error("AskingPriceController.edit", e);
		}
		return new RedirectView("/manage/clue/askingprice/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, AskingPrice query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/clue/askingprice/list");
		String[] idArray = ids.split(",");
		AskingPrice askingPrice = new AskingPrice();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					askingPrice.setId(Long.valueOf(id));
					//askingPrice.setStatus(AskingPrice.DELETE_STATUS);
					this.askingPriceService.updateAskingPriceByObj(askingPrice);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("AskingPriceController.delete", e);
		}
		return rv;
	}*/
	
}
