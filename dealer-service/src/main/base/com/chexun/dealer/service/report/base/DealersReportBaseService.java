package com.chexun.dealer.service.report.base;
import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.report.DealersMallReport;
import com.chexun.dealer.model.report.DealersReportKV;
import com.chexun.dealer.model.report.DealersReportQuery;
public interface DealersReportBaseService {
	/**
	 * 分页查询经销商电商统计报表数据
	 * @param dealersMallReport
	 * @param page
	 * @return
	 */
	public List<DealersMallReport> getDealersMallReportPage(DealersMallReport dealersMallReport,PageEntity page);
	
	/**
	 * 经销商级别统计
	 * @return
	 */
	public List<DealersReportKV> getDealersLevelReportList(DealersReportQuery query);
	
	/**
	 * 经销商新闻类别统计
	 * @return
	 */
	public List<DealersReportKV> getDealersNewsTypeReportList(DealersReportQuery query);
	
	/**
	 * 获取经销商留言信息统计数据的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersMessageReportKVList(DealersReportQuery query);
	
	/**
	 * 获取经销商询价信息统计数据的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersXunjiaReportKVList(DealersReportQuery query);
	
	/**
	 * 获取经销商试驾信息统计数据的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersShijiaReportKVList(DealersReportQuery query);
	
	/**
	 * 获取经销商电商访问量的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersShopAccessLogList(DealersReportQuery query);
	
	/**
	 * 获取经销商报价访问量的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersShopBaojiaLogList(DealersReportQuery query);
	
	/**
	 * 获取经销商新闻资讯访问量的key、value值，key代表分类、value代表汇总的数值
	 * @return
	 */
	public List<DealersReportKV> getDealersShopNewsLogList(DealersReportQuery query);
}
