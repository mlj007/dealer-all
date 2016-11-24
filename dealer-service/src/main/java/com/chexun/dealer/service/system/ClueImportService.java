package com.chexun.dealer.service.system;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.system.XianSuoRecord;

public interface ClueImportService {
	public List<XianSuoRecord> selectXianSuoRecordByPage(XianSuoRecord xianSuoRecord,PageEntity page);
}
