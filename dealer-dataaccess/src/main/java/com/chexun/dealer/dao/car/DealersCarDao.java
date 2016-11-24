package com.chexun.dealer.dao.car;
import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.car.DealersCar;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.vo.dealers.DealersCarVo;
/**
 * DealersCar管理接口
 * User: 
 * Date: 2016-10-08
 */
public interface DealersCarDao {

    /**
     * 添加DealersCar
     * @param dealersCar 要添加的DealersCar
     * @return id
     */
    public Long addDealersCar(DealersCar dealersCar);
	public Long insertDealersCar(DealersCar dealersCar);
    /**
     * 根据id删除一个DealersCar
     * @param id 要删除的id
     */
    public Long deleteDealersCarById(Long id);
    
    public Long deleteDealersCarByObj(DealersCar dealersCar);

	public Long deleteDealersCarByIdList(List<Long > ids);

    /**
     * 修改DealersCar
     * @param dealersCar 要修改的DealersCar
     */
    public Long updateDealersCar(DealersCar dealersCar);
    
    public Long updateDealersCarByObj(DealersCar dealersCar);
    
    public Long updateDealersCarByObjAndConditions(DealersCar s,DealersCar c);
    public void batchUpdateDealersCar(List<DealersCar> records);

    /**
     * 根据id获取单个DealersCar对象
     * @param id 要查询的id
     * @return DealersCar
     */
    public DealersCar getDealersCarById(Long id);
	public DealersCar getDealersCarByObj(DealersCar dealersCar);
    /**
     * 根据条件获取DealersCar列表
     * @param dealersCar 查询条件
     * @return List<DealersCar>
     */
    public List<DealersCar> getDealersCarListByObj(DealersCar dealersCar);
    public List<DealersCar> getDealersCarListPage(DealersCar dealersCar,Integer offset,Integer limit);
    public Integer getDealersCarCountByObj(DealersCar dealersCar);
    public List<DealersCar> getDealersCarPage(DealersCar dealersCar,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getDealersCarIdByObj(DealersCar dealersCar);
    /**
     * 根据条件获取DealersCar列表
     * @param dealersCar 查询条件
     * @return List<DealersCar>
     */
    public List<Long> getDealersCarIdList(DealersCar dealersCar);
    public List<Long> getDealersCarIdListByObj(DealersCar dealersCar);
    public List<Long> getDealersCarIdListPage(DealersCar dealersCar,Integer offset,Integer limit);
    public List<Long> getDealersCarIdPage(DealersCar dealersCar,PageEntity page);
    public DealersCarPo getBrandCountAndCarCountByObj(DealersCarVo dealersCarVo);
    // <!-- 报价管理菜单品牌列表 -->
    public List<DealersCarPo> getBrandListByObj(DealersCarVo dealersCarVo);
    //<!-- 报价管理菜单品牌子菜单的车系列表 -->
    public List<DealersCarPo> getSeriesListAndCarCountByObj(DealersCarVo dealersCarVo);
    //<!-- 报价管理列表统计数据 车系和车型数量 -->
    public DealersCarPo getSeriesNameAndCarCountByObj(DealersCarVo dealersCarVo);
    //<!-- 报价管理列表 -->
    public List<DealersCarPo> getCarListByObj(DealersCarVo dealersCarVo);
}