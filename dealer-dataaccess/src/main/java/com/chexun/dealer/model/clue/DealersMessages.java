package com.chexun.dealer.model.clue;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersMessages implements Serializable{
	public static final int DEFAULT_STATUS = 0;// 默认状态
	public static final int FREEZE_STATUS = 1;// 冻结
	public static final int DELETE_STATUS = 2;// 伪删除
    private Long id;
    private Long dealerId;
    private String messageContent;
    private String ip;
    private String userName;
    private java.util.Date createTime;
    private Long state;
    private Long modelId;
    private String replyContent;
    private java.util.Date replyTime;
    private Long userId;
    private String phone;
    private Long salerid;
    private String salername;
    private Integer isReply;
}
