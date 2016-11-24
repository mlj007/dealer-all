package com.chexun.carinfo.mongo.dao.impl;

/**     
 * @create.date: 2012-4-7 上午09:45:11
 * @author: zxj 
 * @company: chexun
 * @see:com.chexun.carinfo.mongo.dao.impl 
 */ 


import java.util.List;




import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.ErrorPicking;
import com.chexun.carinfo.mongo.dao.CarErrorMongoDao;
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
@Repository("carErrorMongo")
public class CarErrorMongoImpl extends AbstractMultiMongoDao<ErrorPicking> implements CarErrorMongoDao{

	@Override
	public List<ErrorPicking> find(Object query, Object orderBy,
			PageInfo pageInfo)  {
		return super.find(ErrorPicking.MONGO_COLLECT_NAME, query, orderBy, pageInfo);
	}

	@Override
	public void remove(ErrorPicking bean)  {
		super.remove(ErrorPicking.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public void removeByKey(Integer id)  {
		super.removeByKey(ErrorPicking.MONGO_COLLECT_NAME, id);
	}

	@Override
	public void removeByKeys(Integer[] ids)  {
		if (ids != null && ids.length > 0) {
			for (int i=0; i<ids.length; i++) {
				super.removeByKey(ErrorPicking.MONGO_COLLECT_NAME, ids[i]);
			}
		}
	}

	@Override
	public void saveOrUpdate(ErrorPicking bean)  {
		super.saveOrUpdate2(ErrorPicking.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public long count(Object query)  {
		return super.count(ErrorPicking.MONGO_COLLECT_NAME, query);
	}

	@Override
	public long count()  {
		return super.count(ErrorPicking.MONGO_COLLECT_NAME);
	}

	@Override
	public boolean update(Object query, Object parameter)  {
		return super.update(ErrorPicking.MONGO_COLLECT_NAME, query, parameter);
	}

	@Override
	public List<ErrorPicking> find(Object query)  {
		return super.find(ErrorPicking.MONGO_COLLECT_NAME, query);
	}

	@Override
	public List<ErrorPicking> find(Object query, Object orderBy, int limit,
			int skip)  {
		return super.find(ErrorPicking.MONGO_COLLECT_NAME, query, orderBy, limit, skip);
	}

	@Override
	public ErrorPicking getBean(Integer id)  {
		return super.get(ErrorPicking.MONGO_COLLECT_NAME, id + "");
	}
	
	
}

