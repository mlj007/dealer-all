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
import com.chexun.dealer.po.clue.BespeakOrderPo;
import com.chexun.dealer.service.clue.BespeakOrderService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.vo.clue.BespeakOrderVo;

@Controller
@RequestMapping("/admin/clue/bespeakorder")
public class BespeakOrderController extends MBaseController {

	private static final Logger logger = Logger.getLogger(BespeakOrderController.class);

	@Autowired
	private BespeakOrderService bespeakOrderService;
	@Autowired
	private CarInfoService carInfoService;

	// 路径
	private String todriveList = "/admin/clue/drivebespeak_list.httl";//预约试驾列表页
	/*
	private String tomaintainList = "/admin/clue/drivebespeak_list.httl";// 列表页
	private String toAdd = "/admin/clue/drivebespeak_add.httl";// 添加页面
	private String toEdit = "/admin/clue/drivebespeak_edit.httl";// 修改页*/

	@RequestMapping("/drivelist")
	public ModelAndView drivelistAll(BespeakOrderVo query, @ModelAttribute("page") PageEntity page,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView(todriveList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new BespeakOrderVo();
			}
			Long state = query.getState();
			if(query.getState() != null && query.getState().intValue() == -1){
				query.setState(null);
				state = -1L;
			}
			query.setType(1l);//试驾预约
			dealTime(query);
			List<BespeakOrderPo> list = bespeakOrderService.queryBespeakOrderByPage(query, page);
			bespeakOrderService.fillCityName(list);
			fillModelName(list);
			//查询已处理
			query.setState(1L);	
			Integer replyCount = bespeakOrderService.getBespeakOrderCount(query);
			
			//查询全部 
			query.setState(null);	
			Integer tatalCount = bespeakOrderService.getBespeakOrderCount(query);
			
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
			modelAndView.addObject("bespeakOrderList", list);
			modelAndView.addObject("sourceList", getSourceList());
			modelAndView.addObject("page", page);
			
		} catch (Exception e) {
			logger.error("BespeakOrderController.listAll", e);
			return getErrorView("BespeakOrderController.listAll", e);
		}

		return modelAndView;
	}
	
	
	//处理开始结束时间
	private void dealTime(BespeakOrderVo query){
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
	
	private void fillModelName(List<BespeakOrderPo> list){
		if(list == null || list.size() <= 0){
			return;
		}
		for(BespeakOrderPo app:list){
			if(app.getModelId() != null){
				CarModelMongo model = carInfoService.getModelById(app.getModelId().intValue());
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
		List<String> originalSourceList = bespeakOrderService.querySourceList();
		if(originalSourceList != null && originalSourceList.size() > 0){
			sourceList = new ArrayList<String>();
			for(String source : originalSourceList){
				if(source != null && ! source.equals("9") && ! source.endsWith("201") && ! source.equals("202")){
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
			logger.error("BespeakOrderController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			BespeakOrder bespeakOrder = bespeakOrderService.getBespeakOrderById(id);
			modelAndView.addObject(bespeakOrder);
		} catch (Exception e) {
			logger.error("BespeakOrderController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(BespeakOrder bespeakOrder, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(bespeakOrder.getId())){
//				//bespeakOrder.setMtime(new Date());
//				if (seuser != null) {
//					//bespeakOrder.setMuser(String.valueOf(seuser.getId()));
//				}
//				bespeakOrderService.updateBespeakOrderByObj(bespeakOrder);
//			}else{
//				//bespeakOrder.setCtime(new Date());
//				//bespeakOrder.setMtime(new Date());
//				if (seuser != null) {
//					//bespeakOrder.setCuser(String.valueOf(seuser.getId()));
//					//bespeakOrder.setMuser(String.valueOf(seuser.getId()));
//				}
//				bespeakOrderService.addBespeakOrder(bespeakOrder);
//			}
		} catch (Exception e) {
			logger.error("BespeakOrderController.edit", e);
		}
		return new RedirectView("/manage/clue/bespeakorder/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, BespeakOrder query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/clue/bespeakorder/list");
		String[] idArray = ids.split(",");
		BespeakOrder bespeakOrder = new BespeakOrder();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					bespeakOrder.setId(Long.valueOf(id));
					//bespeakOrder.setStatus(BespeakOrder.DELETE_STATUS);
					this.bespeakOrderService.updateBespeakOrderByObj(bespeakOrder);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("BespeakOrderController.delete", e);
		}
		return rv;
	}*/
}
