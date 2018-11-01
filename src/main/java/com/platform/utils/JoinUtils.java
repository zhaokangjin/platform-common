package com.platform.utils;

import java.util.List;

public class JoinUtils {
	public static String join(String[] arr,String joinChar) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(joinChar);
			}
		}
		return sb.toString();
	}
	public static String join(String arr,String split,String joinChar) {
		StringBuilder sb=new StringBuilder();
		String[] arrs=arr.split("\\"+split);
		for(int i=0;i<arrs.length;i++) {
			if(i==arrs.length-1) {
				sb.append(arrs[i]);
			}else {
				sb.append(arrs[i]).append(joinChar);
			}
		}
		return sb.toString();
	}
	public static String join(List<String> list,String joinChar) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				sb.append(list.get(i));
			}else {
				sb.append(list.get(i)).append(joinChar);
			}
		}
		return sb.toString();
	}
}
