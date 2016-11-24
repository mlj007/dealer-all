package com.chexun.common.mongo;

import com.mongodb.DBObject;

public class IndexDBObject {
	
	private DBObject obj;
	private String indexName;
	private boolean unique;
	
	public IndexDBObject(){}
	
	public IndexDBObject(DBObject obj, String indexName, boolean unique) {
		super();
		this.obj = obj;
		this.indexName = indexName;
		this.unique = unique;
	}
	public DBObject getObj() {
		return obj;
	}
	public void setObj(DBObject obj) {
		this.obj = obj;
	}
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public boolean getUnique() {
		return unique;
	}
	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	

}
