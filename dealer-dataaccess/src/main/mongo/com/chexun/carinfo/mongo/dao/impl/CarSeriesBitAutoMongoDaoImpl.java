package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarSeriesBitAutoMongo;
import com.chexun.carinfo.mongo.bean.CarSeriesBitAutoPkMongo;
import com.chexun.carinfo.mongo.dao.ICarSeriesBitAutoMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;

@Repository("carSeriesBitAutoMongoDao")
public class CarSeriesBitAutoMongoDaoImpl extends AbstractMultiMongoDao<CarSeriesBitAutoMongo> implements ICarSeriesBitAutoMongoDao {
	@Override
	public List<CarSeriesBitAutoMongo> find(Object query)  {
		return super.find(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public CarSeriesBitAutoMongo get(Integer id)  {
		return super.get(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarSeriesBitAutoMongo> getByProperyList(String propertyName, Object value)  {
		return super.getByProperyList(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarSeriesBitAutoMongo bean)  {
		super.remove(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarSeriesBitAutoMongo bean)  {
		super.saveOrUpdate(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i = 0; i < ids.length; i++) {
				super.removeByKey(CarSeriesBitAutoMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
