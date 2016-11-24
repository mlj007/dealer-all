package com.chexun.dealer.model.clue;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AskingPrice implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
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
}
