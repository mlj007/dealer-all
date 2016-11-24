package com.chexun.dealer.dao.impl.dealers;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealersInfoDao;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.po.dealers.DealersInfoPo;
import com.chexun.dealer.vo.dealers.DealersCarVo;
import com.chexun.dealer.vo.dealers.DealersInfoVo;
/**
 *
 * DealersInfo
 * User:
 * Date: 2016-09-23
 */
 @Repository("dealersInfoDao")
public class DealersInfoDaoImpl extends GenericDaoImpl implements DealersInfoDao{
	private static final Logger logger = Logger.getLogger(DealersInfoDaoImpl.class);
    public Long addDealersInfo(DealersInfo dealersInfo) {
        return this.insert("com.chexun.dealer.model.dealers.DealersInfoMapper.createDealersInfo",dealersInfo);
    }
	public Long insertDealersInfo(DealersInfo dealersInfo){
		return this.insert("com.chexun.dealer.model.dealers.DealersInfoMapper.insertDealersInfo",dealersInfo);
	}
    public Long deleteDealersInfoById(Long id){
        return this.delete("com.chexun.dealer.model.dealers.DealersInfoMapper.deleteDealersInfoById",id);
    }
    public Long deleteDealersInfoByObj(DealersInfo dealersInfo){
        return this.delete("com.chexun.dealer.model.dealers.DealersInfoMapper.deleteDealersInfoByObj",dealersInfo);
    }
    
	public Long deleteDealersInfoByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.dealers.DealersInfoMapper.deleteDealersInfoByIdList",ids);
	}
    public Long updateDealersInfo(DealersInfo dealersInfo) {
        return this.update("com.chexun.dealer.model.dealers.DealersInfoMapper.updateDealersInfo",dealersInfo);
    }
    
    public Long updateDealersInfoByObj(DealersInfo dealersInfo){
    	return this.update("com.chexun.dealer.model.dealers.DealersInfoMapper.updateDealersInfoByObj",dealersInfo);
    }
    
    public Long updateDealersInfoByObjAndConditions(DealersInfo s,DealersInfo c){
    	Map<String,DealersInfo> map = new HashMap<String,DealersInfo>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.dealers.DealersInfoMapper.updateDealersInfoByObjAndConditions",map);
    }
	public void batchUpdateDealersInfo(List<DealersInfo> records){
		this.update("com.chexun.dealer.model.dealers.DealersInfoMapper.batchUpdateDealersInfo",records);
	}
    public DealersInfo getDealersInfoById(Long id) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoById",id);
    }
    
    public DealersInfoPo getDealersInfoByObj(DealersInfoVo dealersInfoVo) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoByObj",dealersInfoVo);
    }

    
    public List<DealersInfoPo> getDealersInfoListByObj(DealersInfoVo dealersInfoVo){
        return this.selectList("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoListByObj",dealersInfoVo);
    }
   
    //改
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersInfoPo> getDealersInfoListPage(DealersInfoVo dealersInfoVo,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersInfoVo);
			map.put("offset",offset);
    		map.put("limit",limit);
    		map.put("companyName", dealersInfoVo.getCompanyName());
        	return this.selectList("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoPoListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return null;
    }//改
    public Integer getDealersInfoCountByObj(DealersInfoVo dealersInfoVo){
    	return this.selectOne("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoCountByObj", dealersInfoVo);
    }
    //改
    public List<DealersInfoPo> getDealersInfoPage(DealersInfoVo dealersInfoVo,PageEntity page) {
        Integer objectscount = getDealersInfoCountByObj(dealersInfoVo);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersInfoListPage(dealersInfoVo,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersInfoIdByObj(DealersInfoVo dealersInfoVo) {
        return this.selectOne("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoIdByObj",dealersInfoVo);
    }

    public List<Long> getDealersInfoIdList(DealersInfoVo dealersInfoVo) {
        return this.selectList("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoIdList",dealersInfoVo);
    }
    
    public List<Long> getDealersInfoIdListByObj(DealersInfoVo dealersInfoVo){
        return this.selectList("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoIdListByObj",dealersInfoVo);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersInfoIdListPage(DealersInfoVo dealersInfoVo,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersInfoVo);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.dealers.DealersInfoMapper.getDealersInfoIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IntrospectionException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
    	
		return null;
    }
    public List<Long> getDealersInfoIdPage(DealersInfoVo dealersInfoVo,PageEntity page) {
        Integer objectscount = getDealersInfoCountByObj(dealersInfoVo);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersInfoIdListPage(dealersInfoVo,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
	
    
	
}
