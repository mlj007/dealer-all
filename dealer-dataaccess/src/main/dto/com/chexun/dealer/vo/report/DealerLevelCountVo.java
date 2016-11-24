package com.chexun.dealer.vo.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerLevelCountVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer dealerAllCount=0;
	private Integer dealerLevel10=0;
	private Integer dealerLevel20=0;
	private Integer dealerLevel30=0;
	private Integer dealerLevel40=0;
	private Integer dealerLevel50=0;
	private Integer dealerLevel60=0;
	private Integer dealerLevel70=0;
	private Integer dealerLevel100=0;
}
