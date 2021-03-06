package com.chexun.carinfo.mongo.dao;

/**     
 * @create.date: 2012-4-7 上午09:42:07
 * @author: zxj 
 * @company: chexun
 * @see:com.chexun.carinfo.mongo.dao 
 */ 

import java.util.List;
import java.util.Map;

import com.chexun.carinfo.bean.CarSortMongo;
import com.chexun.common.mongo.PageInfo;

/**  
* @create.date: 2012-4-7 上午09:42:07     
* @comment: <p>TODO</p>
* @see: com.chexun.carinfo.mongo.dao
* @author: lfz
* @modify.by: lfz
* @modify.date: 2012-4-7 上午09:42:07
*/
public interface CarSortMongoCronDao {
	/**
	 * 新增/更新记录
	 * 
	 * @param bean
	 * @throws DaoException
	 */
	public void saveOrUpdate(CarSortMongo bean);
	
	/**
	 * 取到 记录
	 * 
	 * @param bean
	 * @throws DaoException
	 */
	public CarSortMongo getBean(Integer id);

	/**
	 * 删除记录
	 * 
	 * @param bean
	 * @throws DaoException
	 */
	public void remove(CarSortMongo bean);

	/**
	 * 删除记录
	 * 
	 * @param id
	 * @throws DaoException
	 */
	public void removeByKey(Integer id);
	
	/**
	 * 
	 * @comment: <p>批量删除</p>  
	 * @create.date: 2012-3-19 ( 下午02:02:54 )
	 * @author: lfz
	 * @param ids
	 * @throws DaoException
	 * @see: <h1>com.chexun.carinfo.mongo.dao.ICarBrandMongoDao.removeByKeys</h1>
	 * @modified.by: <if there modified by others,then write author name>
	 * @modified.date: <modified date time>
	 */
	public void removeByKeys(Integer[] ids);
	/**
	 * 
	 * @comment: <p>根据查询条件查询数据</p>  
	 * @create.date: 2012-4-9 ( 下午04:16:54 )
	 * @author: lfz
	 * @param query
	 * @return
	 * @throws DaoException
	 * @see: <h1>com.chexun.carinfo.mongo.dao.IImpressionMongoDao.find</h1>
	 * @modified.by: <if there modified by others,then write author name>
	 * @modified.date: <modified date time>
	 */
	public List<CarSortMongo> find(Object query);
	
	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param orderBy
	 * @param pageInfo
	 * @return
	 * @throws DaoException
	 */
	public List<CarSortMongo> find(Object query, Object orderBy, PageInfo pageInfo);
	
	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param orderBy
	 * @param pageInfo
	 * @return
	 * @throws DaoException
	 */
	public List<CarSortMongo> find(Object query, Object orderBy,
			int limit,int skip);
	/**
	 * 查询条件得到符合查询条件的记录数
	 * 
	 * @param query
	 * @return
	 * @throws DaoException
	 */
	public long count(Object query);

	/**
	 * 返回总的记录数
	 * 
	 * @return
	 * @throws DaoException
	 */
	public long count();
	/**
	 * 批量更新记录
	 * 
	 * @param query
	 * @param parameter
	 * @return
	 * @throws DaoException
	 */
	public boolean update(Object query, Object parameter);
	
	
	public Map getAllSortMap() throws Exception;
	
	
	
}
