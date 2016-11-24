 /**     
   * @create.date: 2012-3-21 上午10:16:58
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午10:16:58     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:16:58
 */
public class CarSeriesMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_series";
	
	@AnnotationMongoKey
	private Integer id;
	private String name;
	
	/**车系所属品牌*/
	private Integer brand;
	
	private String status;
	private Date createTime;
	private Integer userId;
	private Integer sort;
	private Integer imagePath;
	private String english;//URL英文名
	private String letter;//首字母
	
	/**车系所属厂商*/
	private Integer company;
	private Date shtime;
	private String isExplicit;  //是否外显
	private String recommendSort; //推荐权重
	private String merit; //优点
	private String defect; //缺点
	private String officialName; //官方英文名
	private Integer level;
	private Integer priceInterval;
	private Date updateTime;
	private String isScrapReady;
	private Integer safe_china;
	private Integer safe_japan;
	private Integer safe_europe;
	private String safe_america_front;
	private String safe_america_side;
	private String safe_america_top;
	private String safe_america_behind;
	private Integer score;
	private Integer complexScore;//综合评分
	private String guidePrice;//指导价区间
	private List<?> yearList;
	private long sortOrPv ;
	private long levelSort ;
	private long pvCount;
	//===============冗余
	private Long num;
	private String cxflrxh;
	private Integer carProperty;
	private String advantage;
	public String getCxflrxh() {
		return cxflrxh;
	}
	public void setCxflrxh(String cxflrxh) {
		this.cxflrxh = cxflrxh;
	}
	private String imagePathString;//首显图路径
	private String active;// 1上市、2停产、3未上市
	private String lastUploadDate;//图片最后上传日期
	
	private String alias ;//别名
	private Integer whiteImage ;//白底图
	
	private String isScrap ;// 由原来的属性变成 冗余字段
	
	private String bbsUrl;//为减少bbs接口压力，将bbsUrl冗余进来
	
	public String getBbsUrl() {
		return bbsUrl;
	}
	public void setBbsUrl(String bbsUrl) {
		this.bbsUrl = bbsUrl;
	}
	public String getIsScrap() {
		return isScrap;
	}
	public void setIsScrap(String isScrap) {
		this.isScrap = isScrap;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getWhiteImage() {
		return whiteImage;
	}
	public void setWhiteImage(Integer whiteImage) {
		this.whiteImage = whiteImage;
	}
	public String getLastUploadDate() {
		return lastUploadDate;
	}
	public void setLastUploadDate(String lastUploadDate) {
		this.lastUploadDate = lastUploadDate;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getImagePathString() {
		return imagePathString;
	}
	public void setImagePathString(String imagePathString) {
		this.imagePathString = imagePathString;
	}
	/**
	 * @return the num
	 */
	public Long getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(Long num) {
		this.num = num;
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
	 * @return the brand
	 */
	public Integer getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Integer brand) {
		this.brand = brand;
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
	 * @return the english
	 */
	public String getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(String english) {
		this.english = english;
	}
	/**
	 * @return the company
	 */
	public Integer getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Integer company) {
		this.company = company;
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
	 * @return the recommendSort
	 */
	public String getRecommendSort() {
		return recommendSort;
	}
	/**
	 * @param recommendSort the recommendSort to set
	 */
	public void setRecommendSort(String recommendSort) {
		this.recommendSort = recommendSort;
	}
	/**
	 * @return the merit
	 */
	public String getMerit() {
		return merit;
	}
	/**
	 * @param merit the merit to set
	 */
	public void setMerit(String merit) {
		this.merit = merit;
	}
	/**
	 * @return the defect
	 */
	public String getDefect() {
		return defect;
	}
	/**
	 * @param defect the defect to set
	 */
	public void setDefect(String defect) {
		this.defect = defect;
	}
	/**
	 * @return the officialName
	 */
	public String getOfficialName() {
		return officialName;
	}
	/**
	 * @param officialName the officialName to set
	 */
	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}
	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * @return the priceInterval
	 */
	public Integer getPriceInterval() {
		return priceInterval;
	}
	/**
	 * @param priceInterval the priceInterval to set
	 */
	public void setPriceInterval(Integer priceInterval) {
		this.priceInterval = priceInterval;
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

	public String getIsScrapReady() {
		return isScrapReady;
	}
	public void setIsScrapReady(String isScrapReady) {
		this.isScrapReady = isScrapReady;
	}
	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	/**
	 * @return the complexScore
	 */
	public Integer getComplexScore() {
		return complexScore;
	}
	/**
	 * @param complexScore the complexScore to set
	 */
	public void setComplexScore(Integer complexScore) {
		this.complexScore = complexScore;
	}
	/**
	 * @return the guidePrice
	 */
	public String getGuidePrice() {
		return guidePrice;
	}
	/**
	 * @param guidePrice the guidePrice to set
	 */
	public void setGuidePrice(String guidePrice) {
		this.guidePrice = guidePrice;
	}
	/**
	 * @return the yearList
	 */
	public List<?> getYearList() {
		return yearList;
	}
	/**
	 * @param yearList the yearList to set
	 */
	public void setYearList(List<?> yearList) {
		this.yearList = yearList;
	}
	/**
	 * @return the safe_china
	 */
	public Integer getSafe_china() {
		return safe_china;
	}
	/**
	 * @param safe_china the safe_china to set
	 */
	public void setSafe_china(Integer safe_china) {
		this.safe_china = safe_china;
	}
	/**
	 * @return the safe_japan
	 */
	public Integer getSafe_japan() {
		return safe_japan;
	}
	/**
	 * @param safe_japan the safe_japan to set
	 */
	public void setSafe_japan(Integer safe_japan) {
		this.safe_japan = safe_japan;
	}
	/**
	 * @return the safe_europe
	 */
	public Integer getSafe_europe() {
		return safe_europe;
	}
	/**
	 * @param safe_europe the safe_europe to set
	 */
	public void setSafe_europe(Integer safe_europe) {
		this.safe_europe = safe_europe;
	}
	/**
	 * @return the safe_america_front
	 */
	public String getSafe_america_front() {
		return safe_america_front;
	}
	/**
	 * @param safe_america_front the safe_america_front to set
	 */
	public void setSafe_america_front(String safe_america_front) {
		this.safe_america_front = safe_america_front;
	}
	/**
	 * @return the safe_america_side
	 */
	public String getSafe_america_side() {
		return safe_america_side;
	}
	/**
	 * @param safe_america_side the safe_america_side to set
	 */
	public void setSafe_america_side(String safe_america_side) {
		this.safe_america_side = safe_america_side;
	}
	/**
	 * @return the safe_america_top
	 */
	public String getSafe_america_top() {
		return safe_america_top;
	}
	/**
	 * @param safe_america_top the safe_america_top to set
	 */
	public void setSafe_america_top(String safe_america_top) {
		this.safe_america_top = safe_america_top;
	}
	/**
	 * @return the safe_america_behind
	 */
	public String getSafe_america_behind() {
		return safe_america_behind;
	}
	/**
	 * @param safe_america_behind the safe_america_behind to set
	 */
	public void setSafe_america_behind(String safe_america_behind) {
		this.safe_america_behind = safe_america_behind;
	}
	public Date getShtime() {
		return shtime;
	}
	public void setShtime(Date shtime) {
		this.shtime = shtime;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public long getSortOrPv() {
		return sortOrPv;
	}
	public void setSortOrPv(long sortOrPv) {
		this.sortOrPv = sortOrPv;
	}
	public long getLevelSort() {
		return levelSort;
	}
	public void setLevelSort(long levelSort) {
		this.levelSort = levelSort;
	}
	public long getPvCount() {
		return pvCount;
	}
	public void setPvCount(long pvCount) {
		this.pvCount = pvCount;
	}
	public void setCarProperty(Integer carProperty) {
		this.carProperty = carProperty;
	}
	public Integer getCarProperty() {
		return carProperty;
	}
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
}
