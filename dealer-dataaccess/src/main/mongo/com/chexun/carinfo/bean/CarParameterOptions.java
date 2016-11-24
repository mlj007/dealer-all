package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarParameterOptions implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private CarParameterConfig parameterConfig;
	private String parameterOption;
	private Date createTime;
	private Integer sort;
	private String isDefault;
	private Date updateTime;
	
	
	
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
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CarParameterConfig getParameterConfig() {
		return parameterConfig;
	}
	public void setParameterConfig(CarParameterConfig parameterConfig) {
		this.parameterConfig = parameterConfig;
	}
	public String getParameterOption() {
		return parameterOption;
	}
	public void setParameterOption(String parameterOption) {
		this.parameterOption = parameterOption;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	

}
