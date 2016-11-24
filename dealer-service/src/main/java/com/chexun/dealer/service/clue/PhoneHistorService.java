package com.chexun.dealer.service.clue;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.clue.PhoneHistor;
import com.chexun.dealer.service.clue.base.PhoneHistorBaseService;
/**
 * PhoneHistor管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface PhoneHistorService extends PhoneHistorBaseService{

   /**
    * 手动service
    */
	public List<PhoneHistor> selectPhoneHistorPage(PhoneHistor phoneHistor,PageEntity page);
}