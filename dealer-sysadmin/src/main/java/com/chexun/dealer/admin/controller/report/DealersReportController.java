package com.chexun.dealer.admin.controller.report;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.report.DealersMallReport;
import com.chexun.dealer.model.report.DealersReportKV;
import com.chexun.dealer.model.report.DealersReportQuery;
import com.chexun.dealer.service.report.DealersReportService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.vo.report.DealerLevelCountVo;
import com.chexun.dealer.vo.report.DealerMessageCountVo;
import com.chexun.dealer.vo.report.DealerNewsTypeCountVo;
import com.chexun.dealer.vo.report.DealerShopAccessLogVo;

@Controller
@RequestMapping("/admin/report")
public class DealersReportController extends MBaseController {
	
	private static final Logger logger = Logger.getLogger(DealersReportController.class);
	
	@Autowired
	private DealersReportService dealersReportService;
	
	private String salesreport = "/admin/report/salesreport.httl";
	private String shopdatareport = "/admin/report/shopdatareport.httl";
	private String trafficstatisticsreport = "/admin/report/trafficstatisticsreport.httl";
	
	/**
	 * 电商统计报表页,超管权限才能访问。
	 * 页面是对经销商在电商平台销售的车辆台数及回金额的管理。
	 * @param request
	 * @param response
	 * @param query
	 * @param page
	 * @return
	 */
	
