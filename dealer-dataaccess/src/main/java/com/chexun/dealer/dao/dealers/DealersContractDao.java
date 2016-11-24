package com.chexun.dealer.dao.dealers;
import java.util.List;

import com.chexun.dealer.model.dealers.DealersContract;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * DealersContract管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersContractDao {

    /**
     * 添加DealersContract
     * @param dealersContract 要添加的DealersContract
     * @return id
     */
    public Long addDealersContract(DealersContract dealersContract);
	public Long insertDealersContract(DealersContract dealersContract);
    /**
     * 根据id删除一个DealersContract
     * @param id 要删除的id
     */
    public Long deleteDealersContractById(Long id);
    
    public Long deleteDealersContractByObj(DealersContract dealersContract);

	public Long deleteDealersContractByIdList(List<Long > ids);

    /**
     * 修改DealersContract
     * @param dealersContract 要修改的DealersContract
     */
    public Long updateDealersContract(DealersContract dealersContract);
    
    public Long updateDealersContractByObj(DealersContract dealersContract);
    
    public Long updateDealersContractByObjAndConditions(DealersContract s,DealersContract c);
    public void batchUpdateDealersContract(List<DealersContract> records);

    /**
     * 根据id获取单个DealersContract对象
     * @param id 要查询的id
     * @return DealersContract
     */
    public DealersContract getDealersContractById(Long id);
	public DealersContract getDealersContractByObj(DealersContract dealersContract);
    /**
     * 根据条件获取DealersContract列表
     * @param dealersContract 查询条件
     * @return List<DealersContract>
     */
    public List<DealersContract> getDealersContractListByObj(DealersContract dealersContract);
    public List<DealersContract> getDealersContractListPage(DealersContract dealersContract,Integer offset,Integer limit);
    public Integer getDealersContractCountByObj(DealersContract dealersContract);
    public List<DealersContract> getDealersContractPage(DealersContract dealersContract,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getDealersContractIdByObj(DealersContract dealersContract);
    /**
     * 根据条件获取DealersContract列表
     * @param dealersContract 查询条件
     * @return List<DealersContract>
     */
    public List<Long> getDealersContractIdList(DealersContract dealersContract);
    public List<Long> getDealersContractIdListByObj(DealersContract dealersContract);
    public List<Long> getDealersContractIdListPage(DealersContract dealersContract,Integer offset,Integer limit);
    public List<Long> getDealersContractIdPage(DealersContract dealersContract,PageEntity page);
}