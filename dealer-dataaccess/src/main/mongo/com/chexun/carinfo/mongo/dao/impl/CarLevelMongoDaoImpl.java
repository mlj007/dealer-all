 /**     
   * @create.date: 2012-3-19 下午03:25:12
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarLevelMongo;
import com.chexun.carinfo.mongo.dao.ICarLevelMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;


 /**  
 * @create.date: 2012-3-19 下午03:25:12     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午03:25:12
 */
@Repository("carLevelMongoDao")
public class CarLevelMongoDaoImpl extends AbstractMultiMongoDao<CarLevelMongo> implements ICarLevelMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarLevelMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarLevelMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarLevelMongo> find(Object query)  {
		return super.find(CarLevelMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarLevelMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarLevelMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarLevelMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarLevelMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarLevelMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarLevelMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarLevelMongo> findAll()  {
		return super.findAll(CarLevelMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarLevelMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarLevelMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarLevelMongo get(Integer id)  {
		return super.get(CarLevelMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarLevelMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarLevelMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarLevelMongo bean)  {
		super.remove(CarLevelMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarLevelMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarLevelMongo bean)  {
		super.saveOrUpdate(CarLevelMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarLevelMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarLevelMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
