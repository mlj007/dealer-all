 /**     
   * @create.date: 2012-3-21 上午10:16:08
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午10:16:08     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:16:08
 */
public class CarParameterValueMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameter_values";
	
	@AnnotationMongoKey
	private Integer id;
	private Integer parameterConfig;
	private Integer parameterSet;
	private String value;
	private Date updateTime;
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
	 * @return the parameterConfig
	 */
	public Integer getParameterConfig() {
		return parameterConfig;
	}
	/**
	 * @param parameterConfig the parameterConfig to set
	 */
	public void setParameterConfig(Integer parameterConfig) {
		this.parameterConfig = parameterConfig;
	}
	/**
	 * @return the parameterSet
	 */
	public Integer getParameterSet() {
		return parameterSet;
	}
	/**
	 * @param parameterSet the parameterSet to set
	 */
	public void setParameterSet(Integer parameterSet) {
		this.parameterSet = parameterSet;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
