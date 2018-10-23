package com.platform.configure.base;

import java.io.Serializable;
import java.util.Date;


/**
 * 实体 基类 用于审计字段
 * @ClassName: BaseEntity   
 * @Description: 实体 基类 用于审计字段 
 * @author: kangjin.zhao@accenture  
 * @date:2018年9月3日 下午4:47:21
 */
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 5158632798194822012L;
	private Date createdDate;
	private Date lastUpdatedDate;
	private String createdBy;
	private String lastUpdatedBy;
	//用于标记当前记录的删除类型，D表示硬删除是物理删除；软删除是指删除标记为Y的；非软删除是指删除标记为N的；
	private DeletedType deletedType;
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public DeletedType getDeletedType() {
		return deletedType;
	}
	public void setDeletedType(DeletedType deletedType) {
		this.deletedType = deletedType;
	}
}
