package com.chexun.dealer.service.clue.base;

import java.util.List;

import com.chexun.dealer.model.clue.DealersMessages;
import com.chexun.base.framework.core.entity.PageEntity; 
/**
 * DealersMessages管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersMessagesBaseService {

    /**
     * 添加DealersMessages
     * @param dealersMessages 要添加的DealersMessages
     * @return id
     */
    public Long addDealersMessages(DealersMessages dealersMessages);
	public Long insertDealersMessages(DealersMessages dealersMessages);
    /**
     * 根据id删除一个DealersMessages
     * @param id 要删除的id
     */
    public Long deleteDealersMessagesById(Long id);
	public Long deleteDealersMessagesByObj(DealersMessages dealersMessages);
    public Long deleteDealersMessagesByIdList(List<Long > ids);
    /**
     * 修改DealersMessages
     * @param dealersMessages 要修改的DealersMessages
     */
    public Long updateDealersMessages(DealersMessages dealersMessages);
    public Long updateDealersMessagesByObj(DealersMessages dealersMessages);
    public Long updateDealersMessagesByObjAndConditions(DealersMessages s,DealersMessages c);
	public void batchUpdateDealersMessages(List<DealersMessages> records);
    /**
     * 根据id获取单个DealersMessages对象
     * @param id 要查询的id
     * @return DealersMessages
     */
    public DealersMessages getDealersMessagesById(Long id);
	public DealersMessages getDealersMessagesByObj(DealersMessages dealersMessages);
    /**
     * 根据条件获取DealersMessages列表
     * @param dealersMessages 查询条件
     * @return List<DealersMessages>
     */
    public List<DealersMessages> getDealersMessagesListByObj(DealersMessages dealersMessages);
    public List<DealersMessages> getDealersMessagesListPage(DealersMessages dealersMessages,Integer offset,Integer limit);
    public Integer getDealersMessagesCountByObj(DealersMessages dealersMessages);
    public List<DealersMessages> getDealersMessagesPage(DealersMessages dealersMessages,PageEntity page);
    
}