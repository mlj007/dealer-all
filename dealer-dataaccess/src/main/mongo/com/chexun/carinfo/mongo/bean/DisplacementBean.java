 /**     
   * @create.date: 2012-4-11 下午06:18:33
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carlib.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.List;


 /**  
 * @create.date: 2012-4-11 下午06:18:33     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carlib.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-11 下午06:18:33
 */
public class DisplacementBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String displacement;
	private List<CarModelMongo> modelList;
	private String isActive;  // 0为 在售 1为停产
	private String dealerEnglishName;
	private String horsePower;
	/**
	 * @return the displacement
	 */
	public String getDisplacement() {
		return displacement;
	}
	/**
	 * @param displacement the displacement to set
	 */
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	/**
	 * @return the modelList
	 */
	public List<CarModelMongo> getModelList() {
		return modelList;
	}
	/**
	 * @param modelList the modelList to set
	 */
	public void setModelList(List<CarModelMongo> modelList) {
		this.modelList = modelList;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public void setDealerEnglishName(String dealerEnglishName) {
		this.dealerEnglishName = dealerEnglishName;
	}
	public String getDealerEnglishName() {
		return dealerEnglishName;
	}
	public String getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}
	
}
