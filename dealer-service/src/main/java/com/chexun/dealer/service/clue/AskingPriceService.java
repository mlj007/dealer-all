package com.chexun.dealer.service.clue;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.service.clue.base.AskingPriceBaseService;
import com.chexun.dealer.vo.clue.AskingPriceVo;
/**
 * AskingPrice管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface AskingPriceService extends AskingPriceBaseService{

	//added统计询价信息总数
    public Integer getAskingPriceCount(AskingPriceVo askingPriceVo);
    
    //added询价信息查询（关联经销商查询）
    public List<AskingPricePo> queryAskingPriceByPage(AskingPriceVo askingPriceVo,PageEntity page);
    
    //added填充城市名称
    public void fillCityName(List<AskingPricePo> list);
    
    //added获取来源列表
    public List<String> querySourceList();
}