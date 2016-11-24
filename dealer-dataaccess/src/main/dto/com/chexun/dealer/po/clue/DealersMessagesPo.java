package com.chexun.dealer.po.clue;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DealersMessagesPo implements Serializable{
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
    private String dealerName;
}
