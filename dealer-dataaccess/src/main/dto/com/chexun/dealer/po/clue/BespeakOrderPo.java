package com.chexun.dealer.po.clue;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BespeakOrderPo {
	private Long id;
    private Long dealerId;
    private Long modelId;
    private String contact;
    private String phone;
    private Long provinceId;
    private Long cityId;
    private String email;
    private Long sex;
    private String driveTime;
    private java.util.Date createTime;
    private Long type;
    private Long state;
    private String addedRemarks;
    private java.util.Date disposeTime;
    private Long valid;
    private Long runningistance;
    private String brandname;
    private String seriesname;
    private String modelname;
    private String intention;
    private Long seriesId;
    private Long source;
    private String code;
    private String source2;
    private Long drtype;
    private Long buystatus;
    private String dealerName;
    private String cityName;
}
