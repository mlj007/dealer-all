package com.chexun.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
   * @create.date: October 9, 2012 11:48:52 AM     
   * @see: com.chexun.common.bean
   * @author: criss zhu
   * @modify.by: criss zhu
 */
public class CommonReviewsEditor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;                  //默认ID 递增
	private Integer editorId;            //编辑ID
	private Integer parentId;            //父对象ID
	private String reviewsContent;      //留言内容
	private Date createTime;			 //内容
	private Integer userId;				 //用户ID	
	private String userName;				 //用户名称
	private Integer type;				 //类型
	private Integer replyId = 0;			 //回复ID
	private Integer status;				 //状态
	private String ip;					 //ip地址
	private Integer isReply=0;				 //是否被回复
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEditorId() {
		return editorId;
	}
	public void setEditorId(Integer editorId) {
		this.editorId = editorId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getReviewsContent() {
		return reviewsContent;
	}
	public void setReviewsContent(String reviewsContent) {
		this.reviewsContent = reviewsContent;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getIsReply() {
		return isReply;
	}
	public void setIsReply(Integer isReply) {
		this.isReply = isReply;
	}
	
	
	
}
