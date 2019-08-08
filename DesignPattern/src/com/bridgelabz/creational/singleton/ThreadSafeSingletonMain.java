package com.bridgelabz.creational.singleton;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		
		ThreadSafeSingleton instance=ThreadSafeSingleton.getInstance();
		System.out.println(instance);
	
		System.out.println("Double checking output: ");
		
		ThreadSafeSingleton instance1= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(instance1);
	

		
	}

}
