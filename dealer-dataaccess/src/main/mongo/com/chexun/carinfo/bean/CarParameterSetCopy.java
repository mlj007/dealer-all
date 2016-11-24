 /**     
   * @create.date: 2012-3-14 下午07:41:17
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;

import java.util.Date;

 /**  
 * @create.date: 2012-3-14 下午07:41:17     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-14 下午07:41:17
 */
public class CarParameterSetCopy {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer parameterType;
	private Integer sort;
	private Integer brandId;
	private Integer companyId;
	private Integer isCurValue;//add by jiangpeng 20130716 用于判断是否为当前值
	private Date updateTime;
	
	
	public Integer getIsCurValue() {
		return isCurValue;
	}
	public void setIsCurValue(Integer isCurValue) {
		this.isCurValue = isCurValue;
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
	 * @return the parameterType
	 */
	public Integer getParameterType() {
		return parameterType;
	}
	/**
	 * @param parameterType the parameterType to set
	 */
	public void setParameterType(Integer parameterType) {
		this.parameterType = parameterType;
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
	/**
	 * @return the companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
}
