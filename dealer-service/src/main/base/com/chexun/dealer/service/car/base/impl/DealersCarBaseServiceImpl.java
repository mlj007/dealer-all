package com.chexun.dealer.service.car.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.car.DealersCarDao;
import com.chexun.dealer.model.car.DealersCar;
import com.chexun.dealer.service.car.base.DealersCarBaseService;
/**
 * DealersCar管理接口
 * User: 
 * Date: 2016-10-08
 */
//@Service("dealersCarService")
public class DealersCarBaseServiceImpl implements DealersCarBaseService{

 	@Autowired
    private DealersCarDao dealersCarDao;
    /**
     * 添加DealersCar
     * @param dealersCar 要添加的DealersCar
     * @return id
     */
    public Long addDealersCar(DealersCar dealersCar){
    	Long res = dealersCarDao.addDealersCar(dealersCar);
    	return res;
    }
	public Long insertDealersCar(DealersCar dealersCar){
		Long res = dealersCarDao.insertDealersCar(dealersCar);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersCar
     * @param id 要删除的id
     */
    public Long deleteDealersCarById(Long id){
    	return dealersCarDao.deleteDealersCarById(id);
    }
	public Long deleteDealersCarByObj(DealersCar dealersCar){
        return dealersCarDao.deleteDealersCarByObj(dealersCar);
    }
    public Long deleteDealersCarByIdList(List<Long > ids){
    	
    	return dealersCarDao.deleteDealersCarByIdList(ids);
    }
    /**
     * 修改DealersCar
     * @param dealersCar 要修改的DealersCar
     */
    public Long updateDealersCar(DealersCar dealersCar){
     	return dealersCarDao.updateDealersCar(dealersCar);
    }
    
    public Long updateDealersCarByObj(DealersCar dealersCar){
    	return dealersCarDao.updateDealersCarByObj(dealersCar);
    }
    
    public Long updateDealersCarByObjAndConditions(DealersCar s,DealersCar c){
    	return dealersCarDao.updateDealersCarByObjAndConditions(s,c);
    }
	public void batchUpdateDealersCar(List<DealersCar> records){
		dealersCarDao.batchUpdateDealersCar(records);
	}
    /**
     * 根据id获取单个DealersCar对象
     * @param id 要查询的id
     * @return DealersCar
     */
    
    public Integer getDealersCarCountByObj(DealersCar dealersCar){
    	return dealersCarDao.getDealersCarCountByObj(dealersCar);
    }
    


    public DealersCar getDealersCarById(Long id){
    	return dealersCarDao.getDealersCarById( id);
    }
    
     public DealersCar getDealersCarByObj(DealersCar dealersCar) {
        return dealersCarDao.getDealersCarByObj(dealersCar);
    }


    
    public List<DealersCar> getDealersCarListByObj(DealersCar dealersCar){
        return dealersCarDao.getDealersCarListByObj(dealersCar);
    }
    public List<DealersCar> getDealersCarListPage(DealersCar dealersCar,Integer offset,Integer limit){
        return dealersCarDao.getDealersCarListPage(dealersCar,offset,limit);
    }
    
    public List<DealersCar> getDealersCarPage(DealersCar dealersCar,PageEntity page) {
        return dealersCarDao.getDealersCarPage(dealersCar,page);
    }
}