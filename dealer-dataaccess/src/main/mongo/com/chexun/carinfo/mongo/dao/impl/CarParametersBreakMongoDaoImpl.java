 /**     
   * @create.date: 2012-3-19 下午04:09:54
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParametersBreakMongo;
import com.chexun.carinfo.mongo.dao.ICarParametersBreakMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;

 /**  
 * @create.date: 2012-3-19 下午04:09:54     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:09:54
 */
@Repository("carParametersBreakMongoDao")
public class CarParametersBreakMongoDaoImpl extends AbstractMultiMongoDao<CarParametersBreakMongo> implements ICarParametersBreakMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParametersBreakMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParametersBreakMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParametersBreakMongo> find(Object query)  {
		return super.find(CarParametersBreakMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParametersBreakMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParametersBreakMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParametersBreakMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParametersBreakMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParametersBreakMongo> find(Object query, Object field, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParametersBreakMongo.MONGO_COLLECT_NAME, query, field,orderBy, limit, skip);
	}
	@Override
	public List<CarParametersBreakMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParametersBreakMongo.MONGO_COLLECT_NAME, query,orderBy, limit, skip);
	}

	@Override
	public List<CarParametersBreakMongo> findAll()  {
		return super.findAll(CarParametersBreakMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParametersBreakMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParametersBreakMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParametersBreakMongo get(Integer id)  {
		return super.get(CarParametersBreakMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParametersBreakMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParametersBreakMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParametersBreakMongo bean)  {
		super.remove(CarParametersBreakMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParametersBreakMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParametersBreakMongo bean)  {
		super.saveOrUpdate(CarParametersBreakMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParametersBreakMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParametersBreakMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public List<CarParametersBreakMongo> findForDistinct(BasicDBObject queryParamObject,
			String distinctKey)  {
		return super.findForDistinct(CarParametersBreakMongo.MONGO_COLLECT_NAME, queryParamObject, distinctKey);
	}
}
