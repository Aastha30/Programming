package com.bridgelabz.stockserviceimpl;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.stockservice.StockService;

public class StockServiceImpl implements StockService {

	JSONParser parser = new JSONParser();

	@Override
	public void readFile() {

		try {
			int totalShare = 0;
			double totalPrice = 0.0;
			FileReader fr = new FileReader("StockDetails.json");
			JSONArray array = (JSONArray) parser.parse(fr);
			for (Object obj : array) {
				JSONObject stock = (JSONObject) obj;
				String stockName = (String) stock.get("StockName");
				int numOfShares = ((Number) stock.get("NumOfShares")).intValue();
				Double pricePerShare = (Double) stock.get("PricePerShare");
				System.out.println(stock);

				totalShare += numOfShares;
				totalPrice += numOfShares * pricePerShare;
			}
			System.out.println("Total Share: " + totalShare);
			System.out.println("Total Price: " + totalPrice);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
