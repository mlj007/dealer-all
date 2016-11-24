package com.chexun.dealer.po.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CarSeriesSetPo  implements Serializable{
	private Long seriesId;
    private String seriesName;
}
