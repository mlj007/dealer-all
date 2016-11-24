package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarParameterSetConfig implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private CarParameterSet parameterSet;
	private CarModel model;
	
	private Date updateTime;
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarParameterSet getParameterSet() {
		return parameterSet;
	}

	public void setParameterSet(CarParameterSet parameterSet) {
		this.parameterSet = parameterSet;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}
	
}
