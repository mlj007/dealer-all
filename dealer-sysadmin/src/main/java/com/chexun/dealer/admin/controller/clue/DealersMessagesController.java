package  com.chexun.dealer.admin.controller.clue;

import java.util.Date;
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

import com.chexun.base.common.util.string.StringUtils;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.admin.export.DealersMessageExporter;
import com.chexun.dealer.model.clue.DealersMessages;
import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.service.clue.DealersMessagesService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.vo.clue.DealersMessagesVo;

@Controller
@RequestMapping("/admin/clue/message")
public class DealersMessagesController extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealersMessagesController.class);

	@Autowired
	private DealersMessagesService dealersMessagesService;

	// 路径
	private String toList = "/admin/clue/message_list.httl";// 列表页
	//private String toAdd = "/admin/clue/message_add.httl";// 添加页面
	//private String toEdit = "/admin/clue/message_edit.httl";// 修改页

	@RequestMapping("/list")
	public ModelAndView listAll(DealersMessagesVo query, @ModelAttribute("page") PageEntity page,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView(toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersMessagesVo();
			}
			Integer isReply = query.getIsReply();
			query.setState(1L);
			if(query.getIsReply() != null && query.getIsReply().intValue() == -1){
				query.setIsReply(null);
			}
			dealTime(query);
			List<DealersMessagesPo> list = dealersMessagesService.queryMessageListByPage(query, page);
			query.setIsReply(1);//查询已回复
			Integer replyCount = dealersMessagesService.getMessagesCount(query);
			query.setIsReply(null);//查询所有
			Integer tatalCount = dealersMessagesService.getMessagesCount(query);
			replyCount = (replyCount != null && replyCount > 0)?replyCount:0;
			tatalCount = (tatalCount != null && tatalCount > 0)?tatalCount:0;
			Integer unReplyCount = tatalCount - replyCount;
			unReplyCount = (unReplyCount != null && unReplyCount > 0)?unReplyCount:0;
			isReply = (isReply == null)?-1:isReply;
			modelAndView.addObject("isReply", isReply);
			modelAndView.addObject("tatalCount", tatalCount);
			modelAndView.addObject("replyCount", replyCount);
			modelAndView.addObject("unReplyCount", unReplyCount);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersMessagesList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersMessagesController.listAll", e);
			return getErrorView("DealersMessagesController.listAll", e);
		}

		return modelAndView;
	}

	@ResponseBody
	@RequestMapping(value="/reply",method=RequestMethod.POST)
	public String reply(Long messageId,String replyContent, HttpServletRequest request) {
		String ret = "1";
		try {
			if(messageId != null){
				DealersMessages dm = new DealersMessages();
				dm.setId(messageId);
				dm.setReplyContent(replyContent);
				dm.setReplyTime(new Date());
				dm.setIsReply(1);
				dealersMessagesService.updateDealersMessagesByObj(dm);
			}
		} catch (Exception e) {
			ret = "-1";
			logger.error("DealersMessagesController.reply", e);
		}
		return ret;
	}

	@ResponseBody
	@RequestMapping("/delete")
	public String delete(String ids) {
		String result = "0";
		String[] idArray = ids.split(",");
		DealersMessages dealersMessages = new DealersMessages();
		try {//软删除状态设置为2
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersMessages.setId(Long.valueOf(id));
					dealersMessages.setState(2L);
					dealersMessagesService.updateDealersMessagesByObj(dealersMessages);
				}
			}
			result = "1";
		} catch (Exception e) {
			logger.error("DealersMessagesController.delete", e);
		}
		return result;
	}
	
	@RequestMapping("/export")
	public void export(HttpServletRequest request, HttpServletResponse response, DealersMessagesVo query) {
		try {
			PageEntity page = new PageEntity();
			page.setPageSize(Integer.MAX_VALUE);
			page.setCurrentPage(1);
			if (query == null) {
				query = new DealersMessagesVo();
			}
			query.setState(1L);
			if(query.getIsReply() != null && query.getIsReply().intValue() == -1){
				query.setIsReply(null);
			}
			dealTime(query);
			List<DealersMessagesPo> list = dealersMessagesService.queryMessageListByPage(query, page);
			
			DealersMessageExporter exporter = new DealersMessageExporter();
			exporter.writeExcel(response, list);
		} catch (Exception e) {
			logger.error("DealersMessagesController.export", e);
			getErrorView("DealersMessagesController.export", e);
		}
	}
	
	private void dealTime(DealersMessagesVo query){
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
	
	/*
	 
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView toAdd() {
		ModelAndView modelAndView = new ModelAndView(toAdd);
		try {
		} catch (Exception e) {
			logger.error("DealersMessagesController.toAdd", e);
		}
		return modelAndView;
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView toEdit(Long id) {
		ModelAndView modelAndView = new ModelAndView(toEdit);
		try {
			DealersMessages dealersMessages = dealersMessagesService.getDealersMessagesById(id);
			modelAndView.addObject(dealersMessages);
		} catch (Exception e) {
			logger.error("DealersMessagesController.toEdit", e);
		}
		return modelAndView;
	}*/
}
