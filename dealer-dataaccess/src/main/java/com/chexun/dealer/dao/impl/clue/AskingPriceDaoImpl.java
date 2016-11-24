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
import com.chexun.dealer.dao.clue.AskingPriceDao;
import com.chexun.dealer.model.clue.AskingPrice;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.vo.clue.AskingPriceVo;
/**
 *
 * AskingPrice
 * User:
 * Date: 2016-09-23
 */
 @Repository("askingPriceDao")
public class AskingPriceDaoImpl extends GenericDaoImpl implements AskingPriceDao{

    public Long addAskingPrice(AskingPrice askingPrice) {
        return this.insert("com.chexun.dealer.model.clue.AskingPriceMapper.createAskingPrice",askingPrice);
    }
	public Long insertAskingPrice(AskingPrice askingPrice){
		return this.insert("com.chexun.dealer.model.clue.AskingPriceMapper.insertAskingPrice",askingPrice);
	}
    public Long deleteAskingPriceById(Long id){
        return this.delete("com.chexun.dealer.model.clue.AskingPriceMapper.deleteAskingPriceById",id);
    }
    public Long deleteAskingPriceByObj(AskingPrice askingPrice){
        return this.delete("com.chexun.dealer.model.clue.AskingPriceMapper.deleteAskingPriceByObj",askingPrice);
    }
    
	public Long deleteAskingPriceByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.AskingPriceMapper.deleteAskingPriceByIdList",ids);
	}
    public Long updateAskingPrice(AskingPrice askingPrice) {
        return this.update("com.chexun.dealer.model.clue.AskingPriceMapper.updateAskingPrice",askingPrice);
    }
    
    public Long updateAskingPriceByObj(AskingPrice askingPrice){
    	return this.update("com.chexun.dealer.model.clue.AskingPriceMapper.updateAskingPriceByObj",askingPrice);
    }
    
    public Long updateAskingPriceByObjAndConditions(AskingPrice s,AskingPrice c){
    	Map<String,AskingPrice> map = new HashMap<String,AskingPrice>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.AskingPriceMapper.updateAskingPriceByObjAndConditions",map);
    }
	public void batchUpdateAskingPrice(List<AskingPrice> records){
		this.update("com.chexun.dealer.model.clue.AskingPriceMapper.batchUpdateAskingPrice",records);
	}
    public AskingPrice getAskingPriceById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceById",id);
    }
    
    public AskingPrice getAskingPriceByObj(AskingPrice askingPrice) {
        return this.selectOne("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceByObj",askingPrice);
    }

    
    public List<AskingPrice> getAskingPriceListByObj(AskingPrice askingPrice){
        return this.selectList("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceListByObj",askingPrice);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<AskingPrice> getAskingPriceListPage(AskingPrice askingPrice,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(askingPrice);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getAskingPriceCountByObj(AskingPrice askingPrice){
    	return this.selectOne("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceCountByObj", askingPrice);
    }
    
    public List<AskingPrice> getAskingPricePage(AskingPrice askingPrice,PageEntity page) {
        Integer objectscount = getAskingPriceCountByObj(askingPrice);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getAskingPriceListPage(askingPrice,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getAskingPriceIdByObj(AskingPrice askingPrice) {
        return this.selectOne("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceIdByObj",askingPrice);
    }

    public List<Long> getAskingPriceIdList(AskingPrice askingPrice) {
        return this.selectList("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceIdList",askingPrice);
    }
    
    public List<Long> getAskingPriceIdListByObj(AskingPrice askingPrice){
        return this.selectList("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceIdListByObj",askingPrice);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getAskingPriceIdListPage(AskingPrice askingPrice,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(askingPrice);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.AskingPriceMapper.getAskingPriceIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getAskingPriceIdPage(AskingPrice askingPrice,PageEntity page) {
        Integer objectscount = getAskingPriceCountByObj(askingPrice);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getAskingPriceIdListPage(askingPrice,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    //added统计询价信息总数
    @Override
    public Integer getAskingPriceCount(AskingPriceVo askingPriceVo){
    	return this.selectOne("com.chexun.dealer.model.clue.AskingPriceMapper.queryAskingPriceCount", askingPriceVo);
    }
    
    //added询价信息查询（关联经销商查询）
    @Override
    public List<AskingPricePo> queryAskingPriceByPage(AskingPriceVo askingPriceVo,PageEntity page) {
        Integer objectscount = null;
        if(page.getTotalResultSize() > 0){
        	objectscount = page.getTotalResultSize();
        }else{
        	objectscount = getAskingPriceCount(askingPriceVo);
        }
        List<AskingPricePo> resultList = null;
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
    			Map<String,Object> map = BeanMapConvertor.convertBean(askingPriceVo);
    			map.put("offset",(page.getCurrentPage() - 1) * page.getPageSize());
        		map.put("limit",page.getPageSize());
        		resultList = selectList("com.chexun.dealer.model.clue.AskingPriceMapper.queryAskingPriceList",map);
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
    	return selectList("com.chexun.dealer.model.clue.AskingPriceMapper.querySourceList",null);
    }
}
