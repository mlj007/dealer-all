package com.chexun.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
   * @create.date: May 29, 2012 11:48:52 AM     
   * @see: com.chexun.common.bean
   * @author: aaron.han
   * @modify.by: aaron.han
   * @modify.date: May 29, 2012 11:48:52 AM
 */
public class CommonReviewsUsers implements Serializable {
	/** 
	 * Nov 23, 2011  11:20:37 AM
	 * MobileForCustBean.java 
	 * author:aaron.hanyx
	*/ 
	private static final long serialVersionUID = 1L;
	private Integer id;
	//用户ID
	private Integer userId;
	//用户名
	private String userName;
	//评论数量
	private Integer sendCount;
	//购买车型
	private Date lastSendTime;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSendCount() {
		return sendCount;
	}
	public void setSendCount(Integer sendCount) {
		this.sendCount = sendCount;
	}
	public Date getLastSendTime() {
		return lastSendTime;
	}
	public void setLastSendTime(Date lastSendTime) {
		this.lastSendTime = lastSendTime;
	}
}
