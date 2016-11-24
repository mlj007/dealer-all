package  com.chexun.dealer.admin.controller.clue;

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
import com.chexun.dealer.model.clue.LocalCluePool;
import com.chexun.dealer.service.clue.LocalCluePoolService;
import com.chexun.dealer.utils.MBaseController;

@Controller
@RequestMapping("/admin/clue/localcluepool")
public class LocalCluePoolController extends MBaseController {

	private static final Logger logger = Logger.getLogger(LocalCluePoolController.class);

	@Autowired
	private LocalCluePoolService localCluePoolService;

	// 路径
	private String toList = "/admin/clue/localcluepool_list.httl";// 列表页
	private String toAdd = "/admin/clue/localcluepool_add.httl";// 添加页面
	private String toEdit = "/admin/clue/localcluepool_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, LocalCluePool query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new LocalCluePool();
			}
			List<LocalCluePool> list = localCluePoolService.getLocalCluePoolPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("localCluePoolList", list);
			modelAndView.addObject("page",page);
		} catch (Exception e) {
			logger.error("LocalCluePoolController.listAll", e);
//			return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("LocalCluePoolController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			LocalCluePool localCluePool = localCluePoolService.getLocalCluePoolById(id);
			modelAndView.addObject(localCluePool);
		} catch (Exception e) {
			logger.error("LocalCluePoolController.toEdit", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public RedirectView save(LocalCluePool localCluePool, HttpServletRequest request) {
		try {
//			SysUser seuser = (SysUser) this.getSessionAttribute(request, CoreConstant.SYS_USER_SESSION_NAME);
//			if(StringUtils.isNotEmpty(localCluePool.getId())){
//				//localCluePool.setMtime(new Date());
//				if (seuser != null) {
//					//localCluePool.setMuser(String.valueOf(seuser.getId()));
//				}
//				localCluePoolService.updateLocalCluePoolByObj(localCluePool);
//			}else{
//				//localCluePool.setCtime(new Date());
//				//localCluePool.setMtime(new Date());
//				if (seuser != null) {
//					//localCluePool.setCuser(String.valueOf(seuser.getId()));
//					//localCluePool.setMuser(String.valueOf(seuser.getId()));
//				}
//				localCluePoolService.addLocalCluePool(localCluePool);
//			}
		} catch (Exception e) {
			logger.error("LocalCluePoolController.edit", e);
		}
		return new RedirectView("/manage/clue/localcluepool/list");
	}

	@RequestMapping("/delete")
	public RedirectView delete(String ids, HttpServletRequest request, LocalCluePool query, @ModelAttribute("page") PageEntity page,RedirectAttributes attr) {
		RedirectView rv = new RedirectView("/manage/clue/localcluepool/list");
		String[] idArray = ids.split(",");
		LocalCluePool localCluePool = new LocalCluePool();
		try {// 软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					localCluePool.setId(Long.valueOf(id));
					//localCluePool.setStatus(LocalCluePool.DELETE_STATUS);
					this.localCluePoolService.updateLocalCluePoolByObj(localCluePool);
				}
			}
			//attr.addAttribute("query", query);
			//attr.addAttribute("page", page);
		} catch (Exception e) {
			logger.error("LocalCluePoolController.delete", e);
		}
		return rv;
	}
}
