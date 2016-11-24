package com.chexun.dealer.model.clue;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PhoneRecords implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long dealersid;
    private Long cdrId;
    private Long memberId;
    private String caller;
    private Long extensionNum;
    private String transferNum;
    private java.util.Date callerStartTime;
    private java.util.Date callerConnectTime;
    private Long callerCalltime;
    private java.util.Date calledStartTime;
    private java.util.Date calledEndTime;
    private Long calledCalltime;
    private Long callResult;
    private Long hangupDirection;
    private java.math.BigDecimal memberFee;
    private java.math.BigDecimal systemFee;
    private String recordFile;
    private String callRoute;
    private String playurl;
    private String tel400;
    private String yuanurl;
    private String provinceid;
    private String cityid;
    private String companyName;
    private String begintime;
    private String endtime;
}
