 /**     
   * @create.date: 2012-3-19 下午04:00:12
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParameterConfigMongo;
import com.chexun.carinfo.mongo.dao.ICarParameterConfigMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午04:00:12     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:00:12
 */
@Repository("carParameterConfigMongoDao")
public class CarParameterConfigMongoDaoImpl extends AbstractMultiMongoDao<CarParameterConfigMongo> implements ICarParameterConfigMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParameterConfigMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParameterConfigMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterConfigMongo> find(Object query)  {
		return super.find(CarParameterConfigMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParameterConfigMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParameterConfigMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParameterConfigMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParameterConfigMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParameterConfigMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParameterConfigMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarParameterConfigMongo> findAll()  {
		return super.findAll(CarParameterConfigMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterConfigMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParameterConfigMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParameterConfigMongo get(Integer id)  {
		return super.get(CarParameterConfigMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParameterConfigMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParameterConfigMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParameterConfigMongo bean)  {
		super.remove(CarParameterConfigMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParameterConfigMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParameterConfigMongo bean)  {
		super.saveOrUpdate(CarParameterConfigMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParameterConfigMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParameterConfigMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
