package com.bridgelabz.creational.singleton;

public class StaticBlockInitialization {

	private StaticBlockInitialization() {

	}

	private static StaticBlockInitialization instance;

//	drawback: instance is created even though it is not called by client application
//	  advantage: scope of exception handling	
	
	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			System.out.println("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
