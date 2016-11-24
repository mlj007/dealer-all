package com.chexun.carinfo.mongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.carinfo.mongo.bean.CarBrandMongo;
import com.chexun.carinfo.mongo.bean.CarCompanyMongo;
import com.chexun.carinfo.mongo.bean.CarModelMongo;
import com.chexun.carinfo.mongo.bean.CarSeriesMongo;
import com.chexun.carinfo.mongo.dao.ICarBrandMongoDao;
import com.chexun.carinfo.mongo.dao.ICarCompanyMongoDao;
import com.chexun.carinfo.mongo.dao.ICarModelMongoDao;
import com.chexun.carinfo.mongo.dao.ICarSeriesMongoDao;
import com.chexun.carinfo.mongo.service.CarInfoService;

@Service("carInfoService")
public class CarInfoServiceImpl implements CarInfoService {
		
	@Autowired
	private ICarBrandMongoDao carBrandMongoDao;
	@Autowired
	private ICarSeriesMongoDao carSeriesMongoDao;
	@Autowired
	private ICarModelMongoDao carModelMongoDao;
	@Autowired
	private ICarCompanyMongoDao carCompanyMongoDao;
	
	@Override
	public CarBrandMongo getBrandById(Integer brandId) {
		return carBrandMongoDao.get(brandId);
	}
	
	@Override
	public CarSeriesMongo getSeriesById(Integer seriesId) {
		return carSeriesMongoDao.get(seriesId);
	}
	
	@Override
	public CarModelMongo getModelById(Integer modelId) {
		return carModelMongoDao.get(modelId);
	}

	@Override
	public CarCompanyMongo getCompanyById(Integer companyId) {
		return carCompanyMongoDao.get(companyId);
	}
}
