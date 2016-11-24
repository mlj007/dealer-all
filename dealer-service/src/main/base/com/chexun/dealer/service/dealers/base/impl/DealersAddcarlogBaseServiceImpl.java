package com.chexun.dealer.service.dealers.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealersAddcarlogDao;
import com.chexun.dealer.model.dealers.DealersAddcarlog;
import com.chexun.dealer.service.dealers.base.DealersAddcarlogBaseService;
import com.chexun.dealer.service.dealers.impl.DealersAddcarlogServiceImpl;
/**
 * DealersAddcarlog管理接口
 * User: 
 * Date: 2016-10-10
 */
//@Service("dealersAddcarlogService")
public class DealersAddcarlogBaseServiceImpl   implements DealersAddcarlogBaseService{

 	@Autowired
    private DealersAddcarlogDao dealersAddcarlogDao;
    /**
     * 添加DealersAddcarlog
     * @param dealersAddcarlog 要添加的DealersAddcarlog
     * @return id
     */
    public Long addDealersAddcarlog(DealersAddcarlog dealersAddcarlog){
    	Long res = dealersAddcarlogDao.addDealersAddcarlog(dealersAddcarlog);
    	return res;
    }
	public Long insertDealersAddcarlog(DealersAddcarlog dealersAddcarlog){
		Long res = dealersAddcarlogDao.insertDealersAddcarlog(dealersAddcarlog);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersAddcarlog
     * @param id 要删除的id
     */
    public Long deleteDealersAddcarlogById(Long id){
    	return dealersAddcarlogDao.deleteDealersAddcarlogById(id);
    }
	public Long deleteDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog){
        return dealersAddcarlogDao.deleteDealersAddcarlogByObj(dealersAddcarlog);
    }
    public Long deleteDealersAddcarlogByIdList(List<Long > ids){
    	
    	return dealersAddcarlogDao.deleteDealersAddcarlogByIdList(ids);
    }
    /**
     * 修改DealersAddcarlog
     * @param dealersAddcarlog 要修改的DealersAddcarlog
     */
    public Long updateDealersAddcarlog(DealersAddcarlog dealersAddcarlog){
     	return dealersAddcarlogDao.updateDealersAddcarlog(dealersAddcarlog);
    }
    
    public Long updateDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog){
    	return dealersAddcarlogDao.updateDealersAddcarlogByObj(dealersAddcarlog);
    }
    
    public Long updateDealersAddcarlogByObjAndConditions(DealersAddcarlog s,DealersAddcarlog c){
    	return dealersAddcarlogDao.updateDealersAddcarlogByObjAndConditions(s,c);
    }
	public void batchUpdateDealersAddcarlog(List<DealersAddcarlog> records){
		dealersAddcarlogDao.batchUpdateDealersAddcarlog(records);
	}
    /**
     * 根据id获取单个DealersAddcarlog对象
     * @param id 要查询的id
     * @return DealersAddcarlog
     */
    
    public Integer getDealersAddcarlogCountByObj(DealersAddcarlog dealersAddcarlog){
    	return dealersAddcarlogDao.getDealersAddcarlogCountByObj(dealersAddcarlog);
    }
    


    public DealersAddcarlog getDealersAddcarlogById(Long id){
    	return dealersAddcarlogDao.getDealersAddcarlogById( id);
    }
    
     public DealersAddcarlog getDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog) {
        return dealersAddcarlogDao.getDealersAddcarlogByObj(dealersAddcarlog);
    }


    
    public List<DealersAddcarlog> getDealersAddcarlogListByObj(DealersAddcarlog dealersAddcarlog){
        return dealersAddcarlogDao.getDealersAddcarlogListByObj(dealersAddcarlog);
    }
    public List<DealersAddcarlog> getDealersAddcarlogListPage(DealersAddcarlog dealersAddcarlog,Integer offset,Integer limit){
        return dealersAddcarlogDao.getDealersAddcarlogListPage(dealersAddcarlog,offset,limit);
    }
    
    public List<DealersAddcarlog> getDealersAddcarlogPage(DealersAddcarlog dealersAddcarlog,PageEntity page) {
        return dealersAddcarlogDao.getDealersAddcarlogPage(dealersAddcarlog,page);
    }
}