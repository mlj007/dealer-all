package com.chexun.dealer.model.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 经销商数据统计页传参对象
 * @author Administrator
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersReportQuery implements Serializable{
	private String startDateTime="";
	private String endDateTime="";
}
