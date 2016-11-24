package com.chexun.dealer.admin.controller.clue;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.PhoneHistor;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.service.clue.PhoneHistorService;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/clue/phonehistor")
public class PhoneHistorController extends MBaseController {

	private static final Logger logger = Logger.getLogger(PhoneHistorController.class);

	@Autowired
	private PhoneHistorService phoneHistorService;

	// 路径
	private String toList = "/admin/clue/phonehistor_list.httl";// 列表页
	private String toAdd = "/admin/clue/phonehistor_add.httl";// 添加页面
	private String toEdit = "/admin/clue/phonehistor_edit.httl";// 修改页
	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, PhoneHistor query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView=this.getModelAndView(request, Component.ADMIN, toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new PhoneHistor();
			}
			String	beginTime	= request.getParameter("beginTime");
			String	endTime	= request.getParameter("endTime");
			String	tel400	= request.getParameter("tel400");
			if(tel400 != null && !tel400.equals("")){
				query.setTel400(tel400.trim());
			}
			if(beginTime != null && !beginTime.equals("")){
				query.setBegintime(beginTime.trim());
			}
			if(endTime != null && !endTime.equals("")){
				query.setEndtime(endTime.trim());
			}
			List<PhoneHistor> list = phoneHistorService.selectPhoneHistorPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("phoneHistorList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("PhoneHistorController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("PhoneHistorController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			PhoneHistor phoneHistor = phoneHistorService.getPhoneHistorById(id);
			modelAndView.addObject(phoneHistor);
		} catch (Exception e) {
			logger.error("PhoneHistorController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(PhoneHistor phoneHistor, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(phoneHistor.getId())){
//				//phoneHistor.setMtime(new Date());
//				if (seuser != null) {
//					//phoneHistor.setMuser(String.valueOf(seuser.getId()));
//				}
//				phoneHistorService.updatePhoneHistorByObj(phoneHistor);
//			}else{
//				//phoneHistor.setCtime(new Date());
//				//phoneHistor.setMtime(new Date());
//				if (seuser != null) {
//					//phoneHistor.setCuser(String.valueOf(seuser.getId()));
//					//phoneHistor.setMuser(String.valueOf(seuser.getId()));
//				}
//				phoneHistorService.addPhoneHistor(phoneHistor);
//			}
		} catch (Exception e) {
			logger.error("PhoneHistorController.edit", e);
		}
		return new RedirectView("/manage/clue/phonehistor/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, PhoneHistor query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/clue/phonehistor/list");
		String[] idArray = ids.split(",");
		PhoneHistor phoneHistor = new PhoneHistor();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					phoneHistor.setId(Long.valueOf(id));
					//phoneHistor.setStatus(PhoneHistor.DELETE_STATUS);
					this.phoneHistorService.updatePhoneHistorByObj(phoneHistor);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("PhoneHistorController.delete", e);
		}
		return rv;
	}
}
