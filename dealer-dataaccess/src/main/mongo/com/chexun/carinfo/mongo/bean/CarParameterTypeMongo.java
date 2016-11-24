 /**     
   * @create.date: 2012-3-21 上午10:15:18
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午10:15:18     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:15:18
 */
public class CarParameterTypeMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameter_type";
	
	@AnnotationMongoKey
	private Integer id;
	private String name;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
