 /**     
   */ 
package com.chexun.carinfo.mongo.service;

import com.chexun.carinfo.mongo.bean.CarBrandMongo;
import com.chexun.carinfo.mongo.bean.CarCompanyMongo;
import com.chexun.carinfo.mongo.bean.CarModelMongo;
import com.chexun.carinfo.mongo.bean.CarSeriesMongo;

public interface CarInfoService {

	/**
	 * 根据车型ID查询车系数据
	 * 
	 */
	CarModelMongo getModelById(Integer modelId);
	/**
	 * 根据车系ID查询车系数据
	 * 
	 */
	CarSeriesMongo getSeriesById(Integer seriesId);
	/**
	 * 根据品牌ID查询品牌数据
	 * 
	 */	
	CarBrandMongo getBrandById(Integer brandId);
	/**
	 * 根据厂商ID查询厂商数据
	 * 
	 */
	CarCompanyMongo getCompanyById(Integer companyId);

}
