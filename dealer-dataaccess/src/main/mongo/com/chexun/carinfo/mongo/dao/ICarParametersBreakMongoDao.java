 /**     
   * @create.date: 2012-3-19 下午04:09:36
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao 
   */ 
package com.chexun.carinfo.mongo.dao;

import java.util.List;



import com.chexun.carinfo.mongo.bean.CarParametersBreakMongo;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;

 /**  
 * @create.date: 2012-3-19 下午04:09:36     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-19 下午04:09:36
 */
public interface ICarParametersBreakMongoDao {
	/**
	 * 新增/更新记录
	 * 
	 * @param bean
	 * @
	 */
	public void saveOrUpdate(CarParametersBreakMongo bean) ;

	/**
	 * 删除记录
	 * 
	 * @param bean
	 * @
	 */
	public void remove(CarParametersBreakMongo bean) ;

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
	public CarParametersBreakMongo get(Integer id) ;

	/**
	 * 根据某个属性查找多条记录
	 * 
	 * @param propertyName
	 * @param value
	 * @return
	 * @
	 */
	public List<CarParametersBreakMongo> getByProperyList(String propertyName, Object value)
			;

	/**
	 * 根据单一条件查找记录
	 * 
	 * @param query
	 * @return
	 * @
	 */
	public List<CarParametersBreakMongo> find(Object query) ;

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
	public List<CarParametersBreakMongo> find(Object query, PageInfo pageInfo)
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
	public List<CarParametersBreakMongo> find(Object query, Object orderBy, PageInfo pageInfo)
			;

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
	public List<CarParametersBreakMongo> find(Object query,Object filed, Object orderBy, int limit, int skip)
			;
	public List<CarParametersBreakMongo> find(Object query, Object orderBy, int limit, int skip)
	;
	/**
	 * 获取全部记录
	 * 
	 * @return
	 * @
	 */
	public List<CarParametersBreakMongo> findAll() ;

	/**
	 * 获取全部记录
	 * 
	 * @param pageInfo
	 * @return
	 * @
	 */
	public List<CarParametersBreakMongo> findAll(PageInfo pageInfo) ;

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
	//得到去掉重复后的符合条件的参数列表
	public List<?> findForDistinct(BasicDBObject queryParamObject,String distinctKey);
}
