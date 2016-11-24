package com.chexun.dealer.service.clue.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.common.CityDao;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.po.clue.BespeakOrderPo;
import com.chexun.dealer.service.clue.BespeakOrderService;
import com.chexun.dealer.service.clue.base.impl.BespeakOrderBaseServiceImpl;
import com.chexun.dealer.vo.clue.BespeakOrderVo;
/**
 * BespeakOrder管理接口
 * User: 
 * Date: 2016-09-23
 */
@Service("bespeakOrderService") 
public class BespeakOrderServiceImpl extends BespeakOrderBaseServiceImpl  implements BespeakOrderService{
	
	@Autowired
	private CityDao cityDao;
	
	//added统计订单信息总数
    public Integer getBespeakOrderCount(BespeakOrderVo bespeakOrderVo){
    	return getBespeakOrderDao().getBespeakOrderCount(bespeakOrderVo);
    }
    
    //added订单信息查询（关联经销商查询）
    public List<BespeakOrderPo> queryBespeakOrderByPage(BespeakOrderVo bespeakOrderVo,PageEntity page){
    	return getBespeakOrderDao().queryBespeakOrderByPage(bespeakOrderVo, page);
    }

    //added获取来源列表
    public List<String> querySourceList(){
    	return getBespeakOrderDao().querySourceList();
    }
    
    //added填充城市名称
    @Override
    public void fillCityName(List<BespeakOrderPo> list){
    	if(list == null || list.size() <= 0){
    		return;
    	}
    	List<Long> cityIdList = new ArrayList<Long>();
    	for(BespeakOrderPo app : list){
    		if(app.getCityId() != null){
    			cityIdList.add(app.getCityId());
    		}
    	}
    	if(cityIdList.size() > 0){
    		List<City> cityList = cityDao.getCityListByIds(cityIdList);
    		if(cityList != null && cityList.size() > 0){
    			for(BespeakOrderPo app : list){
    	    		if(app.getCityId() != null){
    	    			for(City city : cityList){
    	    				if(app.getCityId().equals(city.getId())){
    	    					app.setCityName(city.getName());
    	    					break;
    	    				}
    	    			}
    	    		}
    	    	}
    		}
    	}  	
    }
}