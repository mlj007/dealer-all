package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarFuelPriceMongo;
import com.chexun.carinfo.mongo.dao.ICarFuelPriceMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@Repository("carFuelPriceMongoDao")
public class CarFuelPriceMongoDaoImpl extends AbstractMultiMongoDao<CarFuelPriceMongo> implements ICarFuelPriceMongoDao{
	@Override
	public long count(Object query)  {
		return super.count(CarFuelPriceMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarFuelPriceMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarFuelPriceMongo> find(Object query)  {
		return super.find(CarFuelPriceMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarFuelPriceMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarFuelPriceMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarFuelPriceMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarFuelPriceMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarFuelPriceMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarFuelPriceMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarFuelPriceMongo> find(Object queryObject,
			Object fieldsObject, Object orderByObject, int limit,
			int skip)  {
		return super.find(CarFuelPriceMongo.MONGO_COLLECT_NAME, queryObject, fieldsObject, orderByObject, limit, skip);
	}
	@Override
	public List<CarFuelPriceMongo> findAll()  {
		return super.findAll(CarFuelPriceMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarFuelPriceMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarFuelPriceMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarFuelPriceMongo get(Integer id)  {
		return super.get(CarFuelPriceMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarFuelPriceMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarFuelPriceMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarFuelPriceMongo bean)  {
		super.remove(CarFuelPriceMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarFuelPriceMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarFuelPriceMongo bean)  {
		super.saveOrUpdate(CarFuelPriceMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarFuelPriceMongo.MONGO_COLLECT_NAME, query, parameter);
	}
	@Override
	public void updateOne(Integer id, Object object)
			 {
		super.updateOne(CarFuelPriceMongo.MONGO_COLLECT_NAME, id, object);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarFuelPriceMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public List<?> groupCarModel(BasicDBObject keyObject,
			BasicDBObject queryObject, BasicDBObject initialObject,
			String reduce)  {
		return super.group(CarFuelPriceMongo.MONGO_COLLECT_NAME, keyObject, queryObject, initialObject, reduce);
	}

	@Override
	public List<?> findForDistinct(DBObject query, String key) {
		return super.findForDistinct(CarFuelPriceMongo.MONGO_COLLECT_NAME, query, key);
	}
}
