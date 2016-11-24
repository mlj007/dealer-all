 /**     
   * @create.date: 2012-4-7 上午09:45:11
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;

import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.ImpressionMongo;
import com.chexun.carinfo.mongo.dao.IImpressionMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;
import com.chexun.common.mongo.PageInfo;


 /**  
 * @create.date: 2012-4-7 上午09:45:11     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-7 上午09:45:11
 */
@Repository("impressionMongoDao")
public class ImpressionMongoDaoImpl extends AbstractMultiMongoDao<ImpressionMongo> implements IImpressionMongoDao{

	@Override
	public List<ImpressionMongo> find(Object query, Object orderBy,
			PageInfo pageInfo)  {
		return super.find(ImpressionMongo.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public void remove(ImpressionMongo bean)  {
		super.remove(ImpressionMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(ImpressionMongo.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(ImpressionMongo.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public void saveOrUpdate(ImpressionMongo bean)  {
		super.saveOrUpdate(ImpressionMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public long count(Object query)  {
		return super.count(ImpressionMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(ImpressionMongo.MONGO_COLLECT_NAME);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(ImpressionMongo.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<ImpressionMongo> find(Object query)  {
		return super.find(ImpressionMongo.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<ImpressionMongo> find(Object query, Object field,Object orderBy, int limit,
			int skip)  {
		return super.find(ImpressionMongo.MONGO_COLLECT_NAME, query,field, orderBy, limit, skip);
	}
	@Override
	public List<ImpressionMongo> find(Object query,Object orderBy, int limit,
			int skip)  {
		return super.find(ImpressionMongo.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}
	
}
