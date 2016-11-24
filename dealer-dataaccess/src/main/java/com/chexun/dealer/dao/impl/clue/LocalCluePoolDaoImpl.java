package com.chexun.dealer.dao.impl.clue;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.chexun.dealer.dao.clue.LocalCluePoolDao;
import com.chexun.dealer.model.clue.LocalCluePool;

import org.springframework.stereotype.Repository;

import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * LocalCluePool
 * User:
 * Date: 2016-09-23
 */
 @Repository("localCluePoolDao")
public class LocalCluePoolDaoImpl extends GenericDaoImpl implements LocalCluePoolDao{

    public Long addLocalCluePool(LocalCluePool localCluePool) {
        return this.insert("com.chexun.dealer.model.clue.LocalCluePoolMapper.createLocalCluePool",localCluePool);
    }
	public Long insertLocalCluePool(LocalCluePool localCluePool){
		return this.insert("com.chexun.dealer.model.clue.LocalCluePoolMapper.insertLocalCluePool",localCluePool);
	}
    public Long deleteLocalCluePoolById(Long id){
        return this.delete("com.chexun.dealer.model.clue.LocalCluePoolMapper.deleteLocalCluePoolById",id);
    }
    public Long deleteLocalCluePoolByObj(LocalCluePool localCluePool){
        return this.delete("com.chexun.dealer.model.clue.LocalCluePoolMapper.deleteLocalCluePoolByObj",localCluePool);
    }
    
	public Long deleteLocalCluePoolByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.LocalCluePoolMapper.deleteLocalCluePoolByIdList",ids);
	}
    public Long updateLocalCluePool(LocalCluePool localCluePool) {
        return this.update("com.chexun.dealer.model.clue.LocalCluePoolMapper.updateLocalCluePool",localCluePool);
    }
    
    public Long updateLocalCluePoolByObj(LocalCluePool localCluePool){
    	return this.update("com.chexun.dealer.model.clue.LocalCluePoolMapper.updateLocalCluePoolByObj",localCluePool);
    }
    
    public Long updateLocalCluePoolByObjAndConditions(LocalCluePool s,LocalCluePool c){
    	Map<String,LocalCluePool> map = new HashMap<String,LocalCluePool>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.LocalCluePoolMapper.updateLocalCluePoolByObjAndConditions",map);
    }
	public void batchUpdateLocalCluePool(List<LocalCluePool> records){
		this.update("com.chexun.dealer.model.clue.LocalCluePoolMapper.batchUpdateLocalCluePool",records);
	}
    public LocalCluePool getLocalCluePoolById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolById",id);
    }
    
    public LocalCluePool getLocalCluePoolByObj(LocalCluePool localCluePool) {
        return this.selectOne("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolByObj",localCluePool);
    }

    
    public List<LocalCluePool> getLocalCluePoolListByObj(LocalCluePool localCluePool){
        return this.selectList("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolListByObj",localCluePool);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<LocalCluePool> getLocalCluePoolListPage(LocalCluePool localCluePool,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(localCluePool);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getLocalCluePoolCountByObj(LocalCluePool localCluePool){
    	return this.selectOne("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolCountByObj", localCluePool);
    }
    
    public List<LocalCluePool> getLocalCluePoolPage(LocalCluePool localCluePool,PageEntity page) {
        Integer objectscount = getLocalCluePoolCountByObj(localCluePool);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getLocalCluePoolListPage(localCluePool,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getLocalCluePoolIdByObj(LocalCluePool localCluePool) {
        return this.selectOne("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolIdByObj",localCluePool);
    }

    public List<Long> getLocalCluePoolIdList(LocalCluePool localCluePool) {
        return this.selectList("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolIdList",localCluePool);
    }
    
    public List<Long> getLocalCluePoolIdListByObj(LocalCluePool localCluePool){
        return this.selectList("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolIdListByObj",localCluePool);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getLocalCluePoolIdListPage(LocalCluePool localCluePool,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(localCluePool);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.LocalCluePoolMapper.getLocalCluePoolIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getLocalCluePoolIdPage(LocalCluePool localCluePool,PageEntity page) {
        Integer objectscount = getLocalCluePoolCountByObj(localCluePool);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getLocalCluePoolIdListPage(localCluePool,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}
