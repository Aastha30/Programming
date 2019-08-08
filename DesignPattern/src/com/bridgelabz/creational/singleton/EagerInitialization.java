package com.bridgelabz.creational.singleton;

public class EagerInitialization {
	
//	drawback: instance is created even though it is not called by client application
//			  no scope of exception handling
	
	private EagerInitialization() {
		
	}
	private static final EagerInitialization instance=new EagerInitialization();
	
	public static EagerInitialization getInstance()
	{
		return instance;
	}

}
