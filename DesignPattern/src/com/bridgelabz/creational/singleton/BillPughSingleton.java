package com.bridgelabz.creational.singleton;

public class BillPughSingleton {
	
    private BillPughSingleton(){}
    
    //used when multiple threads to get the instance of singleton class simultaneously
    
    private static class SingletonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }
}


