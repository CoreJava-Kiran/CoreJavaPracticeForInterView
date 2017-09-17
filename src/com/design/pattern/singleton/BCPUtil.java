package com.design.pattern.singleton;

public class BCPUtil {
	
	private static BCPUtil instance = new BCPUtil();
	
	private BCPUtil(){
		
	}
	
	public static BCPUtil getInstance(){
		return instance;
	}

}
