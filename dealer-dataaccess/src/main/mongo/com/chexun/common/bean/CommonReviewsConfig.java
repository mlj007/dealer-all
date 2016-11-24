package com.chexun.common.bean;

import java.io.Serializable;
import java.util.Date;

public class CommonReviewsConfig implements Serializable {

	private static final long serialVersionUID = -2510187733395718562L;
	
	public static final String ALL_UNALLOWED_VALUE = "20120620";
	public static final String ALL_UNALLOWED_CHECK_VALUE = "check";
	public interface configType{
		/** 所有*/
		int all = 1;
		/** ip类型 */
		int ip = 2;
		/** 用户类型  */
		int user = 3;
		/** 实体类型  */
		int info = 4;
	}

	/** 编号 */
	private Integer id;

	/** 类型 */
	private Integer type;
	
	/** 设定值 */
	private String value;

	/** 到期时间 */
	private Date failureTime;
	
	/** 创建时间 */
	private Date createdAt;
	
	/** 创建人 */
	private Integer createdBy;
	
	/** 更新时间 */
	private Date updatedAt;
	
	/** 更新人  */
	private Integer updatedBy;

	public CommonReviewsConfig() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getFailureTime() {
		return failureTime;
	}

	public void setFailureTime(Date failureTime) {
		this.failureTime = failureTime;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}
