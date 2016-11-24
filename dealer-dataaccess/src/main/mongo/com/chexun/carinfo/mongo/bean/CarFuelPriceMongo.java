package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

public class CarFuelPriceMongo implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_fuel_price";
	@AnnotationMongoKey
	private Integer id;
	private String fuelType;
	private String fuelLabel;
	private double fuelPrice;
	private Integer state;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getFuelLabel() {
		return fuelLabel;
	}
	public void setFuelLabel(String fuelLabel) {
		this.fuelLabel = fuelLabel;
	}
	public double getFuelPrice() {
		return fuelPrice;
	}
	public void setFuelPrice(double fuelPrice) {
		this.fuelPrice = fuelPrice;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
