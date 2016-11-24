package com.chexun.dealer.service.clue.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.clue.AskingPriceDao;
import com.chexun.dealer.model.clue.AskingPrice;
import com.chexun.dealer.service.clue.base.AskingPriceBaseService;
/**
 * AskingPrice管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("askingPriceService")
public class AskingPriceBaseServiceImpl implements AskingPriceBaseService{

 	@Autowired
    private AskingPriceDao askingPriceDao;
    public AskingPriceDao getAskingPriceDao() {
		return askingPriceDao;
	}
	public void setAskingPriceDao(AskingPriceDao askingPriceDao) {
		this.askingPriceDao = askingPriceDao;
	}
	/**
     * 添加AskingPrice
     * @param askingPrice 要添加的AskingPrice
     * @return id
     */
    public Long addAskingPrice(AskingPrice askingPrice){
    	Long res = askingPriceDao.addAskingPrice(askingPrice);
    	return res;
    }
	public Long insertAskingPrice(AskingPrice askingPrice){
		Long res = askingPriceDao.insertAskingPrice(askingPrice);
		
    	return res;
	}
    /**
     * 根据id删除一个AskingPrice
     * @param id 要删除的id
     */
    public Long deleteAskingPriceById(Long id){
    	return askingPriceDao.deleteAskingPriceById(id);
    }
	public Long deleteAskingPriceByObj(AskingPrice askingPrice){
        return askingPriceDao.deleteAskingPriceByObj(askingPrice);
    }
    public Long deleteAskingPriceByIdList(List<Long > ids){
    	
    	return askingPriceDao.deleteAskingPriceByIdList(ids);
    }
    /**
     * 修改AskingPrice
     * @param askingPrice 要修改的AskingPrice
     */
    public Long updateAskingPrice(AskingPrice askingPrice){
     	return askingPriceDao.updateAskingPrice(askingPrice);
    }
    
    public Long updateAskingPriceByObj(AskingPrice askingPrice){
    	return askingPriceDao.updateAskingPriceByObj(askingPrice);
    }
    
    public Long updateAskingPriceByObjAndConditions(AskingPrice s,AskingPrice c){
    	return askingPriceDao.updateAskingPriceByObjAndConditions(s,c);
    }
	public void batchUpdateAskingPrice(List<AskingPrice> records){
		askingPriceDao.batchUpdateAskingPrice(records);
	}
    /**
     * 根据id获取单个AskingPrice对象
     * @param id 要查询的id
     * @return AskingPrice
     */
    
    public Integer getAskingPriceCountByObj(AskingPrice askingPrice){
    	return askingPriceDao.getAskingPriceCountByObj(askingPrice);
    }
    


    public AskingPrice getAskingPriceById(Long id){
    	return askingPriceDao.getAskingPriceById( id);
    }
    
     public AskingPrice getAskingPriceByObj(AskingPrice askingPrice) {
        return askingPriceDao.getAskingPriceByObj(askingPrice);
    }


    
    public List<AskingPrice> getAskingPriceListByObj(AskingPrice askingPrice){
        return askingPriceDao.getAskingPriceListByObj(askingPrice);
    }
    public List<AskingPrice> getAskingPriceListPage(AskingPrice askingPrice,Integer offset,Integer limit){
        return askingPriceDao.getAskingPriceListPage(askingPrice,offset,limit);
    }
    
    public List<AskingPrice> getAskingPricePage(AskingPrice askingPrice,PageEntity page) {
        return askingPriceDao.getAskingPricePage(askingPrice,page);
    }
}