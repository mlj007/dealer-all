package com.chexun.dealer.model.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerRecord implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private String editertype;
    private String editercontent;
    private String username;
    private java.util.Date createdate;
    private Long dealerid;
    private String editerqian;
}
