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
import com.chexun.dealer.dao.dealers.DealersContractDao;
import com.chexun.dealer.model.dealers.DealersContract;
/**
 *
 * DealersContract
 * User:
 * Date: 2016-09-23
 */
 @Repository("dealersContractDao")
public class DealersContractDaoImpl extends GenericDaoImpl implements DealersContractDao{

    public Long addDealersContract(DealersContract dealersContract) {
        return this.insert("com.chexun.dealer.model.dealers.DealersContractMapper.createDealersContract",dealersContract);
    }
	public Long insertDealersContract(DealersContract dealersContract){
		return this.insert("com.chexun.dealer.model.dealers.DealersContractMapper.insertDealersContract",dealersContract);
	}
    public Long deleteDealersContractById(Long id){
        return this.delete("com.chexun.dealer.model.dealers.DealersContractMapper.deleteDealersContractById",id);
    }
    public Long deleteDealersContractByObj(DealersContract dealersContract){
        return this.delete("com.chexun.dealer.model.dealers.DealersContractMapper.deleteDealersContractByObj",dealersContract);
    }
    
	public Long deleteDealersContractByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.dealers.DealersContractMapper.deleteDealersContractByIdList",ids);
	}
    public Long updateDealersContract(DealersContract dealersContract) {
        return this.update("com.chexun.dealer.model.dealers.DealersContractMapper.updateDealersContract",dealersContract);
    }
    
    public Long updateDealersContractByObj(DealersContract dealersContract){
    	return this.update("com.chexun.dealer.model.dealers.DealersContractMapper.updateDealersContractByObj",dealersContract);
    }
    
    public Long updateDealersContractByObjAndConditions(DealersContract s,DealersContract c){
    	Map<String,DealersContract> map = new HashMap<String,DealersContract>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.dealers.DealersContractMapper.updateDealersContractByObjAndConditions",map);
    }
	public void batchUpdateDealersContract(List<DealersContract> records){
		this.update("com.chexun.dealer.model.dealers.DealersContractMapper.batchUpdateDealersContract",records);
	}
    public DealersContract getDealersContractById(Long id) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractById",id);
    }
    
    public DealersContract getDealersContractByObj(DealersContract dealersContract) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractByObj",dealersContract);
    }

    
    public List<DealersContract> getDealersContractListByObj(DealersContract dealersContract){
        return this.selectList("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractListByObj",dealersContract);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersContract> getDealersContractListPage(DealersContract dealersContract,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersContract);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealersContractCountByObj(DealersContract dealersContract){
    	return this.selectOne("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractCountByObj", dealersContract);
    }
    
    public List<DealersContract> getDealersContractPage(DealersContract dealersContract,PageEntity page) {
        Integer objectscount = getDealersContractCountByObj(dealersContract);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersContractListPage(dealersContract,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersContractIdByObj(DealersContract dealersContract) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractIdByObj",dealersContract);
    }

    public List<Long> getDealersContractIdList(DealersContract dealersContract) {
        return this.selectList("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractIdList",dealersContract);
    }
    
    public List<Long> getDealersContractIdListByObj(DealersContract dealersContract){
        return this.selectList("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractIdListByObj",dealersContract);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersContractIdListPage(DealersContract dealersContract,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersContract);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealersContractMapper.getDealersContractIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealersContractIdPage(DealersContract dealersContract,PageEntity page) {
        Integer objectscount = getDealersContractCountByObj(dealersContract);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersContractIdListPage(dealersContract,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}
