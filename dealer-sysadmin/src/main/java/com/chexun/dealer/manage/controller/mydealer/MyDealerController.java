package com.chexun.dealer.manage.controller.mydealer;
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
import com.chexun.dealer.model.clue.BespeakOrder;
import com.chexun.dealer.model.clue.DealersMessages;
import com.chexun.dealer.model.dealers.DealersContract;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.service.car.DealersCarService;
import com.chexun.dealer.service.clue.AskingPriceService;
import com.chexun.dealer.service.clue.BespeakOrderService;
import com.chexun.dealer.service.clue.DealersMessagesService;
import com.chexun.dealer.service.dealers.DealersContractService;
import com.chexun.dealer.service.dealers.DealersInfoService;
import com.chexun.dealer.service.news.DealersNewsService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.utils.common.CookieUtil;
import com.chexun.dealer.utils.domain.Constants;
import com.chexun.dealer.vo.clue.AskingPriceVo;
import com.chexun.dealer.vo.dealers.DealersCarVo;

@Controller
@RequestMapping("/manage")
public class MyDealerController extends MBaseController {
	private static final Logger logger = Logger.getLogger(MyDealerController.class);
	@Autowired
	private DealersInfoService dealersInfoService;
	@Autowired
	private DealersMessagesService dealersMessagesService;
	@Autowired
	private AskingPriceService askingPriceService;
	@Autowired
	private BespeakOrderService bespeakOrderService;
	@Autowired
	private DealersContractService dealersContractService;
	@Autowired
	private DealersNewsService dealersNewsService;
	@Autowired
	private DealersCarService dealersCarService;
	// 路径toCarList
	private String toList = "/manage/my_index.httl";//列表页
	private String toCarList ="/manage/car_list.httl";//列表页
	@RequestMapping("/index")
	public ModelAndView IndexReport(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView modelAndView =this.getModelAndView(request, Component.MANAGE, toList);
		try {
			String dealerId = CookieUtil.getCookieValue(request.getCookies(),Constants.USER_KEY_COOKIE_DEALERID, "");
			DealersMessages dealersMessages=new DealersMessages();
			dealersMessages.setDealerId(Long.valueOf(dealerId));
			Integer messageCount=dealersMessagesService.getDealersMessagesCountByObj(dealersMessages);
			AskingPriceVo askingPriceVo=new AskingPriceVo();
			askingPriceVo.setDealerId(Long.valueOf(dealerId));
			Integer askingPriceCount=askingPriceService.getAskingPriceCount(askingPriceVo);
			BespeakOrder bespeakOrder =new BespeakOrder();
			bespeakOrder.setDealerId(Long.valueOf(dealerId));
			Integer bespeakOrderCount=bespeakOrderService.getBespeakOrderCountByObj(bespeakOrder);
			DealersContract contract =new DealersContract();
			contract.setDealerid(Long.valueOf(dealerId));
			contract=dealersContractService.getDealersContractByObj(contract);
			DealersNews dealersNews =new DealersNews();
			dealersNews.setDealerUserId(Long.valueOf(dealerId));
			Integer newsCount=dealersNewsService.getDealersNewsCountByObj(dealersNews);
			DealersCarVo dealersCarVo=new DealersCarVo();
			dealersCarVo.setDealerId(Long.valueOf(dealerId));
			DealersCarPo dealersCarPo=dealersCarService.getBrandCountAndCarCountByObj(dealersCarVo);
			List<DealersCarPo> dealersCarPoList=dealersCarService.getBrandListByObj(dealersCarVo);
			modelAndView.addObject("messageCount",messageCount);//留言
			modelAndView.addObject("askingPriceCount",askingPriceCount);//询价
			modelAndView.addObject("bespeakOrderCount",bespeakOrderCount);//试驾报名
			modelAndView.addObject("contract",contract);//车E购佣金优惠车辆剩余
			modelAndView.addObject("newsCount",newsCount);//新闻篇数
			modelAndView.addObject("dealersCarPo",dealersCarPo);//已发布报价 品牌数量和款车型数量
			modelAndView.addObject("dealersCarPoList",dealersCarPoList);//报价管理菜单品牌列表
		} catch (Exception e) {
			logger.error("MyDealerController.IndexReport", e);
		}
		return modelAndView;
	}

	@RequestMapping("/car/list")
	public ModelAndView carlistAll(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView =this.getModelAndView(request, Component.MANAGE, toCarList);
		try {
			String seriesId=request.getParameter("seriesId");
			String dealerId = CookieUtil.getCookieValue(request.getCookies(),Constants.USER_KEY_COOKIE_DEALERID, "");
			DealersCarVo dealersCarVo=new DealersCarVo();
			dealersCarVo.setDealerId(Long.valueOf(dealerId));
			dealersCarVo.setSeriesId(Long.valueOf(seriesId));
			List<DealersCarPo> carlist = dealersCarService.getCarListByObj(dealersCarVo);
			DealersCarPo brandCountAndCarCount=dealersCarService.getBrandCountAndCarCountByObj(dealersCarVo);
			DealersCarPo seriesNameAndCarCount=dealersCarService.getSeriesNameAndCarCountByObj(dealersCarVo);
			modelAndView.addObject("carlist", carlist);
			modelAndView.addObject("brandCountAndCarCount", brandCountAndCarCount);
			modelAndView.addObject("seriesNameAndCarCount", seriesNameAndCarCount);
		} catch (Exception e) {
			logger.error("MyDealerController.carlistAll", e);
		}
		return modelAndView;
	}
}
