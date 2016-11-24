package  com.chexun.dealer.admin.controller.dealers;

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
import com.chexun.dealer.model.dealers.DealersContract;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.service.dealers.DealersContractService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.utils.common.CookieUtil;
import com.chexun.dealer.utils.domain.Constants;

@Controller
@RequestMapping("/admin/dealer/contract")
public class DealersContractController extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealersContractController.class);

	@Autowired
	private DealersContractService dealersContractService;

	// 路径
	private String toList = "/report/dealerscontract_list.httl";// 列表页
	private String toAdd = "/report/dealerscontract_add.httl";// 添加页面
	private String toEdit = "/report/dealerscontract_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, DealersContract query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersContract();
			}
			List<DealersContract> list = dealersContractService.getDealersContractPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersContractList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersContractController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}
		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("DealersContractController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			DealersContract dealersContract = dealersContractService.getDealersContractById(id);
			modelAndView.addObject(dealersContract);
		} catch (Exception e) {
			logger.error("DealersContractController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public String save(DealersContract dealersContract,HttpServletRequest request) {
		String callback = request.getParameter("callback");
		String jsonString = "";
		Long ret=-1L;
		try {
			Long num = dealersContractService.addDealersContract(dealersContract);
			if (num > 0) {
				ret = num;
			}
		} catch (Exception e) {
			logger.error("DealersContractController.edit", e);
		}
		if (callback != null && !"".equals(callback)) {
			jsonString = callback + "(" + ret + ")";
		}
		return jsonString;
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, DealersContract query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/report/dealerscontract/list");
		String[] idArray = ids.split(",");
		DealersContract dealersContract = new DealersContract();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersContract.setId(Long.valueOf(id));
					//dealersContract.setStatus(DealersContract.DELETE_STATUS);
					this.dealersContractService.updateDealersContractByObj(dealersContract);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("DealersContractController.delete", e);
		}
		return rv;
	}
}
