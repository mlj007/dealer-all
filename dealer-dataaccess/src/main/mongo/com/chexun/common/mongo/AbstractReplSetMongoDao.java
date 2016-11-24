package com.chexun.common.mongo;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.chexun.common.utils.BeanUtils;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.ReadPreference;

import com.mongodb.WriteResult;

/**
 * Mongo公共Dao，其他业务层的Dao继承之
 * 
 * @author vincent.he
 * @version 1.0, Created on 2012-3-12
 * 
 * @param <T>
 */
public abstract class AbstractReplSetMongoDao<T> {

	protected static Log log = LogFactory.getLog(AbstractReplSetMongoDao.class);

	protected String DB_DATA = "website";
	protected Class<T> persistentClass;
	
	@Resource(name = "mongo")
	protected Mongo mongo;
	protected boolean init;
	protected Set<Field> properitesSet;
	protected List<PropertyDescriptor> propertyDescriptorList;
	protected String _key;
	protected List<IndexDBObject> indexList = new ArrayList<IndexDBObject>();
	protected DB db;
	protected String username;
	protected String password;
	
	public Mongo getMongo() {
		return mongo;
	}

	/**
	 * 通过srping注入mongoDB，也可用api来注入，如果自己注入，请注意要在initialize方法调用前注入
	 * 
	 * @param mongo
	 */
	public void setMongo(Mongo mongo) {
		this.mongo = mongo;
	}

	/**
	 * 构造器，子类继承后，新加构造器时必须要调用super()来实现父类的构造器对泛型的识别，initialize方法会用到这个泛型类型
	 */
	public AbstractReplSetMongoDao() {
		java.lang.reflect.Type t = (java.lang.reflect.Type) getClass()
				.getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			java.lang.reflect.Type[] p = ((ParameterizedType) t)
					.getActualTypeArguments();
			this.persistentClass = (Class<T>) p[0];

			propertyDescriptorList = BeanUtils.propertyDescriptorList(persistentClass);
			properitesSet = BeanUtils.propertysSet(persistentClass);

			Iterator<Field> iteratorKey = properitesSet.iterator();
			Field field;
			Annotation anno;
			while (iteratorKey.hasNext()) {
				field = iteratorKey.next();
				anno = field.getAnnotation(AnnotationMongoKey.class);
				if (anno != null) {
					_key = (String) field.getName();
				}
			}
		}
	}

	/**
	 * 初始化操作MongoDb中的数据集的配置项（下面的实现主要是得到该操作集得MongoDB对象，并设置该文档所对应的java对象）
	 */
	protected void initialize() {
		if (!init) {
			ChexunMongoOptions mo = (ChexunMongoOptions) mongo
					.getMongoOptions();
			username = mo.getUsername();
			password = mo.getPassword();
			db = mongo.getDB(mo.getDbname());
			db.setReadPreference(ReadPreference.SECONDARY) ;
			String initMSG = "username=" + username + " password=" + password
					+ " DB_DATA=" + DB_DATA + " class="
					+ this.getClass().getSimpleName();
//			System.out.println("username=" + username + " password=" + password
//					+ " DB_DATA=" + DB_DATA + " class="
//					+ this.getClass().getSimpleName());
			
			
//			if (username != null && !"".equals(username) && password != null
//					&& !"".equals(password)) {
//				//用户名，密码验证
//				if(!db.isAuthenticated()){
//					CommandResult result = db.authenticateCommand(username,
//							password.toCharArray());
//					if (!result.ok()) {
//						log.error("Mongo DB init error.[" + initMSG + "]",result.getException());
//					}
//				}
//			}
			
//			System.out.println("db=" + db);
			init = true;
		}
	}

	/**
	 * 创建记录
	 * 
	 * @param object
	 */
	public final void insert(String collectName, T object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.insert(covnToDBObject(object));
	}
	
	
	/**
	 * 更新单一记录
	 * id为_id的值
	 * object 为需要set的对象
	 * object示例：BasicDBObject object = new BasicDBObject().append("$set",new BasicDBObject().append("pv", new Integer(pvcount)));
	 * @param object
	 */
	public final void updateOne(String collectName, Integer id ,Object object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(object);
		
		collect.update(new BasicDBObject().append("_id",id), querydb);

	}
	
	
	
	/**
	 * 根据有无主键（"_id"）创建保存或更新记录
	 * @param object
	 *//*
	public final void saveOrUpdate(String collectName,CarAttenctionMongo object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject  dbObject = covnToDBObject(object);
		T t1 = this.get(collectName,String.valueOf(dbObject.get("_id")));
		if(t1!=null){
			BeanUtils.fillForNotNullObject(t1, object);
			collect.save(covnToDBObject(t1));
		}else{
			collect.save(covnToDBObject(object));
		}
	}*/
	//for Attenction
	/**
	 * 根据有无主键（"_id"）创建保存或更新记录
	 * @param object
	 */
	public final void saveOrUpdate(String collectName,T object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject  dbObject = covnToDBObject(object);
		T t1 = this.get(collectName,String.valueOf(dbObject.get("_id")));
		if(t1!=null){
			BeanUtils.fillForNotNullObject(t1, object);
			collect.save(covnToDBObject(t1));
		}else{
			collect.save(covnToDBObject(object));
		}
	}
	
	//end Attenction
	public final void saveOrUpdate3(String collectName,T object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject  dbObject = covnToDBObject(object);
		DBCursor cursor=collect.find().sort(new BasicDBObject("$natural",-1)).limit(1);  
		T t1 = this.get(collectName,String.valueOf(dbObject.get("_id")));
		if(t1!=null && !"-1".equals(t1)){
			BeanUtils.fillForNotNullObject(t1, object);
			collect.save(covnToDBObject(t1));
		}else{
			if(cursor.hasNext()){  
//				System.out.println("2222222222222=="+cursor.next().get("_id").toString());
				dbObject.put("_id", Integer.parseInt(cursor.next().get("_id").toString())+1);  
				collect.save(dbObject);
	        }else{  
	        	dbObject.put("_id", 1);
	        	collect.insert(dbObject);
	        }  
		}
		
		
	}
	
	public final void saveOrUpdate2(String collectName,T object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject  dbObject = covnToDBObject(object);
		DBCursor cursor=collect.find().sort(new BasicDBObject("$natural",-1)).limit(1);  
		if(cursor.hasNext()){  
			dbObject.put("_id", Integer.parseInt(cursor.next().get("_id").toString())+1);  
			collect.save(dbObject);
        }else{  
        	dbObject.put("_id", 1);
        	collect.insert(dbObject);
        }  
		
	}

	
	
