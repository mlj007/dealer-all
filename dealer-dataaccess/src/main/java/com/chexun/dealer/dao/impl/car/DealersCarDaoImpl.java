package com.chexun.dealer.dao.impl.car;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.car.DealersCarDao;
import com.chexun.dealer.model.car.DealersCar;
import com.chexun.dealer.po.dealers.DealersCarPo;
import com.chexun.dealer.vo.dealers.DealersCarVo;
/**
 *
 * DealersCar
 * User:
 * Date: 2016-10-08
 */
 @Repository("dealersCarDao")
public class DealersCarDaoImpl extends GenericDaoImpl implements DealersCarDao{

    public Long addDealersCar(DealersCar dealersCar) {
        return this.insert("com.chexun.dealer.model.car.DealersCarMapper.createDealersCar",dealersCar);
    }
	public Long insertDealersCar(DealersCar dealersCar){
		return this.insert("com.chexun.dealer.model.car.DealersCarMapper.insertDealersCar",dealersCar);
	}
    public Long deleteDealersCarById(Long id){
        return this.delete("com.chexun.dealer.model.car.DealersCarMapper.deleteDealersCarById",id);
    }
    public Long deleteDealersCarByObj(DealersCar dealersCar){
        return this.delete("com.chexun.dealer.model.car.DealersCarMapper.deleteDealersCarByObj",dealersCar);
    }
    
	public Long deleteDealersCarByIdList(List<Long > ids){
		return this.delete("com.chexun.dealer.model.car.DealersCarMapper.deleteDealersCarByIdList",ids);
	}
    public Long updateDealersCar(DealersCar dealersCar) {
        return this.update("com.chexun.dealer.model.car.DealersCarMapper.updateDealersCar",dealersCar);
    }
    
    public Long updateDealersCarByObj(DealersCar dealersCar){
    	return this.update("com.chexun.dealer.model.car.DealersCarMapper.updateDealersCarByObj",dealersCar);
    }
    
    public Long updateDealersCarByObjAndConditions(DealersCar s,DealersCar c){
    	Map<String,DealersCar> map = new HashMap<String,DealersCar>();
    	map.put("s",s);
    	map.put("c",c);
    	return this.update("com.chexun.dealer.model.car.DealersCarMapper.updateDealersCarByObjAndConditions",map);
    }
	public void batchUpdateDealersCar(List<DealersCar> records){
		this.update("com.chexun.dealer.model.car.DealersCarMapper.batchUpdateDealersCar",records);
	}
    public DealersCar getDealersCarById(Long id) {
        return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarById",id);
    }
    
    public DealersCar getDealersCarByObj(DealersCar dealersCar) {
        return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarByObj",dealersCar);
    }

    
    public List<DealersCar> getDealersCarListByObj(DealersCar dealersCar){
        return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarListByObj",dealersCar);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<DealersCar> getDealersCarListPage(DealersCar dealersCar,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersCar);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public Integer getDealersCarCountByObj(DealersCar dealersCar){
    	return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarCountByObj", dealersCar);
    }
    
    public List<DealersCar> getDealersCarPage(DealersCar dealersCar,PageEntity page) {
        Integer objectscount = getDealersCarCountByObj(dealersCar);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersCarListPage(dealersCar,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    
    
    
     /**
    *以下为缓存查询用
    */
    public Long getDealersCarIdByObj(DealersCar dealersCar) {
        return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarIdByObj",dealersCar);
    }

    public List<Long> getDealersCarIdList(DealersCar dealersCar) {
        return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarIdList",dealersCar);
    }
    
    public List<Long> getDealersCarIdListByObj(DealersCar dealersCar){
        return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarIdListByObj",dealersCar);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Long> getDealersCarIdListPage(DealersCar dealersCar,Integer offset,Integer limit){
    	try {
			Map map = BeanMapConvertor.convertBean(dealersCar);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getDealersCarIdListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
    }
    public List<Long> getDealersCarIdPage(DealersCar dealersCar,PageEntity page) {
        Integer objectscount = getDealersCarCountByObj(dealersCar);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return getDealersCarIdListPage(dealersCar,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public DealersCarPo getBrandCountAndCarCountByObj(DealersCarVo dealersCarVo) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersCarVo);
			map.put("dealerId",dealersCarVo.getDealerId());
	    	return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getBrandCountAndCarCountByMap",map);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DealersCarPo> getBrandListByObj(DealersCarVo dealersCarVo) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersCarVo);
			map.put("dealerId",dealersCarVo.getDealerId());
        	return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getBrandListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
	}
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DealersCarPo> getSeriesListAndCarCountByObj(DealersCarVo dealersCarVo) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersCarVo);
			map.put("dealerId",dealersCarVo.getDealerId());
			map.put("brandId",dealersCarVo.getBrandId());
        	return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getSeriesListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
	}
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public DealersCarPo getSeriesNameAndCarCountByObj(DealersCarVo dealersCarVo) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersCarVo);
			map.put("dealerId",dealersCarVo.getDealerId());
			map.put("seriesId",dealersCarVo.getSeriesId());
	    	return this.selectOne("com.chexun.dealer.model.car.DealersCarMapper.getSeriesNameAndCarCountByMap",map);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DealersCarPo> getCarListByObj(DealersCarVo dealersCarVo) {
		try {
			Map map = BeanMapConvertor.convertBean(dealersCarVo);
			map.put("dealerId",dealersCarVo.getDealerId());
			map.put("seriesId",dealersCarVo.getSeriesId());
        	return this.selectList("com.chexun.dealer.model.car.DealersCarMapper.getCarListByMap",map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
