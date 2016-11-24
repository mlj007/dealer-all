package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;
/**
 * 纠错的pojo
 * add by zhuxingjun at 20120910 19:22
 * */
public class ErrorPicking implements Serializable{
	public static final String MONGO_COLLECT_NAME = "chexun_error_picking";
	private static final long serialVersionUID = 1L;
	
	//@AnnotationMongoKey
	
	private Integer _id;
	
	private Integer seriesId;           //车系Id
	private String seriesName;    		//车系名字
	private Integer modelId;      		// 车型ID
	private String modelName;          //车型名字
	private String ip;                 //ip地址
	private String paraName;      		//参数名字
	private String paraValue;      		//参数值
	private String new_para;      		// 正确参数
	private String data;      			//参考资料
	private String status;				//状态
	private Date date;					//时间
	
	
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getParaValue() {
		return paraValue;
	}
	public void setParaValue(String paraValue) {
		this.paraValue = paraValue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getParaName() {
		return paraName;
	}
	public void setParaName(String paraName) {
		this.paraName = paraName;
	}
	public String getNew_para() {
		return new_para;
	}
	public void setNew_para(String new_para) {
		this.new_para = new_para;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
