package com.chexun.carinfo.mongo.dao;

import java.util.List;



import com.chexun.carinfo.mongo.bean.CarFuelPriceMongo;
import com.chexun.common.mongo.PageInfo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public interface ICarFuelPriceMongoDao {
	/**
	 * 新增/更新记录
	 * 
	 * @param bean
	 * @
	 */
	public void saveOrUpdate(CarFuelPriceMongo bean) ;

	/**
	 * 删除记录
	 * 
	 * @param bean
	 * @
	 */
	public void remove(CarFuelPriceMongo bean) ;

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
	public CarFuelPriceMongo get(Integer id) ;

	/**
	 * 根据某个属性查找多条记录
	 * 
	 * @param propertyName
	 * @param value
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> getByProperyList(String propertyName, Object value)
			;

	/**
	 * 根据单一条件查找记录
	 * 
	 * @param query
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> find(Object query) ;

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
	 * 更新单一字段的记录
	 * @param id
	 * @param object
	 * @return
	 * @
	 */
		public void updateOne(Integer id, Object object);

	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param pageInfo
	 *            分页参数
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> find(Object query, PageInfo pageInfo)
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
	public List<CarFuelPriceMongo> find(Object query, Object orderBy, PageInfo pageInfo)
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
	public List<CarFuelPriceMongo> find(Object query, Object orderBy, int limit, int skip)
			;
	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 * @param fieldsObject 查询某字段
	 * @param orderBy
	 * @param limit
	 * @param skip
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> find(Object queryObject, Object fieldsObject,
			Object orderByObject, int limit, int skip);
	/**
	 * 获取全部记录
	 * 
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> findAll() ;

	/**
	 * 获取全部记录
	 * 
	 * @param pageInfo
	 * @return
	 * @
	 */
	public List<CarFuelPriceMongo> findAll(PageInfo pageInfo) ;

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
 * 车型分组计算
 * @param keyObject
 * @param queryObject
 * @param initialObject
 * @param reduce
 * @return
 * @
 */
	public List<?> groupCarModel(BasicDBObject keyObject,
			BasicDBObject queryObject, BasicDBObject initialObject,
			String reduce);
	
	
	public List<?> findForDistinct(DBObject query,String key);

}
