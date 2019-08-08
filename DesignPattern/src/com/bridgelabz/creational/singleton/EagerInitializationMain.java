package com.bridgelabz.creational.singleton;

public class EagerInitializationMain {
	
	public static void main(String[] args) {
		
		EagerInitialization instance=EagerInitialization.getInstance();
		System.out.println(instance);
		
		//EagerInitialization instance=new EagerInitialization(); (private constructor so accessible only within the same class)
		
	}

}
