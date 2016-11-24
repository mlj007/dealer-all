 /**     
   * @create.date: 2012-3-21 上午10:16:58
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2013-01-11 
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: zxj
 * @modify.by: zxj
 */
public class AdCarMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "ad_car";
	
	@AnnotationMongoKey
	private Integer id;     
	private String name;    	//广告Name
	private Integer brand;		//关联 品牌
	private String brandName;
	private Integer company;	//关联 厂商
	private String companyName;
	private Integer series;	//关联 厂商
	private String seriesName;
	private Integer status;		//状态
	private Date createTime;	//创建时间
	private Date updateTime;	//更新时间
	private String startTime;	//开始时间
	private String endTime;	//结束时间
	private Date startTimeDate;	//开始时间
	private Date endTimeDate;	//结束时间
	private Integer type ;  // 类型
	private String content; // 内容
	private Integer cityId;  //城市ID
	private String cityName; //城市名称
	
	private Integer pic_type ;  //图片搁置  0->普通图片  1->flash图片
	private String pic_src ;    //图片内容
	private String pic_href ;   //图片链接
	private String pic_width ;  //图片宽度
	private String pic_height ; //图片高度
	
	private Integer ad_default =1;  // 默认广告   0为默认 1为不是默认
	
	private String ggw;
	
	
	private String key ;// 由brandId,companyId,seriesId,cityId,type 组成的一个唯一的字符串
	
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getPic_type() {
		return pic_type;
	}
	public void setPic_type(Integer pic_type) {
		this.pic_type = pic_type;
	}
	public String getPic_src() {
		return pic_src;
	}
	public void setPic_src(String pic_src) {
		this.pic_src = pic_src;
	}
	public String getPic_href() {
		return pic_href;
	}
	public void setPic_href(String pic_href) {
		this.pic_href = pic_href;
	}
	public String getPic_width() {
		return pic_width;
	}
	public void setPic_width(String pic_width) {
		this.pic_width = pic_width;
	}
	public String getPic_height() {
		return pic_height;
	}
	public void setPic_height(String pic_height) {
		this.pic_height = pic_height;
	}
	public String getGgw() {
		return ggw;
	}
	public void setGgw(String ggw) {
		this.ggw = ggw;
	}
	public Integer getAd_default() {
		return ad_default;
	}
	public void setAd_default(Integer ad_default) {
		this.ad_default = ad_default;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getSeries() {
		return series;
	}
	public void setSeries(Integer series) {
		this.series = series;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBrand() {
		return brand;
	}
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	public Integer getCompany() {
		return company;
	}
	public void setCompany(Integer company) {
		this.company = company;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Date getStartTimeDate() {
		return startTimeDate;
	}
	public void setStartTimeDate(Date startTimeDate) {
		this.startTimeDate = startTimeDate;
	}
	public Date getEndTimeDate() {
		return endTimeDate;
	}
	public void setEndTimeDate(Date endTimeDate) {
		this.endTimeDate = endTimeDate;
	}
	
	
	
	
}
