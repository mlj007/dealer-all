 /**     
   * @create.date: 2012-3-7 上午10:55:37
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;


 /**  
 * @create.date: 2012-3-7 上午10:55:37     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-7 上午10:55:37
 */
public class CarModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private CarSeries series;
	private String status;
	private Date createTime;
	private Integer userId; // 创建人ID
	private Integer sort;
	private String active;// 1上市、2停产、3未上市
	private CarYears year;
	private Double guidePrice;
	private Double guidePriceMax;
	private String marketTime;
	private String isExplicit;
	private Integer imagePath;
	private String isElectric; // 是否电动发动机，0不是、1是
	private Date updateTime;
	private String isScrap; //是否被拆
	//========================add by jiangpeng 2013-04-25
	private Double spaceIndex;//空间指数
	private Double dynamicIndex;//动力指数
	private Double comsumptionIndex;//油耗指数
	
	private Date ssTime; //上市时间Date格式 冗余字段 不在库中
	
	private Integer uselessData = 1; //无用数据 0|1:无用|有用 default 1
	
	private Integer carModelProperty;//0:常规车，1：新能源车，2：平行进口车
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
	/**
	 * @return the series
	 */
	public CarSeries getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(CarSeries series) {
		this.series = series;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the sort
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * @return the year
	 */
	public CarYears getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(CarYears year) {
		this.year = year;
	}
	/**
	 * @return the guidePrice
	 */
	public Double getGuidePrice() {
		return guidePrice;
	}
	/**
	 * @param guidePrice the guidePrice to set
	 */
	public void setGuidePrice(Double guidePrice) {
		this.guidePrice = guidePrice;
	}
	/**
	 * @return the marketTime
	 */
	public String getMarketTime() {
		return marketTime;
	}
	/**
	 * @param marketTime the marketTime to set
	 */
	public void setMarketTime(String marketTime) {
		this.marketTime = marketTime;
	}
	/**
	 * @return the isExplicit
	 */
	public String getIsExplicit() {
		return isExplicit;
	}
	/**
	 * @param isExplicit the isExplicit to set
	 */
	public void setIsExplicit(String isExplicit) {
		this.isExplicit = isExplicit;
	}
	/**
	 * @return the imagePath
	 */
	public Integer getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(Integer imagePath) {
		this.imagePath = imagePath;
	}
	/**
	 * @return the isElectric
	 */
	public String getIsElectric() {
		return isElectric;
	}
	/**
	 * @param isElectric the isElectric to set
	 */
	public void setIsElectric(String isElectric) {
		this.isElectric = isElectric;
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
	public String getIsScrap() {
		return isScrap;
	}
	public void setIsScrap(String isScrap) {
		this.isScrap = isScrap;
	}
	public Date getSsTime() {
		return ssTime;
	}
	public void setSsTime(Date ssTime) {
		this.ssTime = ssTime;
	}
	public Double getSpaceIndex() {
		return spaceIndex;
	}
	public void setSpaceIndex(Double spaceIndex) {
		this.spaceIndex = spaceIndex;
	}
	public Double getDynamicIndex() {
		return dynamicIndex;
	}
	public void setDynamicIndex(Double dynamicIndex) {
		this.dynamicIndex = dynamicIndex;
	}
	public Double getComsumptionIndex() {
		return comsumptionIndex;
	}
	public void setComsumptionIndex(Double comsumptionIndex) {
		this.comsumptionIndex = comsumptionIndex;
	}
	public Integer getUselessData() {
		return uselessData;
	}
	public void setUselessData(Integer uselessData) {
		this.uselessData = uselessData;
	}
	public Double getGuidePriceMax() {
		return guidePriceMax;
	}
	public void setGuidePriceMax(Double guidePriceMax) {
		this.guidePriceMax = guidePriceMax;
	}
	public void setCarModelProperty(Integer carModelProperty) {
		this.carModelProperty = carModelProperty;
	}
	public Integer getCarModelProperty() {
		return carModelProperty;
	}
	
}
