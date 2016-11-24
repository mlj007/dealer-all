package com.chexun.dealer.dao.impl.dealers;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealersAddcarlogDao;
import com.chexun.dealer.model.dealers.DealersAddcarlog;
/**
 *
 * DealersAddcarlog
 * User:
 * Date: 2016-10-10
 */
 @Repository("dealersAddcarlogDao")
public class DealersAddcarlogDaoImpl extends GenericDaoImpl implements DealersAddcarlogDao{

    public Long addDealersAddcarlog(DealersAddcarlog dealersAddcarlog) {
        return this.insert("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.createDealersAddcarlog",dealersAddcarlog);
    }
	public Long insertDealersAddcarlog(DealersAddcarlog dealersAddcarlog){
		return this.insert("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.insertDealersAddcarlog",dealersAddcarlog);
	}
    public Long deleteDealersAddcarlogById(Long id){
        return this.delete("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.deleteDealersAddcarlogById",id);
    }
    public Long deleteDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog){
        return this.delete("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.deleteDealersAddcarlogByObj",dealersAddcarlog);
    }
    
	public Long deleteDealersAddcarlogByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.deleteDealersAddcarlogByIdList",ids);
	}
    public Long updateDealersAddcarlog(DealersAddcarlog dealersAddcarlog) {
        return this.update("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.updateDealersAddcarlog",dealersAddcarlog);
    }
    
    public Long updateDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog){
    	return this.update("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.updateDealersAddcarlogByObj",dealersAddcarlog);
    }
    
    public Long updateDealersAddcarlogByObjAndConditions(DealersAddcarlog s,DealersAddcarlog c){
    	Map<String,DealersAddcarlog> map = new HashMap<String,DealersAddcarlog>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.updateDealersAddcarlogByObjAndConditions",map);
    }
	public void batchUpdateDealersAddcarlog(List<DealersAddcarlog> records){
		this.update("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.batchUpdateDealersAddcarlog",records);
	}
    public DealersAddcarlog getDealersAddcarlogById(Long id) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogById",id);
    }
    
    public DealersAddcarlog getDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogByObj",dealersAddcarlog);
    }

    
    public List<DealersAddcarlog> getDealersAddcarlogListByObj(DealersAddcarlog dealersAddcarlog){
        return this.selectList("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogListByObj",dealersAddcarlog);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersAddcarlog> getDealersAddcarlogListPage(DealersAddcarlog dealersAddcarlog,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersAddcarlog);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealersAddcarlogCountByObj(DealersAddcarlog dealersAddcarlog){
    	return this.selectOne("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogCountByObj", dealersAddcarlog);
    }
    
    public List<DealersAddcarlog> getDealersAddcarlogPage(DealersAddcarlog dealersAddcarlog,PageEntity page) {
        Integer objectscount = getDealersAddcarlogCountByObj(dealersAddcarlog);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersAddcarlogListPage(dealersAddcarlog,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersAddcarlogIdByObj(DealersAddcarlog dealersAddcarlog) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogIdByObj",dealersAddcarlog);
    }

    public List<Long> getDealersAddcarlogIdList(DealersAddcarlog dealersAddcarlog) {
        return this.selectList("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogIdList",dealersAddcarlog);
    }
    
    public List<Long> getDealersAddcarlogIdListByObj(DealersAddcarlog dealersAddcarlog){
        return this.selectList("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogIdListByObj",dealersAddcarlog);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersAddcarlogIdListPage(DealersAddcarlog dealersAddcarlog,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersAddcarlog);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealersAddcarlogMapper.getDealersAddcarlogIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealersAddcarlogIdPage(DealersAddcarlog dealersAddcarlog,PageEntity page) {
        Integer objectscount = getDealersAddcarlogCountByObj(dealersAddcarlog);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersAddcarlogIdListPage(dealersAddcarlog,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}
