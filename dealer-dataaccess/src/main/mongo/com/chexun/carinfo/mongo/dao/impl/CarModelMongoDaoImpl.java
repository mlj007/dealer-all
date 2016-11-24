 /**     
   * @create.date: 2012-3-19 下午03:53:57
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarModelMongo;
import com.chexun.carinfo.mongo.dao.ICarModelMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

 /**  
 * @create.date: 2012-3-19 下午03:53:57     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午03:53:57
 */
@Repository("carModelMongoDao")
public class CarModelMongoDaoImpl extends AbstractMultiMongoDao<CarModelMongo> implements ICarModelMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarModelMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarModelMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarModelMongo> find(Object query)  {
		return super.find(CarModelMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarModelMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarModelMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarModelMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarModelMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarModelMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarModelMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarModelMongo> find(Object queryObject,
			Object fieldsObject, Object orderByObject, int limit,
			int skip)  {
		return super.find(CarModelMongo.MONGO_COLLECT_NAME, queryObject, fieldsObject, orderByObject, limit, skip);
	}
	@Override
	public List<CarModelMongo> findAll()  {
		return super.findAll(CarModelMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarModelMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarModelMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarModelMongo get(Integer id)  {
		return super.get(CarModelMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarModelMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarModelMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarModelMongo bean)  {
		super.remove(CarModelMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarModelMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarModelMongo bean)  {
		super.saveOrUpdate(CarModelMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarModelMongo.MONGO_COLLECT_NAME, query, parameter);
	}
	@Override
	public void updateOne(Integer id, Object object)
			 {
		super.updateOne(CarModelMongo.MONGO_COLLECT_NAME, id, object);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarModelMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public List<?> groupCarModel(BasicDBObject keyObject,
			BasicDBObject queryObject, BasicDBObject initialObject,
			String reduce)  {
		return super.group(CarModelMongo.MONGO_COLLECT_NAME, keyObject, queryObject, initialObject, reduce);
	}

	@Override
	public List<?> findForDistinct(DBObject query, String key) {
		return super.findForDistinct(CarModelMongo.MONGO_COLLECT_NAME, query, key);
	}



}
