package com.platform.configure.base;

import java.util.List;

import com.platform.configure.base.annotation.LockRisk;
import com.platform.configure.result.ResultStatus;

/**
 * 
 * @author kangjin.zhao
 * @param <R> Record 数据库表字段和对象之间的映射
 * @param <C> Condition 调用参数
 */
public interface BaseService<R, C> {

	public ResultStatus<Long> countByExample();
	
	@LockRisk
	public ResultStatus<Integer> deleteByExample();

	@LockRisk
	public ResultStatus<Integer> insert(R record);

	@LockRisk
	public ResultStatus<Integer> insertSelective(R record);
	
	public ResultStatus<List<R>> selectByExample(C condition);
	//支持分页
	public ResultStatus<List<R>> selectByExample();

	@LockRisk
	public ResultStatus<Integer> updateByExampleSelective(R record);

	@LockRisk
	public ResultStatus<Integer> updateByExample(R record);

	@LockRisk
	public ResultStatus<Integer> bathcDeleteUpdateOrInsertByExample(List<R> record, C conditon);

	public ResultStatus<List<R>> selectRecordsByInList(String fieldName, List<Object> paramListIn, Integer splitSize,C conditon);

	public ResultStatus<List<R>> selectRecordsByNotInList(String fieldName, List<Object> paramListNotIn, Integer splitSize,C conditon);
	
	public ResultStatus<List<R>> selectRecordsByExists(C condition,String subTableName);
}