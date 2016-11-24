package com.chexun.dealer.vo.clue;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BespeakOrderVo implements Serializable{
    private Long id;
    private Long dealerId;
    private String dealerName;
    private Long provinceId;
    private Long cityId;
    private Long brandId;
    private Long seriesId;
    private Long modelId;
    private String timeStart;
    private String timeEnd;
    private Long state;//状态，1为已处理，0或者其他为未处理
    private String source;//来源
    private Long type;//类型1/试架预约、2/订车、3/二手车置换、4/保养预约
}