/*	*//**
	 * 删除单个记录
	 * 
	 * @param object
	 *//*
	public final void remove(String collectName, CarAttenctionMongo object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.remove(covnToDBObject(object));
	}*/

	///for Attenction
	/**
	 * 删除单个记录
	 * 
	 * @param object
	 */
	public final void remove(String collectName, T object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.remove(covnToDBObject(object));
	}
	//
	/**
	 * 删除单个记录
	 * 
	 * @param object
	 */
	public final void removeByKey(String collectName, Object object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.remove(new BasicDBObject("_id", object));
	}

	/**
	 * 根据查询条件删除记录
	 * 
	 * @param object
	 */
	public final void removeQuery(String collectName, Object object) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(object);
		collect.remove(querydb);
	}


	/**
	 * 删除所有的记录
	 */
	public final void remove(String collectName) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.remove(new BasicDBObject());
	}

	
	/**
	 * 根据主键查找记录
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final T get(String collectName, String id) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		return (T) covnToTObject(collect.findOne(new BasicDBObject("_id", new Integer(id))));
	}
	@SuppressWarnings("unchecked")
	public final DBObject getDBObject(String collectName, String id) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		return collect.findOne(new BasicDBObject("_id", new Integer(id)));
	}
	/**
	 * 根据某个属性查找第一条记录
	 * 
	 * @param propertyName
	 *            属性名
	 * @param value
	 *            属性值
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final T getByPropery(String collectName, String propertyName, Object value) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		return (T) covnToTObject(collect.findOne(new BasicDBObject(
				propertyName, value)));
	}

	/**
	 * 根据某个属性查找多条记录
	 * 
	 * @param propertyName
	 *            属性名
	 * @param value
	 *            属性值
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final List<T> getByProperyList(String collectName, String propertyName,
			Object value) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBCursor cur = collect.find(new BasicDBObject(propertyName, value));
		return cursorFind(cur);
	}

	/**
	 * 根据单一条件查找记录
	 * 
	 * @return
	 */
	public final List<T> find(String collectName, Object query) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBCursor cur = collect.find(querydb);
		return cursorFind(cur);
	}
	public final List<T> find(String collectName,
			Object query, Object fields) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		DBCursor cur = collect.find(querydb,fieldsDb);
		return cursorFind(cur);
	}
	/**
	 * 根据条件批量更新对象的parameter中的属性
	 * 
	 * @param query
	 *            查询条件
	 * @param parameter
	 *            要更新的属性和值
	 * @return 返回更新成功或失败
	 */
	public final boolean update(String collectName, Object query, Object parameter) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		WriteResult result = collect.updateMulti(querydb, (DBObject) parameter);
		if (result.getError() == null || "".equals(result)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 分组查询
	 * 
	 * @param collectName
	 * @param keyObject
	 * @param condObject
	 * @param initialObject
	 * @param reduce
	 * @return
	 */
	public final List<BasicDBObject> group(String collectName,
			BasicDBObject keyObject, BasicDBObject condObject,
			BasicDBObject initialObject, String reduce) {
		if (!init) {
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		return (List<BasicDBObject>) collect.group(keyObject, condObject,
				initialObject, reduce);
	}

	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 *            查询条件
	 * @param pageInfo
	 *            分页参数
	 * @return
	 */
	public final List<T> find(String collectName, Object query, PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		int count = (int) count(collectName, querydb);
		pageInfo.setTotalCount(count);
		DBCursor cur = collect.find(querydb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult());
		return cursorFind(cur);
	}

	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 *            查询条件
	 * @param pageInfo
	 *            分页参数
	 * @return
	 */
	public final List<T> find(String collectName, Object query, Object orderBy,
			PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		int count = (int) count(collectName, querydb);
		pageInfo.setTotalCount(count);
		DBCursor cur = collect.find(querydb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult())
				.sort((DBObject) orderBy);
		return cursorFind(cur);
	}
	/**
	 * 
	 * @param collectName
	 * @param query 查询条件
	 * @param fields  需要得到的属性字段
	 * @param orderBy  排序
	 * @param pageInfo  分页
	 * @return
	 */
	public final List<T> find(String collectName, Object query, Object fields, Object orderBy,
			PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject queryDb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		int count = (int) count(collectName, queryDb);
		pageInfo.setTotalCount(count);
		
		DBCursor cur = collect.find(queryDb, fieldsDb).limit(pageInfo.getPageSize()).skip(pageInfo.getFirstResult()).sort((DBObject) orderBy);
		
		return cursorFind(cur);
	}
	
	/**
	 * 根据查询条件查询数据
	 * 
	 * @param query
	 *            查询条件
	 * @param pageInfo
	 *            分页参数
	 * @return
	 */
	public final List<DBObject> findBasic(String collectName, Object query, Object orderBy,
			PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		int count = (int) count(collectName, querydb);
		pageInfo.setTotalCount(count);
		List<DBObject> list = collect.find(querydb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult())
				.sort((DBObject) orderBy).toArray();
		return list;
	}
	public final List<DBObject> findBasic(String collectName,
			Object query, Object fields, Object orderBy,PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		int count = (int) count(collectName, querydb);
		System.out.println("count==="+count);
		pageInfo.setTotalCount(count);
		List<DBObject> list = collect.find(querydb,fieldsDb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult())
				.sort((DBObject) orderBy).toArray();
		return list;
	}
	public final List<DBObject> findBasicWithOutCount(String collectName,
			Object query, Object fields, Object orderBy,PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		long listTime1 = System.currentTimeMillis();
		List<DBObject> list = collect.find(querydb,fieldsDb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult())
				.sort((DBObject) orderBy).toArray();
		long listTime2 = System.currentTimeMillis();
		System.out.println("listTime2-listTime1=="+(listTime2-listTime1));
		return list;
	}
	public final List<DBObject> findAll(String collectName,
			Object query, Object fields, Object orderBy,PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		
		List<DBObject> list = collect.find(querydb,fieldsDb).limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult())
				.sort((DBObject) orderBy).toArray();
		return list;
	}
	public final List<DBObject> findAll(String collectName,
			Object query, Object fields, Object orderBy,int limit,int skip) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		
		List<DBObject> list = collect.find(querydb,fieldsDb)
				.limit(limit)
				.skip(skip)
				.sort((DBObject) orderBy).toArray();
		return list;
	}
	/**
	 * 根据查询参数返回查询列表的第一个元素。
	 * 
	 * @param obj
	 * @return
	 */
	public final long findOne2(String collectName, DBObject obj) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(obj);
		DBObject object = collect.findOne(querydb);
		long count =(Long)object.get("count");
		return count;
	}
	/**
	 * 根据查询条件查询数据
	 * @param collectName
	 * @param query
	 * @param fields需要得到的属性字段
	 * @param orderBy
	 * @param limit
	 * @param skip
	 * @return
	 */
	public final List<T> find(String collectName, Object query, Object fields,Object orderBy,
			int limit,int skip) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject queryDb = replaceKey(query);
		DBObject fieldsDb = replaceKey(fields);
		DBCursor cur = collect.find(queryDb,fieldsDb).limit(limit)
				.skip(skip)
				.sort((DBObject) orderBy);
		return cursorFind(cur);
	}
	/**
	 * 根据查询条件查询数据
	 * @param collectName
	 * @param query
	 * @param orderBy
	 * @param limit
	 * @param skip
	 * @return
	 */
	public final List<T> find(String collectName, Object query, Object orderBy,
			int limit,int skip) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		DBCursor cur = collect.find(querydb).limit(limit)
		.skip(skip)
		.sort((DBObject) orderBy);
		return cursorFind(cur);
	}

	/**
	 * 得到所有的记录
	 * 
	 * @return
	 */
	public final List<T> findAll(String collectName) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBCursor cur = collect.find();
		return cursorFind(cur);
	}
	
	public final List<T> findAll(String collectName,PageInfo pageInfo) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		int count = (int) count(collectName);
		pageInfo.setTotalCount(count);
		DBCursor cur = collect.find().limit(pageInfo.getPageSize())
				.skip(pageInfo.getFirstResult());
		return cursorFind(cur);
	}	

	/**
	 * 私有方法，把Mongodb的数据结构转换成List
	 * 
	 * @param cur
	 * @return
	 */
	private List<T> cursorFind(DBCursor cur) {
		List<T> list = new ArrayList<T>();
		while (cur.hasNext()) {
			list.add((T) covnToTObject(cur.next()));
		}
		return list;
	}

	/**
	 * 根据查询条件得到符合查询条件的记录数
	 * 
	 * @param query
	 * @return
	 */
	public final long count(String collectName, Object query) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		return collect.count(querydb);
	}
	
	/**
	 * 滤重统计记录数
	 * 
	 * @param query
	 * @return
	 */
	public final long countByDistinct(String collectName, String distinctKey, Object query) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		List list = collect.distinct(distinctKey, querydb);
		return list == null ? 0 : list.size();
	}

	/**
	 * 返回总的记录数
	 * 
	 * @return
	 */
	public final long count(String collectName) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		return collect.count();
	}

	/**
	 * 根据查询参数返回查询列表的第一个元素。
	 * 
	 * @param obj
	 * @return
	 */
	public final T findOne(String collectName, DBObject obj) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(obj);
		DBObject object = collect.findOne(querydb);
		return (T) covnToTObject(object);
	}

	/**
	 * 删除表
	 */
	public final void drop(String collectName) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		collect.drop();
	}

	private DBObject replaceKey(Object query) {
		DBObject querydb = (DBObject) query;
		if (querydb!=null&&querydb.get(_key) != null) {
			querydb.put("_id", querydb.get(_key));
			querydb.removeField(_key);
		}
		return querydb;
	}
	
	private DBObject covnToDBObject(Object valueObject) {
		DBObject fillObject = null;
		if(valueObject!=null){
			fillObject = new BasicDBObject();
			String key = null;
			Object value = null;
			try {
				for(PropertyDescriptor pg : propertyDescriptorList){
					if(pg.getName().equals(_key)){
						key = "_id";
					}else{
						key = pg.getName();
					}
					value = invokeMethod(pg.getReadMethod(),valueObject,new Object[0]);
					if(value!=null){
								fillObject.put(key,value);
					}
				}
			} catch (IllegalAccessException e) {
				log.error("covnToTObject failed.", e);
			} catch (InvocationTargetException e) {
				log.error("covnToTObject failed.", e);
			}
		}
		//System.out.println(fillObject);
		return fillObject;
	}
	
	private Object covnToTObject(DBObject valueObject) {
		Object fillObject = null;
		if(valueObject!=null){
			try {
				fillObject = persistentClass.newInstance();
				String key = null;
				Object value = null;
				 Object[] values = null;
				for(PropertyDescriptor pg : propertyDescriptorList){
					if(pg.getName().equals(_key)){
						key = "_id";
					}else{
						key = pg.getName();
					}
					//value = MyBeanUtils.getSimpleProperty(valueObject,field.getName());
					value = valueObject.get(key);
					if(value!=null){
						if(value instanceof BasicDBList){
							BasicDBList dbList = (BasicDBList)value;
							 invokeMethod(pg.getWriteMethod(),fillObject,dbList);
						}
						 values = new Object[1];
					     values[0] = value;
						 invokeMethod(pg.getWriteMethod(),fillObject,values);
					}
				}
			} catch (InstantiationException e) {
				log.error("covnToTObject failed.", e);
			} catch (IllegalAccessException e) {
				log.error("covnToTObject failed.", e);
			} catch (InvocationTargetException e) {
				log.error("covnToTObject failed.", e);
			}
		}
		return fillObject;
	}
	
    /**
     * This just catches and wraps IllegalArgumentException. 
     * @param method
     * @param bean
     * @param values
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private Object invokeMethod(Method method, Object bean, BasicDBList values) throws IllegalAccessException, InvocationTargetException {
    	Object ret = null;
        try {
        	if(!values.isEmpty()){
        		Object object = values.get(0);
        		if(object instanceof Integer){
        			Integer[] temp = dBList2Integer(values);
        			method.invoke(bean, temp);
        		}
        	}
        	
        	ret = method.invoke(bean, values.toArray());
        
        } catch (IllegalArgumentException e) {            
            log.error("Method invocation failed.", e);
            throw new IllegalArgumentException(
                "Cannot invoke " + method.getDeclaringClass().getName() + "." 
                + method.getName() + " - " + e.getMessage());
            
        }
        return ret;
    }
    
	private Integer[] dBList2Integer(BasicDBList values) {
		if (values == null)
			return null;
		Integer[] list = new Integer[values.size()];
		int i = 0;
		for (Object object : values.toArray()) {
			list[i] = new Integer(object.toString());
			i++;
		}

		return list;
	}
    
    private Object invokeMethod(Method method, Object bean, Object[] values) throws IllegalAccessException, InvocationTargetException {
        try {
            return method.invoke(bean, values);
        
        } catch (Exception e) {            
            log.error("Method invocation failed.", e);
            throw new IllegalArgumentException(
                "Cannot invoke " + method.getDeclaringClass().getName() + "." 
                + method.getName() + " - " + e.getMessage());
            
        }
    }
    
	/**
	 * 根据查询条件查询数据(去除重复)
	 * @param collectName
	 * @param query
	 * @param orderBy
	 * @param limit
	 * @param skip
	 * @return
	 */
	public final List<T> findForDistinct(String collectName, Object query,String key) {
		if(!init){
			initialize();
		}
		DBCollection collect = db.getCollection(collectName);
		DBObject querydb = replaceKey(query);
		List<T> list = collect.distinct(key, querydb);
		return list;
	}




	
}
