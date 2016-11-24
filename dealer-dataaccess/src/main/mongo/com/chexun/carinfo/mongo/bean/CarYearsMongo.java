 /**     
   * @create.date: 2012-3-21 上午10:18:20
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
 * @create.date: 2012-3-21 上午10:18:20     
 * @comment: 
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:18:20
 */
public class CarYearsMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_years";
	
	@AnnotationMongoKey
	private Integer id;
	private String name;
	private Integer series;
	private Date createTime;
	private Date updateTime;
	private String status;
	
//============冗余===============
	private String isBuy;
	private Integer buyNum;
	private Integer nobuyNum;
	private Integer notYetbuyNum;//未上市数量
	
	private Integer active;// 1上市、2停产、3未上市
	
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public Integer getNotYetbuyNum() {
		return notYetbuyNum;
	}
	public void setNotYetbuyNum(Integer notYetbuyNum) {
		this.notYetbuyNum = notYetbuyNum;
	}
	private List<DisplacementBean> dList;
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
	 * @return the isBuy
	 */
	public String getIsBuy() {
		return isBuy;
	}
	/**
	 * @param isBuy the isBuy to set
	 */
	public void setIsBuy(String isBuy) {
		this.isBuy = isBuy;
	}
	/**
	 * @return the dList
	 */
	public List<DisplacementBean> getDList() {
		return dList;
	}
	/**
	 * @param list the dList to set
	 */
	public void setDList(List<DisplacementBean> list) {
		dList = list;
	}
	/**
	 * @return the buyNum
	 */
	public Integer getBuyNum() {
		return buyNum;
	}
	/**
	 * @param buyNum the buyNum to set
	 */
	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}
	public Integer getNobuyNum() {
		return nobuyNum;
	}
	public void setNobuyNum(Integer nobuyNum) {
		this.nobuyNum = nobuyNum;
	}
	
}
