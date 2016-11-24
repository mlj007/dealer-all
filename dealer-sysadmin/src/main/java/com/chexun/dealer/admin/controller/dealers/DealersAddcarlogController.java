package  com.chexun.dealer.admin.controller.dealers;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.DealersAddcarlog;
import com.chexun.dealer.service.dealers.DealersAddcarlogService;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/dealer/addcarlog")
public class DealersAddcarlogController  extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealersAddcarlogController.class);

	@Autowired
	private DealersAddcarlogService dealersAddcarlogService;

	// 路径
	private String toList = "/report/dealersaddcarlog_list.httl";// 列表页
	private String toAdd = "/report/dealersaddcarlog_add.httl";// 添加页面
	private String toEdit = "/report/dealersaddcarlog_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, DealersAddcarlog query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersAddcarlog();
			}
			List<DealersAddcarlog> list = dealersAddcarlogService.getDealersAddcarlogPage(query,page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersAddcarlogList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersAddcarlogController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("DealersAddcarlogController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			DealersAddcarlog dealersAddcarlog = dealersAddcarlogService.getDealersAddcarlogById(id);
			modelAndView.addObject(dealersAddcarlog);
		} catch (Exception e) {
			logger.error("DealersAddcarlogController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public String save(DealersAddcarlog dealersAddcarlog,String backcash,String hirecash, HttpServletRequest request) {
		String callback = request.getParameter("callback");
		String jsonString = "";
		Long ret = -1L;
		try {
			Double back=Double.valueOf(backcash);
			Double hire=Double.valueOf(hirecash);
			int count = 0;
			if (back < 0 && hire < 0){
	            back = -back;hire = -hire;
	        }if (back >= hire || back<0 || hire<0){
	            count =(int)(back / hire); 
	        }else{
	            count =(int)(hire / back); count *= -1;
	        }
	        BigDecimal backcashBigDecimal = BigDecimal.valueOf(back);
			BigDecimal hirecashBigDecimal = BigDecimal.valueOf(hire);
			dealersAddcarlog.setBackcash(backcashBigDecimal);
			dealersAddcarlog.setHirecash(hirecashBigDecimal);
			dealersAddcarlog.setAddcount(Long.valueOf(count));
			Long num =dealersAddcarlogService.addDealersAddcarlog(dealersAddcarlog);
			if (num > 0) {
				ret = 1L;
			}
		} catch (Exception e) {
			logger.error("DealersAddcarlogController.edit", e);
			ret = -1L;
		}
		if (callback != null && !"".equals(callback)) {
			jsonString = callback + "(" + ret + ")";
		}
		return jsonString;
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, DealersAddcarlog query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/report/dealersaddcarlog/list");
		String[] idArray = ids.split(",");
		DealersAddcarlog dealersAddcarlog = new DealersAddcarlog();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersAddcarlog.setId(Long.valueOf(id));
					//dealersAddcarlog.setStatus(DealersAddcarlog.DELETE_STATUS);
					this.dealersAddcarlogService.updateDealersAddcarlogByObj(dealersAddcarlog);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("DealersAddcarlogController.delete", e);
		}
		return rv;
	}
}
