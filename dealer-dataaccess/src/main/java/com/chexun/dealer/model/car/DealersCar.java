package com.chexun.dealer.model.car;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersCar implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long userId;
    private Long brandId;
    private String brandName;
    private Long companyId;
    private String companyName;
    private Long seriesId;
    private String seriesName;
    private Long yearId;
    private String yearName;
    private Long modelId;
    private String modelName;
    private java.math.BigDecimal companyprice;
    private java.math.BigDecimal price;
    private Long provinceId;
    private Long cityId;
    private Long state;
    private java.util.Date createTime;
    private Long isRecommend;
    private String remarks;
    private Long clickNum;
    private Long sort;
    private java.util.Date dateTime;
    private String gifts;
    private String modelRecommend;
    private Long sellType;
    private Long promotionType;
    private String companyWebsite;
    private Long ycSeriesId;
    private Long ycModelId;
    private Long clickcount;
    private java.math.BigDecimal consultprice;
    private String companyWebsite2;
}
