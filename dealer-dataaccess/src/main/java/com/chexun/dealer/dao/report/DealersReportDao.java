package com.chexun.dealer.dao.report;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.report.DealersMallReport;
import com.chexun.dealer.model.report.DealersReportKV;
import com.chexun.dealer.model.report.DealersReportQuery;

public interface DealersReportDao {
	
    public List<DealersMallReport> getDealersNewsListPage(DealersMallReport dealersMallReport,Integer offset,Integer limit);
    
	public Integer getDealersNewsCountByObj(DealersMallReport dealersMallReport);
	
	public List<DealersMallReport> getDealersMallReportPage(DealersMallReport dealersMallReport,PageEntity page);
	
	public List<DealersReportKV> getDealersLevelReportList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersNewsTypeReportList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersMessageReportKVList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersXunjiaReportKVList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersShijiaReportKVList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersShopAccessLogList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersShopBaojiaLogList(DealersReportQuery query);
	
	public List<DealersReportKV> getDealersShopNewsLogList(DealersReportQuery query);
}
