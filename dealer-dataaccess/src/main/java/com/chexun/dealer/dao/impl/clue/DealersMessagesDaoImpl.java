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
import com.chexun.dealer.dao.clue.DealersMessagesDao;
import com.chexun.dealer.model.clue.DealersMessages;
import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.vo.clue.DealersMessagesVo;
/**
 *
 * DealersMessages
 * User:
 * Date: 2016-09-23
 */
 @Repository("dealersMessagesDao")
public class DealersMessagesDaoImpl extends GenericDaoImpl implements DealersMessagesDao{

    public Long addDealersMessages(DealersMessages dealersMessages) {
        return this.insert("com.chexun.dealer.model.clue.DealersMessagesMapper.createDealersMessages",dealersMessages);
    }
	public Long insertDealersMessages(DealersMessages dealersMessages){
		return this.insert("com.chexun.dealer.model.clue.DealersMessagesMapper.insertDealersMessages",dealersMessages);
	}
    public Long deleteDealersMessagesById(Long id){
        return this.delete("com.chexun.dealer.model.clue.DealersMessagesMapper.deleteDealersMessagesById",id);
    }
    public Long deleteDealersMessagesByObj(DealersMessages dealersMessages){
        return this.delete("com.chexun.dealer.model.clue.DealersMessagesMapper.deleteDealersMessagesByObj",dealersMessages);
    }
    
	public Long deleteDealersMessagesByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.clue.DealersMessagesMapper.deleteDealersMessagesByIdList",ids);
	}
    public Long updateDealersMessages(DealersMessages dealersMessages) {
        return this.update("com.chexun.dealer.model.clue.DealersMessagesMapper.updateDealersMessages",dealersMessages);
    }
    
    public Long updateDealersMessagesByObj(DealersMessages dealersMessages){
    	return this.update("com.chexun.dealer.model.clue.DealersMessagesMapper.updateDealersMessagesByObj",dealersMessages);
    }
    
    public Long updateDealersMessagesByObjAndConditions(DealersMessages s,DealersMessages c){
    	Map<String,DealersMessages> map = new HashMap<String,DealersMessages>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.clue.DealersMessagesMapper.updateDealersMessagesByObjAndConditions",map);
    }
	public void batchUpdateDealersMessages(List<DealersMessages> records){
		this.update("com.chexun.dealer.model.clue.DealersMessagesMapper.batchUpdateDealersMessages",records);
	}
    public DealersMessages getDealersMessagesById(Long id) {
        return this.selectOne("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesById",id);
    }
    
    public DealersMessages getDealersMessagesByObj(DealersMessages dealersMessages) {
        return this.selectOne("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesByObj",dealersMessages);
    }

    
    public List<DealersMessages> getDealersMessagesListByObj(DealersMessages dealersMessages){
        return this.selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesListByObj",dealersMessages);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersMessages> getDealersMessagesListPage(DealersMessages dealersMessages,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersMessages);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealersMessagesCountByObj(DealersMessages dealersMessages){
    	return this.selectOne("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesCountByObj", dealersMessages);
    }
    
    public List<DealersMessages> getDealersMessagesPage(DealersMessages dealersMessages,PageEntity page) {
        Integer objectscount = getDealersMessagesCountByObj(dealersMessages);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersMessagesListPage(dealersMessages,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersMessagesIdByObj(DealersMessages dealersMessages) {
        return this.selectOne("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesIdByObj",dealersMessages);
    }

    public List<Long> getDealersMessagesIdList(DealersMessages dealersMessages) {
        return this.selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesIdList",dealersMessages);
    }
    
    public List<Long> getDealersMessagesIdListByObj(DealersMessages dealersMessages){
        return this.selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesIdListByObj",dealersMessages);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersMessagesIdListPage(DealersMessages dealersMessages,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersMessages);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.getDealersMessagesIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealersMessagesIdPage(DealersMessages dealersMessages,PageEntity page) {
        Integer objectscount = getDealersMessagesCountByObj(dealersMessages);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersMessagesIdListPage(dealersMessages,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    //added统计留言总数
    @Override
    public Integer getMessagesCount(DealersMessagesVo dealersMessages){
    	return this.selectOne("com.chexun.dealer.model.clue.DealersMessagesMapper.queryMessageCount", dealersMessages);
    }
    
    //added留言查询（关联经销商查询）
    @Override
    public List<DealersMessagesPo> queryMessageListByPage(DealersMessagesVo dealersMessages,PageEntity page) {
        Integer objectscount = null;
        if(page.getTotalResultSize() > 0){
        	objectscount = page.getTotalResultSize();
        }else{
        	objectscount = getMessagesCount(dealersMessages);
        }
        List<DealersMessagesPo> resultList = null;
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
    			Map<String,Object> map = BeanMapConvertor.convertBean(dealersMessages);
    			map.put("offset",(page.getCurrentPage() - 1) * page.getPageSize());
        		map.put("limit",page.getPageSize());
        		resultList = selectList("com.chexun.dealer.model.clue.DealersMessagesMapper.queryMessageList",map);
    		} catch (IllegalAccessException e) {
    			e.printStackTrace();
    		} catch (InvocationTargetException e) {
    			e.printStackTrace();
    		} catch (IntrospectionException e) {
    			e.printStackTrace();
    		}
            return resultList;
            //return getDealersMessagesListPage(dealersMessages,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}
