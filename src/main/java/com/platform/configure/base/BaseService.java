package com.platform.configure.base;

import java.util.List;

import com.platform.configure.base.annotation.LockRisk;

/**
 * 
 * @author kangjin.zhao
 * @param <R> Record 数据库表字段和对象之间的映射
 * @param <C> Condition 调用参数
 */
public interface BaseService<R, C> {

	public StatusResult<Long> countByExample();
	
	@LockRisk
	public StatusResult<Integer> deleteByExample();

	@LockRisk
	public StatusResult<Integer> insert(R record);

	@LockRisk
	public StatusResult<Integer> insertSelective(R record);
	
	public StatusResult<List<R>> selectByExample(C condition);
	//支持分页
	public StatusResult<List<R>> selectByExample();

	@LockRisk
	public StatusResult<Integer> updateByExampleSelective(R record);

	@LockRisk
	public StatusResult<Integer> updateByExample(R record);

	@LockRisk
	public StatusResult<Integer> bathcDeleteUpdateOrInsertByExample(List<R> record, C conditon);

	public StatusResult<List<R>> selectRecordsByInList(String fieldName, List<Object> paramListIn, Integer splitSize,C conditon);

	public StatusResult<List<R>> selectRecordsByNotInList(String fieldName, List<Object> paramListNotIn, Integer splitSize,C conditon);
	
	public StatusResult<List<R>> selectRecordsByExists(C condition,String subTableName);
}