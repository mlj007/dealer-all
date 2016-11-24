package com.chexun.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论员
 * 
 * @author vincent
 * 
 */
public class CommonReviewsCommentator implements Serializable {
	private static final long serialVersionUID = 4083219594400840009L;

	/** 编号 */
	private Integer id;

	/** 用户名 */
	private String name;

	/** Email */
	private String email;

	/** 创建时间 */
	private Date createdAt;

	/** 创建人 */
	private Integer createdBy;

	public CommonReviewsCommentator() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
