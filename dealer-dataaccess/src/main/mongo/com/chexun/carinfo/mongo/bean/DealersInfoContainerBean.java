package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 包装经销商信息
 * */
public class DealersInfoContainerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private double minPriceSection ;
	private double maxPriceSection ;
	private List<DealersBean> recommendDealersList ;
	private List<DealersBean> recommendDealersList_1 ;
	public DealersInfoContainerBean(){
		
	}
	public DealersInfoContainerBean(double minPriceSection,double maxPriceSection,List<DealersBean> recommendDealersList,List<DealersBean> recommendDealersList_1){
		this.minPriceSection = 0 ;
		this.maxPriceSection = 0 ;
		this.recommendDealersList = recommendDealersList ;
		this.recommendDealersList_1 = recommendDealersList_1 ;
	}
	/**
	 * @return the minPriceSection
	 */
	public double getMinPriceSection() {
		return minPriceSection;
	}
	/**
	 * @return the maxPriceSection
	 */
	public double getMaxPriceSection() {
		return maxPriceSection;
	}
	/**
	 * @return the recommendDealersList
	 */
	public List<DealersBean> getRecommendDealersList() {
		return recommendDealersList;
	}
	/**
	 * @return the recommendDealersList_1
	 */
	public List<DealersBean> getRecommendDealersList_1() {
		return recommendDealersList_1;
	}
	/**
	 * @param minPriceSection the minPriceSection to set
	 */
	public void setMinPriceSection(double minPriceSection) {
		this.minPriceSection = minPriceSection;
	}
	/**
	 * @param maxPriceSection the maxPriceSection to set
	 */
	public void setMaxPriceSection(double maxPriceSection) {
		this.maxPriceSection = maxPriceSection;
	}
	/**
	 * @param recommendDealersList the recommendDealersList to set
	 */
	public void setRecommendDealersList(List<DealersBean> recommendDealersList) {
		this.recommendDealersList = recommendDealersList;
	}
	/**
	 * @param recommendDealersList_1 the recommendDealersList_1 to set
	 */
	public void setRecommendDealersList_1(List<DealersBean> recommendDealersList_1) {
		this.recommendDealersList_1 = recommendDealersList_1;
	}
}
