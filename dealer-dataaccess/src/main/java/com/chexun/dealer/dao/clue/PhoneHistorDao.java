package com.chexun.dealer.dao.clue;
import java.util.List;

import com.chexun.dealer.model.clue.PhoneHistor;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * PhoneHistor管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface PhoneHistorDao {

    /**
     * 添加PhoneHistor
     * @param phoneHistor 要添加的PhoneHistor
     * @return id
     */
    public Long addPhoneHistor(PhoneHistor phoneHistor);
	public Long insertPhoneHistor(PhoneHistor phoneHistor);
    /**
     * 根据id删除一个PhoneHistor
     * @param id 要删除的id
     */
    public Long deletePhoneHistorById(Long id);
    
    public Long deletePhoneHistorByObj(PhoneHistor phoneHistor);

	public Long deletePhoneHistorByIdList(List<Long > ids);

    /**
     * 修改PhoneHistor
     * @param phoneHistor 要修改的PhoneHistor
     */
    public Long updatePhoneHistor(PhoneHistor phoneHistor);
    
    public Long updatePhoneHistorByObj(PhoneHistor phoneHistor);
    
    public Long updatePhoneHistorByObjAndConditions(PhoneHistor s,PhoneHistor c);
    public void batchUpdatePhoneHistor(List<PhoneHistor> records);

    /**
     * 根据id获取单个PhoneHistor对象
     * @param id 要查询的id
     * @return PhoneHistor
     */
    public PhoneHistor getPhoneHistorById(Long id);
	public PhoneHistor getPhoneHistorByObj(PhoneHistor phoneHistor);
    /**
     * 根据条件获取PhoneHistor列表
     * @param phoneHistor 查询条件
     * @return List<PhoneHistor>
     */
    public List<PhoneHistor> getPhoneHistorListByObj(PhoneHistor phoneHistor);
    public List<PhoneHistor> getPhoneHistorListPage(PhoneHistor phoneHistor,Integer offset,Integer limit);
    public Integer getPhoneHistorCountByObj(PhoneHistor phoneHistor);
    public List<PhoneHistor> getPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getPhoneHistorIdByObj(PhoneHistor phoneHistor);
    /**
     * 根据条件获取PhoneHistor列表
     * @param phoneHistor 查询条件
     * @return List<PhoneHistor>
     */
    public List<Long> getPhoneHistorIdList(PhoneHistor phoneHistor);
    public List<Long> getPhoneHistorIdListByObj(PhoneHistor phoneHistor);
    public List<Long> getPhoneHistorIdListPage(PhoneHistor phoneHistor,Integer offset,Integer limit);
    public List<Long> getPhoneHistorIdPage(PhoneHistor phoneHistor,PageEntity page);
    
    /**
     * 手动DAO
     */
    public Integer selectPhoneHistorCountByObj(PhoneHistor phoneHistor);
    public List<PhoneHistor> selectPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page);
    public List<PhoneHistor> selectPhoneHistorListPage(PhoneHistor phoneHistor,Integer offset,Integer limit);
}