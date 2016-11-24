package com.chexun.dealer.dao.system;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.system.XianSuoRecord;

public interface ClueImportDao {
	public Integer selectXianSuoRecordCountByObj(XianSuoRecord xianSuoRecord);
	public List<XianSuoRecord> selectXianSuoRecordByPage(XianSuoRecord xianSuoRecord,PageEntity page);
	public List<XianSuoRecord> selectXianSuoRecordListPage(XianSuoRecord xianSuoRecord,Integer offset,Integer limit);
}
