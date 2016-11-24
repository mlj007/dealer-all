package com.chexun.dealer.service.clue.base;

import java.util.List;

import com.chexun.dealer.model.clue.BespeakOrder;
import com.chexun.base.framework.core.entity.PageEntity; 
/**
 * BespeakOrder管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface BespeakOrderBaseService {

    /**
     * 添加BespeakOrder
     * @param bespeakOrder 要添加的BespeakOrder
     * @return id
     */
    public Long addBespeakOrder(BespeakOrder bespeakOrder);
	public Long insertBespeakOrder(BespeakOrder bespeakOrder);
    /**
     * 根据id删除一个BespeakOrder
     * @param id 要删除的id
     */
    public Long deleteBespeakOrderById(Long id);
	public Long deleteBespeakOrderByObj(BespeakOrder bespeakOrder);
    public Long deleteBespeakOrderByIdList(List<Long > ids);
    /**
     * 修改BespeakOrder
     * @param bespeakOrder 要修改的BespeakOrder
     */
    public Long updateBespeakOrder(BespeakOrder bespeakOrder);
    public Long updateBespeakOrderByObj(BespeakOrder bespeakOrder);
    public Long updateBespeakOrderByObjAndConditions(BespeakOrder s,BespeakOrder c);
	public void batchUpdateBespeakOrder(List<BespeakOrder> records);
    /**
     * 根据id获取单个BespeakOrder对象
     * @param id 要查询的id
     * @return BespeakOrder
     */
    public BespeakOrder getBespeakOrderById(Long id);
	public BespeakOrder getBespeakOrderByObj(BespeakOrder bespeakOrder);
    /**
     * 根据条件获取BespeakOrder列表
     * @param bespeakOrder 查询条件
     * @return List<BespeakOrder>
     */
    public List<BespeakOrder> getBespeakOrderListByObj(BespeakOrder bespeakOrder);
    public List<BespeakOrder> getBespeakOrderListPage(BespeakOrder bespeakOrder,Integer offset,Integer limit);
    public Integer getBespeakOrderCountByObj(BespeakOrder bespeakOrder);
    public List<BespeakOrder> getBespeakOrderPage(BespeakOrder bespeakOrder,PageEntity page);
    
}