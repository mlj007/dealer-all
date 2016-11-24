
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

public class CarParameterSetConfigMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameter_set_config";
	
	@AnnotationMongoKey
	private Integer id;
	private Integer parameterType;
	private Integer parameterSet;
	private Integer model;
	private Date updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParameterType() {
		return parameterType;
	}
	public void setParameterType(Integer parameterType) {
		this.parameterType = parameterType;
	}
	public Integer getParameterSet() {
		return parameterSet;
	}
	public void setParameterSet(Integer parameterSet) {
		this.parameterSet = parameterSet;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
