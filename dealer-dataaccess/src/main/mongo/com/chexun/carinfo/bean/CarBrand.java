 /**     
   * @create.date: 2012-3-6 上午10:24:20
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;


import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import java.util.List;

 /**  
 * @create.date: 2012-3-6 上午10:24:20     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-6 上午10:24:20
 */
public class CarBrand implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id; //品牌ID
	private String name; //品牌名称
	private String letter; //品牌首字母
	private Integer logo; //品牌Logo
	private Clob  historyClob; //品牌历史
	private String  history; //品牌历史
	private String status; //状态(1正常,4锁定,5级联锁定,6删除)
	private Date createTime; //创建时间
	private Integer userId; //操作人员编号
	private String webSite; //官方网址	
	private String phone; //官方电话号码
	private String english; //URL英文名
	private String isExplicit;  //是否外显
	private String officialName; //官方英文名
	
	private Integer weight; //权重 默认5 add by jiangpeng 20130718
	private String xl_weibo;//新浪微博
    private String tx_weibo;//腾讯微博
	

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
	private Date updateTime; //更新时间
	
	/**
	 * 所属某品牌下的厂商列表
	 */
	private List<?> companyList;
	
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
	public List<?> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<?> companyList) {
		this.companyList = companyList;
	}
	public Clob getHistoryClob() {
		return historyClob;
	}
	public void setHistoryClob(Clob historyClob) {
		this.historyClob = historyClob;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getHistory() {
		return history;
	}

}
