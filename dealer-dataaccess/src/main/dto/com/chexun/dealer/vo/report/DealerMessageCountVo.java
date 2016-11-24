package com.chexun.dealer.vo.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerMessageCountVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer allCount=0;
	private Integer allMessageCount=0;
	private Integer untreatedMessageCount=0;
	private Integer allXunjiaCount=0;
	private Integer untreatedXunjiaCount=0;
	private Integer allShijiaCount=0;
	private Integer untreatedShijiaCount=0;
}
