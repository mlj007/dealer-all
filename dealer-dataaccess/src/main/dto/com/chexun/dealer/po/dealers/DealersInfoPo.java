package com.chexun.dealer.po.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersInfoPo implements Serializable{
    private Long 	id;
    private String dealerName;
    private String dealerShortName;
    private String servicePhone;
    private String contact;
    private String cityName;
    private String brandName;
    private String salePhone;
    private String createTime;
    private String lastLoginTime;
    private String beginTime;
    private String endTime;
    private Long dealerlevel;
    private Long isrecommendfirst;
    private Long companyType;
    private Long 	state;
    
}
