package com.chexun.dealer.model.clue;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LocalCluePool implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private java.util.Date createDate;
    private String province;
    private String phoneProvince;
    private String cityid;
    private String city;
    private String phoneCity;
    private String brandid;
    private String brand;
    private String company;
    private String series;
    private String model;
    private String name;
    private String phone;
    private String source;
    private java.util.Date firstVisitDate;
    private String firstVisitRes;
    private java.util.Date secondVisitDate;
    private String secondVisitRes;
    private java.util.Date thirdVisitDate;
    private String thirdVisitRes;
    private Long phoneState;
}
