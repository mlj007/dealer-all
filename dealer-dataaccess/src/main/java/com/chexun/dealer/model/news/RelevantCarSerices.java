package com.chexun.dealer.model.news;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RelevantCarSerices implements Serializable {
	private String ASum;
	private String seriesId;
	private String brandId;
	private String seriesName;
	private String maxPrice;
	private Long userId;
	
	private boolean checked;
}
