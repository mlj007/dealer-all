package com.chexun.dealer.service.dealers.base;

import java.util.List;
import com.chexun.dealer.model.dealers.BuyCredentials;
import com.chexun.base.framework.core.entity.PageEntity; 
/**
 * BuyCredentials管理接口
 * User: 
 * Date: 2016-10-12
 */
public interface BuyCredentialsBaseService {

    /**
     * 添加BuyCredentials
     * @param buyCredentials 要添加的BuyCredentials
     * @return id
     */
    public Long addBuyCredentials(BuyCredentials buyCredentials);
	public Long insertBuyCredentials(BuyCredentials buyCredentials);
    /**
     * 根据id删除一个BuyCredentials
     * @param id 要删除的id
     */
    public Long deleteBuyCredentialsById(Long id);
	public Long deleteBuyCredentialsByObj(BuyCredentials buyCredentials);
    public Long deleteBuyCredentialsByIdList(List<Long > ids);
    /**
     * 修改BuyCredentials
     * @param buyCredentials 要修改的BuyCredentials
     */
    public Long updateBuyCredentials(BuyCredentials buyCredentials);
    public Long updateBuyCredentialsByObj(BuyCredentials buyCredentials);
    public Long updateBuyCredentialsByObjAndConditions(BuyCredentials s,BuyCredentials c);
	public void batchUpdateBuyCredentials(List<BuyCredentials> records);
    /**
     * 根据id获取单个BuyCredentials对象
     * @param id 要查询的id
     * @return BuyCredentials
     */
    public BuyCredentials getBuyCredentialsById(Long id);
	public BuyCredentials getBuyCredentialsByObj(BuyCredentials buyCredentials);
    /**
     * 根据条件获取BuyCredentials列表
     * @param buyCredentials 查询条件
     * @return List<BuyCredentials>
     */
    public List<BuyCredentials> getBuyCredentialsListByObj(BuyCredentials buyCredentials);
    public List<BuyCredentials> getBuyCredentialsListPage(BuyCredentials buyCredentials,Integer offset,Integer limit);
    public Integer getBuyCredentialsCountByObj(BuyCredentials buyCredentials);
    public List<BuyCredentials> getBuyCredentialsPage(BuyCredentials buyCredentials,PageEntity page);
    
}