package com.chexun.dealer.model.dealers;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersAddcarlog implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long dealerid;
    private java.math.BigDecimal backcash;
    private java.math.BigDecimal hirecash;
    private Long addcount;
    private java.util.Date createdate;
}
