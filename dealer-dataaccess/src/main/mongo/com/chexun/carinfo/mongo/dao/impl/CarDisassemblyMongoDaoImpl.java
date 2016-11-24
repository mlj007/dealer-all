 /**     
   * @create.date: 2012-3-8 上午09:22:47
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.hibernate.dao.iface 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.CarDisassemblyMongo;
import com.chexun.carinfo.mongo.dao.ICarDisassemblyMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

 /**  
 * @create.date: 2013-2-28 上午10:19:47     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.hibernate.dao.iface
 * @author: jp
 * @modify.by: jp
 * @modify.date: 2012-2-8 上午10:19:47 
 */
@Repository("carDisassemblyMongoDao")
public class CarDisassemblyMongoDaoImpl extends AbstractMultiMongoDao<CarDisassemblyMongo> implements ICarDisassemblyMongoDao {

	@Override
	public void saveOrUpdate(CarDisassemblyMongo bean)  {
		super.saveOrUpdate(CarDisassemblyMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void remove(CarDisassemblyMongo bean)  {
		super.remove(CarDisassemblyMongo.MONGO_COLLECT_NAME, bean);
		
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarDisassemblyMongo.MONGO_COLLECT_NAME, id);
		
	}

	@Override
	public CarDisassemblyMongo get(Integer id)  {
		return super.get(CarDisassemblyMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<CarDisassemblyMongo> getByProperyList(String propertyName, Object value)
			 {
		return super.getByProperyList(CarDisassemblyMongo.MONGO_COLLECT_NAME, propertyName, value);
	}

	@Override
	public List<CarDisassemblyMongo> find(Object query)  {
		return super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<CarDisassemblyMongo> find(Object query, PageInfo pageInfo)
			 {		
		return super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, pageInfo);
	}

	@Override
	public List<CarDisassemblyMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			 {
		return super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public List<CarDisassemblyMongo> find(Object query, Object orderBy, int limit, int skip)
			 {
		return super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	@Override
	public List<CarDisassemblyMongo> find(Object query, Object fields,
			Object orderBy, int limit, int skip)  {
		return super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, fields,orderBy, limit, skip);
	}
	@Override
	public List<CarDisassemblyMongo> findAll()  {
		return super.findAll(CarDisassemblyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<CarDisassemblyMongo> findAll(PageInfo pageInfo)  {
		return super.findAll(CarDisassemblyMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public long count(Object query)  {
		return super.count(CarDisassemblyMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarDisassemblyMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarDisassemblyMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	public CarDisassemblyMongo findOne(Object query, Object orderBy) {
		List<CarDisassemblyMongo> list = super.find(CarDisassemblyMongo.MONGO_COLLECT_NAME, query, null, orderBy, 1, 0);
		if(list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}



}
