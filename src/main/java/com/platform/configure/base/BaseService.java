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
public interface BaseService<R, C, I> {

	public long countByExample();

	public int deleteByExample();

	public int insert(R record);

	public int insertSelective(R record);
	
	public List<R> selectByExample(C condition);
	//支持分页
	public List<R> selectByExample();

	public int updateByExampleSelective(R record);

	public int updateByExample(R record);

	public int bathcDeleteUpdateOrInsertByExample(R record, C conditon);

	public int bathcDeleteUpdateOrInsertByExample(List<R> record, C conditon);

	public List<R> selectRecordsByInList(String fieldName, List<I> paramList, Integer splitSize);

	public List<R> selectRecordsByNotInList(String fieldName, List<I> paramList);
	
	public List<R> selectRecordsByExists(C condition,String subTableName);
}