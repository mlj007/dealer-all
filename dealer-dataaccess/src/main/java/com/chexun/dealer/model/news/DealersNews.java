package com.chexun.dealer.model.news;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersNews implements Serializable{
	public static final Long DEFAULT_STATUS = (long) 0;// 默认状态(没启用)
	public static final Long FREEZE_STATUS = (long) 1;// 显示
	public static final Long DELETE_STATUS = (long) 2;// 隐藏(伪删除)
    private Long id;
    private String content;
    private String createTime;
    private Long dealerUserId;
    private String title;
    private Long state;
    private Long type;
    private Long isRecommend;
    private String recommendPage;
    private Long isFirst;
    private String recommendTime;
    private String recommendTitle;
    private java.util.Date publishtime;
    private String seriesids;
    private Long clickcount;
    private Long showother;
    private String begintime;
    private String endtime;
    private Long cheaptype;
    private java.math.BigDecimal cheapvalue;
    private Long modeltype;
    private Long pushtype;
    private java.util.Date pushdate;
    private Long pushdifang;
    private Long pushchexun;
    private String imgurl;
    private Long pushdealer;
    private java.util.Date pushdealerdate;
    private Long pushdealertimes;
    
    private String companyName;
    private String englishAlias;
}
