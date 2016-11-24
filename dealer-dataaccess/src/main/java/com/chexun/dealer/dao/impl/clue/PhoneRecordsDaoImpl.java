package com.chexun.dealer.dao.impl.clue;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.chexun.dealer.dao.clue.PhoneRecordsDao;
import com.chexun.dealer.model.clue.PhoneRecords;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.model.common.Province;

import org.springframework.stereotype.Repository;

import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * PhoneRecords
 * User:
 * Date: 2016-09-23
 */
 @Repository("phoneRecordsDao")
public class PhoneRecordsDaoImpl extends GenericDaoImpl implements PhoneRecordsDao{

    public Long addPhoneRecords(PhoneRecords phoneRecords) {
        return this.insert("com.chexun.dealer.model.clue.PhoneRecordsMapper.createPhoneRecords",phoneRecords);
    }
	public Long insertPhoneRecords(PhoneRecords phoneRecords){
		return this.insert("com.chexun.dealer.model.clue.PhoneRecordsMapper.insertPhoneRecords",phoneRecords);
	}
    public Long deletePhoneRecordsById(Long id){
        return this.delete("com.chexun.dealer.model.clue.PhoneRecordsMapper.deletePhoneRecordsById",id);
    }
    public Long deletePhoneRecordsByObj(PhoneRecords phoneRecords){
        return this.delete("com.chexun.dealer.model.clue.PhoneRecordsMapper.deletePhoneRecordsByObj",phoneRecords);
    }
    
	public Long deletePhoneRecordsByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.PhoneRecordsMapper.deletePhoneRecordsByIdList",ids);
	}
    public Long updatePhoneRecords(PhoneRecords phoneRecords) {
        return this.update("com.chexun.dealer.model.clue.PhoneRecordsMapper.updatePhoneRecords",phoneRecords);
    }
    
    public Long updatePhoneRecordsByObj(PhoneRecords phoneRecords){
    	return this.update("com.chexun.dealer.model.clue.PhoneRecordsMapper.updatePhoneRecordsByObj",phoneRecords);
    }
    
    public Long updatePhoneRecordsByObjAndConditions(PhoneRecords s,PhoneRecords c){
    	Map<String,PhoneRecords> map = new HashMap<String,PhoneRecords>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.PhoneRecordsMapper.updatePhoneRecordsByObjAndConditions",map);
    }
	public void batchUpdatePhoneRecords(List<PhoneRecords> records){
		this.update("com.chexun.dealer.model.clue.PhoneRecordsMapper.batchUpdatePhoneRecords",records);
	}
    public PhoneRecords getPhoneRecordsById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsById",id);
    }
    
    public PhoneRecords getPhoneRecordsByObj(PhoneRecords phoneRecords) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsByObj",phoneRecords);
    }

    
    public List<PhoneRecords> getPhoneRecordsListByObj(PhoneRecords phoneRecords){
        return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsListByObj",phoneRecords);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<PhoneRecords> getPhoneRecordsListPage(PhoneRecords phoneRecords,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneRecords);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getPhoneRecordsCountByObj(PhoneRecords phoneRecords){
    	return this.selectOne("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsCountByObj", phoneRecords);
    }
    
    public List<PhoneRecords> getPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page) {
        Integer objectscount = getPhoneRecordsCountByObj(phoneRecords);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPhoneRecordsListPage(phoneRecords,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getPhoneRecordsIdByObj(PhoneRecords phoneRecords) {
        return this.selectOne("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsIdByObj",phoneRecords);
    }

    public List<Long> getPhoneRecordsIdList(PhoneRecords phoneRecords) {
        return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsIdList",phoneRecords);
    }
    
    public List<Long> getPhoneRecordsIdListByObj(PhoneRecords phoneRecords){
        return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsIdListByObj",phoneRecords);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getPhoneRecordsIdListPage(PhoneRecords phoneRecords,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneRecords);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.getPhoneRecordsIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getPhoneRecordsIdPage(PhoneRecords phoneRecords,PageEntity page) {
        Integer objectscount = getPhoneRecordsCountByObj(phoneRecords);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getPhoneRecordsIdListPage(phoneRecords,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    /**
     * 手动DAO
     */
    
    public Integer selectPhoneRecordsCountByObj(PhoneRecords phoneRecords){
    	return this.selectOne("com.chexun.dealer.model.clue.PhoneRecordsMapper.selectPhoneRecordsCountByObj", phoneRecords);
    }
    public List<PhoneRecords> selectPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page) {
        Integer objectscount = selectPhoneRecordsCountByObj(phoneRecords);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return selectPhoneRecordsListPage(phoneRecords,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<PhoneRecords> selectPhoneRecordsListPage(PhoneRecords phoneRecords,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(phoneRecords);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.selectPhoneRecordsListByMap",map);
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
	public List<Province> selectProvince() {
		return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.selectProvince",null);
	}
	@Override
	public List<City> selectCityById(Long provinceid) {
		return this.selectList("com.chexun.dealer.model.clue.PhoneRecordsMapper.selectCity",provinceid);
	}
}
