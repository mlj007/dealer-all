 /**     
   * @create.date: 2012-4-1 下午05:03:58
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo.bean 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-4-1 下午05:03:58     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-4-1 下午05:03:58
 */
public class TreeMongo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "tree";
	
	@AnnotationMongoKey
	private Integer id;
	private String firstPicLetter;
	private String picLetter;
	private String picTree;
	/**
	 * @return the picLetter
	 */
	public String getPicLetter() {
		return picLetter;
	}
	/**
	 * @param picLetter the picLetter to set
	 */
	public void setPicLetter(String picLetter) {
		this.picLetter = picLetter;
	}
	/**
	 * @return the picTree
	 */
	public String getPicTree() {
		return picTree;
	}
	/**
	 * @param picTree the picTree to set
	 */
	public void setPicTree(String picTree) {
		this.picTree = picTree;
	}
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
	 * @return the firstPicLetter
	 */
	public String getFirstPicLetter() {
		return firstPicLetter;
	}
	/**
	 * @param firstPicLetter the firstPicLetter to set
	 */
	public void setFirstPicLetter(String firstPicLetter) {
		this.firstPicLetter = firstPicLetter;
	}
}
