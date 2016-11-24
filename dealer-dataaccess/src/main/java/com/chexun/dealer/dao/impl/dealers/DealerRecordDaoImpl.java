package com.chexun.dealer.dao.impl.dealers;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealerRecordDao;
import com.chexun.dealer.model.dealers.DealerRecord;
import com.chexun.dealer.vo.dealers.DealerRecordVo;
/**
 *
 * DealerRecord
 * User:
 * Date: 2016-10-11
 */
 @Repository("dealerRecordDao")
public class DealerRecordDaoImpl extends GenericDaoImpl implements DealerRecordDao{

    public Long addDealerRecord(DealerRecord dealerRecord) {
        return this.insert("com.chexun.dealer.model.dealers.DealerRecordMapper.createDealerRecord",dealerRecord);
    }
	public Long insertDealerRecord(DealerRecord dealerRecord){
		return this.insert("com.chexun.dealer.model.dealers.DealerRecordMapper.insertDealerRecord",dealerRecord);
	}
    public Long deleteDealerRecordById(Long id){
        return this.delete("com.chexun.dealer.model.dealers.DealerRecordMapper.deleteDealerRecordById",id);
    }
    public Long deleteDealerRecordByObj(DealerRecord dealerRecord){
        return this.delete("com.chexun.dealer.model.dealers.DealerRecordMapper.deleteDealerRecordByObj",dealerRecord);
    }
    
	public Long deleteDealerRecordByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.dealers.DealerRecordMapper.deleteDealerRecordByIdList",ids);
	}
    public Long updateDealerRecord(DealerRecord dealerRecord) {
        return this.update("com.chexun.dealer.model.dealers.DealerRecordMapper.updateDealerRecord",dealerRecord);
    }
    
    public Long updateDealerRecordByObj(DealerRecord dealerRecord){
    	return this.update("com.chexun.dealer.model.dealers.DealerRecordMapper.updateDealerRecordByObj",dealerRecord);
    }
    
    public Long updateDealerRecordByObjAndConditions(DealerRecord s,DealerRecord c){
    	Map<String,DealerRecord> map = new HashMap<String,DealerRecord>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.dealers.DealerRecordMapper.updateDealerRecordByObjAndConditions",map);
    }
	public void batchUpdateDealerRecord(List<DealerRecord> records){
		this.update("com.chexun.dealer.model.dealers.DealerRecordMapper.batchUpdateDealerRecord",records);
	}
    public DealerRecord getDealerRecordById(Long id) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordById",id);
    }
    
    public DealerRecord getDealerRecordByObj(DealerRecordVo dealerRecordVo) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordByObj",dealerRecordVo);
    }

    
    public List<DealerRecord> getDealerRecordListByObj(DealerRecordVo dealerRecordVo){
        return this.selectList("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordListByObj",dealerRecordVo);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealerRecord> getDealerRecordListPage(DealerRecordVo dealerRecordVo,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealerRecordVo);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealerRecordCountByObj(DealerRecordVo dealerRecordVo){
    	return this.selectOne("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordCountByObj", dealerRecordVo);
    }
    
    public List<DealerRecord> getDealerRecordPage(DealerRecordVo dealerRecordVo,PageEntity page) {
        Integer objectscount = getDealerRecordCountByObj(dealerRecordVo);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealerRecordListPage(dealerRecordVo,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealerRecordIdByObj(DealerRecordVo dealerRecordVo) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordIdByObj",dealerRecordVo);
    }

    public List<Long> getDealerRecordIdList(DealerRecordVo dealerRecordVo) {
        return this.selectList("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordIdList",dealerRecordVo);
    }
    
    public List<Long> getDealerRecordIdListByObj(DealerRecordVo dealerRecordVo){
        return this.selectList("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordIdListByObj",dealerRecordVo);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealerRecordIdListPage(DealerRecordVo dealerRecordVo,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealerRecordVo);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealerRecordMapper.getDealerRecordIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealerRecordIdPage(DealerRecordVo dealerRecordVo,PageEntity page) {
        Integer objectscount = getDealerRecordCountByObj(dealerRecordVo);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealerRecordIdListPage(dealerRecordVo,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
	
	
	
	

}
