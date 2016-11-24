package com.chexun.dealer.service.news.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.news.DealersNewsDao;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.DealersNoticeCheap;
import com.chexun.dealer.service.news.base.DealersNewsBaseService;
/**
 * DealersNews管理接口
 * User: 
 * Date: 2016-09-23
 */
public class DealersNewsBaseServiceImpl implements DealersNewsBaseService{

 	@Autowired
    private DealersNewsDao dealersNewsDao;
    /**
     * 添加DealersNews
     * @param dealersNews 要添加的DealersNews
     * @return id
     */
    public Long addDealersNews(DealersNews dealersNews){
    	Long res = dealersNewsDao.addDealersNews(dealersNews);
    	return res;
    }
	public Long insertDealersNews(DealersNews dealersNews){
		Long res = dealersNewsDao.insertDealersNews(dealersNews);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersNews
     * @param id 要删除的id
     */
    public Long deleteDealersNewsById(Long id){
    	return dealersNewsDao.deleteDealersNewsById(id);
    }
	public Long deleteDealersNewsByObj(DealersNews dealersNews){
        return dealersNewsDao.deleteDealersNewsByObj(dealersNews);
    }
    public Long deleteDealersNewsByIdList(List<Long > ids){
    	
    	return dealersNewsDao.deleteDealersNewsByIdList(ids);
    }
    /**
     * 修改DealersNews
     * @param dealersNews 要修改的DealersNews
     */
    public Long updateDealersNews(DealersNews dealersNews){
     	return dealersNewsDao.updateDealersNews(dealersNews);
    }
    
    public Long updateDealersNewsByObj(DealersNews dealersNews){
    	return dealersNewsDao.updateDealersNewsByObj(dealersNews);
    }
    
    public Long updateDealersNewsByObjAndConditions(DealersNews s,DealersNews c){
    	return dealersNewsDao.updateDealersNewsByObjAndConditions(s,c);
    }
	public void batchUpdateDealersNews(List<DealersNews> records){
		dealersNewsDao.batchUpdateDealersNews(records);
	}
    /**
     * 根据id获取单个DealersNews对象
     * @param id 要查询的id
     * @return DealersNews
     */
    
    public Integer getDealersNewsCountByObj(DealersNews dealersNews){
    	return dealersNewsDao.getDealersNewsCountByObj(dealersNews);
    }
    


    public DealersNews getDealersNewsById(Long id){
    	return dealersNewsDao.getDealersNewsById( id);
    }
    
     public DealersNews getDealersNewsByObj(DealersNews dealersNews) {
        return dealersNewsDao.getDealersNewsByObj(dealersNews);
    }


    
    public List<DealersNews> getDealersNewsListByObj(DealersNews dealersNews){
        return dealersNewsDao.getDealersNewsListByObj(dealersNews);
    }
    public List<DealersNews> getDealersNewsListPage(DealersNews dealersNews,Integer offset,Integer limit){
        return dealersNewsDao.getDealersNewsListPage(dealersNews,offset,limit);
    }
    
    public List<DealersNews> getDealersNewsPage(DealersNews dealersNews,PageEntity page) {
        return dealersNewsDao.getDealersNewsPage(dealersNews,page);
    }
	@Override
	public DealersNoticeCheap selectDealersNoticeCheapByObj(
			DealersNoticeCheap dealersNoticeCheap) {
		return dealersNewsDao.selectDealersNoticeCheapByObj(dealersNoticeCheap);
	}
}