package com.chexun.carinfo.mongo.dao;

import java.util.List;



import com.chexun.carinfo.mongo.bean.CarSeriesBitAutoMongo;

public interface ICarSeriesBitAutoMongoDao {
	public void saveOrUpdate(CarSeriesBitAutoMongo bean) ;

	public void remove(CarSeriesBitAutoMongo bean) ;

	public void removeByKey(Integer id) ;

	public void removeByKeys(Integer[] ids) ;

	public CarSeriesBitAutoMongo get(Integer id) ;

	public List<CarSeriesBitAutoMongo> getByProperyList(String propertyName, Object value) ;

	public List<CarSeriesBitAutoMongo> find(Object query) ;

	public boolean update(Object query, Object parameter) ;

}
