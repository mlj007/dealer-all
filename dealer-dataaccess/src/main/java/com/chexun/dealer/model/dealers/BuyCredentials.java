package com.chexun.dealer.model.dealers;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BuyCredentials implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long dealerid;
    private String zhizhao;
    private Long zhizhaostatus;
    private String jigou;
    private Long jigoustatus;
    private String shuiwu;
    private String shouquan;
    private Long shouquanstatus;
    private Long shuiwustatus;
}
