package com.chexun.carinfo.bean;

import java.io.Serializable;

import com.chexun.common.mongo.AnnotationMongoKey;
/**
 * 品牌页面所有新闻 缓存进mongo
 * add by zhuxingjun at 20120725 14:22
 * */
public class CarSortMongo implements Serializable{
	public static final String MONGO_COLLECT_NAME = "car_sort";
	private static final long serialVersionUID = 1L;
	
	@AnnotationMongoKey
	private Integer id;
	
	private Integer seriesId;    //车系ID
	private Long sort;           //排序
	private Long pvCount;		 // pv数量
	private Integer level;       // 级别
	private String updateTime;    //更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}
	public Long getSort() {
		return sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public Long getPvCount() {
		return pvCount;
	}
	public void setPvCount(Long pvCount) {
		this.pvCount = pvCount;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
	

}
