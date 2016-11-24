package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarSeriesBitAuto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer seriesId;// 车讯车系id
	private String seriesName;// 车讯车系名
	private String bitautoUrl;
	private String bitautoBrandName;
	private String bitautoSeriesName;
	private String zhyh;
	private String jssj;
	private String zdjl;
	private Integer status;// 1:已匹配 2:未匹配
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getBitautoUrl() {
		return bitautoUrl;
	}

	public void setBitautoUrl(String bitautoUrl) {
		this.bitautoUrl = bitautoUrl;
	}

	public String getBitautoBrandName() {
		return bitautoBrandName;
	}

	public void setBitautoBrandName(String bitautoBrandName) {
		this.bitautoBrandName = bitautoBrandName;
	}

	public String getBitautoSeriesName() {
		return bitautoSeriesName;
	}

	public void setBitautoSeriesName(String bitautoSeriesName) {
		this.bitautoSeriesName = bitautoSeriesName;
	}

	public String getZhyh() {
		return zhyh;
	}

	public void setZhyh(String zhyh) {
		this.zhyh = zhyh;
	}

	public String getJssj() {
		return jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public String getZdjl() {
		return zdjl;
	}

	public void setZdjl(String zdjl) {
		this.zdjl = zdjl;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
