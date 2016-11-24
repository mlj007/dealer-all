package com.chexun.dealer.dao.impl.report;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.report.DealersReportDao;
import com.chexun.dealer.model.report.DealersMallReport;
import com.chexun.dealer.model.report.DealersReportKV;
import com.chexun.dealer.model.report.DealersReportQuery;

@Repository("dealersReportDao")
public class DealersReportDaoImpl extends GenericDaoImpl implements DealersReportDao{	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DealersMallReport> getDealersNewsListPage(
			DealersMallReport dealersMallReport, Integer offset, Integer limit) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersMallReport);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersMallReportListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer getDealersNewsCountByObj(DealersMallReport dealersMallReport) {
		return this.selectOne("com.chexun.dealer.model.report.DealersReportMapper.getDealersMallReportCountByObj", dealersMallReport);
	}

	@Override
	public List<DealersMallReport> getDealersMallReportPage(
			DealersMallReport dealersMallReport, PageEntity page) {
		
		Integer objectscount = getDealersNewsCountByObj(dealersMallReport);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersNewsListPage(dealersMallReport,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
	}

	@Override
	public List<DealersReportKV> getDealersLevelReportList(DealersReportQuery query) {
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersLevelReportListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersNewsTypeReportList(
			DealersReportQuery query) {
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersNewsTypeReportListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersMessageReportKVList(
			DealersReportQuery query) {
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersMessageReportKVListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersXunjiaReportKVList(
			DealersReportQuery query) {
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersXunjiaReportKVListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersShijiaReportKVList(
			DealersReportQuery query) {
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersShijiaReportKVListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersShopAccessLogList(
			DealersReportQuery query) {
		// TODO Auto-generated method stub
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersShopAccessLogListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersShopBaojiaLogList(
			DealersReportQuery query) {
		// TODO Auto-generated method stub
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersShopBaojiaLogListByObj",query);
	}

	@Override
	public List<DealersReportKV> getDealersShopNewsLogList(
			DealersReportQuery query) {
		// TODO Auto-generated method stub
		return this.selectList("com.chexun.dealer.model.report.DealersReportMapper.getDealersShopNewsLogListByObj",query);
	}

	
}
