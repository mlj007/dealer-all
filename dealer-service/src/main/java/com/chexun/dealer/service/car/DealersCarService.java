package com.chexun.dealer.service.car;

import java.util.List;

import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.service.car.base.DealersCarBaseService;
import com.chexun.dealer.vo.dealers.DealersCarVo;
/**
 * DealersCar管理接口
 * User: 
 * Date: 2016-10-08
 */
public interface DealersCarService extends DealersCarBaseService {
	//<!-- 已发布报价 品牌数量和款车型数量 -->
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