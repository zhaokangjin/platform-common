package com.platform.configure.result;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.platform.configure.base.WordFirstCharChangeUtils;

public class ConditonToExample <C,E> implements Serializable{
	private static final long serialVersionUID = 1L;
	private E examlpe;
	public ConditonToExample(){}
	
	public ConditonToExample(C condition,E examlpe){
		Field[] fields=condition.getClass().getDeclaredFields();
		Method[] methods=condition.getClass().getDeclaredMethods();
		for(int i=0;i<fields.length;i++) {
			Field field=fields[i];
			String upperFieldName=WordFirstCharChangeUtils.toUpperCaseFirstChar(field.getName());
			String lowerFieldName=WordFirstCharChangeUtils.toLowerCaseFirstChar(field.getName());
			Type type=field.getType();
			Type genericReturnType=null;
			for(int j=0;j<methods.length;j++) {
				Method method=methods[j];
				Class<?> returnType=method.getReturnType();
				String methodName=method.getName();
				if(("get"+upperFieldName).equals(methodName)) {
					genericReturnType=method.getGenericReturnType();
				}
			}
			
		}
		

		
		
		
		
		
		
		
		this.examlpe=examlpe;
	}
	public E getExamlpe() {
		return examlpe;
	}
}
