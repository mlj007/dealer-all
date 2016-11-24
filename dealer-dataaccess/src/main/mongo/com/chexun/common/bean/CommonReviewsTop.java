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
public class CommonReviewsTop implements Serializable {
	
	private Integer id; //id
	private Integer infoId; //新闻Id
	private Integer up = 0;//顶 数量
	private Integer down = 0;//踩 数量
	private Integer type ; //类别
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
	public Integer getUp() {
		return up;
	}
	public void setUp(Integer up) {
		this.up = up;
	}
	public Integer getDown() {
		return down;
	}
	public void setDown(Integer down) {
		this.down = down;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	
	
	
	
}
