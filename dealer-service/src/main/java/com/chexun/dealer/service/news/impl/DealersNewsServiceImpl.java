package com.chexun.dealer.service.news.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.news.DealersNewsDao;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.DealersNoticeCheap;
import com.chexun.dealer.model.news.RelevantCarSerices;
import com.chexun.dealer.service.news.DealersNewsService;
import com.chexun.dealer.service.news.base.impl.DealersNewsBaseServiceImpl;
/**
 * DealersNews管理接口
 * User: 
 * Date: 2016-09-23
 */
@Service("dealersNewsService")
public class DealersNewsServiceImpl extends DealersNewsBaseServiceImpl implements DealersNewsService{
	
	@Autowired
    private DealersNewsDao dealersNewsDao;

	/**
     * 手工service
     */
    public List<DealersNews> selectDealersNewsPage(DealersNews dealersNews,PageEntity page) {
    	return dealersNewsDao.selectDealersNewsPage(dealersNews,page);
    }
    public Long updateDealersNewsById(DealersNews dealersNews){
    	return dealersNewsDao.updateDealersNewsById(dealersNews);
    }
    public DealersNews selectDealersNewsById(int id){
    	return dealersNewsDao.selectDealersNewsById(id);
    }
	@Override
	public List<RelevantCarSerices> selectSeriesById(Long dealerId) {
		return dealersNewsDao.selectSeriesById(dealerId);
	}
	@Override
	public RelevantCarSerices selectSeriesById2(RelevantCarSerices relevantCarSerices) {
		return dealersNewsDao.selectSeriesById2(relevantCarSerices);
	}
	@Override
	public DealersNoticeCheap selectDealersNoticeCheapByObj(DealersNoticeCheap dealersNoticeCheap) {
		return dealersNewsDao.selectDealersNoticeCheapByObj(dealersNoticeCheap);
	}
}