package com.platform.configure.base;

import java.util.List;

/**
 * 
 * @author kangjin.zhao@accenture
 *
 * @param <R> Record 数据库表字段和对象之间的映射
 * @param <C> Condition 调用参数
 * @param <I> in or not in 调用参数(in 子查询，可能是字符串，日期，数字等)
 */
public interface BaseService<R, C> {

	public StatusResult<Long> countByExample();

	public StatusResult<Integer> deleteByExample();

	public StatusResult<Integer> insert(R record);

	public StatusResult<Integer> insertSelective(R record);
	
	public StatusResult<List<R>> selectByExample(C condition);
	//支持分页
	public StatusResult<List<R>> selectByExample();

	public StatusResult<Integer> updateByExampleSelective(R record);

	public StatusResult<Integer> updateByExample(R record);

	public StatusResult<Integer> bathcDeleteUpdateOrInsertByExample(List<R> record, C conditon);

	public StatusResult<List<R>> selectRecordsByInList(String fieldName, List<Object> paramList, Integer splitSize);

	public StatusResult<List<R>> selectRecordsByNotInList(String fieldName, List<Object> paramList, Integer splitSize);
	
	public StatusResult<List<R>> selectRecordsByExists(C condition,String subTableName);
}