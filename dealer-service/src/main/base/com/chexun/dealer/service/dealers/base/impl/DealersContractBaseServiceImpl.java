package com.chexun.dealer.service.dealers.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealersContractDao;
import com.chexun.dealer.model.dealers.DealersContract;
import com.chexun.dealer.service.dealers.base.DealersContractBaseService;
/**
 * DealersContract管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("dealersContractService")
public class DealersContractBaseServiceImpl implements DealersContractBaseService{

 	@Autowired
    private DealersContractDao dealersContractDao;
    /**
     * 添加DealersContract
     * @param dealersContract 要添加的DealersContract
     * @return id
     */
    public Long addDealersContract(DealersContract dealersContract){
    	Long res = dealersContractDao.addDealersContract(dealersContract);
    	return res;
    }
	public Long insertDealersContract(DealersContract dealersContract){
		Long res = dealersContractDao.insertDealersContract(dealersContract);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersContract
     * @param id 要删除的id
     */
    public Long deleteDealersContractById(Long id){
    	return dealersContractDao.deleteDealersContractById(id);
    }
	public Long deleteDealersContractByObj(DealersContract dealersContract){
        return dealersContractDao.deleteDealersContractByObj(dealersContract);
    }
    public Long deleteDealersContractByIdList(List<Long > ids){
    	
    	return dealersContractDao.deleteDealersContractByIdList(ids);
    }
    /**
     * 修改DealersContract
     * @param dealersContract 要修改的DealersContract
     */
    public Long updateDealersContract(DealersContract dealersContract){
     	return dealersContractDao.updateDealersContract(dealersContract);
    }
    
    public Long updateDealersContractByObj(DealersContract dealersContract){
    	return dealersContractDao.updateDealersContractByObj(dealersContract);
    }
    
    public Long updateDealersContractByObjAndConditions(DealersContract s,DealersContract c){
    	return dealersContractDao.updateDealersContractByObjAndConditions(s,c);
    }
	public void batchUpdateDealersContract(List<DealersContract> records){
		dealersContractDao.batchUpdateDealersContract(records);
	}
    /**
     * 根据id获取单个DealersContract对象
     * @param id 要查询的id
     * @return DealersContract
     */
    
    public Integer getDealersContractCountByObj(DealersContract dealersContract){
    	return dealersContractDao.getDealersContractCountByObj(dealersContract);
    }
    


    public DealersContract getDealersContractById(Long id){
    	return dealersContractDao.getDealersContractById( id);
    }
    
     public DealersContract getDealersContractByObj(DealersContract dealersContract) {
        return dealersContractDao.getDealersContractByObj(dealersContract);
    }


    
    public List<DealersContract> getDealersContractListByObj(DealersContract dealersContract){
        return dealersContractDao.getDealersContractListByObj(dealersContract);
    }
    public List<DealersContract> getDealersContractListPage(DealersContract dealersContract,Integer offset,Integer limit){
        return dealersContractDao.getDealersContractListPage(dealersContract,offset,limit);
    }
    
    public List<DealersContract> getDealersContractPage(DealersContract dealersContract,PageEntity page) {
        return dealersContractDao.getDealersContractPage(dealersContract,page);
    }
}