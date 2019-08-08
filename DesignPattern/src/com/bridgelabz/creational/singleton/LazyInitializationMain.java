package com.bridgelabz.creational.singleton;

public class LazyInitializationMain {

	public static void main(String[] args) {
		
		LazyInitialization instance=LazyInitialization.getInstance();
		System.out.println(instance);

	}

}
