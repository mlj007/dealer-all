package com.chexun.dealer.model.report;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 存储电商统计报表的实体对象
 * @author Administrator
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DealersMallReport implements Serializable{
	private Long dealerid;
	private Integer salecount=0;	
	private String companyname;
	private Integer dealerlevel;
	private Integer companytype;	
    private String contractsaler;
    private Integer allshopcount=0;
    private String contractnum;
    private Integer contractcar;
    private Float contractmoney;
    private String contractbegin;
    private String contractend;
    private String contractremark;
    private Float backcash;
    private String huodong;
    private Long cityid;
    private String cityname;
}
