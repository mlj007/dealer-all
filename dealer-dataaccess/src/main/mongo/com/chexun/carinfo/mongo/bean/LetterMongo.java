 /**     
   * @create.date: 2012-4-1 下午03:01:45
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.List;

 /**  
 * @create.date: 2012-4-1 下午03:01:45     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-1 下午03:01:45
 */
public class LetterMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String letter;
	private List<?> brandList;
	/**
	 * @return the letter
	 */
	public String getLetter() {
		return letter;
	}
	/**
	 * @param letter the letter to set
	 */
	public void setLetter(String letter) {
		this.letter = letter;
	}
	/**
	 * @return the brandList
	 */
	public List<?> getBrandList() {
		return brandList;
	}
	/**
	 * @param brandList the brandList to set
	 */
	public void setBrandList(List<?> brandList) {
		this.brandList = brandList;
	}
	
}
