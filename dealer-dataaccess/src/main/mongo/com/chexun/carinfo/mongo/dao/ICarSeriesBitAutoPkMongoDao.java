package com.chexun.carinfo.mongo.dao;

import java.util.List;



import com.chexun.carinfo.mongo.bean.CarSeriesBitAutoPkMongo;

public interface ICarSeriesBitAutoPkMongoDao {
	
	public void saveOrUpdate(CarSeriesBitAutoPkMongo bean) ;

	public void remove(CarSeriesBitAutoPkMongo bean) ;

	public void removeByKey(Integer id) ;
	
	public List<CarSeriesBitAutoPkMongo> find(Object query) ;

}
