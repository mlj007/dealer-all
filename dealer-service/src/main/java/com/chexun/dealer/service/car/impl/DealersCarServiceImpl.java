package com.chexun.dealer.service.car.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.dealer.dao.car.DealersCarDao;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.service.car.DealersCarService;
import com.chexun.dealer.service.car.base.impl.DealersCarBaseServiceImpl;
import com.chexun.dealer.vo.dealers.DealersCarVo;
/**
 * DealersCar管理接口
 * User: 
 * Date: 2016-10-08
 */
@Service("dealersCarService")
public class DealersCarServiceImpl extends DealersCarBaseServiceImpl implements DealersCarService{

	@Autowired
    private DealersCarDao dealersCarDao;
	public DealersCarPo getBrandCountAndCarCountByObj(DealersCarVo dealersCarVo) {
		// TODO Auto-generated method stub
		return dealersCarDao.getBrandCountAndCarCountByObj(dealersCarVo);
	}
	@Override
	public List<DealersCarPo> getBrandListByObj(DealersCarVo dealersCarVo) {
		// TODO Auto-generated method stub
		return dealersCarDao.getBrandListByObj(dealersCarVo);
	}
	@Override
	public List<DealersCarPo> getSeriesListAndCarCountByObj(
			DealersCarVo dealersCarVo) {
		// TODO Auto-generated method stub
		return dealersCarDao.getSeriesListAndCarCountByObj(dealersCarVo);
	}
	@Override
	public DealersCarPo getSeriesNameAndCarCountByObj(DealersCarVo dealersCarVo) {
		// TODO Auto-generated method stub
		return dealersCarDao.getSeriesNameAndCarCountByObj(dealersCarVo);
	}
	@Override
	public List<DealersCarPo> getCarListByObj(DealersCarVo dealersCarVo) {
		// TODO Auto-generated method stub
		return dealersCarDao.getCarListByObj(dealersCarVo);
	}

 	
}