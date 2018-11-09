package com.platform.utils;

import java.util.List;

import com.platform.configure.base.enums.MsgLevel;
import com.platform.configure.base.enums.Status;
import com.platform.configure.result.CustomException;

public class ContainUtils {
	public static boolean isContains(String content,String subStr) throws CustomException{
		if(null!=content) {
			return content.contains(subStr);
		}else {
			throw new CustomException("content is null","IT surport",Status.EXCEPTION,MsgLevel.ERROR,new NullPointerException());
		}
		
	}
	public static boolean isContains(List<Object> list,Object object) throws CustomException{
		if(null!=list) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i)==object) {
					return true;
				}
			}
			return false;
		}else {
			throw new CustomException("List<Object> list is null","IT surport",Status.EXCEPTION,MsgLevel.ERROR,new NullPointerException());
		}
	}
	public static boolean isContains(Object[] objects,Object object) throws CustomException{
		if(null!=objects) {
			for(int i=0;i<objects.length;i++) {
				if(objects[i]==object) {
					return true;
				}
			}
			return false;
		}else {
			throw new CustomException("objects is null","IT surport",Status.EXCEPTION,MsgLevel.ERROR,new NullPointerException());
		}
	}
}
