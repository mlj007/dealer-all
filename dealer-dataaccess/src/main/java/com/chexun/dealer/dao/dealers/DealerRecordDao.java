package com.chexun.dealer.dao.dealers;
import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.DealerRecord;
import com.chexun.dealer.vo.dealers.DealerRecordVo;
/**
 * DealerRecord管理接口
 * User: 
 * Date: 2016-10-11
 */
public interface DealerRecordDao {

    /**
     * 添加DealerRecord
     * @param dealerRecord 要添加的DealerRecord
     * @return id
     */
    public Long addDealerRecord(DealerRecord dealerRecord);
	public Long insertDealerRecord(DealerRecord dealerRecord);
    /**
     * 根据id删除一个DealerRecord
     * @param id 要删除的id
     */
    public Long deleteDealerRecordById(Long id);
    
    public Long deleteDealerRecordByObj(DealerRecord dealerRecord);

	public Long deleteDealerRecordByIdList(List<Long > ids);

    /**
     * 修改DealerRecord
     * @param dealerRecord 要修改的DealerRecord
     */
    public Long updateDealerRecord(DealerRecord dealerRecord);
    
    public Long updateDealerRecordByObj(DealerRecord dealerRecord);
    
    public Long updateDealerRecordByObjAndConditions(DealerRecord s,DealerRecord c);
    public void batchUpdateDealerRecord(List<DealerRecord> records);

    /**
     * 根据id获取单个DealerRecord对象
     * @param id 要查询的id
     * @return DealerRecord
     */
    public DealerRecord getDealerRecordById(Long id);
	public DealerRecord getDealerRecordByObj(DealerRecordVo dealerRecordVo);
    /**
     * 根据条件获取DealerRecord列表
     * @param dealerRecord 查询条件
     * @return List<DealerRecord>
     */
    public List<DealerRecord> getDealerRecordListByObj(DealerRecordVo dealerRecordVo);
    public List<DealerRecord> getDealerRecordListPage(DealerRecordVo dealerRecordVo,Integer offset,Integer limit);
    public Integer getDealerRecordCountByObj(DealerRecordVo dealerRecordVo);
    public List<DealerRecord> getDealerRecordPage(DealerRecordVo dealerRecordVo,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getDealerRecordIdByObj(DealerRecordVo dealerRecord);
    /**
     * 根据条件获取DealerRecord列表
     * @param dealerRecord 查询条件
     * @return List<DealerRecord>
     */
    public List<Long> getDealerRecordIdList(DealerRecordVo dealerRecord);
    public List<Long> getDealerRecordIdListByObj(DealerRecordVo dealerRecord);
    public List<Long> getDealerRecordIdListPage(DealerRecordVo dealerRecord,Integer offset,Integer limit);
    public List<Long> getDealerRecordIdPage(DealerRecordVo dealerRecord,PageEntity page);
}