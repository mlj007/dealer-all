package com.chexun.dealer.admin.controller.dealers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.DealerRecord;
import com.chexun.dealer.service.dealers.DealerRecordService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.vo.dealers.DealerRecordVo;

@Controller
@RequestMapping("/admin/dealer/record")
public class DealerRecordController extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealerRecordController.class);

	@Autowired
	private DealerRecordService dealerRecordService;

	// 路径
	private String toList = "/admin/dealer/edit_record.httl";// 列表页
	private String toAdd = "/dealers/dealerrecord_add.httl";// 添加页面
	private String toEdit = "/dealers/dealerrecord_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, DealerRecordVo query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealerRecordVo();
			}
			List<DealerRecord> list = dealerRecordService.getDealerRecordPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealerRecordList", list);
			modelAndView.addObject("dealerid",String.valueOf(query.getDealerid()));
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealerRecordController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("DealerRecordController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			DealerRecord dealerRecord = dealerRecordService.getDealerRecordById(id);
			modelAndView.addObject(dealerRecord);
		} catch (Exception e) {
			logger.error("DealerRecordController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(DealerRecord dealerRecord, HttpServletRequest request) {
		try {
			dealerRecordService.addDealerRecord(dealerRecord);
		} catch (Exception e) {
			logger.error("DealerRecordController.edit", e);
		}
		return new RedirectView("/manage/dealers/dealerrecord/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, DealerRecord query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/dealers/dealerrecord/list");
		String[] idArray = ids.split(",");
		DealerRecord dealerRecord = new DealerRecord();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealerRecord.setId(Long.valueOf(id));
					//dealerRecord.setStatus(DealerRecord.DELETE_STATUS);
					this.dealerRecordService.updateDealerRecordByObj(dealerRecord);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("DealerRecordController.delete", e);
		}
		return rv;
	}
}
