 /**     
   * @create.date: 2012-3-21 上午09:50:48
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午09:50:48     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午09:50:48
 */
public class CarModelMongo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_model";
	
	@AnnotationMongoKey
	private Integer id;
	private String name;
	private Integer series;
	private Integer brandId;
	private String status;
	private Date createTime;
	private Integer userId; // 创建人ID
	private Integer sort;
	private String active;// 1上市、2停产、3未上市
	private Integer year;
	private Double guidePrice;
	private Double guidePriceMax;
	private String marketTime;
	private String isExplicit;
	private Integer imagePath;
	private String isElectric; // 是否电动发动机，0不是、1是
	private Date updateTime;
	//========================add by jiangpeng 2013-04-25
	private Double spaceIndex;//空间指数
	private Double dynamicIndex;//动力指数
	private Double comsumptionIndex;//油耗指数
	
//==========冗余================
	private Integer yearName;
	private Double displacement;
	private Double combined_consumption;
	private Double minPrice;
	private Double maxPrice;
	private String imagePathString;
	private String brandLetter;
//==========冗余========add by zhuxingjun at 2012-08-06 14:25
	
	private Integer companyId; //厂商Id
	private String companyType;//0进口，1自主，2合资
	private String transmission_type;//变速箱类型
	private String structure ; //车身结构
	private String rear_power_window;//电动车窗
	private String corium_simulation_seat;//真皮坐椅
	private String electric_seat_memory;//电动座椅
	private String auto_air;//自动空调
	private String keyless_start_system;//一键启动
	private String xenon_light;//氙气大灯
	private String auto_headlight;//自动大灯
	private String park_assist;//倒车雷达
	private String reverse_video;//倒车影像
	private String cruise;//定速巡航
	private String drive; //四轮驱动
	private String tp_monitor_device;//胎压监测
	private String panoramic_sunroof;//全景天窗
	private String front_seat_heating;//座椅加热
	private String hard_drive;//车载硬盘
	private String car_refrigerator;//车载冰箱
	private String sensing_wipers;//感应雨刷
	private String light_clean_device;//大灯清洗
	private String gps_navigate_system;//GPS导航
	private String single_dvd;//DVD播放
	private String auto_parking_place;//自动泊车入位
	
	private Integer level;
	private Integer priceInterval;
	
	private String isScrap; //是否被拆 add by zhuxingjun at 2012-11-03 10:25
	
	private Date ssTime; //上市时间Date格式
	//================冗余===============   add by jiangpeng at 2013-03-01 10:09
	private long pvCount;//一个月pv
	
	private Integer carModelProperty;
	
	private String max_horsepower;
	private Double maxHorsePower;
	
	public String getMax_horsepower() {
		return max_horsepower;
	}
	public void setMax_horsepower(String max_horsepower) {
		this.max_horsepower = max_horsepower;
	}
	public long getPvCount() {
		return pvCount;
	}
	public void setPvCount(long pvCount) {
		this.pvCount = pvCount;
	}
	/**
	 * @return the imagePathString
	 */
	public String getImagePathString() {
		return imagePathString;
	}
	/**
	 * @param imagePathString the imagePathString to set
	 */
	public void setImagePathString(String imagePathString) {
		this.imagePathString = imagePathString;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	/**
	 * @return the displacement
	 */
	public Double getDisplacement() {
		if(displacement == null)
			return 0d ;
		return displacement;
	}
	/**
	 * @param displacement the displacement to set
	 */
	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}
	/**
	 * @return the combined_consumption
	 */
	public Double getCombined_consumption() {
		return combined_consumption;
	}
	/**
	 * @param combined_consumption the combined_consumption to set
	 */
	public void setCombined_consumption(Double combined_consumption) {
		this.combined_consumption = combined_consumption;
	}
	/**
	 * @return the transmission_type
	 */
	public String getTransmission_type() {
		return transmission_type;
	}
	/**
	 * @param transmission_type the transmission_type to set
	 */
	public void setTransmission_type(String transmission_type) {
		this.transmission_type = transmission_type;
	}
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
	public Integer getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(Integer series) {
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
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
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
	/**
	 * @return the brandId
	 */
	public Integer getBrandId() {
		return brandId;
	}
	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getYearName() {
		return yearName;
	}
	public void setYearName(Integer yearName) {
		this.yearName = yearName;
	}
	public String getBrandLetter() {
		return brandLetter;
	}
	public void setBrandLetter(String brandLetter) {
		this.brandLetter = brandLetter;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getRear_power_window() {
		return rear_power_window;
	}
	public void setRear_power_window(String rear_power_window) {
		this.rear_power_window = rear_power_window;
	}
	public String getCorium_simulation_seat() {
		return corium_simulation_seat;
	}
	public void setCorium_simulation_seat(String corium_simulation_seat) {
		this.corium_simulation_seat = corium_simulation_seat;
	}
	public String getElectric_seat_memory() {
		return electric_seat_memory;
	}
	public void setElectric_seat_memory(String electric_seat_memory) {
		this.electric_seat_memory = electric_seat_memory;
	}
	public String getAuto_air() {
		return auto_air;
	}
	public void setAuto_air(String auto_air) {
		this.auto_air = auto_air;
	}
	public String getKeyless_start_system() {
		return keyless_start_system;
	}
	public void setKeyless_start_system(String keyless_start_system) {
		this.keyless_start_system = keyless_start_system;
	}
	public String getXenon_light() {
		return xenon_light;
	}
	public void setXenon_light(String xenon_light) {
		this.xenon_light = xenon_light;
	}
	public String getAuto_headlight() {
		return auto_headlight;
	}
	public void setAuto_headlight(String auto_headlight) {
		this.auto_headlight = auto_headlight;
	}
	public String getPark_assist() {
		return park_assist;
	}
	public void setPark_assist(String park_assist) {
		this.park_assist = park_assist;
	}
	public String getReverse_video() {
		return reverse_video;
	}
	public void setReverse_video(String reverse_video) {
		this.reverse_video = reverse_video;
	}
	public String getCruise() {
		return cruise;
	}
	public void setCruise(String cruise) {
		this.cruise = cruise;
	}
	public String getDrive() {
		return drive;
	}
	public void setDrive(String drive) {
		this.drive = drive;
	}
	public String getTp_monitor_device() {
		return tp_monitor_device;
	}
	public void setTp_monitor_device(String tp_monitor_device) {
		this.tp_monitor_device = tp_monitor_device;
	}
	public String getPanoramic_sunroof() {
		return panoramic_sunroof;
	}
	public void setPanoramic_sunroof(String panoramic_sunroof) {
		this.panoramic_sunroof = panoramic_sunroof;
	}
	public String getFront_seat_heating() {
		return front_seat_heating;
	}
	public void setFront_seat_heating(String front_seat_heating) {
		this.front_seat_heating = front_seat_heating;
	}
	public String getHard_drive() {
		return hard_drive;
	}
	public void setHard_drive(String hard_drive) {
		this.hard_drive = hard_drive;
	}
	public String getCar_refrigerator() {
		return car_refrigerator;
	}
	public void setCar_refrigerator(String car_refrigerator) {
		this.car_refrigerator = car_refrigerator;
	}
	public String getSensing_wipers() {
		return sensing_wipers;
	}
	public void setSensing_wipers(String sensing_wipers) {
		this.sensing_wipers = sensing_wipers;
	}
	public String getLight_clean_device() {
		return light_clean_device;
	}
	public void setLight_clean_device(String light_clean_device) {
		this.light_clean_device = light_clean_device;
	}
	public String getGps_navigate_system() {
		return gps_navigate_system;
	}
	public void setGps_navigate_system(String gps_navigate_system) {
		this.gps_navigate_system = gps_navigate_system;
	}
	public String getSingle_dvd() {
		return single_dvd;
	}
	public void setSingle_dvd(String single_dvd) {
		this.single_dvd = single_dvd;
	}
	public String getAuto_parking_place() {
		return auto_parking_place;
	}
	public void setAuto_parking_place(String auto_parking_place) {
		this.auto_parking_place = auto_parking_place;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getPriceInterval() {
		return priceInterval;
	}
	public void setPriceInterval(Integer priceInterval) {
		this.priceInterval = priceInterval;
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
	public Double getMaxHorsePower() {
		return maxHorsePower;
	}
	public void setMaxHorsePower(Double maxHorsePower) {
		this.maxHorsePower = maxHorsePower;
	}
	
}
