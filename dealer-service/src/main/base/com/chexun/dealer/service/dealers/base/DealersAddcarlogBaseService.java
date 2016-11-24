package com.chexun.dealer.service.dealers.base;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.DealersAddcarlog;
/**
 * DealersAddcarlog管理接口
 * User: 
 * Date: 2016-10-10
 */
public interface DealersAddcarlogBaseService {

    /**
     * 添加DealersAddcarlog
     * @param dealersAddcarlog 要添加的DealersAddcarlog
     * @return id
     */
    public Long addDealersAddcarlog(DealersAddcarlog dealersAddcarlog);
	public Long insertDealersAddcarlog(DealersAddcarlog dealersAddcarlog);
    /**
     * 根据id删除一个DealersAddcarlog
     * @param id 要删除的id
     */
    public Long deleteDealersAddcarlogById(Long id);
	public Long deleteDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog);
    public Long deleteDealersAddcarlogByIdList(List<Long > ids);
    /**
     * 修改DealersAddcarlog
     * @param dealersAddcarlog 要修改的DealersAddcarlog
     */
    public Long updateDealersAddcarlog(DealersAddcarlog dealersAddcarlog);
    public Long updateDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog);
    public Long updateDealersAddcarlogByObjAndConditions(DealersAddcarlog s,DealersAddcarlog c);
	public void batchUpdateDealersAddcarlog(List<DealersAddcarlog> records);
    /**
     * 根据id获取单个DealersAddcarlog对象
     * @param id 要查询的id
     * @return DealersAddcarlog
     */
    public DealersAddcarlog getDealersAddcarlogById(Long id);
	public DealersAddcarlog getDealersAddcarlogByObj(DealersAddcarlog dealersAddcarlog);
    /**
     * 根据条件获取DealersAddcarlog列表
     * @param dealersAddcarlog 查询条件
     * @return List<DealersAddcarlog>
     */
    public List<DealersAddcarlog> getDealersAddcarlogListByObj(DealersAddcarlog dealersAddcarlog);
    public List<DealersAddcarlog> getDealersAddcarlogListPage(DealersAddcarlog dealersAddcarlog,Integer offset,Integer limit);
    public Integer getDealersAddcarlogCountByObj(DealersAddcarlog dealersAddcarlog);
    public List<DealersAddcarlog> getDealersAddcarlogPage(DealersAddcarlog dealersAddcarlog,PageEntity page);
    
}