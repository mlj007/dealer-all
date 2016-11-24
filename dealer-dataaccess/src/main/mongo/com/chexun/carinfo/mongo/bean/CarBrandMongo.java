 /**     
   * @create.date: 2012-3-21 上午09:42:47
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
 * @create.date: 2012-3-21 上午09:42:47     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午09:42:47
 */
public class CarBrandMongo implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_brand";
	
	@AnnotationMongoKey
	private Integer id; //品牌ID
	private String name; //品牌名称
	private String letter; //品牌首字母
	private Integer logo; //品牌Logo
	private String history; //品牌历史
	private String status; //状态(1正常,4锁定,5级联锁定,6删除)
	private Date createTime; //创建时间
	private Integer userId; //操作人员编号
	private String webSite; //官方网址	
	private String phone; //官方电话号码
	private String english; //URL英文名
	private String isExplicit;  //是否外显
	private String officialName; //官方英文名
	private Date updateTime; //更新时间
	//===========冗余
	private Long num; //品牌图片数量
	private List<?> companyList; //厂商集合
	private String logoPathStirng;//logo的图片地址
	
	private Integer weight;//权重  add by jiangpeng 20130718
	private String xl_weibo;
	private String tx_weibo;
	
	public String getXl_weibo() {
		return xl_weibo;
	}
	public void setXl_weibo(String xl_weibo) {
		this.xl_weibo = xl_weibo;
	}
	public String getTx_weibo() {
		return tx_weibo;
	}
	public void setTx_weibo(String tx_weibo) {
		this.tx_weibo = tx_weibo;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getLogoPathStirng() {
		return logoPathStirng;
	}
	public void setLogoPathStirng(String logoPathStirng) {
		this.logoPathStirng = logoPathStirng;
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
	 * @return the letter
	 */
	public String getLetter() {
		return letter;
	}
	/**
	 * @param letter the letter to set
	 */
	public void setLetter(String letter) {
		this.letter = letter;
	}
	/**
	 * @return the logo
	 */
	public Integer getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(Integer logo) {
		this.logo = logo;
	}
	/**
	 * @return the history
	 */
	public String getHistory() {
		return history;
	}
	/**
	 * @param history the history to set
	 */
	public void setHistory(String history) {
		this.history = history;
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
	 * @return the webSite
	 */
	public String getWebSite() {
		return webSite;
	}
	/**
	 * @param webSite the webSite to set
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return the mONGO_COLLECT_NAME
	 */
	public static String getMONGO_COLLECT_NAME() {
		return MONGO_COLLECT_NAME;
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
	 * @return the companyList
	 */
	public List<?> getCompanyList() {
		return companyList;
	}
	/**
	 * @param companyList the companyList to set
	 */
	public void setCompanyList(List<?> companyList) {
		this.companyList = companyList;
	}
}
