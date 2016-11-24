package com.chexun.dealer.vo.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerShopAccessLogVo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer allCount=0;
	private Integer avgCount=0;
	private String xAxisData="";
	private String yAxisData="";
}
