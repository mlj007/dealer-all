package com.chexun.dealer.service.report.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.report.DealersReportDao;
import com.chexun.dealer.model.report.DealersMallReport;
import com.chexun.dealer.model.report.DealersReportKV;
import com.chexun.dealer.model.report.DealersReportQuery;
import com.chexun.dealer.service.report.base.DealersReportBaseService;

//@Service("dealersContractService")
public class DealersReportBaseServiceImpl implements DealersReportBaseService{

	@Autowired
    private DealersReportDao dealersReportDao;
	
	/**
	 * 分页查询经销商电商统计报表数据
	 * @param dealersMallReport
	 * @param page
	 * @return
	 */
	@Override
	public List<DealersMallReport> getDealersMallReportPage(
			DealersMallReport dealersMallReport, PageEntity page) {
		return dealersReportDao.getDealersMallReportPage(dealersMallReport, page);
	}

	/**
	 * 经销商级别统计
	 * @return
	 */
	@Override
	public List<DealersReportKV> getDealersLevelReportList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersLevelReportList(query);
	}

	/**
	 * 经销商新闻类别统计
	 * @return
	 */
	@Override
	public List<DealersReportKV> getDealersNewsTypeReportList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersNewsTypeReportList(query);
	}

	/**
	 * 经销商消息统计
	 */
	@Override
	public List<DealersReportKV> getDealersMessageReportKVList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersMessageReportKVList(query);
	}

	/**
	 * 经销商询价统计
	 */
	@Override
	public List<DealersReportKV> getDealersXunjiaReportKVList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersXunjiaReportKVList(query);
	}

	/**
	 * 经销商试驾统计
	 */
	@Override
	public List<DealersReportKV> getDealersShijiaReportKVList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersShijiaReportKVList(query);
	}

	/**
	 * 经销商店铺访问日志统计
	 */
	@Override
	public List<DealersReportKV> getDealersShopAccessLogList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersShopAccessLogList(query);
	}

	/**
	 * 经销商报价统计
	 */
	@Override
	public List<DealersReportKV> getDealersShopBaojiaLogList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersShopBaojiaLogList(query);
	}

	/**
	 * 经销商新闻统计
	 */
	@Override
	public List<DealersReportKV> getDealersShopNewsLogList(
			DealersReportQuery query) {
		return dealersReportDao.getDealersShopNewsLogList(query);
	}

	
}
