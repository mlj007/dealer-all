package com.chexun.dealer.service.dealers.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealerRecordDao;
import com.chexun.dealer.model.dealers.DealerRecord;
import com.chexun.dealer.service.dealers.base.DealerRecordBaseService;
import com.chexun.dealer.vo.dealers.DealerRecordVo;
/**
 * DealerRecord管理接口
 * User: 
 * Date: 2016-10-11
 */
//@Service("dealerRecordService")
public class DealerRecordBaseServiceImpl implements DealerRecordBaseService{

 	@Autowired
    private DealerRecordDao dealerRecordDao;
    /**
     * 添加DealerRecord
     * @param dealerRecord 要添加的DealerRecord
     * @return id
     */
    public Long addDealerRecord(DealerRecord dealerRecord){
    	Long res = dealerRecordDao.addDealerRecord(dealerRecord);
    	return res;
    }
	public Long insertDealerRecord(DealerRecord dealerRecord){
		Long res = dealerRecordDao.insertDealerRecord(dealerRecord);
		
    	return res;
	}
    /**
     * 根据id删除一个DealerRecord
     * @param id 要删除的id
     */
    public Long deleteDealerRecordById(Long id){
    	return dealerRecordDao.deleteDealerRecordById(id);
    }
	public Long deleteDealerRecordByObj(DealerRecord dealerRecord){
        return dealerRecordDao.deleteDealerRecordByObj(dealerRecord);
    }
    public Long deleteDealerRecordByIdList(List<Long > ids){
    	
    	return dealerRecordDao.deleteDealerRecordByIdList(ids);
    }
    /**
     * 修改DealerRecord
     * @param dealerRecord 要修改的DealerRecord
     */
    public Long updateDealerRecord(DealerRecord dealerRecord){
     	return dealerRecordDao.updateDealerRecord(dealerRecord);
    }
    
    public Long updateDealerRecordByObj(DealerRecord dealerRecord){
    	return dealerRecordDao.updateDealerRecordByObj(dealerRecord);
    }
    
    public Long updateDealerRecordByObjAndConditions(DealerRecord s,DealerRecord c){
    	return dealerRecordDao.updateDealerRecordByObjAndConditions(s,c);
    }
	public void batchUpdateDealerRecord(List<DealerRecord> records){
		dealerRecordDao.batchUpdateDealerRecord(records);
	}
    /**
     * 根据id获取单个DealerRecord对象
     * @param id 要查询的id
     * @return DealerRecord
     */
    
    public Integer getDealerRecordCountByObj(DealerRecordVo dealerRecordVo){
    	return dealerRecordDao.getDealerRecordCountByObj(dealerRecordVo);
    }
    


    public DealerRecord getDealerRecordById(Long id){
    	return dealerRecordDao.getDealerRecordById( id);
    }
    
     public DealerRecord getDealerRecordByObj(DealerRecordVo dealerRecordVo) {
        return dealerRecordDao.getDealerRecordByObj(dealerRecordVo);
    }


    
    public List<DealerRecord> getDealerRecordListByObj(DealerRecordVo dealerRecordVo){
        return dealerRecordDao.getDealerRecordListByObj(dealerRecordVo);
    }
    public List<DealerRecord> getDealerRecordListPage(DealerRecordVo dealerRecordVo,Integer offset,Integer limit){
        return dealerRecordDao.getDealerRecordListPage(dealerRecordVo,offset,limit);
    }
    
    public List<DealerRecord> getDealerRecordPage(DealerRecordVo dealerRecordVo,PageEntity page) {
        return dealerRecordDao.getDealerRecordPage(dealerRecordVo,page);
    }
}