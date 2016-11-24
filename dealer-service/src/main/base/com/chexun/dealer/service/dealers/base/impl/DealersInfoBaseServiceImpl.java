package com.chexun.dealer.service.dealers.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.dealers.DealersInfoDao;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.po.dealers.DealersInfoPo;
import com.chexun.dealer.service.dealers.DealersInfoService;
import com.chexun.dealer.vo.dealers.DealersInfoVo;
/**
 * DealersInfo管理接口
 * User: 
 * Date: 2016-09-23
 */
//@Service("dealersInfoService")
public class DealersInfoBaseServiceImpl implements DealersInfoService{

 	@Autowired
    private DealersInfoDao dealersInfoDao;
    /**
     * 添加DealersInfo
     * @param dealersInfo 要添加的DealersInfo
     * @return id
     */
    public Long addDealersInfo(DealersInfo dealersInfo){
    	Long res = dealersInfoDao.addDealersInfo(dealersInfo);
    	return res;
    }
	public Long insertDealersInfo(DealersInfo dealersInfo){
		Long res = dealersInfoDao.insertDealersInfo(dealersInfo);
		
    	return res;
	}
    /**
     * 根据id删除一个DealersInfo
     * @param id 要删除的id
     */
    public Long deleteDealersInfoById(Long id){
    	return dealersInfoDao.deleteDealersInfoById(id);
    }
	public Long deleteDealersInfoByObj(DealersInfo dealersInfo){
        return dealersInfoDao.deleteDealersInfoByObj(dealersInfo);
    }
    public Long deleteDealersInfoByIdList(List<Long > ids){
    	
    	return dealersInfoDao.deleteDealersInfoByIdList(ids);
    }
    /**
     * 修改DealersInfo
     * @param dealersInfo 要修改的DealersInfo
     */
    public Long updateDealersInfo(DealersInfo dealersInfo){
     	return dealersInfoDao.updateDealersInfo(dealersInfo);
    }
    
    public Long updateDealersInfoByObj(DealersInfo dealersInfo){
    	return dealersInfoDao.updateDealersInfoByObj(dealersInfo);
    }
    
    public Long updateDealersInfoByObjAndConditions(DealersInfo s,DealersInfo c){
    	return dealersInfoDao.updateDealersInfoByObjAndConditions(s,c);
    }
	public void batchUpdateDealersInfo(List<DealersInfo> records){
		dealersInfoDao.batchUpdateDealersInfo(records);
	}
    /**
     * 根据id获取单个DealersInfo对象
     * @param id 要查询的id
     * @return DealersInfo
     */
    
    public Integer getDealersInfoCountByObj(DealersInfoVo dealersInfoVo){
    	return dealersInfoDao.getDealersInfoCountByObj(dealersInfoVo);
    }
    


    public DealersInfo getDealersInfoById(Long id){
    	return dealersInfoDao.getDealersInfoById( id);
    }
    
     public DealersInfoPo getDealersInfoByObj(DealersInfoVo dealersInfoVo) {
        return dealersInfoDao.getDealersInfoByObj(dealersInfoVo);
    }


    
    public List<DealersInfoPo> getDealersInfoListByObj(DealersInfoVo dealersInfoVo){
        return dealersInfoDao.getDealersInfoListByObj(dealersInfoVo);
    }
    public List<DealersInfoPo> getDealersInfoListPage(DealersInfoVo dealersInfoVo,Integer offset,Integer limit){
        return dealersInfoDao.getDealersInfoListPage(dealersInfoVo,offset,limit);
    }
    //改
    public List<DealersInfoPo> getDealersInfoPage(DealersInfoVo dealersInfoVo,PageEntity page) {
        return dealersInfoDao.getDealersInfoPage(dealersInfoVo,page);
    }
}