package com.chexun.dealer.dao.dealers;
import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.po.dealers.DealersInfoPo;
import com.chexun.dealer.vo.dealers.DealersCarVo;
import com.chexun.dealer.vo.dealers.DealersInfoVo;
/**
 * DealersInfo管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersInfoDao {

    /**
     * 添加DealersInfo
     * @param dealersInfo 要添加的DealersInfo
     * @return id
     */
    public Long addDealersInfo(DealersInfo dealersInfo);
	public Long insertDealersInfo(DealersInfo dealersInfo);
    /**
     * 根据id删除一个DealersInfo
     * @param id 要删除的id
     */
    public Long deleteDealersInfoById(Long id);
    
    public Long deleteDealersInfoByObj(DealersInfo dealersInfo);

	public Long deleteDealersInfoByIdList(List<Long > ids);

    /**
     * 修改DealersInfo
     * @param dealersInfo 要修改的DealersInfo
     */
    public Long updateDealersInfo(DealersInfo dealersInfo);
    
    public Long updateDealersInfoByObj(DealersInfo dealersInfo);
    
    public Long updateDealersInfoByObjAndConditions(DealersInfo s,DealersInfo c);
    public void batchUpdateDealersInfo(List<DealersInfo> records);

    /**
     * 根据id获取单个DealersInfo对象
     * @param id 要查询的id
     * @return DealersInfo
     */
    public DealersInfo getDealersInfoById(Long id);
	public DealersInfoPo getDealersInfoByObj(DealersInfoVo dealersInfoVo);
    /**
     * 根据条件获取DealersInfo列表
     * @param dealersInfo 查询条件
     * @return List<DealersInfo>
     */
    public List<DealersInfoPo> getDealersInfoListByObj(DealersInfoVo dealersInfoVo);
    public List<DealersInfoPo> getDealersInfoListPage(DealersInfoVo dealersInfoVo,Integer offset,Integer limit);
    public Integer getDealersInfoCountByObj(DealersInfoVo dealersInfoVo);
    public List<DealersInfoPo> getDealersInfoPage(DealersInfoVo dealersInfoVo,PageEntity page);//改
    
    /**
    *以下为缓存查询用
    */
    public Long getDealersInfoIdByObj(DealersInfoVo dealersInfoVo);
    /**
     * 根据条件获取DealersInfo列表
     * @param dealersInfo 查询条件
     * @return List<DealersInfo>
     */
    public List<Long> getDealersInfoIdList(DealersInfoVo dealersInfoVo);
    public List<Long> getDealersInfoIdListByObj(DealersInfoVo dealersInfoVo);
    public List<Long> getDealersInfoIdListPage(DealersInfoVo dealersInfoVo,Integer offset,Integer limit);
    public List<Long> getDealersInfoIdPage(DealersInfoVo dealersInfoVo,PageEntity page);
    
   
}