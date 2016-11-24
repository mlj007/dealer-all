 /**     
   * @create.date: 2012-4-1 下午05:07:25
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao 
   */ 
package com.chexun.carinfo.mongo.dao;



import com.chexun.carinfo.mongo.bean.TreeMongo;

 /**  
 * @create.date: 2012-4-1 下午05:07:25     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-1 下午05:07:25
 */
public interface ITreeMongoDao {
	/**
	 * 新增/更新记录
	 * 
	 * @param bean
	 * @
	 */
	public void saveOrUpdate(TreeMongo bean) ;
	/**
	 * 
	 * @comment: <p>根据获取数据</p>  
	 * @create.date: 2012-4-4 ( 下午12:10:01 )
	 * @author: lfz
	 * @param id
	 * @return
	 * @
	 * @see: <h1>com.chexun.carinfo.mongo.dao.ITreeMongoDao.get</h1>
	 * @modified.by: <if there modified by others,then write author name>
	 * @modified.date: <modified date time>
	 */
	public TreeMongo get(Integer id) ;
}
