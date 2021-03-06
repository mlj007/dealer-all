package com.chexun.dealer.dao.news;
import java.util.List;

import com.chexun.dealer.model.news.DealersNews;
import com.chexun.dealer.model.news.DealersNoticeCheap;
import com.chexun.dealer.model.news.RelevantCarSerices;
import com.chexun.base.framework.core.entity.PageEntity;
/**
 * DealersNews管理接口
 * User: 
 * Date: 2016-09-23
 */
public interface DealersNewsDao {

    /**
     * 添加DealersNews
     * @param dealersNews 要添加的DealersNews
     * @return id
     */
    public Long addDealersNews(DealersNews dealersNews);
	public Long insertDealersNews(DealersNews dealersNews);
    /**
     * 根据id删除一个DealersNews
     * @param id 要删除的id
     */
    public Long deleteDealersNewsById(Long id);
    
    public Long deleteDealersNewsByObj(DealersNews dealersNews);

	public Long deleteDealersNewsByIdList(List<Long > ids);

    /**
     * 修改DealersNews
     * @param dealersNews 要修改的DealersNews
     */
    public Long updateDealersNews(DealersNews dealersNews);
    
    public Long updateDealersNewsByObj(DealersNews dealersNews);
    
    public Long updateDealersNewsByObjAndConditions(DealersNews s,DealersNews c);
    public void batchUpdateDealersNews(List<DealersNews> records);

    /**
     * 根据id获取单个DealersNews对象
     * @param id 要查询的id
     * @return DealersNews
     */
    public DealersNews getDealersNewsById(Long id);
	public DealersNews getDealersNewsByObj(DealersNews dealersNews);
    /**
     * 根据条件获取DealersNews列表
     * @param dealersNews 查询条件
     * @return List<DealersNews>
     */
    public List<DealersNews> getDealersNewsListByObj(DealersNews dealersNews);
    public List<DealersNews> getDealersNewsListPage(DealersNews dealersNews,Integer offset,Integer limit);
    public Integer getDealersNewsCountByObj(DealersNews dealersNews);
    public List<DealersNews> getDealersNewsPage(DealersNews dealersNews,PageEntity page);
    
    /**
    *以下为缓存查询用
    */
    public Long getDealersNewsIdByObj(DealersNews dealersNews);
    /**
     * 根据条件获取DealersNews列表
     * @param dealersNews 查询条件
     * @return List<DealersNews>
     */
    public List<Long> getDealersNewsIdList(DealersNews dealersNews);
    public List<Long> getDealersNewsIdListByObj(DealersNews dealersNews);
    public List<Long> getDealersNewsIdListPage(DealersNews dealersNews,Integer offset,Integer limit);
    public List<Long> getDealersNewsIdPage(DealersNews dealersNews,PageEntity page);
    
    
    /**
     * 手写DAO
     */
    public Integer selectDealersNewsCountByObj(DealersNews dealersNews);
    public List<DealersNews> selectDealersNewsPage(DealersNews dealersNews,PageEntity page);
    public List<DealersNews> selectDealersNewsListPage(DealersNews dealersNews,Integer offset,Integer limit);
    public Long updateDealersNewsById(DealersNews dealersNews);
    public DealersNews selectDealersNewsById(int id);
    public List<RelevantCarSerices> selectSeriesById(Long id);
    public RelevantCarSerices selectSeriesById2(RelevantCarSerices relevantCarSerices);
	public DealersNoticeCheap selectDealersNoticeCheapByObj(DealersNoticeCheap dealersNoticeCheap);
}