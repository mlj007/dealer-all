package com.chexun.common.bean;
/**
 * @author fengzf
 * 评论类型枚举
 * */
public enum ReviewTypeEnum {
	SERIES(1,"1","新车车系"),NEWS(2,"2","新闻"),VIDEONEWS(3,"3","视频新闻"),PRODUCT(4,"4","商口"),SUBJECT(5,"5","专题"),PIC(6,"6","图片");
	private int type;
	private String typeStr;
	private String desc;
	private ReviewTypeEnum(int type,String typeStr,String desc){
		this.type = type;
		this.desc = desc;
		this.typeStr = typeStr;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTypeStr() {
		return typeStr;
	}
	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}
	
}
