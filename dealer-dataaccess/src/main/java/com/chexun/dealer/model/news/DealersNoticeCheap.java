package com.chexun.dealer.model.news;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersNoticeCheap implements Serializable {

	private Long newsId;
	private Long modelId;
	private String modelName;
	private BigDecimal companyPrice;
	private BigDecimal price;
	private Long brandId;
	private String brandName;
	private Long seriesId;
	private String seriesName;
	private Long cheapID;
	private BigDecimal cheapPrice;
	private BigDecimal guidePrice;
	
	private Long userId;
}
