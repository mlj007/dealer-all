 /**     
   * @create.date: 2012-3-19 下午04:19:41
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarModelMongo;
import com.chexun.carinfo.mongo.bean.CarSeriesMongo;
import com.chexun.carinfo.mongo.dao.ICarSeriesMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

 /**  
 * @create.date: 2012-3-19 下午04:19:41     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:19:41
 */
@Repository("carSeriesMongoDao")
public class CarSeriesMongoDaoImpl extends AbstractMultiMongoDao<CarSeriesMongo> implements ICarSeriesMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarSeriesMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarSeriesMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarSeriesMongo> find(Object query)  {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarSeriesMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarSeriesMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}
	@Override
	public List<CarSeriesMongo> find(Object query, Object fields,
			Object orderBy, PageInfo pageInfo)  {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query, fields,orderBy, pageInfo);
	}
	@Override
	public List<CarSeriesMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarSeriesMongo> find(Object query, Object fields,
			Object orderBy, int limit, int skip)  {
		return super.find(CarSeriesMongo.MONGO_COLLECT_NAME, query, fields,orderBy, limit, skip);
	}
	@Override
	public List<CarSeriesMongo> findAll()  {
		return super.findAll(CarSeriesMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarSeriesMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarSeriesMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarSeriesMongo get(Integer id)  {
		return super.get(CarSeriesMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarSeriesMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarSeriesMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarSeriesMongo bean)  {
		super.remove(CarSeriesMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarSeriesMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarSeriesMongo bean)  {
		super.saveOrUpdate(CarSeriesMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarSeriesMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarSeriesMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public List<?> groupCarSeries(BasicDBObject keyObject,
			BasicDBObject querySeries, BasicDBObject initialObject,
			String reduce)  {
		return super.group(CarSeriesMongo.MONGO_COLLECT_NAME, keyObject, querySeries, initialObject, reduce);

	}

	@Override
	public List<CarSeriesMongo> getDistinctCarLevelIds(DBObject query) {
		return super.findForDistinct(CarSeriesMongo.MONGO_COLLECT_NAME, query, "level");
	}




}
