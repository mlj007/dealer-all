package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarParameterValue implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private CarParameterConfig parameterConfig;
	private CarParameterSet parameterSet;
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
	public CarParameterConfig getParameterConfig() {
		return parameterConfig;
	}
	/**
	 * @param parameterConfig the parameterConfig to set
	 */
	public void setParameterConfig(CarParameterConfig parameterConfig) {
		this.parameterConfig = parameterConfig;
	}
	/**
	 * @return the parameterSet
	 */
	public CarParameterSet getParameterSet() {
		return parameterSet;
	}
	/**
	 * @param parameterSet the parameterSet to set
	 */
	public void setParameterSet(CarParameterSet parameterSet) {
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
