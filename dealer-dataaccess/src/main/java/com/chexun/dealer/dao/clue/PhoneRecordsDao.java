package com.chexun.dealer.dao.clue;
import java.util.List;

import com.chexun.dealer.model.clue.PhoneRecords;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.model.common.Province;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * PhoneRecords管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface PhoneRecordsDao {

    /**
     * 添加PhoneRecords
     * @param phoneRecords 要添加的PhoneRecords
     * @return id
     */
    public Long addPhoneRecords(PhoneRecords phoneRecords);
	public Long insertPhoneRecords(PhoneRecords phoneRecords);
    /**
     * 根据id删除一个PhoneRecords
     * @param id 要删除的id
     */
    public Long deletePhoneRecordsById(Long id);
    
    public Long deletePhoneRecordsByObj(PhoneRecords phoneRecords);

	public Long deletePhoneRecordsByIdList(List<Long > ids);

    /**
     * 修改PhoneRecords
     * @param phoneRecords 要修改的PhoneRecords
     */
    public Long updatePhoneRecords(PhoneRecords phoneRecords);
    
    public Long updatePhoneRecordsByObj(PhoneRecords phoneRecords);
    
    public Long updatePhoneRecordsByObjAndConditions(PhoneRecords s,PhoneRecords c);
    public void batchUpdatePhoneRecords(List<PhoneRecords> records);

    /**
     * 根据id获取单个PhoneRecords对象
     * @param id 要查询的id
     * @return PhoneRecords
     */
    public PhoneRecords getPhoneRecordsById(Long id);
	public PhoneRecords getPhoneRecordsByObj(PhoneRecords phoneRecords);
    /**
     * 根据条件获取PhoneRecords列表
     * @param phoneRecords 查询条件
     * @return List<PhoneRecords>
     */
    public List<PhoneRecords> getPhoneRecordsListByObj(PhoneRecords phoneRecords);
    public List<PhoneRecords> getPhoneRecordsListPage(PhoneRecords phoneRecords,Integer offset,Integer limit);
    public Integer getPhoneRecordsCountByObj(PhoneRecords phoneRecords);
    public List<PhoneRecords> getPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getPhoneRecordsIdByObj(PhoneRecords phoneRecords);
    /**
     * 根据条件获取PhoneRecords列表
     * @param phoneRecords 查询条件
     * @return List<PhoneRecords>
     */
    public List<Long> getPhoneRecordsIdList(PhoneRecords phoneRecords);
    public List<Long> getPhoneRecordsIdListByObj(PhoneRecords phoneRecords);
    public List<Long> getPhoneRecordsIdListPage(PhoneRecords phoneRecords,Integer offset,Integer limit);
    public List<Long> getPhoneRecordsIdPage(PhoneRecords phoneRecords,PageEntity page);
    
    
    /**
     * 手动DAO
     */
    public List<Province> selectProvince();
    public List<City> selectCityById(Long provinceid);
    public Integer selectPhoneRecordsCountByObj(PhoneRecords phoneRecords);
    public List<PhoneRecords> selectPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page);
    public List<PhoneRecords> selectPhoneRecordsListPage(PhoneRecords phoneRecords,Integer offset,Integer limit);
}