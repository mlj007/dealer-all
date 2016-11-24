package com.chexun.dealer.po.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
public class CarCompanySetPo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long companyId;
	private String companyName;
}
