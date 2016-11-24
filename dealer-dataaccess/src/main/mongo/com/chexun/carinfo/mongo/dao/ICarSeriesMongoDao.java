 /**     
   * @create.date: 2012-3-19 下午04:19:21
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao 
   */ 
package com.chexun.carinfo.mongo.dao;

import java.util.List;



import com.chexun.carinfo.mongo.bean.CarSeriesMongo;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

 /**  
 * @create.date: 2012-3-19 下午04:19:21     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:19:21
 */
public interface ICarSeriesMongoDao {
	/**
	 * 新增/更新记录
	 * 
	 * @param bean
	 * @
	 */
	public void saveOrUpdate(CarSeriesMongo bean) ;

	/**
	 * 删除记录
	 * 
	 * @param bean
	 * @
	 */
	public void remove(CarSeriesMongo bean) ;

	/**
	 * 删除记录
	 * 
	 * @param id
	 * @
	 */
	public void removeByKey(Integer id) ;
	
	/**
	 * 
	 * @comment: <p>批量删除</p>  
	 * @create.date: 2012-3-19 ( 下午02:02:54 )
	 * @author: lfz
	 * @param ids
	 * @
	 * @see: <h1>com.chexun.carinfo.mongo.dao.ICarBrandMongoDao.removeByKeys</h1>
	 * @modified.by: <if there modified by others,then write author name>
	 * @modified.date: <modified date time>
	 */
	public void removeByKeys(Integer[] ids) ;

	/**
	 * 获取记录
	 * 
	 * @param id
	 * @return
	 * @
	 */
	public CarSeriesMongo get(Integer id) ;

	/**
	 * 根据某个属性查找多条记录
	 * 
	 * @param propertyName
	 * @param value
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> getByProperyList(String propertyName, Object value)
			;

	/**
	 * 根据单一条件查找记录
	 * 
	 * @param query
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> find(Object query) ;

	/**
	 * 批量更新记录
	 * 
	 * @param query
	 * @param parameter
	 * @return
	 * @
	 */
	public boolean update(Object query, Object parameter) ;

	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param pageInfo
	 *            分页参数
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> find(Object query, PageInfo pageInfo)
			;

	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param orderBy
	 * @param pageInfo
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			;
	public List<CarSeriesMongo> find(Object query,Object fields, Object orderBy,
			PageInfo pageInfo);
	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param orderBy
	 * @param limit
	 * @param skip
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> find(Object query, Object orderBy, int limit, int skip)
			;
	public List<CarSeriesMongo> find(Object query,
			Object fields, Object orderBy, int limit, int skip)
			;
	/**
	 * 获取全部记录
	 * 
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> findAll() ;

	/**
	 * 获取全部记录
	 * 
	 * @param pageInfo
	 * @return
	 * @
	 */
	public List<CarSeriesMongo> findAll(PageInfo pageInfo) ;

	/**
	 * 查询条件得到符合查询条件的记录数
	 * 
	 * @param query
	 * @return
	 * @
	 */
	public long count(Object query) ;

	/**
	 * 返回总的记录数
	 * 
	 * @return
	 * @
	 */
	public long count() ;

	/**
	 * 车系分组计算
	 * @param keyObject
	 * @param queryObject
	 * @param initialObject
	 * @param reduce
	 * @return
	 * @
	 */
	public List<?> groupCarSeries(BasicDBObject keyObject,
		BasicDBObject querySeries, BasicDBObject initialObject, String reduce);


	public List<CarSeriesMongo> getDistinctCarLevelIds(DBObject query);


}
