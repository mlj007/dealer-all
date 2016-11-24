package com.chexun.dealer.service.clue.base;

import java.util.List;

import com.chexun.dealer.model.clue.*;
import com.chexun.base.framework.core.entity.PageEntity; 
/**
 * AskingPrice管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface AskingPriceBaseService {

    /**
     * 添加AskingPrice
     * @param askingPrice 要添加的AskingPrice
     * @return id
     */
    public Long addAskingPrice(AskingPrice askingPrice);
	public Long insertAskingPrice(AskingPrice askingPrice);
    /**
     * 根据id删除一个AskingPrice
     * @param id 要删除的id
     */
    public Long deleteAskingPriceById(Long id);
	public Long deleteAskingPriceByObj(AskingPrice askingPrice);
    public Long deleteAskingPriceByIdList(List<Long > ids);
    /**
     * 修改AskingPrice
     * @param askingPrice 要修改的AskingPrice
     */
    public Long updateAskingPrice(AskingPrice askingPrice);
    public Long updateAskingPriceByObj(AskingPrice askingPrice);
    public Long updateAskingPriceByObjAndConditions(AskingPrice s,AskingPrice c);
	public void batchUpdateAskingPrice(List<AskingPrice> records);
    /**
     * 根据id获取单个AskingPrice对象
     * @param id 要查询的id
     * @return AskingPrice
     */
    public AskingPrice getAskingPriceById(Long id);
	public AskingPrice getAskingPriceByObj(AskingPrice askingPrice);
    /**
     * 根据条件获取AskingPrice列表
     * @param askingPrice 查询条件
     * @return List<AskingPrice>
     */
    public List<AskingPrice> getAskingPriceListByObj(AskingPrice askingPrice);
    public List<AskingPrice> getAskingPriceListPage(AskingPrice askingPrice,Integer offset,Integer limit);
    public Integer getAskingPriceCountByObj(AskingPrice askingPrice);
    public List<AskingPrice> getAskingPricePage(AskingPrice askingPrice,PageEntity page);
    
}