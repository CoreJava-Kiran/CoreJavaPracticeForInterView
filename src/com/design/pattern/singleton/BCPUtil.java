package com.design.pattern.singleton;

public class BCPUtil {
	
	//This is thread safe as we are creating at the class-load time
	private static BCPUtil instance = new BCPUtil();
	
	protected BCPUtil(){
		
	}
	
	public static BCPUtil getInstance(){
		return instance;
	}

}
