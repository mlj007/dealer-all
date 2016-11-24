package com.chexun.dealer.vo.dealers;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
public class DealerRecordVo implements Serializable{
	private Long id;
	private String editertype;
    private String editercontent;
    private String username;
    private String beginTime;
    private String endTime;
    private Long dealerid;
    private String editerqian;
    private Data createdate;
}

