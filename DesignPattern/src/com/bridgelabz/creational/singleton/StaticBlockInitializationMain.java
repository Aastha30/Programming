package com.bridgelabz.creational.singleton;

public class StaticBlockInitializationMain {
	
	public static void main(String[] args) {
		
		StaticBlockInitialization instance=StaticBlockInitialization.getInstance();
		System.out.println(instance);
		
		//StaticBlockInitialization instance = new StaticBlockInitialization(); (private constructor so accessible only within the same class)
		
	}
	
	
	

}
