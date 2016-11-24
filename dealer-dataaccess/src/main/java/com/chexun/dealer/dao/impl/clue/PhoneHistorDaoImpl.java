package com.chexun.dealer.dao.impl.clue;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.chexun.dealer.dao.clue.PhoneHistorDao;
import com.chexun.dealer.model.clue.PhoneHistor;

import org.springframework.stereotype.Repository;

import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * PhoneHistor
 * User:
 * Date: 2016-09-23
 */
 @Repository("phoneHistorDao")
public class PhoneHistorDaoImpl extends GenericDaoImpl implements PhoneHistorDao{

    public Long addPhoneHistor(PhoneHistor phoneHistor) {
        return this.insert("com.chexun.dealer.model.clue.PhoneHistorMapper.createPhoneHistor",phoneHistor);
    }
	public Long insertPhoneHistor(PhoneHistor phoneHistor){
		return this.insert("com.chexun.dealer.model.clue.PhoneHistorMapper.insertPhoneHistor",phoneHistor);
	}
    public Long deletePhoneHistorById(Long id){
        return this.delete("com.chexun.dealer.model.clue.PhoneHistorMapper.deletePhoneHistorById",id);
    }
    public Long deletePhoneHistorByObj(PhoneHistor phoneHistor){
        return this.delete("com.chexun.dealer.model.clue.PhoneHistorMapper.deletePhoneHistorByObj",phoneHistor);
    }
    
	public Long deletePhoneHistorByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.PhoneHistorMapper.deletePhoneHistorByIdList",ids);
	}
    public Long updatePhoneHistor(PhoneHistor phoneHistor) {
        return this.update("com.chexun.dealer.model.clue.PhoneHistorMapper.updatePhoneHistor",phoneHistor);
    }
    
    public Long updatePhoneHistorByObj(PhoneHistor phoneHistor){
    	return this.update("com.chexun.dealer.model.clue.PhoneHistorMapper.updatePhoneHistorByObj",phoneHistor);
    }
    
    public Long updatePhoneHistorByObjAndConditions(PhoneHistor s,PhoneHistor c){
    	Map<String,PhoneHistor> map = new HashMap<String,PhoneHistor>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.PhoneHistorMapper.updatePhoneHistorByObjAndConditions",map);
    }
	public void batchUpdatePhoneHistor(List<PhoneHistor> records){
		this.update("com.chexun.dealer.model.clue.PhoneHistorMapper.batchUpdatePhoneHistor",records);
	}
    public PhoneHistor getPhoneHistorById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorById",id);
    }
    
    public PhoneHistor getPhoneHistorByObj(PhoneHistor phoneHistor) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorByObj",phoneHistor);
    }

    
    public List<PhoneHistor> getPhoneHistorListByObj(PhoneHistor phoneHistor){
        return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorListByObj",phoneHistor);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<PhoneHistor> getPhoneHistorListPage(PhoneHistor phoneHistor,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneHistor);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getPhoneHistorCountByObj(PhoneHistor phoneHistor){
    	return this.selectOne("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorCountByObj", phoneHistor);
    }
    
    public List<PhoneHistor> getPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page) {
        Integer objectscount = getPhoneHistorCountByObj(phoneHistor);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPhoneHistorListPage(phoneHistor,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getPhoneHistorIdByObj(PhoneHistor phoneHistor) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorIdByObj",phoneHistor);
    }

    public List<Long> getPhoneHistorIdList(PhoneHistor phoneHistor) {
        return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorIdList",phoneHistor);
    }
    
    public List<Long> getPhoneHistorIdListByObj(PhoneHistor phoneHistor){
        return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorIdListByObj",phoneHistor);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getPhoneHistorIdListPage(PhoneHistor phoneHistor,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneHistor);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.getPhoneHistorIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getPhoneHistorIdPage(PhoneHistor phoneHistor,PageEntity page) {
        Integer objectscount = getPhoneHistorCountByObj(phoneHistor);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPhoneHistorIdListPage(phoneHistor,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    /**
     * 手动Dao
     */
    
    public Integer selectPhoneHistorCountByObj(PhoneHistor phoneHistor){
    	return this.selectOne("com.chexun.dealer.model.clue.PhoneHistorMapper.selectPhoneHistorCountByObj", phoneHistor);
    }
    
    public List<PhoneHistor> selectPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page) {
        Integer objectscount = selectPhoneHistorCountByObj(phoneHistor);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return selectPhoneHistorListPage(phoneHistor,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<PhoneHistor> selectPhoneHistorListPage(PhoneHistor phoneHistor,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneHistor);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneHistorMapper.selectPhoneHistorListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
}
