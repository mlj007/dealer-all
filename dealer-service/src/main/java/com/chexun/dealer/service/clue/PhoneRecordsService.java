package com.chexun.dealer.service.clue;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.PhoneRecords;
import com.chexun.dealer.model.common.City;
import com.chexun.dealer.model.common.Province;
import com.chexun.dealer.service.clue.base.PhoneRecordsBaseService;
/**
 * PhoneRecords管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface PhoneRecordsService extends PhoneRecordsBaseService{

    /**
     * 手动service
     */
	public List<PhoneRecords> selectPhoneRecordsPage(PhoneRecords phoneRecords,PageEntity page);
	public List<Province> selectProvince();
	public List<City> selectCityById(Long provinceid);
}