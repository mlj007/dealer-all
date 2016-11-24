
package com.chexun.carinfo.bean;


import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import java.util.List;


public class CarParameterTriger implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer modelId;
	private Integer type;
	private Date creatTime;
	private Date updateTime;
	private Integer state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
	

	
}
