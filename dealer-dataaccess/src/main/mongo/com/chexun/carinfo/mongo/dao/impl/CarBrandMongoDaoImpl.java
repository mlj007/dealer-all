 /**     
   * @create.date: 2012-3-8 上午09:22:47
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.hibernate.dao.iface 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarBrandMongo;
import com.chexun.carinfo.mongo.dao.ICarBrandMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-8 上午09:22:47     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.hibernate.dao.iface
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-8 上午09:22:47
 */
@Repository("carBrandMongoDao")
public class CarBrandMongoDaoImpl extends AbstractMultiMongoDao<CarBrandMongo> implements ICarBrandMongoDao {

	@Override
	public void saveOrUpdate(CarBrandMongo bean)  {
		super.saveOrUpdate(CarBrandMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void remove(CarBrandMongo bean)  {
		super.remove(CarBrandMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarBrandMongo.MONGO_COLLECT_NAME, id);
		
	}

	@Override
	public CarBrandMongo get(Integer id)  {
		return super.get(CarBrandMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarBrandMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarBrandMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public List<CarBrandMongo> find(Object query)  {
		return super.find(CarBrandMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarBrandMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<CarBrandMongo> find(Object query, PageInfo pageInfo)
			 {		
		return super.find(CarBrandMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarBrandMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarBrandMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarBrandMongo> find(Object query, Object orderBy, int limit, int skip)
			 {
		return super.find(CarBrandMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarBrandMongo> find(Object query, Object fields,
			Object orderBy, int limit, int skip)  {
		return super.find(CarBrandMongo.MONGO_COLLECT_NAME, query, fields,orderBy, limit, skip);
	}
	@Override
	public List<CarBrandMongo> findAll()  {
		return super.findAll(CarBrandMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarBrandMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarBrandMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public long count(Object query)  {
		return super.count(CarBrandMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarBrandMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarBrandMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}



}
