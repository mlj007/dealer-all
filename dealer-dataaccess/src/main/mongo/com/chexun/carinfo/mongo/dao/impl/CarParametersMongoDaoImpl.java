 /**     
   * @create.date: 2012-3-19 下午04:09:54
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParametersMongo;
import com.chexun.carinfo.mongo.dao.ICarParametersMongoDao;
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
@Repository("carParametersMongoDao")
public class CarParametersMongoDaoImpl extends AbstractMultiMongoDao<CarParametersMongo> implements ICarParametersMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParametersMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParametersMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParametersMongo> find(Object query)  {
		return super.find(CarParametersMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParametersMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParametersMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParametersMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParametersMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParametersMongo> find(Object query, Object field, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParametersMongo.MONGO_COLLECT_NAME, query, field,orderBy, limit, skip);
	}
	@Override
	public List<CarParametersMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParametersMongo.MONGO_COLLECT_NAME, query,orderBy, limit, skip);
	}

	@Override
	public List<CarParametersMongo> findAll()  {
		return super.findAll(CarParametersMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParametersMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParametersMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParametersMongo get(Integer id)  {
		return super.get(CarParametersMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParametersMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParametersMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParametersMongo bean)  {
		super.remove(CarParametersMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParametersMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParametersMongo bean)  {
		super.saveOrUpdate(CarParametersMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParametersMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParametersMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public List<CarParametersMongo> findForDistinct(BasicDBObject queryParamObject,
			String distinctKey)  {
		return super.findForDistinct(CarParametersMongo.MONGO_COLLECT_NAME, queryParamObject, distinctKey);
	}
}
