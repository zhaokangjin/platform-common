package com.platform.configure.result;

import java.io.Serializable;

public class ConditonToExample <C,E> implements Serializable{
	private static final long serialVersionUID = 1L;
	private E examlpe;
	public ConditonToExample(){}
	
	public ConditonToExample(C condition,E examlpe){
		this.examlpe=examlpe;
	}
	public E setConditionValueToExamlpe(C condition,E examlpe) {
		
		return examlpe;
	}
	public E getExamlpe() {
		return examlpe;
	}
}
