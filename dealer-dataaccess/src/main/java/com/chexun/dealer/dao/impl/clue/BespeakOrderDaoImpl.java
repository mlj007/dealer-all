package com.chexun.dealer.dao.impl.clue;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.clue.BespeakOrderDao;
import com.chexun.dealer.model.clue.BespeakOrder;
import com.chexun.dealer.po.clue.BespeakOrderPo;
import com.chexun.dealer.vo.clue.BespeakOrderVo;
/**
 *
 * BespeakOrder
 * User:
 * Date: 2016-09-23
 */
 @Repository("bespeakOrderDao")
public class BespeakOrderDaoImpl extends GenericDaoImpl implements BespeakOrderDao{

    public Long addBespeakOrder(BespeakOrder bespeakOrder) {
        return this.insert("com.chexun.dealer.model.clue.BespeakOrderMapper.createBespeakOrder",bespeakOrder);
    }
	public Long insertBespeakOrder(BespeakOrder bespeakOrder){
		return this.insert("com.chexun.dealer.model.clue.BespeakOrderMapper.insertBespeakOrder",bespeakOrder);
	}
    public Long deleteBespeakOrderById(Long id){
        return this.delete("com.chexun.dealer.model.clue.BespeakOrderMapper.deleteBespeakOrderById",id);
    }
    public Long deleteBespeakOrderByObj(BespeakOrder bespeakOrder){
        return this.delete("com.chexun.dealer.model.clue.BespeakOrderMapper.deleteBespeakOrderByObj",bespeakOrder);
    }
    
	public Long deleteBespeakOrderByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.BespeakOrderMapper.deleteBespeakOrderByIdList",ids);
	}
    public Long updateBespeakOrder(BespeakOrder bespeakOrder) {
        return this.update("com.chexun.dealer.model.clue.BespeakOrderMapper.updateBespeakOrder",bespeakOrder);
    }
    
    public Long updateBespeakOrderByObj(BespeakOrder bespeakOrder){
    	return this.update("com.chexun.dealer.model.clue.BespeakOrderMapper.updateBespeakOrderByObj",bespeakOrder);
    }
    
    public Long updateBespeakOrderByObjAndConditions(BespeakOrder s,BespeakOrder c){
    	Map<String,BespeakOrder> map = new HashMap<String,BespeakOrder>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.BespeakOrderMapper.updateBespeakOrderByObjAndConditions",map);
    }
	public void batchUpdateBespeakOrder(List<BespeakOrder> records){
		this.update("com.chexun.dealer.model.clue.BespeakOrderMapper.batchUpdateBespeakOrder",records);
	}
    public BespeakOrder getBespeakOrderById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderById",id);
    }
    
    public BespeakOrder getBespeakOrderByObj(BespeakOrder bespeakOrder) {
        return this.selectOne("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderByObj",bespeakOrder);
    }

    
    public List<BespeakOrder> getBespeakOrderListByObj(BespeakOrder bespeakOrder){
        return this.selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderListByObj",bespeakOrder);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<BespeakOrder> getBespeakOrderListPage(BespeakOrder bespeakOrder,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(bespeakOrder);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getBespeakOrderCountByObj(BespeakOrder bespeakOrder){
    	return this.selectOne("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderCountByObj", bespeakOrder);
    }
    
    public List<BespeakOrder> getBespeakOrderPage(BespeakOrder bespeakOrder,PageEntity page) {
        Integer objectscount = getBespeakOrderCountByObj(bespeakOrder);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getBespeakOrderListPage(bespeakOrder,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getBespeakOrderIdByObj(BespeakOrder bespeakOrder) {
        return this.selectOne("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderIdByObj",bespeakOrder);
    }

    public List<Long> getBespeakOrderIdList(BespeakOrder bespeakOrder) {
        return this.selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderIdList",bespeakOrder);
    }
    
    public List<Long> getBespeakOrderIdListByObj(BespeakOrder bespeakOrder){
        return this.selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderIdListByObj",bespeakOrder);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getBespeakOrderIdListPage(BespeakOrder bespeakOrder,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(bespeakOrder);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.getBespeakOrderIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getBespeakOrderIdPage(BespeakOrder bespeakOrder,PageEntity page) {
        Integer objectscount = getBespeakOrderCountByObj(bespeakOrder);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getBespeakOrderIdListPage(bespeakOrder,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    //added统计订单信息总数
    @Override
    public Integer getBespeakOrderCount(BespeakOrderVo bespeakOrderVo){
    	return this.selectOne("com.chexun.dealer.model.clue.BespeakOrderMapper.queryBespeakOrderCount", bespeakOrderVo);
    }
    
    //added订单信息查询（关联经销商查询）
    @Override
    public List<BespeakOrderPo> queryBespeakOrderByPage(BespeakOrderVo bespeakOrderVo,PageEntity page) {
        Integer objectscount = null;
        if(page.getTotalResultSize() > 0){
        	objectscount = page.getTotalResultSize();
        }else{
        	objectscount = getBespeakOrderCount(bespeakOrderVo);
        }
        List<BespeakOrderPo> resultList = null;
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            try {
    			Map<String,Object> map = BeanMapConvertor.convertBean(bespeakOrderVo);
    			map.put("offset",(page.getCurrentPage() - 1) * page.getPageSize());
        		map.put("limit",page.getPageSize());
        		resultList = selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.queryBespeakOrderList",map);
    		} catch (IllegalAccessException e) {
    			e.printStackTrace();
    		} catch (InvocationTargetException e) {
    			e.printStackTrace();
    		} catch (IntrospectionException e) {
    			e.printStackTrace();
    		}
            return resultList;
        }
    }
    
    //added获取来源列表
    @Override
    public List<String> querySourceList(){
    	return selectList("com.chexun.dealer.model.clue.BespeakOrderMapper.querySourceList",null);
    }
    
    
}
