package com.chexun.dealer.model.system;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class XianSuoRecord implements Serializable{
	public static final Long ASKINGPRICECULE = (long) 0;// 询价线索
	public static final Long TESTDRIVECULE = (long) 1;// 试驾线索
	public static final Long SUBUPKEEP = (long) 2;// 预约保养
	
	private Long id;
	private int XSType;
	private int count;
	private String createTime;
	private String OPName;
	private int Source;
}
