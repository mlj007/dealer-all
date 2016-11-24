package com.chexun.carinfo.mongo.bean;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2013-02-28 上午10:16:47     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo.bean
 * @author: jp	
 * @modify.by: jp
 * @modify.date: 2013-02-28 上午10:16:47
 */
public class CarDisassemblyMongo implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_disassembly";
	
	@AnnotationMongoKey
	private Integer id; //编号
	private Integer termId; //
	private String name; //品牌名称
	private String cmsSubjectId ;
	private String cmsSubjectUrl ;
	private String carModelBind ;
	private String status ;
	private Date createTime ;
	private String dataUrl ;//数据页url
	
	private String headerImg ;//头图
	private String headerCover ;//封面图
	private String focusContent ;//焦点图代码
	private String headContent ;//头条
	private String listContent ;//列表
	
	private Integer editorViewAuthor1 ;
	private String editorView1 ;
	private Integer editorViewAuthor2 ;
	private String editorView2 ;
	
	private String noticeUrl ;
	public String getDataUrl() {
		return dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTermId() {
		return termId;
	}
	public void setTermId(Integer termId) {
		this.termId = termId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmsSubjectId() {
		return cmsSubjectId;
	}
	public void setCmsSubjectId(String cmsSubjectId) {
		this.cmsSubjectId = cmsSubjectId;
	}
	public String getCmsSubjectUrl() {
		return cmsSubjectUrl;
	}
	public void setCmsSubjectUrl(String cmsSubjectUrl) {
		this.cmsSubjectUrl = cmsSubjectUrl;
	}
	public String getCarModelBind() {
		return carModelBind;
	}
	public void setCarModelBind(String carModelBind) {
		this.carModelBind = carModelBind;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNoticeUrl() {
		return noticeUrl;
	}
	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}
	public String getHeaderImg() {
		return headerImg;
	}
	public void setHeaderImg(String headerImg) {
		this.headerImg = headerImg;
	}
	public String getHeaderCover() {
		return headerCover;
	}
	public void setHeaderCover(String headerCover) {
		this.headerCover = headerCover;
	}
	public String getFocusContent() {
		return focusContent;
	}
	public void setFocusContent(String focusContent) {
		this.focusContent = focusContent;
	}
	public String getHeadContent() {
		return headContent;
	}
	public void setHeadContent(String headContent) {
		this.headContent = headContent;
	}
	public String getListContent() {
		return listContent;
	}
	public void setListContent(String listContent) {
		this.listContent = listContent;
	}
	public Integer getEditorViewAuthor1() {
		return editorViewAuthor1;
	}
	public void setEditorViewAuthor1(Integer editorViewAuthor1) {
		this.editorViewAuthor1 = editorViewAuthor1;
	}
	public String getEditorView1() {
		return editorView1;
	}
	public void setEditorView1(String editorView1) {
		this.editorView1 = editorView1;
	}
	public Integer getEditorViewAuthor2() {
		return editorViewAuthor2;
	}
	public void setEditorViewAuthor2(Integer editorViewAuthor2) {
		this.editorViewAuthor2 = editorViewAuthor2;
	}
	public String getEditorView2() {
		return editorView2;
	}
	public void setEditorView2(String editorView2) {
		this.editorView2 = editorView2;
	}
}
