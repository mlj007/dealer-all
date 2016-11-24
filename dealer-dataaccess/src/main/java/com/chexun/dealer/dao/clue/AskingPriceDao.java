package com.chexun.dealer.dao.clue;
import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.AskingPrice;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.vo.clue.AskingPriceVo;
/**
 * AskingPrice管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface AskingPriceDao {

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
    
    /**
    *以下为缓存查询用
    */
    public Long getAskingPriceIdByObj(AskingPrice askingPrice);
    /**
     * 根据条件获取AskingPrice列表
     * @param askingPrice 查询条件
     * @return List<AskingPrice>
     */
    public List<Long> getAskingPriceIdList(AskingPrice askingPrice);
    public List<Long> getAskingPriceIdListByObj(AskingPrice askingPrice);
    public List<Long> getAskingPriceIdListPage(AskingPrice askingPrice,Integer offset,Integer limit);
    public List<Long> getAskingPriceIdPage(AskingPrice askingPrice,PageEntity page);
    
    
    //added统计询价信息总数
    public Integer getAskingPriceCount(AskingPriceVo askingPriceVo);
    
    //added询价信息查询（关联经销商查询）
    public List<AskingPricePo> queryAskingPriceByPage(AskingPriceVo askingPriceVo,PageEntity page);

    //added获取来源列表
    public List<String> querySourceList();
}