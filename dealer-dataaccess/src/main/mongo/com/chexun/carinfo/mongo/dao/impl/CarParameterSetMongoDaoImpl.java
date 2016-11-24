 /**     
   * @create.date: 2012-3-19 下午04:07:44
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParameterSetMongo;
import com.chexun.carinfo.mongo.dao.ICarParameterSetMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午04:07:44     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:07:44
 */
@Repository("carParameterSetMongoDao")
public class CarParameterSetMongoDaoImpl extends AbstractMultiMongoDao<CarParameterSetMongo> implements ICarParameterSetMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParameterSetMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParameterSetMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterSetMongo> find(Object query)  {
		return super.find(CarParameterSetMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParameterSetMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParameterSetMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParameterSetMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParameterSetMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParameterSetMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParameterSetMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarParameterSetMongo> findAll()  {
		return super.findAll(CarParameterSetMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterSetMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParameterSetMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParameterSetMongo get(Integer id)  {
		return super.get(CarParameterSetMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParameterSetMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParameterSetMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParameterSetMongo bean)  {
		super.remove(CarParameterSetMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParameterSetMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParameterSetMongo bean)  {
		super.saveOrUpdate(CarParameterSetMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParameterSetMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParameterSetMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
