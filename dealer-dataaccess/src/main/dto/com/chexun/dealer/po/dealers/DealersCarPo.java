package com.chexun.dealer.po.dealers;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersCarPo  implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long dealerId;
	private Long brandId;
	private Long seriesId;
	private Long modelId;
	private Long companyId;
	private Long yearID;
	private Long provinceId;
	private Long cityId;
	private Long regionalId;
	
	private String brandName;
	private String seriesName;
	private String modelName;
	private String companyName;
	private String yearName;
	
	
	private java.math.BigDecimal companyPrice;
	private java.math.BigDecimal price;
	
	private String state;
	private Date createTime;
	private String sellType;//售卖类型 1 现车 0预定
	private Date dateTime;
	
	private Long brandCount;
	private Long carCount;
}
