package com.chexun.dealer.service.clue.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.clue.DealersMessagesDao;
import com.chexun.dealer.model.clue.DealersMessages;
import com.chexun.dealer.service.clue.base.DealersMessagesBaseService;
/**
 * DealersMessages管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("dealersMessagesService")
public class DealersMessagesBaseServiceImpl implements DealersMessagesBaseService{

 	@Autowired
    private DealersMessagesDao dealersMessagesDao;
    /**
     * 添加DealersMessages
     * @param dealersMessages 要添加的DealersMessages
     * @return id
     */
    public Long addDealersMessages(DealersMessages dealersMessages){
    	Long res = dealersMessagesDao.addDealersMessages(dealersMessages);
    	return res;
    }
	public Long insertDealersMessages(DealersMessages dealersMessages){
		Long res = dealersMessagesDao.insertDealersMessages(dealersMessages);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersMessages
     * @param id 要删除的id
     */
    public Long deleteDealersMessagesById(Long id){
    	return dealersMessagesDao.deleteDealersMessagesById(id);
    }
	public Long deleteDealersMessagesByObj(DealersMessages dealersMessages){
        return dealersMessagesDao.deleteDealersMessagesByObj(dealersMessages);
    }
    public Long deleteDealersMessagesByIdList(List<Long > ids){
    	
    	return dealersMessagesDao.deleteDealersMessagesByIdList(ids);
    }
    /**
     * 修改DealersMessages
     * @param dealersMessages 要修改的DealersMessages
     */
    public Long updateDealersMessages(DealersMessages dealersMessages){
     	return dealersMessagesDao.updateDealersMessages(dealersMessages);
    }
    
    public Long updateDealersMessagesByObj(DealersMessages dealersMessages){
    	return dealersMessagesDao.updateDealersMessagesByObj(dealersMessages);
    }
    
    public Long updateDealersMessagesByObjAndConditions(DealersMessages s,DealersMessages c){
    	return dealersMessagesDao.updateDealersMessagesByObjAndConditions(s,c);
    }
	public void batchUpdateDealersMessages(List<DealersMessages> records){
		dealersMessagesDao.batchUpdateDealersMessages(records);
	}
    /**
     * 根据id获取单个DealersMessages对象
     * @param id 要查询的id
     * @return DealersMessages
     */
    
    public Integer getDealersMessagesCountByObj(DealersMessages dealersMessages){
    	return dealersMessagesDao.getDealersMessagesCountByObj(dealersMessages);
    }
    


    public DealersMessages getDealersMessagesById(Long id){
    	return dealersMessagesDao.getDealersMessagesById( id);
    }
    
     public DealersMessages getDealersMessagesByObj(DealersMessages dealersMessages) {
        return dealersMessagesDao.getDealersMessagesByObj(dealersMessages);
    }


    
    public List<DealersMessages> getDealersMessagesListByObj(DealersMessages dealersMessages){
        return dealersMessagesDao.getDealersMessagesListByObj(dealersMessages);
    }
    public List<DealersMessages> getDealersMessagesListPage(DealersMessages dealersMessages,Integer offset,Integer limit){
        return dealersMessagesDao.getDealersMessagesListPage(dealersMessages,offset,limit);
    }
    
    public List<DealersMessages> getDealersMessagesPage(DealersMessages dealersMessages,PageEntity page) {
        return dealersMessagesDao.getDealersMessagesPage(dealersMessages,page);
    }
	public DealersMessagesDao getDealersMessagesDao() {
		return dealersMessagesDao;
	}
	public void setDealersMessagesDao(DealersMessagesDao dealersMessagesDao) {
		this.dealersMessagesDao = dealersMessagesDao;
	}
}