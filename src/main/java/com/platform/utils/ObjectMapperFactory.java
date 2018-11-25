package com.platform.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * ObjectMapper 对象的建立平均耗时200毫秒，这在一个高并发的系统频繁使用是不可接受的，采用简单工厂可以有效提高系统综合性能
 * @author kangjin.zhao
 *
 */
public class ObjectMapperFactory {
	//can reuse,share globally
	public static ObjectMapper genertorObjectMapper = new ObjectMapper();
/*	public static ObjectMapper genertorObjectMapper() {
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}*/
}
