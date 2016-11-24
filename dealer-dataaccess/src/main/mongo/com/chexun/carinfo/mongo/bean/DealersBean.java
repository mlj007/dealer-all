package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;

/**
 * 经销商基本信息
 * */
public class DealersBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id ;
	private String companyName ;
	private int companyType ;
	private String companyTypeName ;
	private String companyAddress ;
	private String salePhone ;
	private String servicePhone ;
	private double price ;
	private int SeriesId ;
	private int modelId ;
	private String gifts ;
	private String mapUrl ;
	private String questionsOnlineUrl ;
	private String shiJiaDingChe ;
	private double minPrice;
	private double maxPrice;
	private int cityId;
	private String companyPic;
	private String recommend;
	private String dealerLevel ;
	private String url;
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the recommend
	 */
	public String getRecommend() {
		return recommend;
	}
	/**
	 * @param recommend the recommend to set
	 */
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	/**
	 * @return the companyPic
	 */
	public String getCompanyPic() {
		return companyPic;
	}
	/**
	 * @param companyPic the companyPic to set
	 */
	public void setCompanyPic(String companyPic) {
		this.companyPic = companyPic;
	}
	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @return the companyType
	 */
	public int getCompanyType() {
		return companyType;
	}
	/**
	 * @return the companyTypeName
	 */
	public String getCompanyTypeName() {
		return companyTypeName;
	}
	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}
	/**
	 * @return the salePhone
	 */
	public String getSalePhone() {
		return salePhone;
	}
	/**
	 * @return the servicePhone
	 */
	public String getServicePhone() {
		return servicePhone;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the seriesId
	 */
	public int getSeriesId() {
		return SeriesId;
	}
	/**
	 * @return the modelId
	 */
	public int getModelId() {
		return modelId;
	}
	/**
	 * @return the gifts
	 */
	public String getGifts() {
		return gifts;
	}
	/**
	 * @return the mapUrl
	 */
	public String getMapUrl() {
		return mapUrl;
	}
	/**
	 * @return the questionsOnlineUrl
	 */
	public String getQuestionsOnlineUrl() {
		return questionsOnlineUrl;
	}
	/**
	 * @return the shiJiaDingChe
	 */
	public String getShiJiaDingChe() {
		return shiJiaDingChe;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(int companyType) {
		this.companyType = companyType;
	}
	/**
	 * @param companyTypeName the companyTypeName to set
	 */
	public void setCompanyTypeName(String companyTypeName) {
		this.companyTypeName = companyTypeName;
	}
	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	/**
	 * @param salePhone the salePhone to set
	 */
	public void setSalePhone(String salePhone) {
		this.salePhone = salePhone;
	}
	/**
	 * @param servicePhone the servicePhone to set
	 */
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param seriesId the seriesId to set
	 */
	public void setSeriesId(int seriesId) {
		SeriesId = seriesId;
	}
	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	/**
	 * @param gifts the gifts to set
	 */
	public void setGifts(String gifts) {
		this.gifts = gifts;
	}
	/**
	 * @param mapUrl the mapUrl to set
	 */
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}
	/**
	 * @param questionsOnlineUrl the questionsOnlineUrl to set
	 */
	public void setQuestionsOnlineUrl(String questionsOnlineUrl) {
		this.questionsOnlineUrl = questionsOnlineUrl;
	}
	/**
	 * @param shiJiaDingChe the shiJiaDingChe to set
	 */
	public void setShiJiaDingChe(String shiJiaDingChe) {
		this.shiJiaDingChe = shiJiaDingChe;
	}
	public String getDealerLevel() {
		return dealerLevel;
	}
	public void setDealerLevel(String dealerLevel) {
		this.dealerLevel = dealerLevel;
	}
	
}
