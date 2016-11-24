package com.chexun.dealer.service.clue.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.clue.BespeakOrderDao;
import com.chexun.dealer.model.clue.BespeakOrder;
import com.chexun.dealer.service.clue.base.BespeakOrderBaseService;
/**
 * BespeakOrder管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("bespeakOrderService")
public class BespeakOrderBaseServiceImpl implements BespeakOrderBaseService{

 	@Autowired
    private BespeakOrderDao bespeakOrderDao;
 	
    public BespeakOrderDao getBespeakOrderDao() {
		return bespeakOrderDao;
	}
    
	public void setBespeakOrderDao(BespeakOrderDao bespeakOrderDao) {
		this.bespeakOrderDao = bespeakOrderDao;
	}
	/**
     * 添加BespeakOrder
     * @param bespeakOrder 要添加的BespeakOrder
     * @return id
     */
    public Long addBespeakOrder(BespeakOrder bespeakOrder){
    	Long res = bespeakOrderDao.addBespeakOrder(bespeakOrder);
    	return res;
    }
	public Long insertBespeakOrder(BespeakOrder bespeakOrder){
		Long res = bespeakOrderDao.insertBespeakOrder(bespeakOrder);
		
    	return res;
	}
    /**
     * 根据id删除一个BespeakOrder
     * @param id 要删除的id
     */
    public Long deleteBespeakOrderById(Long id){
    	return bespeakOrderDao.deleteBespeakOrderById(id);
    }
	public Long deleteBespeakOrderByObj(BespeakOrder bespeakOrder){
        return bespeakOrderDao.deleteBespeakOrderByObj(bespeakOrder);
    }
    public Long deleteBespeakOrderByIdList(List<Long > ids){
    	
    	return bespeakOrderDao.deleteBespeakOrderByIdList(ids);
    }
    /**
     * 修改BespeakOrder
     * @param bespeakOrder 要修改的BespeakOrder
     */
    public Long updateBespeakOrder(BespeakOrder bespeakOrder){
     	return bespeakOrderDao.updateBespeakOrder(bespeakOrder);
    }
    
    public Long updateBespeakOrderByObj(BespeakOrder bespeakOrder){
    	return bespeakOrderDao.updateBespeakOrderByObj(bespeakOrder);
    }
    
    public Long updateBespeakOrderByObjAndConditions(BespeakOrder s,BespeakOrder c){
    	return bespeakOrderDao.updateBespeakOrderByObjAndConditions(s,c);
    }
	public void batchUpdateBespeakOrder(List<BespeakOrder> records){
		bespeakOrderDao.batchUpdateBespeakOrder(records);
	}
    /**
     * 根据id获取单个BespeakOrder对象
     * @param id 要查询的id
     * @return BespeakOrder
     */
    
    public Integer getBespeakOrderCountByObj(BespeakOrder bespeakOrder){
    	return bespeakOrderDao.getBespeakOrderCountByObj(bespeakOrder);
    }
    


    public BespeakOrder getBespeakOrderById(Long id){
    	return bespeakOrderDao.getBespeakOrderById( id);
    }
    
     public BespeakOrder getBespeakOrderByObj(BespeakOrder bespeakOrder) {
        return bespeakOrderDao.getBespeakOrderByObj(bespeakOrder);
    }


    
    public List<BespeakOrder> getBespeakOrderListByObj(BespeakOrder bespeakOrder){
        return bespeakOrderDao.getBespeakOrderListByObj(bespeakOrder);
    }
    public List<BespeakOrder> getBespeakOrderListPage(BespeakOrder bespeakOrder,Integer offset,Integer limit){
        return bespeakOrderDao.getBespeakOrderListPage(bespeakOrder,offset,limit);
    }
    
    public List<BespeakOrder> getBespeakOrderPage(BespeakOrder bespeakOrder,PageEntity page) {
        return bespeakOrderDao.getBespeakOrderPage(bespeakOrder,page);
    }
    
    
    
}