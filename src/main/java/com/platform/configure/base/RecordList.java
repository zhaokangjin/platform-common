package com.platform.configure.base;

import java.io.Serializable;
import java.util.List;

public class RecordList <R> implements Serializable{
	private static final long serialVersionUID = -1301454722105841671L;
	private List<R> deleteList;
	private List<R> updateList;
	private List<R> insertList;
	public List<R> getDeleteList() {
		return deleteList;
	}
	public void setDeleteList(List<R> deleteList) {
		this.deleteList = deleteList;
	}
	public List<R> getUpdateList() {
		return updateList;
	}
	public void setUpdateList(List<R> updateList) {
		this.updateList = updateList;
	}
	public List<R> getInsertList() {
		return insertList;
	}
	public void setInsertList(List<R> insertList) {
		this.insertList = insertList;
	}
}
