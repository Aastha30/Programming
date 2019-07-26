package com.bridgelabz.stock.main;

import com.bridgelabz.stockserviceimpl.StockServiceImpl;

public class StockMain {

	public static void main(String[] args) {
		
		StockServiceImpl impl=new StockServiceImpl();
		impl.readFile();

	}

}
