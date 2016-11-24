package com.chexun.dealer.service.clue.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.service.clue.DealersMessagesService;
import com.chexun.dealer.service.clue.base.impl.DealersMessagesBaseServiceImpl;
import com.chexun.dealer.vo.clue.DealersMessagesVo;
/**
 * DealersMessages管理接口
 * User: 
 * Date: 2016-09-23
 */
@Service("dealersMessagesService")
public class DealersMessagesServiceImpl extends DealersMessagesBaseServiceImpl  implements DealersMessagesService{


	//added统计留言总数
    @Override
    public Integer getMessagesCount(DealersMessagesVo dealersMessages){
    	return getDealersMessagesDao().getMessagesCount(dealersMessages);
    }
    
    //added留言查询（关联经销商查询）
    public List<DealersMessagesPo> queryMessageListByPage(DealersMessagesVo dealersMessages,PageEntity page){
    	return getDealersMessagesDao().queryMessageListByPage(dealersMessages, page);
    }
 	
}