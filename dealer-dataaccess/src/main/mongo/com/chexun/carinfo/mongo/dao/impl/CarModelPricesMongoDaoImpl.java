 /**     
   * @create.date: 2012-3-19 下午03:56:28
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarModelPricesMongo;
import com.chexun.carinfo.mongo.dao.ICarModelPricesMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午03:56:28     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午03:56:28
 */
@Repository("carModelPricesMongoDao")
public class CarModelPricesMongoDaoImpl extends AbstractMultiMongoDao<CarModelPricesMongo> implements ICarModelPricesMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarModelPricesMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarModelPricesMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarModelPricesMongo> find(Object query)  {
		return super.find(CarModelPricesMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarModelPricesMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarModelPricesMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarModelPricesMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarModelPricesMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarModelPricesMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarModelPricesMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarModelPricesMongo> findAll()  {
		return super.findAll(CarModelPricesMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarModelPricesMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarModelPricesMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarModelPricesMongo get(Integer id)  {
		return super.get(CarModelPricesMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarModelPricesMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarModelPricesMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarModelPricesMongo bean)  {
		super.remove(CarModelPricesMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarModelPricesMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarModelPricesMongo bean)  {
		super.saveOrUpdate(CarModelPricesMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarModelPricesMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarModelPricesMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
