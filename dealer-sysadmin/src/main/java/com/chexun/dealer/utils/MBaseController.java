package com.chexun.dealer.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.model.permission.Permission;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.service.car.DealersCarService;
import com.chexun.dealer.service.dealers.DealersInfoService;
import com.chexun.dealer.service.permission.PermissionService;
import com.chexun.dealer.utils.common.CookieUtil;
import com.chexun.dealer.utils.domain.Constants;
import com.chexun.dealer.vo.dealers.DealersCarVo;

public abstract class MBaseController{
	
	private String errorPage = "/common/error.httl";
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private DealersCarService dealersCarService;
	@Autowired
	private DealersInfoService dealersInfoService;
	private void sendErrorMsg(String msg, String method,Exception ex) {
//		mailSenderService.sendException(msg, method);
	}	
	
	public ModelAndView getErrorView(String errorKey,Exception ex){
		sendErrorMsg(ex.getMessage(), errorKey, ex);
		ModelAndView modelAndView = new ModelAndView(errorPage);
		modelAndView.addObject("errorMsg", ex);
		return modelAndView;
	}
	public ModelAndView getModelAndView(HttpServletRequest request, Component component,String toPage){
		ModelAndView modelAndView=getPermission(request,component,toPage);
		return modelAndView;
	}
	public ModelAndView getPermission(HttpServletRequest request, Component component,String toPage) {
		ModelAndView modelAndView = new ModelAndView(toPage);
		Permission permission = new Permission();
		String userName = CookieUtil.getCookieValue(request.getCookies(),Constants.USER_KEY_COOKIE_INFO, "");
		if(!userName.isEmpty()){
			permission.setUserName(userName);
			permission.setModuleRel(String.valueOf(component));
			List<Permission> parentMenulist = permissionService.getPermissionParentMenu(permission);
			List<Permission> modulelist = permissionService.getPermissionModule(permission);
			modelAndView.addObject("m",request.getParameter("m"));
			modelAndView.addObject("parentMenulist", parentMenulist);
			modelAndView.addObject("modulelist", modulelist);
			if(component.equals(Component.MANAGE)){
				String dealerId = CookieUtil.getCookieValue(request.getCookies(),Constants.USER_KEY_COOKIE_DEALERID, "");
				DealersCarVo dealersCarVo=new DealersCarVo();
				dealersCarVo.setDealerId(Long.valueOf(dealerId));
				DealersInfo dealersInfo=dealersInfoService.getDealersInfoById(Long.valueOf(dealerId));
				List<DealersCarPo> carBrandList=dealersCarService.getBrandListByObj(dealersCarVo);
				List<DealersCarPo> carSeriesList=dealersCarService.getSeriesListAndCarCountByObj(dealersCarVo);
				modelAndView.addObject("b",request.getParameter("b"));
				modelAndView.addObject("dealersInfo", dealersInfo);
				modelAndView.addObject("carBrandList", carBrandList);
				modelAndView.addObject("carSeriesList", carSeriesList);
			}
			return modelAndView;
		}
		return modelAndView;
	}
}
