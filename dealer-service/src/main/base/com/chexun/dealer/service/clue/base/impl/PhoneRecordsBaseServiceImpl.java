package com.chexun.dealer.service.clue.base.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.dealer.dao.clue.PhoneRecordsDao;
import com.chexun.dealer.model.clue.PhoneRecords;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.model.common.Province;
import com.chexun.dealer.service.clue.PhoneRecordsService;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.base.cache.QueryProvider;
/**
 * PhoneRecords管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("phoneRecordsService")
public class PhoneRecordsBaseServiceImpl implements PhoneRecordsService{

 	@Autowired
    private PhoneRecordsDao phoneRecordsDao;
    /**
     * 添加PhoneRecords
     * @param phoneRecords 要添加的PhoneRecords
     * @return id
     */
    public Long addPhoneRecords(PhoneRecords phoneRecords){
    	Long res = phoneRecordsDao.addPhoneRecords(phoneRecords);
    	return res;
    }
	public Long insertPhoneRecords(PhoneRecords phoneRecords){
		Long res = phoneRecordsDao.insertPhoneRecords(phoneRecords);
		
    	return res;
	}
    /**
     * 根据id删除一个PhoneRecords
     * @param id 要删除的id
     */
    public Long deletePhoneRecordsById(Long id){
    	return phoneRecordsDao.deletePhoneRecordsById(id);
    }
	public Long deletePhoneRecordsByObj(PhoneRecords phoneRecords){
        return phoneRecordsDao.deletePhoneRecordsByObj(phoneRecords);
    }
    public Long deletePhoneRecordsByIdList(List<Long > ids){
    	
    	return phoneRecordsDao.deletePhoneRecordsByIdList(ids);
    }
    /**
     * 修改PhoneRecords
     * @param phoneRecords 要修改的PhoneRecords
     */
    public Long updatePhoneRecords(PhoneRecords phoneRecords){
     	return phoneRecordsDao.updatePhoneRecords(phoneRecords);
    }
    
    public Long updatePhoneRecordsByObj(PhoneRecords phoneRecords){
    	return phoneRecordsDao.updatePhoneRecordsByObj(phoneRecords);
    }
    
    public Long updatePhoneRecordsByObjAndConditions(PhoneRecords s,PhoneRecords c){
    	return phoneRecordsDao.updatePhoneRecordsByObjAndConditions(s,c);
    }
	public void batchUpdatePhoneRecords(List<PhoneRecords> records){
		phoneRecordsDao.batchUpdatePhoneRecords(records);
	}
    /**
     * 根据id获取单个PhoneRecords对象
     * @param id 要查询的id
     * @return PhoneRecords
     */
    
    public Integer getPhoneRecordsCountByObj(PhoneRecords phoneRecords){
    	return phoneRecordsDao.getPhoneRecordsCountByObj(phoneRecords);
    }
    


    public PhoneRecords getPhoneRecordsById(Long id){
    	return phoneRecordsDao.getPhoneRecordsById( id);
    }
    
     public PhoneRecords getPhoneRecordsByObj(PhoneRecords phoneRecords) {
        return phoneRecordsDao.getPhoneRecordsByObj(phoneRecords);
    }


    
    public List<PhoneRecords> getPhoneRecordsListByObj(PhoneRecords phoneRecords){
        return phoneRecordsDao.getPhoneRecordsListByObj(phoneRecords);
    }
    public List<PhoneRecords> getPhoneRecordsListPage(PhoneRecords phoneRecords,Integer offset,Integer limit){
        return phoneRecordsDao.getPhoneRecordsListPage(phoneRecords,offset,limit);
    }
    
    public List<PhoneRecords> getPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page) {
        return phoneRecordsDao.getPhoneRecordsPage(phoneRecords,page);
    }
    
    
    /**
     * 手动service
     */
    public List<PhoneRecords> selectPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page) {
        return phoneRecordsDao.selectPhoneRecordsPage(phoneRecords,page);
    }
	@Override
	public List<Province> selectProvince() {
		return phoneRecordsDao.selectProvince();
	}
	@Override
	public List<City> selectCityById(Long provinceid) {
		return phoneRecordsDao.selectCityById(provinceid);
	}
	
}