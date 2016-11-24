package com.chexun.dealer.service.clue.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.common.CityDao;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.po.clue.AskingPricePo;
import com.chexun.dealer.service.clue.AskingPriceService;
import com.chexun.dealer.service.clue.base.impl.AskingPriceBaseServiceImpl;
import com.chexun.dealer.vo.clue.AskingPriceVo;
/**
 * AskingPrice管理接口
 * User: 
 * Date: 2016-09-23
 */
@Service("askingPriceService")
public class AskingPriceServiceImpl extends AskingPriceBaseServiceImpl implements AskingPriceService{
	
	@Autowired
	private CityDao cityDao;
	
	//added统计询价信息总数
    @Override
    public Integer getAskingPriceCount(AskingPriceVo askingPriceVo){
    	return super.getAskingPriceDao().getAskingPriceCount(askingPriceVo);
    }
    
    //added询价信息查询（关联经销商查询）
    @Override
    public List<AskingPricePo> queryAskingPriceByPage(AskingPriceVo askingPriceVo,PageEntity page){
    	return super.getAskingPriceDao().queryAskingPriceByPage(askingPriceVo, page);
    }
    
    //added填充城市名称
    @Override
    public void fillCityName(List<AskingPricePo> list){
    	if(list == null || list.size() <= 0){
    		return;
    	}
    	List<Long> cityIdList = new ArrayList<Long>();
    	for(AskingPricePo app : list){
    		if(app.getCityid() != null){
    			cityIdList.add(app.getCityid());
    		}
    	}
    	if(cityIdList.size() > 0){
    		List<City> cityList = cityDao.getCityListByIds(cityIdList);
    		if(cityList != null && cityList.size() > 0){
    			for(AskingPricePo app : list){
    	    		if(app.getCityid() != null){
    	    			for(City city : cityList){
    	    				if(app.getCityid().equals(city.getId())){
    	    					app.setCityName(city.getName());
    	    					break;
    	    				}
    	    			}
    	    		}
    	    	}
    		}
    	}  	
    }
    
    //added获取来源列表
    @Override
    public List<String> querySourceList(){
    	return getAskingPriceDao().querySourceList();
    }
}