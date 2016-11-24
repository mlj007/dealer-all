package com.chexun.common.mongo;

import javax.net.SocketFactory;

import com.mongodb.DBDecoderFactory;
import com.mongodb.MongoOptions;

/**
 * Mongo配置类
 * 
 * @author vincent.he
 * @version 1.0, Created on 2012-3-12
 * 
 */
public class ChexunMongoOptions extends MongoOptions{
	private String username;
	private String password;
	private String dbname;
	
	public ChexunMongoOptions(){
		super();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setConnectionsPerHost(int connectionsPerHost) {
		this.connectionsPerHost = connectionsPerHost;
	}

	public void setThreadsAllowedToBlockForConnectionMultiplier(
			int threadsAllowedToBlockForConnectionMultiplier) {
		this.threadsAllowedToBlockForConnectionMultiplier = threadsAllowedToBlockForConnectionMultiplier;
	}

	public void setMaxWaitTime(int maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	public void setSocketKeepAlive(boolean socketKeepAlive) {
		this.socketKeepAlive = socketKeepAlive;
	}

	public void setAutoConnectRetry(boolean autoConnectRetry) {
		this.autoConnectRetry = autoConnectRetry;
	}

	public void setMaxAutoConnectRetryTime(long maxAutoConnectRetryTime) {
		this.maxAutoConnectRetryTime = maxAutoConnectRetryTime;
	}

	public void setSlaveOk(boolean slaveOk) {
		this.slaveOk = slaveOk;
	}

	public void setDbDecoderFactory(DBDecoderFactory dbDecoderFactory) {
		this.dbDecoderFactory = dbDecoderFactory;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setWtimeout(int wtimeout) {
		this.wtimeout = wtimeout;
	}

	public void setFsync(boolean fsync) {
		this.fsync = fsync;
	}

	public void setJ(boolean j) {
		this.j = j;
	}

	public void setSocketFactory(SocketFactory socketFactory) {
		this.socketFactory = socketFactory;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
}
