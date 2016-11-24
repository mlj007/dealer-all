package com.chexun.dealer.service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.system.ClueImportDao;
import com.chexun.dealer.model.system.XianSuoRecord;
import com.chexun.dealer.service.system.ClueImportService;

@Service("clueImportService")
public class ClueImportServiceImpl implements ClueImportService {
	@Autowired
	private ClueImportDao clueImportDao;
	
	@Override
	public List<XianSuoRecord> selectXianSuoRecordByPage(XianSuoRecord xianSuoRecord, PageEntity page) {
		return clueImportDao.selectXianSuoRecordByPage(xianSuoRecord, page);
	}

}
