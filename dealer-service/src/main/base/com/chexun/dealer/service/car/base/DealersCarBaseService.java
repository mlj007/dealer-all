package com.chexun.dealer.service.car.base;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.car.DealersCar;
/**
 * DealersCar管理接口
 * User: 
 * Date: 2016-10-08
 */
public interface DealersCarBaseService {

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
    
}