package com.chexun.carinfo.mongo.dao.impl;

/**     
 * @create.date: 2012-4-7 上午09:45:11
 * @author: zxj 
 * @company: chexun
 * @see:com.chexun.carinfo.mongo.dao.impl 
 */ 


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.bean.CarSortMongo;
import com.chexun.carinfo.mongo.dao.CarSortMongoCronDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;


/**  
* @create.date: 2012-4-7 上午09:45:11     
* @comment: <p>TODO</p>
* @see: com.chexun.carinfo.mongo.dao.impl
* @author: lfz
* @modify.by: lfz
* @modify.date: 2012-4-7 上午09:45:11
*/
@Repository("carSortMongoCronDao")
public class CarSortMongoCronDaoImpl extends AbstractMultiMongoDao<CarSortMongo> implements CarSortMongoCronDao{
	
	

	@Override
	public List<CarSortMongo> find(Object query, Object orderBy,
			PageInfo pageInfo)  {
		return super.find(CarSortMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public void remove(CarSortMongo bean)  {
		super.remove(CarSortMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(CarSortMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(CarSortMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public void saveOrUpdate(CarSortMongo bean)  {
		super.saveOrUpdate(CarSortMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public long count(Object query)  {
		return super.count(CarSortMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(CarSortMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(CarSortMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<CarSortMongo> find(Object query)  {
		return super.find(CarSortMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<CarSortMongo> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(CarSortMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public CarSortMongo getBean(Integer id)  {
		return super.get(CarSortMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public Map getAllSortMap() throws Exception {
		// TODO Auto-generated method stub
		BasicDBObject query1 = new BasicDBObject();
		BasicDBObject order1 = new BasicDBObject();
		order1.put("id", 1);
		List<CarSortMongo> list1 = find(query1,order1,0,0);
		Map map = new HashMap();
		for(CarSortMongo carsort:list1){
			map.put(carsort.getSeriesId(), carsort.getSort());
		}		
		return map;
	}
	
	
}

