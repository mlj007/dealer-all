package com.chexun.dealer.dao.common;
import java.util.List;
import com.chexun.dealer.model.common.City;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * City管理接口
 * User: 
 * Date: 2016-09-29
 */
public interface CityDao {

    /**
     * 添加City
     * @param city 要添加的City
     * @return id
     */
    public Long addCity(City city);
	public Long insertCity(City city);
    /**
     * 根据id删除一个City
     * @param id 要删除的id
     */
    public Long deleteCityById(Long id);
    
    public Long deleteCityByObj(City city);

	public Long deleteCityByIdList(List<Long > ids);

    /**
     * 修改City
     * @param city 要修改的City
     */
    public Long updateCity(City city);
    
    public Long updateCityByObj(City city);
    
    public Long updateCityByObjAndConditions(City s,City c);
    public void batchUpdateCity(List<City> records);

    /**
     * 根据id获取单个City对象
     * @param id 要查询的id
     * @return City
     */
    public City getCityById(Long id);
	public City getCityByObj(City city);
    /**
     * 根据条件获取City列表
     * @param city 查询条件
     * @return List<City>
     */
    public List<City> getCityListByObj(City city);
    public List<City> getCityListPage(City city,Integer offset,Integer limit);
    public Integer getCityCountByObj(City city);
    public List<City> getCityPage(City city,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getCityIdByObj(City city);
    /**
     * 根据条件获取City列表
     * @param city 查询条件
     * @return List<City>
     */
    public List<Long> getCityIdList(City city);
    public List<Long> getCityIdListByObj(City city);
    public List<Long> getCityIdListPage(City city,Integer offset,Integer limit);
    public List<Long> getCityIdPage(City city,PageEntity page);
    
    
    //added 根据id(多个查询)城市列表
    public List<City> getCityListByIds(List<Long> idList);
}