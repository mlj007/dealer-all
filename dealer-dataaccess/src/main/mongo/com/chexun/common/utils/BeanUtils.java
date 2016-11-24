package com.chexun.common.utils;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;


public class BeanUtils {	
	protected static Log log = LogFactory.getLog(BeanUtils.class);

	/**
	 * 获得同时有get和set的field和value。
	 * 
	 * @param bean
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map describe(Object bean) {
		Map des = new HashMap();
		PropertyDescriptor desor[] = PropertyUtils.getPropertyDescriptors(bean);
		String name = null;
		for (int i = 0; i < desor.length; i++) {
			if (desor[i].getReadMethod() != null
					&& desor[i].getWriteMethod() != null) {
				name = desor[i].getName();
				try {
					
				
					des.put(name, PropertyUtils.getProperty(bean, name));
				} catch (Exception e) {
					throw new RuntimeException("属性不存在：" + name);
				}
			}
		}
		return des;
	}
	
	/**
	 * 获得同时有get和set的field和PropertyDescriptor。
	 * 
	 * @param bean
	 * @return
	 */

	public static List<PropertyDescriptor> propertyDescriptorList(Object bean) {
		List<PropertyDescriptor> des = new ArrayList<PropertyDescriptor>();
		PropertyDescriptor desor[] = PropertyUtils.getPropertyDescriptors(bean);
		for (int i = 0; i < desor.length; i++) {
			if (desor[i].getReadMethod() != null
					&& desor[i].getWriteMethod() != null) {
				des.add(desor[i]);
			}
		}
		return des;
	}
	
	/**
	 * 获得同时有get和set的field和PropertyDescriptor。
	 * 
	 * @param bean
	 * @return
	 */

	public static List<PropertyDescriptor> propertyDescriptorList(Class clazz) {
		List<PropertyDescriptor> des = new ArrayList<PropertyDescriptor>();
		PropertyDescriptor desor[] = PropertyUtils.getPropertyDescriptors(clazz);
		for (int i = 0; i < desor.length; i++) {
			if (desor[i].getReadMethod() != null
					&& desor[i].getWriteMethod() != null) {
				des.add(desor[i]);
			}
		}
		return des;
	}
	
	/**
	 * 获得同时有get和set的field和Field。
	 * 
	 * @param bean
	 * @return
	 */

	@SuppressWarnings("rawtypes")
	public static Set<Field> propertysSet(Class clazz) {
		Set<Field> des = new HashSet<Field>();
		Map<String,Field> fields = fieldMap(clazz);
		PropertyDescriptor desor[] = PropertyUtils.getPropertyDescriptors(clazz);
		for (int i = 0; i < desor.length; i++) {
			if (desor[i].getReadMethod() != null
					&& desor[i].getWriteMethod() != null && fields.get(desor[i].getName())!=null) {
				des.add(fields.get(desor[i].getName()));
			}
		}
		return des;
	}
	
	
	@SuppressWarnings("rawtypes")
	public static Map<String, Field> fieldMap(Class lclazzazz){
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		Field[] fields;
		for (Class cls = lclazzazz; !cls.equals(Object.class); cls = cls.getSuperclass()) {  
			fields = cls.getDeclaredFields();
			if(fields!=null){
				for(Field field:fields){
					if(fieldMap.get(field.getName())==null){
						fieldMap.put(field.getName(), field);
					}
				}
			}
		}
		return fieldMap;
	}
	

	public static void setSimpleProperty(Object bean, String name, Object value) {
		try {
			PropertyUtils.setSimpleProperty(bean, name, value);
		} catch (Exception e) {
			throw new RuntimeException("Property is not exists：" + name);
		}
	}
	
	public static Object getSimpleProperty(Object bean, String name) {
		try {
			return PropertyUtils.getSimpleProperty(bean, name);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Property is not exists：" + name);
		}
	}

	/**
	 * 直接读取对象属性值,无视private/protected修饰符,不经过getter函数.
	 */
	public static Object getFieldValue(Object object, String fieldName)
			throws NoSuchFieldException {
		Field field = getDeclaredField(object, fieldName);
		if (!field.isAccessible()) {
			field.setAccessible(true);
		}

		Object result = null;
		try {
			result = field.get(object);
		} catch (IllegalAccessException e) {
			log.error(e.getMessage());
		}
		return result;
	}

	/**
	 * 直接设置对象属性值,无视private/protected修饰符,不经过setter函数.
	 */
	public static void setFieldValue(Object object, String fieldName,
			Object value) throws NoSuchFieldException {
		Field field = getDeclaredField(object, fieldName);
		if (!field.isAccessible()) {
			field.setAccessible(true);
		}
		try {
			field.set(object, value);
		} catch (IllegalAccessException e) {
			log.error(e.getMessage());
		}
	}

	/**
	 * 循环向上转型,获取对象的DeclaredField.
	 */
	public static Field getDeclaredField(Object object, String fieldName)
			throws NoSuchFieldException {
		Assert.notNull(object);
		return getDeclaredField(object.getClass(), fieldName);
	}

	/**
	 * 循环向上转型,获取类的DeclaredField.
	 */

	@SuppressWarnings("rawtypes")
	public static Field getDeclaredField(Class clazz, String fieldName)
			throws NoSuchFieldException {
		Assert.notNull(clazz);
		Assert.hasText(fieldName);
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass
				.getSuperclass()) {
			try {
				return superClass.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
				// Field不在当前类定义,继续向上转型
			}
		}
		throw new NoSuchFieldException("No such field: " + clazz.getName()
				+ '.' + fieldName);
	}

	@SuppressWarnings("rawtypes")
	public static Object fillForNotNullObject(Object fillObject,
			Object valueObject) {
		if(fillObject==null||valueObject==null) return fillObject;
			if (fillObject.getClass().getName().equals(valueObject.getClass().getName())) {

				Map properitesMap = describe(fillObject);
				Iterator iteratorKey = properitesMap.keySet().iterator();
				String key = null;
				Object value = null;
				while(iteratorKey.hasNext()){
					key = (String)iteratorKey.next();
					value = getSimpleProperty(valueObject,key);
					if(value!=null){
						setSimpleProperty(fillObject,key,value);
					}
				}
			}

		return fillObject;
	}

}
