 /**     
   * @create.date: 2012-3-21 上午10:08:26
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午10:08:26     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:08:26
 */
public class CarParameterOptionsMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameter_options";
	
	@AnnotationMongoKey
	private Integer id;
	private Integer parameterConfig;
	private String parameterOption;
	private Date createTime;
	private Integer sort;
	private String isDefault;
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
	 * @return the parameterConfig
	 */
	public Integer getParameterConfig() {
		return parameterConfig;
	}
	/**
	 * @param parameterConfig the parameterConfig to set
	 */
	public void setParameterConfig(Integer parameterConfig) {
		this.parameterConfig = parameterConfig;
	}
	/**
	 * @return the parameterOption
	 */
	public String getParameterOption() {
		return parameterOption;
	}
	/**
	 * @param parameterOption the parameterOption to set
	 */
	public void setParameterOption(String parameterOption) {
		this.parameterOption = parameterOption;
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
	 * @return the isDefault
	 */
	public String getIsDefault() {
		return isDefault;
	}
	/**
	 * @param isDefault the isDefault to set
	 */
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
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
