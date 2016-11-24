package com.chexun.dealer.vo.clue;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersMessagesVo implements Serializable{
    private Long id;
    private Long dealerId;
    private String dealerName;
    private Long provinceId;
    private Long cityId;
    private String timeStart;
    private String timeEnd;
    private Long state;//状态，1正常，2删除，4隐藏（原来的，去掉这种状态）
    private Integer isReply;//是否回复，1为已经回复，0为未回复
}
