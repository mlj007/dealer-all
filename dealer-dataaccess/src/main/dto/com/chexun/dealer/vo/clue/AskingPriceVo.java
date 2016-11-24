package com.chexun.dealer.vo.clue;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AskingPriceVo implements Serializable{
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
}
