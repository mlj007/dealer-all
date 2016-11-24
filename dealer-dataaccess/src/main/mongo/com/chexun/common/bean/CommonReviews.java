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
public class CommonReviews implements Serializable {
	private static final long serialVersionUID = 6026465237288614149L;
	public static final String ILLEGALITY_CONTENT = "该评论含有非法信息.";
	public static final String VAR_ILLEGALITY_CONTENT = "varChexunIllegalityTag";
	public static final String NEAR_REPLY_SPLIT = "#chexun#";
	public static final String SELF_REPLY_SPLIT = "\\$\\$";
	public static final String SOURCE_SELF_REPLY_SPLIT = "$$";
	
	/**
	 * 热门评论排行榜周期类型
	 *
	 */
	public interface reviewTopType{
		int week = 1;
		int month = 2;
		int day = 3;
	}
	
	/**
	 * 精华设定值
	 *
	 */
	public interface reviewTop{
		/** 非精华 */
		int NONE_TOP = 0;
		/** 精华  */
		int IS_TOP = 1;
	}
	
	/**
	 * 
	 * 评论状态值
	 *
	 */
	public interface reviewState{
		/** 有效的 */
		int ENABLED = 1;
		/** 无效的 删除的 */
		int DELETED = 2;
		/** 待审核*/
		int CHECKED = 3;
	}

	/** 编号 */
	private Integer id;
	
	/** 信息编号 */
	private Integer infoId;
	
	/** 评论内容 */
	private String reviewContent;
	
	/** 评论内容 (冗余存储评论内容便于反查删除内容)*/
	private String trueContent;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 新闻所属栏目*/
	private Integer parentId;
	
	/** 评论人会员账号（非登录为空) */
	private String userName;
	
	/** 类型:1、新车车系 2、资讯信息 3、视频 4、商品 5、专题 6、图片 */
	private String type;
	
	/** 支持票数 */
	private Integer support;
	
	/** 反对票数 */
	private Integer opposed;
	
	/** (最后)评论人IP */
	private String ip;
	
	/** 最后回复内容 */
	private String lastReply;
	
	/** 是否有子回复:0没有，1有 */
	private String isChild;
	
	/** 评论人编号*/
	private Integer userId;
	
	/** IP地址所属区域*/
	private String ipArea;
	
	/** 回复所属的评论ID */
	private Integer replyBy;
	
	/** 状态 */
	private Integer state;
	
	/** 信息名称 */
	private String infoName;
	
	/** 信息URL */
	private String infoUrl;
	
	/** 精华帖 默认0**/
	private Integer top;
	
	/** 车系Id 默认值 0 */
	private Integer seriesId;
	
	/**页面冗余使用*/
	private Integer floor;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSupport() {
		return support;
	}

	public void setSupport(Integer support) {
		this.support = support;
	}

	public Integer getOpposed() {
		return opposed;
	}

	public void setOpposed(Integer opposed) {
		this.opposed = opposed;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLastReply() {
		return lastReply;
	}

	public void setLastReply(String lastReply) {
		this.lastReply = lastReply;
	}

	public String getIsChild() {
		return isChild;
	}

	public void setIsChild(String isChild) {
		this.isChild = isChild;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIpArea() {
		return ipArea;
	}

	public void setIpArea(String ipArea) {
		this.ipArea = ipArea;
	}

	public Integer getReplyBy() {
		return replyBy;
	}

	public void setReplyBy(Integer replyBy) {
		this.replyBy = replyBy;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getInfoName() {
		return infoName;
	}

	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoUrl() {
		return infoUrl;
	}

	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getTrueContent() {
		return trueContent;
	}

	public void setTrueContent(String trueContent) {
		this.trueContent = trueContent;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	
}
