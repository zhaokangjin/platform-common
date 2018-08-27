package com.platform.configure.connection;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 系统配置
 * @ClassName: SystemPropertiesConfigure   
 * @Description: 环境变量配置  
 * @author: Administrator  
 * @date:2018年8月23日 上午12:36:59
 */
@Component  
@ConfigurationProperties(prefix="system") 
public class SystemPropertiesConfigure implements Serializable{
	private static final long serialVersionUID = 4170140471320327958L;
	private ConnectionPropertiesConfigure oracleConnection;
    private ConnectionPropertiesConfigure mySqlConnection;
    private ConnectionPropertiesConfigure kafkaConnection;
    private ConnectionPropertiesConfigure redisConnection;
	public ConnectionPropertiesConfigure getOracleConnection() {
		return oracleConnection;
	}
	public void setOracleConnection(ConnectionPropertiesConfigure oracleConnection) {
		this.oracleConnection = oracleConnection;
	}
	public ConnectionPropertiesConfigure getMySqlConnection() {
		return mySqlConnection;
	}
	public void setMySqlConnection(ConnectionPropertiesConfigure mySqlConnection) {
		this.mySqlConnection = mySqlConnection;
	}
	public ConnectionPropertiesConfigure getKafkaConnection() {
		return kafkaConnection;
	}
	public void setKafkaConnection(ConnectionPropertiesConfigure kafkaConnection) {
		this.kafkaConnection = kafkaConnection;
	}
	public ConnectionPropertiesConfigure getRedisConnection() {
		return redisConnection;
	}
	public void setRedisConnection(ConnectionPropertiesConfigure redisConnection) {
		this.redisConnection = redisConnection;
	}
}