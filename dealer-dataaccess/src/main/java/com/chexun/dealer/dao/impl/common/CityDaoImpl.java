package com.chexun.dealer.dao.impl.common;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.chexun.dealer.model.common.City;
import com.chexun.dealer.dao.common.CityDao;

import org.springframework.stereotype.Repository;

import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * City
 * User:
 * Date: 2016-09-29
 */
 @Repository("cityDao")
public class CityDaoImpl extends GenericDaoImpl implements CityDao{

    public Long addCity(City city) {
        return this.insert("com.chexun.dealer.model.common.CityMapper.createCity",city);
    }
	public Long insertCity(City city){
		return this.insert("com.chexun.dealer.model.common.CityMapper.insertCity",city);
	}
    public Long deleteCityById(Long id){
        return this.delete("com.chexun.dealer.model.common.CityMapper.deleteCityById",id);
    }
    public Long deleteCityByObj(City city){
        return this.delete("com.chexun.dealer.model.common.CityMapper.deleteCityByObj",city);
    }
    
	public Long deleteCityByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.common.CityMapper.deleteCityByIdList",ids);
	}
    public Long updateCity(City city) {
        return this.update("com.chexun.dealer.model.common.CityMapper.updateCity",city);
    }
    
    public Long updateCityByObj(City city){
    	return this.update("com.chexun.dealer.model.common.CityMapper.updateCityByObj",city);
    }
    
    public Long updateCityByObjAndConditions(City s,City c){
    	Map<String,City> map = new HashMap<String,City>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.common.CityMapper.updateCityByObjAndConditions",map);
    }
	public void batchUpdateCity(List<City> records){
		this.update("com.chexun.dealer.model.common.CityMapper.batchUpdateCity",records);
	}
    public City getCityById(Long id) {
        return this.selectOne("com.chexun.dealer.model.common.CityMapper.getCityById",id);
    }
    
    public City getCityByObj(City city) {
        return this.selectOne("com.chexun.dealer.model.common.CityMapper.getCityByObj",city);
    }

    
    public List<City> getCityListByObj(City city){
        return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityListByObj",city);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<City> getCityListPage(City city,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(city);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getCityCountByObj(City city){
    	return this.selectOne("com.chexun.dealer.model.common.CityMapper.getCityCountByObj", city);
    }
    
    public List<City> getCityPage(City city,PageEntity page) {
        Integer objectscount = getCityCountByObj(city);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getCityListPage(city,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getCityIdByObj(City city) {
        return this.selectOne("com.chexun.dealer.model.common.CityMapper.getCityIdByObj",city);
    }

    public List<Long> getCityIdList(City city) {
        return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityIdList",city);
    }
    
    public List<Long> getCityIdListByObj(City city){
        return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityIdListByObj",city);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getCityIdListPage(City city,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(city);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getCityIdPage(City city,PageEntity page) {
        Integer objectscount = getCityCountByObj(city);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getCityIdListPage(city,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    //added 根据id(多个查询)城市列表
    @Override
    public List<City> getCityListByIds(List<Long> idList){
    	return this.selectList("com.chexun.dealer.model.common.CityMapper.getCityListByIds",idList);
    }
}
