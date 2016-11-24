package com.chexun.dealer.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.chexun.dealer.po.dealers.DealersInfoPo;
import com.chexun.dealer.service.dealers.DealersInfoService;
import com.chexun.dealer.vo.dealers.DealersInfoVo;

@Controller
public class MainController extends MBaseController{
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	private String aboutlistPage = "/about/aboutlist.httl";
	private String aboutusPage = "/about/aboutus.httl";
	private String defaultPage = "/about/Default.httl";
	private String feedbackPage = "/about/feedback.httl";
	private String sitemapPage = "/about/sitemap.httl";
	private String zhaopinPage = "/about/zhaopin.httl";
	
	@Autowired
	private DealersInfoService dealersInfoService;
	
	@RequestMapping("/main/checkLogin")
	@ResponseBody
	public  JSONObject checkLogin(HttpServletRequest request, HttpServletResponse response){
		JSONObject json = new JSONObject();
		json.put("ret", -1);
		String[] result = SsoAuthUtil.ssoCheck(request,response);
		UserDto userDto= SsoAuthUtil.getUserByToken(request);
		
		if(result != null){
			json = new JSONObject();
			json.put("ret", 1);
			json.put("userId", result[0]);
			json.put("userName", result[1]);
			json.put("bbsUserId", result[2]);
			json.put("groupId", userDto.getGroupId());
			DealersInfoPo dealersInfoPo =new DealersInfoPo();
			DealersInfoVo dealersInfoVo=new DealersInfoVo();
			dealersInfoVo.setUsername(result[1]);
			dealersInfoPo=dealersInfoService.getDealersInfoByObj(dealersInfoVo);
			json.put("companyName", dealersInfoPo.getDealerName());
		}
		return json;
	}
	/**
	 * 关于车讯网
	 * @return
	 */
	@RequestMapping("/about/aboutlist.aspx")
	public  ModelAndView aboutlist(){
		ModelAndView modelAndView = new ModelAndView(aboutlistPage);	
		return modelAndView;
	}
	
	/**
	 * 关于我们
	 * @return
	 */
	@RequestMapping("/about/aboutus.aspx")
	public  ModelAndView aboutus(){
		ModelAndView modelAndView = new ModelAndView(aboutusPage);	
		return modelAndView;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/about/Default.aspx")
	public  ModelAndView toDefault(){
		ModelAndView modelAndView = new ModelAndView(defaultPage);	
		return modelAndView;
	}
	
	/**
	 * 意见反馈
	 * @return
	 */
	@RequestMapping("/about/feedback.aspx")
	public  ModelAndView feedback(){
		ModelAndView modelAndView = new ModelAndView(aboutusPage);	
		return modelAndView;
	}
	
	/**
	 * 整站地图
	 * @return
	 */
	@RequestMapping("/about/sitemap.aspx")
	public  ModelAndView sitemap(){
		ModelAndView modelAndView = new ModelAndView(sitemapPage);	
		return modelAndView;
	}
	
	/**
	 * 招聘英才
	 * @return
	 */
	@RequestMapping("/about/zhaopin.aspx")
	public  ModelAndView zhaopin(){
		ModelAndView modelAndView = new ModelAndView(zhaopinPage);	
		return modelAndView;
	}
	
	
}
