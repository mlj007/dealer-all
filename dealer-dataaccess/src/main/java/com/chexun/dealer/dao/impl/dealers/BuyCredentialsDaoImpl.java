package com.chexun.dealer.dao.impl.dealers;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.chexun.dealer.model.dealers.BuyCredentials;
import com.chexun.dealer.dao.dealers.BuyCredentialsDao;
import org.springframework.stereotype.Repository;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.entity.PageEntity;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
/**
 *
 * BuyCredentials
 * User:
 * Date: 2016-10-12
 */
 @Repository("buyCredentialsDao")
public class BuyCredentialsDaoImpl extends GenericDaoImpl implements BuyCredentialsDao{

    public Long addBuyCredentials(BuyCredentials buyCredentials) {
        return this.insert("com.chexun.dealer.model.dealers.BuyCredentialsMapper.createBuyCredentials",buyCredentials);
    }
	public Long insertBuyCredentials(BuyCredentials buyCredentials){
		return this.insert("com.chexun.dealer.model.dealers.BuyCredentialsMapper.insertBuyCredentials",buyCredentials);
	}
    public Long deleteBuyCredentialsById(Long id){
        return this.delete("com.chexun.dealer.model.dealers.BuyCredentialsMapper.deleteBuyCredentialsById",id);
    }
    public Long deleteBuyCredentialsByObj(BuyCredentials buyCredentials){
        return this.delete("com.chexun.dealer.model.dealers.BuyCredentialsMapper.deleteBuyCredentialsByObj",buyCredentials);
    }
    
	public Long deleteBuyCredentialsByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.dealers.BuyCredentialsMapper.deleteBuyCredentialsByIdList",ids);
	}
    public Long updateBuyCredentials(BuyCredentials buyCredentials) {
        return this.update("com.chexun.dealer.model.dealers.BuyCredentialsMapper.updateBuyCredentials",buyCredentials);
    }
    
    public Long updateBuyCredentialsByObj(BuyCredentials buyCredentials){
    	return this.update("com.chexun.dealer.model.dealers.BuyCredentialsMapper.updateBuyCredentialsByObj",buyCredentials);
    }
    
    public Long updateBuyCredentialsByObjAndConditions(BuyCredentials s,BuyCredentials c){
    	Map<String,BuyCredentials> map = new HashMap<String,BuyCredentials>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.dealers.BuyCredentialsMapper.updateBuyCredentialsByObjAndConditions",map);
    }
	public void batchUpdateBuyCredentials(List<BuyCredentials> records){
		this.update("com.chexun.dealer.model.dealers.BuyCredentialsMapper.batchUpdateBuyCredentials",records);
	}
    public BuyCredentials getBuyCredentialsById(Long id) {
        return this.selectOne("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsById",id);
    }
    
    public BuyCredentials getBuyCredentialsByObj(BuyCredentials buyCredentials) {
        return this.selectOne("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsByObj",buyCredentials);
    }

    
    public List<BuyCredentials> getBuyCredentialsListByObj(BuyCredentials buyCredentials){
        return this.selectList("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsListByObj",buyCredentials);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<BuyCredentials> getBuyCredentialsListPage(BuyCredentials buyCredentials,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(buyCredentials);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getBuyCredentialsCountByObj(BuyCredentials buyCredentials){
    	return this.selectOne("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsCountByObj", buyCredentials);
    }
    
    public List<BuyCredentials> getBuyCredentialsPage(BuyCredentials buyCredentials,PageEntity page) {
        Integer objectscount = getBuyCredentialsCountByObj(buyCredentials);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getBuyCredentialsListPage(buyCredentials,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getBuyCredentialsIdByObj(BuyCredentials buyCredentials) {
        return this.selectOne("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsIdByObj",buyCredentials);
    }

    public List<Long> getBuyCredentialsIdList(BuyCredentials buyCredentials) {
        return this.selectList("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsIdList",buyCredentials);
    }
    
    public List<Long> getBuyCredentialsIdListByObj(BuyCredentials buyCredentials){
        return this.selectList("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsIdListByObj",buyCredentials);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getBuyCredentialsIdListPage(BuyCredentials buyCredentials,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(buyCredentials);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.BuyCredentialsMapper.getBuyCredentialsIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getBuyCredentialsIdPage(BuyCredentials buyCredentials,PageEntity page) {
        Integer objectscount = getBuyCredentialsCountByObj(buyCredentials);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getBuyCredentialsIdListPage(buyCredentials,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
}
