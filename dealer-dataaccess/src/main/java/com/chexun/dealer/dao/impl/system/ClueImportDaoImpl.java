package com.chexun.dealer.dao.impl.system;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chexun.base.common.util.BeanMapConvertor;
import com.chexun.base.framework.core.dao.impl.common.GenericDaoImpl;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.dao.system.ClueImportDao;
import com.chexun.dealer.model.system.XianSuoRecord;
@Repository("clueImportDao")
public class ClueImportDaoImpl extends GenericDaoImpl implements ClueImportDao {

	@Override
	public List<XianSuoRecord> selectXianSuoRecordByPage(XianSuoRecord xianSuoRecord, PageEntity page) {
		Integer objectscount = selectXianSuoRecordCountByObj(xianSuoRecord);
        if (objectscount == null || objectscount == 0) {
            page.setTotalResultSize(0);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return null;
        } else {
            page.setTotalResultSize(objectscount);
            int totalPageSize = (page.getTotalResultSize() - 1) / page.getPageSize() + 1;
            page.setTotalPageSize(totalPageSize);
            return selectXianSuoRecordListPage(xianSuoRecord,(page.getCurrentPage() - 1) * page.getPageSize(),page.getPageSize());
        }
	}

	@Override
	public Integer selectXianSuoRecordCountByObj(XianSuoRecord xianSuoRecord) {
		return this.selectOne("com.chexun.dealer.model.system.XianSuoRecordMapper.selectXianSuoRecordCountByObj", xianSuoRecord);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<XianSuoRecord> selectXianSuoRecordListPage(XianSuoRecord xianSuoRecord, Integer offset, Integer limit) {
		try {
			Map map = BeanMapConvertor.convertBean(xianSuoRecord);
			map.put("offset",offset);
    		map.put("limit",limit);
        	return this.selectList("com.chexun.dealer.model.system.XianSuoRecordMapper.selectXianSuoRecordListPage",map);
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
