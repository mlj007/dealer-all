 /**     
   * @create.date: 2012-3-21 上午09:46:24
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午09:46:24     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午09:46:24
 */
public class CarBrandCompanyMongo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_brand_company";
	
	@AnnotationMongoKey
	private Integer id;
	private Integer brand;
	private Integer company;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the brand
	 */
	public Integer getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	/**
	 * @return the company
	 */
	public Integer getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Integer company) {
		this.company = company;
	}
}
