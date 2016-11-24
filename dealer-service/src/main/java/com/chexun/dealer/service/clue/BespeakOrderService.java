package com.chexun.dealer.service.clue;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.BespeakOrder;
import com.chexun.dealer.po.clue.BespeakOrderPo;
import com.chexun.dealer.service.clue.base.BespeakOrderBaseService;
import com.chexun.dealer.vo.clue.BespeakOrderVo;
/**
 * BespeakOrder管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface BespeakOrderService extends BespeakOrderBaseService{

	//added统计订单信息总数
    public Integer getBespeakOrderCount(BespeakOrderVo bespeakOrderVo);
    
    //added订单信息查询（关联经销商查询）
    public List<BespeakOrderPo> queryBespeakOrderByPage(BespeakOrderVo bespeakOrderVo,PageEntity page);

    //added获取来源列表
    public List<String> querySourceList();
    
    //added填充城市名称
    public void fillCityName(List<BespeakOrderPo> list);
    
}