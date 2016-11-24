package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarSeriesBitAutoPkMongo;
import com.chexun.carinfo.mongo.dao.ICarSeriesBitAutoPkMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;

@Repository("carSeriesBitAutoPkMongoDao")
public class CarSeriesBitAutoPkMongoDaoImpl extends AbstractMultiMongoDao<CarSeriesBitAutoPkMongo> implements ICarSeriesBitAutoPkMongoDao {

	@Override
	public void remove(CarSeriesBitAutoPkMongo bean)  {
		super.remove(CarSeriesBitAutoPkMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarSeriesBitAutoPkMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarSeriesBitAutoPkMongo bean)  {
		super.saveOrUpdate(CarSeriesBitAutoPkMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public List<CarSeriesBitAutoPkMongo> find(Object query)  {
		return super.find(CarSeriesBitAutoPkMongo.MONGO_COLLECT_NAME, query);
	}
}
