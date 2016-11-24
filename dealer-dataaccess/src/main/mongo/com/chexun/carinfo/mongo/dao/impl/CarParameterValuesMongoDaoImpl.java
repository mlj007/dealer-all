 /**     
   * @create.date: 2012-3-20 下午12:29:02
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParameterValueMongo;
import com.chexun.carinfo.mongo.dao.ICarParameterValuesMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-20 下午12:29:02     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-20 下午12:29:02
 */
@Repository("carParameterValuesMongoDao")
public class CarParameterValuesMongoDaoImpl extends AbstractMultiMongoDao<CarParameterValueMongo> implements ICarParameterValuesMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParameterValueMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParameterValueMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterValueMongo> find(Object query)  {
		return super.find(CarParameterValueMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParameterValueMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParameterValueMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParameterValueMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParameterValueMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParameterValueMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParameterValueMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarParameterValueMongo> findAll()  {
		return super.findAll(CarParameterValueMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterValueMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParameterValueMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParameterValueMongo get(Integer id)  {
		return super.get(CarParameterValueMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParameterValueMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParameterValueMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParameterValueMongo bean)  {
		super.remove(CarParameterValueMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParameterValueMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParameterValueMongo bean)  {
		super.saveOrUpdate(CarParameterValueMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParameterValueMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParameterValueMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
