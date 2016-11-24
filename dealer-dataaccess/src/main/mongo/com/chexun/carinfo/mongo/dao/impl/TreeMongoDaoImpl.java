 /**     
   * @create.date: 2012-4-1 下午05:07:56
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.dao.impl 
   */ 
package com.chexun.carinfo.mongo.dao.impl;



import org.springframework.stereotype.Repository;

import com.chexun.carinfo.mongo.bean.TreeMongo;
import com.chexun.carinfo.mongo.dao.ITreeMongoDao;
import com.chexun.common.mongo.AbstractMultiMongoDao;

 /**  
 * @create.date: 2012-4-1 下午05:07:56     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.dao.impl
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-1 下午05:07:56
 */
@Repository("treeMongoDao")
public class TreeMongoDaoImpl extends AbstractMultiMongoDao<TreeMongo> implements ITreeMongoDao {

	@Override
	public void saveOrUpdate(TreeMongo bean)  {
		super.saveOrUpdate(TreeMongo.MONGO_COLLECT_NAME, bean);
	}

	@Override
	public TreeMongo get(Integer id)  {
		return super.get(TreeMongo.MONGO_COLLECT_NAME, id+"");
	}

}
