package com.chexun.dealer.model.report;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 存储经销商统计数据的key、value值，key代表分类、value代表汇总的数值
 * @author Administrator
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DealersReportKV implements Serializable{
	private Integer key;
	private Integer value;
}
