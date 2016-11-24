 /**     
   * @create.date: 2012-3-6 上午11:52:09
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.chexun.common.bean.Country;

 /**  
 * @create.date: 2012-3-6 上午11:52:09     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-6 上午11:52:09
 */
public class CarCompany implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer logo;
	private String english;
	private String website;
	private String introduction;
	private Date createTime;
	private String status;
	private String companyType;//0进口，1自主，2合资
	private String officialPhone;
	private String isExplicit;
	private String letter;
	private Country country;
	private Date updateTime;
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
	/**
	 * 厂商所具有的品牌
	 */
	private List<?> brandList;
	
	/**
	 * 厂商所具有的车系
	 */
	private List<?> seriesList;
	
	
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
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the introduction
	 */
	public String getIntroduction() {
		return introduction;
	}
	/**
	 * @param introduction the introduction to set
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
	 * @return the companyType
	 */
	public String getCompanyType() {
		return companyType;
	}
	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	/**
	 * @return the officialPhone
	 */
	public String getOfficialPhone() {
		return officialPhone;
	}
	/**
	 * @param officialPhone the officialPhone to set
	 */
	public void setOfficialPhone(String officialPhone) {
		this.officialPhone = officialPhone;
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
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
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
	public List<?> getBrandList() {
		return brandList;
	}
	public void setBrandList(List<?> brandList) {
		this.brandList = brandList;
	}
	public List<?> getSeriesList() {
		return seriesList;
	}
	public void setSeriesList(List<?> seriesList) {
		this.seriesList = seriesList;
	}
}
