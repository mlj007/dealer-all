package com.chexun.dealer.po.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerRecordPo implements Serializable{
	private String editertype;
    private String editercontent;
    private String username;
    private java.util.Date createdate;
    private Long dealerid;
    private String editerqian;
}
