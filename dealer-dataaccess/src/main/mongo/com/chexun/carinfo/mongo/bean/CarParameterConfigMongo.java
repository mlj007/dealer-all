 /**     
   * @create.date: 2012-3-21 上午10:06:52
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
 * @create.date: 2012-3-21 上午10:06:52     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:06:52
 */
public class CarParameterConfigMongo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameter_config";
	
	@AnnotationMongoKey
	private Integer id;
	private String code;
	private String name;
	private Integer sort;
	private String state;
	private Date createTime;
	private String type;
	private String dataType;
	private Integer parameterType;
	private Integer is_show;
	private Object value;
	private List<?> optionList;
	private Integer dataLength;
	
	public Integer getIs_show() {
		return is_show;
	}
	public void setIs_show(Integer is_show) {
		this.is_show = is_show;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
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
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	/**
	 * @return the optionList
	 */
	public List<?> getOptionList() {
		return optionList;
	}
	/**
	 * @param optionList the optionList to set
	 */
	public void setOptionList(List<?> optionList) {
		this.optionList = optionList;
	}
	/**
	 * @return the dataLength
	 */
	public Integer getDataLength() {
		return dataLength;
	}
	/**
	 * @param dataLength the dataLength to set
	 */
	
	
	
	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}
}
