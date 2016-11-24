package com.chexun.dealer.dao.clue;
import java.util.List;

import com.chexun.dealer.model.clue.LocalCluePool;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * LocalCluePool管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface LocalCluePoolDao {

    /**
     * 添加LocalCluePool
     * @param localCluePool 要添加的LocalCluePool
     * @return id
     */
    public Long addLocalCluePool(LocalCluePool localCluePool);
	public Long insertLocalCluePool(LocalCluePool localCluePool);
    /**
     * 根据id删除一个LocalCluePool
     * @param id 要删除的id
     */
    public Long deleteLocalCluePoolById(Long id);
    
    public Long deleteLocalCluePoolByObj(LocalCluePool localCluePool);

	public Long deleteLocalCluePoolByIdList(List<Long > ids);

    /**
     * 修改LocalCluePool
     * @param localCluePool 要修改的LocalCluePool
     */
    public Long updateLocalCluePool(LocalCluePool localCluePool);
    
    public Long updateLocalCluePoolByObj(LocalCluePool localCluePool);
    
    public Long updateLocalCluePoolByObjAndConditions(LocalCluePool s,LocalCluePool c);
    public void batchUpdateLocalCluePool(List<LocalCluePool> records);

    /**
     * 根据id获取单个LocalCluePool对象
     * @param id 要查询的id
     * @return LocalCluePool
     */
    public LocalCluePool getLocalCluePoolById(Long id);
	public LocalCluePool getLocalCluePoolByObj(LocalCluePool localCluePool);
    /**
     * 根据条件获取LocalCluePool列表
     * @param localCluePool 查询条件
     * @return List<LocalCluePool>
     */
    public List<LocalCluePool> getLocalCluePoolListByObj(LocalCluePool localCluePool);
    public List<LocalCluePool> getLocalCluePoolListPage(LocalCluePool localCluePool,Integer offset,Integer limit);
    public Integer getLocalCluePoolCountByObj(LocalCluePool localCluePool);
    public List<LocalCluePool> getLocalCluePoolPage(LocalCluePool localCluePool,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getLocalCluePoolIdByObj(LocalCluePool localCluePool);
    /**
     * 根据条件获取LocalCluePool列表
     * @param localCluePool 查询条件
     * @return List<LocalCluePool>
     */
    public List<Long> getLocalCluePoolIdList(LocalCluePool localCluePool);
    public List<Long> getLocalCluePoolIdListByObj(LocalCluePool localCluePool);
    public List<Long> getLocalCluePoolIdListPage(LocalCluePool localCluePool,Integer offset,Integer limit);
    public List<Long> getLocalCluePoolIdPage(LocalCluePool localCluePool,PageEntity page);
}