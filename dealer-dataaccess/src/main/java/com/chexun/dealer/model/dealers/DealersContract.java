package com.chexun.dealer.model.dealers;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersContract implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long dealerid;
    private String contractnum;
    private Long contractcar;
    private java.math.BigDecimal contractmoney;
    private java.util.Date contractbegin;
    private java.util.Date contractend;
    private String contractsaler;
    private String contractremark;
    private java.util.Date createdate;
}
