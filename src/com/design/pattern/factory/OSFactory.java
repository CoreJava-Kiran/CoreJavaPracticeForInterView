package com.design.pattern.factory;

public class OSFactory {
	
	public OS getInstance(String osName){
		if (osName.equalsIgnoreCase("Android")){
			return new Android();
		}else if (osName.equalsIgnoreCase("IOS")) {
			return new IOS();
		}
		return null;
	}

}
