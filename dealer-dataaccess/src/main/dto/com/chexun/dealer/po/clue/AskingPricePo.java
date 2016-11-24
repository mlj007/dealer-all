package com.chexun.dealer.po.clue;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AskingPricePo {
	private Long id;
    private Long dealersid;
    private String username;
    private String phone;
    private Long proviceid;
    private Long cityid;
    private Long brandid;
    private String brandname;
    private Long seriesid;
    private String seriesname;
    private Long modelid;
    private String modelname;
    private String modelcolor;
    private String remark;
    private java.util.Date createtime;
    private Long state;
    private Long sex;
    private Long source;
    private Long tongjiid;
    private java.util.Date disposeTime;
    private String source2;
    private Long drtype;
    private Long buystatus;
    private Long type;
    private String dealerName;
    private String cityName;
}
