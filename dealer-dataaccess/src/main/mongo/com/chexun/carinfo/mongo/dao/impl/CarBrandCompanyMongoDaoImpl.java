 /**     
   * @create.date: 2012-3-21 下午04:38:37
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarBrandCompanyMongo;
import com.chexun.carinfo.mongo.dao.ICarBrandCompanyMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-21 下午04:38:37     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 下午04:38:37
 */
@Repository("carBrandCompanyMongoDao")
public class CarBrandCompanyMongoDaoImpl extends AbstractMultiMongoDao<CarBrandCompanyMongo> implements ICarBrandCompanyMongoDao {

	@Override
	public void saveOrUpdate(CarBrandCompanyMongo bean)  {
		super.saveOrUpdate(CarBrandCompanyMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void remove(CarBrandCompanyMongo bean)  {
		super.remove(CarBrandCompanyMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarBrandCompanyMongo.MONGO_COLLECT_NAME, id);
		
	}

	@Override
	public CarBrandCompanyMongo get(Integer id)  {
		return super.get(CarBrandCompanyMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarBrandCompanyMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarBrandCompanyMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public List<CarBrandCompanyMongo> find(Object query)  {
		return super.find(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<CarBrandCompanyMongo> find(Object query, PageInfo pageInfo)
			 {		
		return super.find(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarBrandCompanyMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarBrandCompanyMongo> find(Object query, Object orderBy, int limit, int skip)
			 {
		return super.find(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarBrandCompanyMongo> findAll()  {
		return super.findAll(CarBrandCompanyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarBrandCompanyMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarBrandCompanyMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public long count(Object query)  {
		return super.count(CarBrandCompanyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarBrandCompanyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarBrandCompanyMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
