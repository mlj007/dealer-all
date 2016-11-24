package com.chexun.dealer.service.clue.base.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.dealer.dao.clue.LocalCluePoolDao;
import com.chexun.dealer.model.clue.LocalCluePool;
import com.chexun.dealer.service.clue.LocalCluePoolService;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.base.cache.QueryProvider;
/**
 * LocalCluePool管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("localCluePoolService")
public class LocalCluePoolBaseServiceImpl implements LocalCluePoolService{

 	@Autowired
    private LocalCluePoolDao localCluePoolDao;
    /**
     * 添加LocalCluePool
     * @param localCluePool 要添加的LocalCluePool
     * @return id
     */
    public Long addLocalCluePool(LocalCluePool localCluePool){
    	Long res = localCluePoolDao.addLocalCluePool(localCluePool);
    	return res;
    }
	public Long insertLocalCluePool(LocalCluePool localCluePool){
		Long res = localCluePoolDao.insertLocalCluePool(localCluePool);
		
    	return res;
	}
    /**
     * 根据id删除一个LocalCluePool
     * @param id 要删除的id
     */
    public Long deleteLocalCluePoolById(Long id){
    	return localCluePoolDao.deleteLocalCluePoolById(id);
    }
	public Long deleteLocalCluePoolByObj(LocalCluePool localCluePool){
        return localCluePoolDao.deleteLocalCluePoolByObj(localCluePool);
    }
    public Long deleteLocalCluePoolByIdList(List<Long > ids){
    	
    	return localCluePoolDao.deleteLocalCluePoolByIdList(ids);
    }
    /**
     * 修改LocalCluePool
     * @param localCluePool 要修改的LocalCluePool
     */
    public Long updateLocalCluePool(LocalCluePool localCluePool){
     	return localCluePoolDao.updateLocalCluePool(localCluePool);
    }
    
    public Long updateLocalCluePoolByObj(LocalCluePool localCluePool){
    	return localCluePoolDao.updateLocalCluePoolByObj(localCluePool);
    }
    
    public Long updateLocalCluePoolByObjAndConditions(LocalCluePool s,LocalCluePool c){
    	return localCluePoolDao.updateLocalCluePoolByObjAndConditions(s,c);
    }
	public void batchUpdateLocalCluePool(List<LocalCluePool> records){
		localCluePoolDao.batchUpdateLocalCluePool(records);
	}
    /**
     * 根据id获取单个LocalCluePool对象
     * @param id 要查询的id
     * @return LocalCluePool
     */
    
    public Integer getLocalCluePoolCountByObj(LocalCluePool localCluePool){
    	return localCluePoolDao.getLocalCluePoolCountByObj(localCluePool);
    }
    


    public LocalCluePool getLocalCluePoolById(Long id){
    	return localCluePoolDao.getLocalCluePoolById( id);
    }
    
     public LocalCluePool getLocalCluePoolByObj(LocalCluePool localCluePool) {
        return localCluePoolDao.getLocalCluePoolByObj(localCluePool);
    }


    
    public List<LocalCluePool> getLocalCluePoolListByObj(LocalCluePool localCluePool){
        return localCluePoolDao.getLocalCluePoolListByObj(localCluePool);
    }
    public List<LocalCluePool> getLocalCluePoolListPage(LocalCluePool localCluePool,Integer offset,Integer limit){
        return localCluePoolDao.getLocalCluePoolListPage(localCluePool,offset,limit);
    }
    
    public List<LocalCluePool> getLocalCluePoolPage(LocalCluePool localCluePool,PageEntity page) {
        return localCluePoolDao.getLocalCluePoolPage(localCluePool,page);
    }
}