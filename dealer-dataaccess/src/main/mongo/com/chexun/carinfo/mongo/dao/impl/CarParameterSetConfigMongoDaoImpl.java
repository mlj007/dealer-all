package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParameterSetConfigMongo;
import com.chexun.carinfo.mongo.dao.ICarParameterSetConfigMongoDao;
import com.chexun.carinfo.mongo.dao.ICarParameterValuesMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**
  * 20130716
  * @author jp
  *
  */
@Repository("carParameterSetConfigMongoDao")
public class CarParameterSetConfigMongoDaoImpl extends AbstractMultiMongoDao<CarParameterSetConfigMongo> implements ICarParameterSetConfigMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParameterSetConfigMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterSetConfigMongo> find(Object query)  {
		return super.find(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParameterSetConfigMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParameterSetConfigMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParameterSetConfigMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarParameterSetConfigMongo> findAll()  {
		return super.findAll(CarParameterSetConfigMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterSetConfigMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParameterSetConfigMongo get(Integer id)  {
		return super.get(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParameterSetConfigMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParameterSetConfigMongo bean)  {
		super.remove(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParameterSetConfigMongo bean)  {
		super.saveOrUpdate(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParameterSetConfigMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
