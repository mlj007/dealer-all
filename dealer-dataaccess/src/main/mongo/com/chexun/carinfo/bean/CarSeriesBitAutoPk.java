package com.chexun.carinfo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarSeriesBitAutoPk implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer seriesId;
	private Integer seriesCompareId;
	private Date updateTime;
	private Integer isReport;// 1 数据测试报告 0 竞品对比

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

	public Integer getSeriesCompareId() {
		return seriesCompareId;
	}

	public void setSeriesCompareId(Integer seriesCompareId) {
		this.seriesCompareId = seriesCompareId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsReport() {
		return isReport;
	}

	public void setIsReport(Integer isReport) {
		this.isReport = isReport;
	}

}
