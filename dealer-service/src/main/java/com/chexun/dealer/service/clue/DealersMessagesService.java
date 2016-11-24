package com.chexun.dealer.service.clue;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.service.clue.base.DealersMessagesBaseService;
import com.chexun.dealer.vo.clue.DealersMessagesVo;

/**
 * DealersMessages管理接口
 * User: 
 * Date: 2016-09-23
 */
/**
 * DealersMessages管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersMessagesService extends DealersMessagesBaseService{
	
	//added统计留言总数
    public Integer getMessagesCount(DealersMessagesVo dealersMessages);
    
    //added留言查询（关联经销商查询）
    public List<DealersMessagesPo> queryMessageListByPage(DealersMessagesVo dealersMessages,PageEntity page);
}