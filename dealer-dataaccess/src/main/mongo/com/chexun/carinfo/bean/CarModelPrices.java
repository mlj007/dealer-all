 /**     
   * @create.date: 2012-3-7 上午11:42:43
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

 /**  
 * @create.date: 2012-3-7 上午11:42:43     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-7 上午11:42:43
 */
public class CarModelPrices implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer modelId;
	private Double guidePrice;
	private Double guidePriceMax;
	private Date createTime;
	private Date updateTime;
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
	 * @return the modelId
	 */
	public Integer getModelId() {
		return modelId;
	}
	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
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
	
	public Double getGuidePriceMax() {
		return guidePriceMax;
	}
	
	public void setGuidePriceMax(Double guidePriceMax) {
		this.guidePriceMax = guidePriceMax;
	}
	
}
