 /**     
   * @create.date: 2012-3-19 下午04:21:50
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarYearsMongo;
import com.chexun.carinfo.mongo.dao.ICarYearsMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午04:21:50     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:21:50
 */
@Repository("carYearsMongoDao")
public class CarYearsMongoDaoImpl extends AbstractMultiMongoDao<CarYearsMongo> implements ICarYearsMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarYearsMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarYearsMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarYearsMongo> find(Object query)  {
		return super.find(CarYearsMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarYearsMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarYearsMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarYearsMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarYearsMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarYearsMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarYearsMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<?> find(Object query, Object fields, Object orderBy, int limit,
			int skip)  {
		return super.find(CarYearsMongo.MONGO_COLLECT_NAME, query, fields ,orderBy, limit, skip);
	}
	@Override
	public List<CarYearsMongo> findAll()  {
		return super.findAll(CarYearsMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarYearsMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarYearsMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarYearsMongo get(Integer id)  {
		return super.get(CarYearsMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarYearsMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarYearsMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarYearsMongo bean)  {
		super.remove(CarYearsMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarYearsMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarYearsMongo bean)  {
		super.saveOrUpdate(CarYearsMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarYearsMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarYearsMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}


}
