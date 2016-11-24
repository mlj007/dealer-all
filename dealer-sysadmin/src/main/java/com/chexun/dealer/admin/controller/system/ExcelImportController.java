package com.chexun.dealer.admin.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.model.system.XianSuoRecord;
import com.chexun.dealer.service.system.ClueImportService;
import com.chexun.dealer.utils.MBaseController;
@Controller
@RequestMapping("/admin/system/excelImport")
public class ExcelImportController extends MBaseController{
	
	private static final Logger logger = Logger.getLogger(ExcelImportController.class);
	@Autowired
	private ClueImportService clueImportService;
	
	// 路径
	private String toList = "/admin/system/excelImport_list.httl";// 列表页
	private String toAdd = "/admin/system/addClue_add.httl";// 添加页面
	
	@RequestMapping(value="/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response,XianSuoRecord query,@ModelAttribute("page") PageEntity page){
		ModelAndView modelAndView=this.getModelAndView(request, Component.ADMIN, toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new XianSuoRecord();
			}
			List<XianSuoRecord> selectXianSuoRecordByPage = clueImportService.selectXianSuoRecordByPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("XianSuoRecordList", selectXianSuoRecordByPage);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("ExcelImportController.listAll", e);
		}
			return modelAndView;
	}
}
