 /**     
   * @create.date: 2012-3-19 下午04:03:06
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarParameterOptionsMongo;
import com.chexun.carinfo.mongo.dao.ICarParameterOptionsMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2012-3-19 下午04:03:06     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:03:06
 */
@Repository("carParameterOptionsMongoDao")
public class CarParameterOptionsMongoDaoImpl extends AbstractMultiMongoDao<CarParameterOptionsMongo> implements ICarParameterOptionsMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarParameterOptionsMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterOptionsMongo> find(Object query)  {
		return super.find(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarParameterOptionsMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarParameterOptionsMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarParameterOptionsMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public List<CarParameterOptionsMongo> findAll()  {
		return super.findAll(CarParameterOptionsMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarParameterOptionsMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarParameterOptionsMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public CarParameterOptionsMongo get(Integer id)  {
		return super.get(CarParameterOptionsMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarParameterOptionsMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarParameterOptionsMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public void remove(CarParameterOptionsMongo bean)  {
		super.remove(CarParameterOptionsMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarParameterOptionsMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(CarParameterOptionsMongo bean)  {
		super.saveOrUpdate(CarParameterOptionsMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarParameterOptionsMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarParameterOptionsMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}
}
