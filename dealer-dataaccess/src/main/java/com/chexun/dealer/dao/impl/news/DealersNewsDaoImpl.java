package com.chexun.dealer.dao.impl.news;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.chexun.dealer.dao.news.DealersNewsDao;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.DealersNoticeCheap;
import com.chexun.dealer.model.news.RelevantCarSerices;

import org.springframework.stereotype.Repository;

import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * DealersNews
 * User:
 * Date: 2016-09-23
 */
 @Repository("dealersNewsDao")
public class DealersNewsDaoImpl extends GenericDaoImpl implements DealersNewsDao{

    public Long addDealersNews(DealersNews dealersNews) {
        return this.insert("com.chexun.dealer.model.news.DealersNewsMapper.createDealersNews",dealersNews);
    }
	public Long insertDealersNews(DealersNews dealersNews){
		return this.insert("com.chexun.dealer.model.news.DealersNewsMapper.insertDealersNews",dealersNews);
	}
    public Long deleteDealersNewsById(Long id){
        return this.delete("com.chexun.dealer.model.news.DealersNewsMapper.deleteDealersNewsById",id);
    }
    public Long deleteDealersNewsByObj(DealersNews dealersNews){
        return this.delete("com.chexun.dealer.model.news.DealersNewsMapper.deleteDealersNewsByObj",dealersNews);
    }
    
	public Long deleteDealersNewsByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.news.DealersNewsMapper.deleteDealersNewsByIdList",ids);
	}
    public Long updateDealersNews(DealersNews dealersNews) {
        return this.update("com.chexun.dealer.model.news.DealersNewsMapper.updateDealersNews",dealersNews);
    }
    
    public Long updateDealersNewsByObj(DealersNews dealersNews){
    	return this.update("com.chexun.dealer.model.news.DealersNewsMapper.updateDealersNewsByObj",dealersNews);
    }
    
    public Long updateDealersNewsByObjAndConditions(DealersNews s,DealersNews c){
    	Map<String,DealersNews> map = new HashMap<String,DealersNews>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.news.DealersNewsMapper.updateDealersNewsByObjAndConditions",map);
    }
	public void batchUpdateDealersNews(List<DealersNews> records){
		this.update("com.chexun.dealer.model.news.DealersNewsMapper.batchUpdateDealersNews",records);
	}
    public DealersNews getDealersNewsById(Long id) {
        return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsById",id);
    }
    
    public DealersNews getDealersNewsByObj(DealersNews dealersNews) {
        return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsByObj",dealersNews);
    }

    
    public List<DealersNews> getDealersNewsListByObj(DealersNews dealersNews){
        return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsListByObj",dealersNews);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersNews> getDealersNewsListPage(DealersNews dealersNews,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersNews);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealersNewsCountByObj(DealersNews dealersNews){
    	return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsCountByObj", dealersNews);
    }
    
    public List<DealersNews> getDealersNewsPage(DealersNews dealersNews,PageEntity page) {
        Integer objectscount = getDealersNewsCountByObj(dealersNews);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersNewsListPage(dealersNews,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersNewsIdByObj(DealersNews dealersNews) {
        return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsIdByObj",dealersNews);
    }

    public List<Long> getDealersNewsIdList(DealersNews dealersNews) {
        return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsIdList",dealersNews);
    }
    
    public List<Long> getDealersNewsIdListByObj(DealersNews dealersNews){
        return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsIdListByObj",dealersNews);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersNewsIdListPage(DealersNews dealersNews,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersNews);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.getDealersNewsIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealersNewsIdPage(DealersNews dealersNews,PageEntity page) {
        Integer objectscount = getDealersNewsCountByObj(dealersNews);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersNewsIdListPage(dealersNews,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
    /**
     * 手动DAO
     */
    
    public Integer selectDealersNewsCountByObj(DealersNews dealersNews){
    	return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.selectDealersNewsCountByObj", dealersNews);
    }
    
    public List<DealersNews> selectDealersNewsPage(DealersNews dealersNews,PageEntity page) {
        Integer objectscount = selectDealersNewsCountByObj(dealersNews);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return selectDealersNewsListPage(dealersNews,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersNews> selectDealersNewsListPage(DealersNews dealersNews,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersNews);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.selectDealersNewsListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    public Long updateDealersNewsById(DealersNews dealersNews){
    	return this.update("com.chexun.dealer.model.news.DealersNewsMapper.updateDealersNewsById",dealersNews);
    }
    
    public DealersNews selectDealersNewsById(int id) {
        return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.selectDealersNewsById",id);
    }
	@Override
	public List<RelevantCarSerices> selectSeriesById(Long id) {
		return this.selectList("com.chexun.dealer.model.news.DealersNewsMapper.selectSeriesById",id);
	}
	@Override
	public RelevantCarSerices selectSeriesById2(RelevantCarSerices relevantCarSerices) {
		return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.selectSeriesById2",relevantCarSerices);
	}
	@Override
	public DealersNoticeCheap selectDealersNoticeCheapByObj(DealersNoticeCheap dealersNoticeCheap) {
		return this.selectOne("com.chexun.dealer.model.news.DealersNewsMapper.selectDealersNoticeCheapByObj",dealersNoticeCheap);
	}
}
