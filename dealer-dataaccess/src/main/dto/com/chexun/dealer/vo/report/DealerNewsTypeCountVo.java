package com.chexun.dealer.vo.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealerNewsTypeCountVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer allCount=0;
	private Integer qiyeNewsCount=0;
	private Integer cuxiaoNewsCount=0;
	private Integer cheyouNewsCount=0;
	private Integer xincheNewsCount=0;
}
