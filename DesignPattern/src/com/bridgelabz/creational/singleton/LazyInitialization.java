package com.bridgelabz.creational.singleton;

public class LazyInitialization {
	
	private LazyInitialization()
	{
		
	}
	
//this is used in case of single-threaded environment 
	
	private static LazyInitialization instance;
	
	public static LazyInitialization getInstance()
	{
		if(instance==null)
			instance=new LazyInitialization();
	
		return instance;
		
	}
	
}