	@RequestMapping("/dstj.aspx")
	public ModelAndView salesReport(HttpServletRequest request, HttpServletResponse response, DealersMallReport query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = new ModelAndView(salesreport);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersMallReport();
			}
			List<DealersMallReport> dealersMallReports = dealersReportService.getDealersMallReportPage(query, page);
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersMallReports", dealersMallReports);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersReportController", e);
		}

		return modelAndView;
	}
	
	/**
	 * 店铺数据统计报表页,超管权限才能访问。
	 * 页面是对经销商的级别、咨询、线索等汇总统计。
	 * @param request
	 * @param response
	 * @param query
	 * @param page
	 * @return
	 */
	@RequestMapping("/tjsj.aspx")
	public ModelAndView shopDataReport(HttpServletRequest request, HttpServletResponse response) {
		String startdatetime=request.getParameter("startDateTime");
		String enddatetime=request.getParameter("endDateTime");
		DealersReportQuery query=new DealersReportQuery();
		query.setStartDateTime(startdatetime);
		query.setEndDateTime(enddatetime);
		ModelAndView modelAndView = new ModelAndView(shopdatareport);
		try {
			//经销商级别统计
			DealerLevelCountVo dealerLevelCountVo=new DealerLevelCountVo();
			List<DealersReportKV> list = dealersReportService.getDealersLevelReportList(query);
			for (DealersReportKV dealersReportKV : list) {
				switch(dealersReportKV.getKey()){
					case 10:
						dealerLevelCountVo.setDealerLevel10(dealersReportKV.getValue());
						break;
					case 20:
						dealerLevelCountVo.setDealerLevel20(dealersReportKV.getValue());
						break;
					case 30:
						dealerLevelCountVo.setDealerLevel30(dealersReportKV.getValue());
						break;
					case 40:
						dealerLevelCountVo.setDealerLevel40(dealersReportKV.getValue());
						break;
					case 50:
						dealerLevelCountVo.setDealerLevel50(dealersReportKV.getValue());
						break;
					case 60:
						dealerLevelCountVo.setDealerLevel60(dealersReportKV.getValue());
						break;
					case 70:
						dealerLevelCountVo.setDealerLevel70(dealersReportKV.getValue());
						break;
					case 100:
						dealerLevelCountVo.setDealerLevel100(dealersReportKV.getValue());
						break;
				}
				
				dealerLevelCountVo.setDealerAllCount(dealerLevelCountVo.getDealerAllCount()+dealersReportKV.getValue());
			}
			
			//按新闻类别统计
			DealerNewsTypeCountVo dealerNewsTypeCountVo=new DealerNewsTypeCountVo();
			List<DealersReportKV> dealersNewsTypeReportList = dealersReportService.getDealersNewsTypeReportList(query);
			for (DealersReportKV dealersReportKV : dealersNewsTypeReportList) {
				switch(dealersReportKV.getKey()){
					case 1:
						dealerNewsTypeCountVo.setQiyeNewsCount(dealersReportKV.getValue());
						break;
					case 2:
						dealerNewsTypeCountVo.setCuxiaoNewsCount(dealersReportKV.getValue());
						break;
					case 3:
						dealerNewsTypeCountVo.setCheyouNewsCount(dealersReportKV.getValue());
						break;
					case 4:
						dealerNewsTypeCountVo.setXincheNewsCount(dealersReportKV.getValue());
						break;					
				}
				
				dealerNewsTypeCountVo.setAllCount(dealerNewsTypeCountVo.getAllCount()+dealersReportKV.getValue());
			}
			
			//留言信息统计
			DealerMessageCountVo dealerMessageCountVo=new DealerMessageCountVo();
			List<DealersReportKV> dealersReportKVList = dealersReportService.getDealersMessageReportKVList(query);
			for (DealersReportKV dealersReportKV : dealersReportKVList) {
				switch(dealersReportKV.getKey()){
					case 0:
						//未处理的消息
						dealerMessageCountVo.setUntreatedMessageCount(dealersReportKV.getValue());
						break;
				}
				
				dealerMessageCountVo.setAllMessageCount(dealerMessageCountVo.getAllMessageCount()+dealersReportKV.getValue());
			}
			dealerMessageCountVo.setAllCount(dealerMessageCountVo.getAllCount()+dealerMessageCountVo.getAllMessageCount());
			
			List<DealersReportKV> dealersXunjiaReportKVList = dealersReportService.getDealersXunjiaReportKVList(query);
			for (DealersReportKV dealersReportKV : dealersXunjiaReportKVList) {
				switch(dealersReportKV.getKey()){
					case 0:
						//未处理的消息
						dealerMessageCountVo.setUntreatedXunjiaCount(dealersReportKV.getValue());
						break;
				}
				
				dealerMessageCountVo.setAllXunjiaCount(dealerMessageCountVo.getAllXunjiaCount()+dealersReportKV.getValue());
			}
			dealerMessageCountVo.setAllCount(dealerMessageCountVo.getAllCount()+dealerMessageCountVo.getAllXunjiaCount());
			
			//询价试驾信息统计
			List<DealersReportKV> dealersShijiaReportKVList = dealersReportService.getDealersShijiaReportKVList(query);
			for (DealersReportKV dealersReportKV : dealersShijiaReportKVList) {
				switch(dealersReportKV.getKey()){
					case 0:
						//未处理的消息
						dealerMessageCountVo.setUntreatedShijiaCount(dealersReportKV.getValue());
						break;
				}
				
				dealerMessageCountVo.setAllShijiaCount(dealerMessageCountVo.getAllShijiaCount()+dealersReportKV.getValue());
			}
			dealerMessageCountVo.setAllCount(dealerMessageCountVo.getAllCount()+dealerMessageCountVo.getAllShijiaCount());
			
			modelAndView.addObject("dealerLevelCountVo", dealerLevelCountVo);
			modelAndView.addObject("dealerNewsTypeCountVo", dealerNewsTypeCountVo);
			modelAndView.addObject("dealerMessageCountVo", dealerMessageCountVo);
			modelAndView.addObject("dealersReportQuery", query);
		} catch (Exception e) {
			logger.error("DealersReportController", e);
		}

		return modelAndView;
	}
	
	/**
	 * 流量统计报表页,超管权限才能访问。
	 * 页面是对经销商的总浏览量、报价浏览量、资讯浏览量等汇总统计。
	 * @param request
	 * @param response
	 * @param query
	 * @param page
	 * @return
	 */
	@RequestMapping("/llfx.aspx")
	public ModelAndView trafficStatisticsReport(HttpServletRequest request, HttpServletResponse response) {
		String startdatetime=request.getParameter("startDateTime");
		String enddatetime=request.getParameter("endDateTime");
		if(startdatetime == null || startdatetime.length() <= 0 || enddatetime == null || enddatetime.length() <=0){
			java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();// 取当前日期。
			enddatetime=format.format(cal.getTime());
			cal.add(Calendar.DAY_OF_MONTH, -7);// 取当前日期的前7天.
			startdatetime=format.format(cal.getTime());
		}
		
		DealersReportQuery query=new DealersReportQuery();
		query.setStartDateTime(startdatetime);
		query.setEndDateTime(enddatetime);
		ModelAndView modelAndView = new ModelAndView(trafficstatisticsreport);
		try {
			//前台总浏览量统计
			DealerShopAccessLogVo dealerShopAccessLogVo=new DealerShopAccessLogVo();
			List<DealersReportKV> dealersShopAccessLogKVList = dealersReportService.getDealersShopAccessLogList(query);
			String xAxisData="";
			String yAxisData="";
			if(dealersShopAccessLogKVList.size()>0){
				for (DealersReportKV dealersReportKV : dealersShopAccessLogKVList) {				
					dealerShopAccessLogVo.setAllCount(dealerShopAccessLogVo.getAllCount()+dealersReportKV.getValue());
					xAxisData+=""+dealersReportKV.getKey()+",";
					yAxisData+=""+dealersReportKV.getValue()+",";
				}
				dealerShopAccessLogVo.setXAxisData(xAxisData.substring(0,xAxisData.length() - 1));
				dealerShopAccessLogVo.setYAxisData(yAxisData.substring(0,yAxisData.length() - 1));
				dealerShopAccessLogVo.setAvgCount(dealerShopAccessLogVo.getAllCount()/dealersShopAccessLogKVList.size());
			}
			
			//总报价览量统计	
			DealerShopAccessLogVo dealerShopBaojiaLogVo=new DealerShopAccessLogVo();
			List<DealersReportKV> dealersShopBaojiaLogKVList = dealersReportService.getDealersShopBaojiaLogList(query);
			xAxisData="";
			yAxisData="";
			if(dealersShopBaojiaLogKVList.size()>0){
				for (DealersReportKV dealersReportKV : dealersShopBaojiaLogKVList) {				
					dealerShopBaojiaLogVo.setAllCount(dealerShopAccessLogVo.getAllCount()+dealersReportKV.getValue());
					xAxisData+=""+dealersReportKV.getKey()+",";
					yAxisData+=""+dealersReportKV.getValue()+",";
				}
				dealerShopBaojiaLogVo.setXAxisData(xAxisData.substring(0,xAxisData.length() - 1));
				dealerShopBaojiaLogVo.setYAxisData(yAxisData.substring(0,yAxisData.length() - 1));
				dealerShopBaojiaLogVo.setAvgCount(dealerShopBaojiaLogVo.getAllCount()/dealersShopBaojiaLogKVList.size());
			}
			
			//新闻资讯览量统计	
			DealerShopAccessLogVo dealerShopNewsLogVo=new DealerShopAccessLogVo();
			List<DealersReportKV> dealersShopNewsLogKVList = dealersReportService.getDealersShopNewsLogList(query);
			xAxisData="";
			yAxisData="";
			if(dealersShopNewsLogKVList.size()>0){
				for (DealersReportKV dealersReportKV : dealersShopNewsLogKVList) {				
					dealerShopNewsLogVo.setAllCount(dealerShopNewsLogVo.getAllCount()+dealersReportKV.getValue());
					xAxisData+=""+dealersReportKV.getKey()+",";
					yAxisData+=""+dealersReportKV.getValue()+",";
				}
				dealerShopNewsLogVo.setXAxisData(xAxisData.substring(0,xAxisData.length() - 1));
				dealerShopNewsLogVo.setYAxisData(yAxisData.substring(0,yAxisData.length() - 1));
				dealerShopNewsLogVo.setAvgCount(dealerShopNewsLogVo.getAllCount()/dealersShopNewsLogKVList.size());
			}
			
			modelAndView.addObject("dealerShopAccessLogVo", dealerShopAccessLogVo);
			modelAndView.addObject("dealerShopBaojiaLogVo", dealerShopBaojiaLogVo);
			modelAndView.addObject("dealerShopNewsLogVo", dealerShopNewsLogVo);
			modelAndView.addObject("dealersReportQuery", query);
		} catch (Exception e) {
			logger.error("DealersReportController", e);
		}

		return modelAndView;
	}
}
