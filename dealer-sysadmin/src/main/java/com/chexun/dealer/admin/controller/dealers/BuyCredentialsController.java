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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.chexun.base.common.util.string.StringUtils;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.BuyCredentials;
import com.chexun.dealer.service.dealers.BuyCredentialsService;
import com.chexun.dealer.utils.CoreConstant;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/dealer/credentials")
public class BuyCredentialsController extends MBaseController {

	private static final Logger logger = Logger.getLogger(BuyCredentialsController.class);

	@Autowired
	private BuyCredentialsService buyCredentialsService;

	// 路径
	private String toList = "/admin/dealers/buycredentials_list.httl";// 列表页
	private String toAdd = "/admin/dealers/buycredentials_add.httl";// 添加页面
	private String toEdit = "/admin/dealer/edit_credentials.httl";// 修改页
	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, BuyCredentials query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new BuyCredentials();
			}
			List<BuyCredentials> list = buyCredentialsService.getBuyCredentialsPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("buyCredentialsList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("BuyCredentialsController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("BuyCredentialsController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			BuyCredentials buyCredentials = buyCredentialsService.getBuyCredentialsById(id);
			modelAndView.addObject(buyCredentials);
		} catch (Exception e) {
			logger.error("BuyCredentialsController.toEdit", e);
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(BuyCredentials buyCredentials, HttpServletRequest request) {
		try {
			buyCredentialsService.addBuyCredentials(buyCredentials);
		} catch (Exception e) {
			logger.error("BuyCredentialsController.edit", e);
		}
		return new RedirectView("/manage/dealers/buycredentials/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, BuyCredentials query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/dealers/buycredentials/list");
		String[] idArray = ids.split(",");
		BuyCredentials buyCredentials = new BuyCredentials();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					buyCredentials.setId(Long.valueOf(id));
					//buyCredentials.setStatus(BuyCredentials.DELETE_STATUS);
					this.buyCredentialsService.updateBuyCredentialsByObj(buyCredentials);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("BuyCredentialsController.delete", e);
		}
		return rv;
	}
}
