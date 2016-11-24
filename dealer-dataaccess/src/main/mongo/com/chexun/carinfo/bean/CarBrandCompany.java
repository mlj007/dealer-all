 /**     
   * @create.date: 2012-3-6 上午11:37:24
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.bean 
   */ 
package com.chexun.carinfo.bean;

import java.io.Serializable;

 /**  
 * @create.date: 2012-3-6 上午11:37:24     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-6 上午11:37:24
 */
public class CarBrandCompany implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private CarBrand brand;
	private CarCompany company;
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
	public CarBrand getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
	/**
	 * @return the company
	 */
	public CarCompany getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(CarCompany company) {
		this.company = company;
	}
}
