package com.bridgelabz.inventorymain;

import com.bridgelabz.inventoryimpl.InventoryImpl;

public class InventoryMain {

	public static void main(String[] args) {
		InventoryImpl impl=new InventoryImpl();
		impl.readFile();

	}

}
