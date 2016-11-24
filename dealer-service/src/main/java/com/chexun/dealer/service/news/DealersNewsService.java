package com.chexun.dealer.service.news;

import java.util.List;

import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.RelevantCarSerices;
import com.chexun.dealer.service.news.base.DealersNewsBaseService;
/**
 * DealersNews管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersNewsService extends  DealersNewsBaseService{
	/**
     * 手动service
     */
    public List<DealersNews> selectDealersNewsPage(DealersNews dealersNews,PageEntity page);
    public Long updateDealersNewsById(DealersNews dealersNews);
    public DealersNews selectDealersNewsById(int id);
    public List<RelevantCarSerices> selectSeriesById(Long dealerId);
    public RelevantCarSerices selectSeriesById2(RelevantCarSerices relevantCarSerices);
}