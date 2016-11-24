package com.chexun.dealer.model.clue;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PhoneHistor implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private String tel400;
    private String status;
    private java.util.Date adddate;
    private String username;
    private Long dealersid;
    private String companyName;
    private String begintime;
    private String endtime;
}
