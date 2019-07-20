package com.bridgelabz.inventory;

import java.util.ArrayList;



public class InventoryModel {

	private String inventory;
	private ArrayList<InventoryModel> listofinventories = new ArrayList<InventoryModel>();
	private String name;
	private double weight, price;
	
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getInventory() {
		return inventory;
	}

	public void setListofinventories(ArrayList<InventoryModel> listofinventories) {
		this.listofinventories = listofinventories;
	}

	public ArrayList<InventoryModel> getListofinventories() {
		return listofinventories;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
