/**     
 * @create.date: 2012-3-19 下午03:25:12
 * @author: lfz 
 * @company: 车马驿站
 * @see:com.chexun.carinfo.mongo.dao.impl 
 */
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.PriceIntervalMongo;
import com.chexun.carinfo.mongo.dao.IPriceIntervalMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;

/**
 * 车系价格区间
 */
@Repository("priceIntervalMongoDao")
public class PriceIntervalMongoDaoImpl extends
		AbstractMultiMongoDao<PriceIntervalMongo> implements
		IPriceIntervalMongoDao {
	@Override
	public long count(Object query)  {
		return super.count(PriceIntervalMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(PriceIntervalMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<PriceIntervalMongo> find(Object query)  {
		return super.find(PriceIntervalMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<PriceIntervalMongo> find(Object query, PageInfo pageInfo)
			 {
		return super.find(PriceIntervalMongo.MONGO_COLLECT_NAME, query,
				pageInfo);
	}

	@Override
	public List<PriceIntervalMongo> find(Object query, Object orderBy,
			PageInfo pageInfo)  {
		return super.find(PriceIntervalMongo.MONGO_COLLECT_NAME, query,
				orderBy, pageInfo);
	}

	@Override
	public List<PriceIntervalMongo> find(Object query, Object orderBy,
			int limit, int skip)  {
		return super.find(PriceIntervalMongo.MONGO_COLLECT_NAME, query,
				orderBy, limit, skip);
	}

	@Override
	public List<PriceIntervalMongo> findAll()  {
		return super.findAll(PriceIntervalMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public List<PriceIntervalMongo> findAll(PageInfo pageInfo)
			 {
		return super.findAll(PriceIntervalMongo.MONGO_COLLECT_NAME, pageInfo);
	}

	@Override
	public PriceIntervalMongo get(Integer id)  {
		return super.get(PriceIntervalMongo.MONGO_COLLECT_NAME, id + "");
	}

	@Override
	public List<PriceIntervalMongo> getByProperyList(String propertyName,
			Object value)  {
		return super.getByProperyList(PriceIntervalMongo.MONGO_COLLECT_NAME,
				propertyName, value);
	}

	@Override
	public void remove(PriceIntervalMongo bean)  {
		super.remove(PriceIntervalMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(PriceIntervalMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void saveOrUpdate(PriceIntervalMongo bean)  {
		super.saveOrUpdate(PriceIntervalMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(PriceIntervalMongo.MONGO_COLLECT_NAME, query,
				parameter);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i = 0; i < ids.length; i++) {
				super
						.removeByKey(PriceIntervalMongo.MONGO_COLLECT_NAME,
								ids[i]);
			}
		}
	}
}
