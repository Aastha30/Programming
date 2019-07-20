package com.bridgelabz.inventoryimpl;

import java.io.FileReader;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.inventory.InventoryModel;

public class InventoryImpl {

	
	JSONParser parser = new JSONParser();
	

	/*
	 * public void readFile() { try { FileReader fr = new FileReader(
	 * "/home/admin1/Desktop/Bridgelabz/Inventory Data Management/src/InventoryDetails.json"
	 * ); ObjectMapper objectMapper=new ObjectMapper();
	 * objectMapper.readValue(fr,InventoryModel.class); List<listofinventories> list
	 * = objectMapper.readValue(fr ,new TypeReference<List<listofinventories>>(){});
	 * } }
	 */

	public void readFile() {
		try {
			FileReader fr = new FileReader(
					"/home/admin1/Desktop/Bridgelabz/Inventory Data Management/src/InventoryDetails.json");
			JSONArray array = (JSONArray) parser.parse(fr);
			
			for (Object obj : array) {
				double totalWeight=0.0;
				double totalPrice=0.0;
				JSONObject details = (JSONObject) obj;

				String inventory = (String) details.get("inventory");
				JSONArray listofinventories = (JSONArray) details.get("listofinventories");
				System.out.println(inventory);
				for (Object obj1 : listofinventories) {
					JSONObject details1 = (JSONObject) obj1;
					String name = (String) details1.get("name");
					Double weight = (Double) details1.get("weight");
					Double price = (Double) details1.get("price");
					totalWeight+=weight;
					totalPrice+=weight*price;
					System.out.println(details1);
					
				}
				System.out.println("Total Weight of "+inventory+": "+totalWeight);
				System.out.println("Total Price of "+inventory+": "+totalPrice);
			}

			// InventoryModel model = gson.fromJson(fr, InventoryModel.class);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
