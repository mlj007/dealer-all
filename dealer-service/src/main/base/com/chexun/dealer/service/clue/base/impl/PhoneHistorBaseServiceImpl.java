package com.chexun.dealer.service.clue.base.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.dealer.dao.clue.PhoneHistorDao;
import com.chexun.dealer.model.clue.PhoneHistor;
import com.chexun.dealer.service.clue.PhoneHistorService;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.base.cache.QueryProvider;
/**
 * PhoneHistor管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("phoneHistorService")
public class PhoneHistorBaseServiceImpl implements PhoneHistorService{

 	@Autowired
    private PhoneHistorDao phoneHistorDao;
    /**
     * 添加PhoneHistor
     * @param phoneHistor 要添加的PhoneHistor
     * @return id
     */
    public Long addPhoneHistor(PhoneHistor phoneHistor){
    	Long res = phoneHistorDao.addPhoneHistor(phoneHistor);
    	return res;
    }
	public Long insertPhoneHistor(PhoneHistor phoneHistor){
		Long res = phoneHistorDao.insertPhoneHistor(phoneHistor);
		
    	return res;
	}
    /**
     * 根据id删除一个PhoneHistor
     * @param id 要删除的id
     */
    public Long deletePhoneHistorById(Long id){
    	return phoneHistorDao.deletePhoneHistorById(id);
    }
	public Long deletePhoneHistorByObj(PhoneHistor phoneHistor){
        return phoneHistorDao.deletePhoneHistorByObj(phoneHistor);
    }
    public Long deletePhoneHistorByIdList(List<Long > ids){
    	
    	return phoneHistorDao.deletePhoneHistorByIdList(ids);
    }
    /**
     * 修改PhoneHistor
     * @param phoneHistor 要修改的PhoneHistor
     */
    public Long updatePhoneHistor(PhoneHistor phoneHistor){
     	return phoneHistorDao.updatePhoneHistor(phoneHistor);
    }
    
    public Long updatePhoneHistorByObj(PhoneHistor phoneHistor){
    	return phoneHistorDao.updatePhoneHistorByObj(phoneHistor);
    }
    
    public Long updatePhoneHistorByObjAndConditions(PhoneHistor s,PhoneHistor c){
    	return phoneHistorDao.updatePhoneHistorByObjAndConditions(s,c);
    }
	public void batchUpdatePhoneHistor(List<PhoneHistor> records){
		phoneHistorDao.batchUpdatePhoneHistor(records);
	}
    /**
     * 根据id获取单个PhoneHistor对象
     * @param id 要查询的id
     * @return PhoneHistor
     */
    
    public Integer getPhoneHistorCountByObj(PhoneHistor phoneHistor){
    	return phoneHistorDao.getPhoneHistorCountByObj(phoneHistor);
    }
    


    public PhoneHistor getPhoneHistorById(Long id){
    	return phoneHistorDao.getPhoneHistorById( id);
    }
    
     public PhoneHistor getPhoneHistorByObj(PhoneHistor phoneHistor) {
        return phoneHistorDao.getPhoneHistorByObj(phoneHistor);
    }


    
    public List<PhoneHistor> getPhoneHistorListByObj(PhoneHistor phoneHistor){
        return phoneHistorDao.getPhoneHistorListByObj(phoneHistor);
    }
    public List<PhoneHistor> getPhoneHistorListPage(PhoneHistor phoneHistor,Integer offset,Integer limit){
        return phoneHistorDao.getPhoneHistorListPage(phoneHistor,offset,limit);
    }
    
    public List<PhoneHistor> getPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page) {
        return phoneHistorDao.getPhoneHistorPage(phoneHistor,page);
    }
    
    
    /**
     * 手动service
     */
    public List<PhoneHistor> selectPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page) {
    	return phoneHistorDao.selectPhoneHistorPage(phoneHistor,page);
    }
    
}