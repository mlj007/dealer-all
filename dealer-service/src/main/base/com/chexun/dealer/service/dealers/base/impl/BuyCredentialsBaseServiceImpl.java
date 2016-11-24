package com.chexun.dealer.service.dealers.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.BuyCredentialsDao;
import com.chexun.dealer.model.dealers.BuyCredentials;
import com.chexun.dealer.service.dealers.base.BuyCredentialsBaseService;
/**
 * BuyCredentials管理接口
 * User: 
 * Date: 2016-10-12
 */
//@Service("buyCredentialsService")
public class BuyCredentialsBaseServiceImpl implements BuyCredentialsBaseService{

 	@Autowired
    private BuyCredentialsDao buyCredentialsDao;
    /**
     * 添加BuyCredentials
     * @param buyCredentials 要添加的BuyCredentials
     * @return id
     */
    public Long addBuyCredentials(BuyCredentials buyCredentials){
    	Long res = buyCredentialsDao.addBuyCredentials(buyCredentials);
    	return res;
    }
	public Long insertBuyCredentials(BuyCredentials buyCredentials){
		Long res = buyCredentialsDao.insertBuyCredentials(buyCredentials);
		
    	return res;
	}
    /**
     * 根据id删除一个BuyCredentials
     * @param id 要删除的id
     */
    public Long deleteBuyCredentialsById(Long id){
    	return buyCredentialsDao.deleteBuyCredentialsById(id);
    }
	public Long deleteBuyCredentialsByObj(BuyCredentials buyCredentials){
        return buyCredentialsDao.deleteBuyCredentialsByObj(buyCredentials);
    }
    public Long deleteBuyCredentialsByIdList(List<Long > ids){
    	
    	return buyCredentialsDao.deleteBuyCredentialsByIdList(ids);
    }
    /**
     * 修改BuyCredentials
     * @param buyCredentials 要修改的BuyCredentials
     */
    public Long updateBuyCredentials(BuyCredentials buyCredentials){
     	return buyCredentialsDao.updateBuyCredentials(buyCredentials);
    }
    
    public Long updateBuyCredentialsByObj(BuyCredentials buyCredentials){
    	return buyCredentialsDao.updateBuyCredentialsByObj(buyCredentials);
    }
    
    public Long updateBuyCredentialsByObjAndConditions(BuyCredentials s,BuyCredentials c){
    	return buyCredentialsDao.updateBuyCredentialsByObjAndConditions(s,c);
    }
	public void batchUpdateBuyCredentials(List<BuyCredentials> records){
		buyCredentialsDao.batchUpdateBuyCredentials(records);
	}
    /**
     * 根据id获取单个BuyCredentials对象
     * @param id 要查询的id
     * @return BuyCredentials
     */
    
    public Integer getBuyCredentialsCountByObj(BuyCredentials buyCredentials){
    	return buyCredentialsDao.getBuyCredentialsCountByObj(buyCredentials);
    }
    


    public BuyCredentials getBuyCredentialsById(Long id){
    	return buyCredentialsDao.getBuyCredentialsById( id);
    }
    
     public BuyCredentials getBuyCredentialsByObj(BuyCredentials buyCredentials) {
        return buyCredentialsDao.getBuyCredentialsByObj(buyCredentials);
    }


    
    public List<BuyCredentials> getBuyCredentialsListByObj(BuyCredentials buyCredentials){
        return buyCredentialsDao.getBuyCredentialsListByObj(buyCredentials);
    }
    public List<BuyCredentials> getBuyCredentialsListPage(BuyCredentials buyCredentials,Integer offset,Integer limit){
        return buyCredentialsDao.getBuyCredentialsListPage(buyCredentials,offset,limit);
    }
    
    public List<BuyCredentials> getBuyCredentialsPage(BuyCredentials buyCredentials,PageEntity page) {
        return buyCredentialsDao.getBuyCredentialsPage(buyCredentials,page);
    }
}