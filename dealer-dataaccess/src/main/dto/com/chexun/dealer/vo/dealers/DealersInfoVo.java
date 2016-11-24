package com.chexun.dealer.vo.dealers;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersInfoVo implements Serializable{
   
    /**
	 * 经销商管理列表查询参数
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long brandId;
	private Long seriesId;
	private Long modelId;
	private Long companyType;
    private Long dealerlevel;
    private Long state;
    private Long isrecommendfirst;
    private String createbeginTime;
    private String createendTime;
    private String expirebeginTime;
    private String expireendTime;
    private String companyName;
    private Long provinceId;
    private Long cityId;
    private Long regionalId;
    private String englishAlias;
    private String username;
}
