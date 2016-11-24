 /**     
   * @create.date: 2012-3-19 下午02:11:33
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarCompanyMongo;
import com.chexun.carinfo.mongo.dao.ICarCompanyMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午02:11:33     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午02:11:33
 */
@Repository("carCompanyMongoDao")
public class CarCompanyMongoDaoImpl extends AbstractMultiMongoDao<CarCompanyMongo> implements ICarCompanyMongoDao {

	@Override
	public long count(Object query)  {
		return super.count(CarCompanyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarCompanyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarCompanyMongo> find(Object query)  {
		return super.find(CarCompanyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarCompanyMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarCompanyMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarCompanyMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarCompanyMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarCompanyMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarCompanyMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarCompanyMongo> find(Object query, Object fields,
			Object orderBy, int limit, int skip)  {
		return super.find(CarCompanyMongo.MONGO_COLLECT_NAME, query, fields ,orderBy, limit, skip);
	}

	@Override
	public List<CarCompanyMongo> findAll()  {
		return super.findAll(CarCompanyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarCompanyMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarCompanyMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarCompanyMongo get(Integer id)  {
		return super.get(CarCompanyMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarCompanyMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarCompanyMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarCompanyMongo bean)  {
		super.remove(CarCompanyMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarCompanyMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarCompanyMongo bean)  {
		super.saveOrUpdate(CarCompanyMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarCompanyMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarCompanyMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}


}
