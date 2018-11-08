package com.platform.configure.base.enums;
/**
 * 
 * @author kangjin.zhao
 */
public enum DeletedType {
	//删除枚举  D 表示物理删除 Y 表示软删除  N 表示非软删除
	HARD_DELETE("D"), SOFT_DELETE_YES("Y"), SOFT_DELETE_NO("N");
	
	private DeletedType(String delteType) {
		this.deleteFlag=delteType;
	}

	private String deleteFlag;

	public String getDeleteFlag() {
		return deleteFlag;
	}

}
