package com.bridgelabz.commercial.serviceimpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.commercial.model.CommercialModel;
import com.bridgelabz.commercial.service.StockService;
import com.bridgelabz.practice.UnorderedList;
import com.bridgelabz.practice.UnorderedList.Node;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockAccount implements StockService {

	UnorderedList<CommercialModel> list = new UnorderedList<>();
	ArrayList<CommercialModel> arrayList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	JSONParser parser = new JSONParser();

	public StockAccount(String fileName) {
		try {

			FileReader fr = new FileReader(fileName);
			JSONArray array = (JSONArray) parser.parse(fr);

			for (Object obj : array) {
				CommercialModel stocker = new CommercialModel();
				JSONObject stockData = (JSONObject) obj;
				stocker.setStockName((String) stockData.get("stockName"));
				stocker.setNumOfShares(((Number) stockData.get("numOfShares")).intValue());
				stocker.setSharePrice((Double) stockData.get("sharePrice"));
				list.insert(list, stocker);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public double valueOf() {

		Node<CommercialModel> temp = list.head;
		double totalValue = 0.0;

		while (temp != null) {
			String stockName = temp.data.getStockName();
			int numOfShares = temp.data.getNumOfShares();
			double sharePrice = temp.data.getSharePrice();
			System.out.println("Share Price of " + stockName + " - " + numOfShares * sharePrice);
			totalValue += (numOfShares * sharePrice);
			temp = temp.next;
		}
		System.out.println("Total value of Account: " + totalValue);

		return totalValue;
	}

	@Override
	public void buy(int numOfShares, String stockName) {
		
		Node<CommercialModel> temp=list.head;
		boolean found=false;
		
		while(temp!=null)
		{
		
		if(temp.data.getStockName().equalsIgnoreCase(stockName))
		{
			temp.data.setNumOfShares(temp.data.getNumOfShares()+ numOfShares);
			System.out.println("Shares added successfully to "+stockName);
			found=true;
			break;
		}
		else
		{
		temp=temp.next;
		}
		}
		if(!found)
		{
		System.out.println("This stock is not present.");
		System.out.println("Let's add it.");
		CommercialModel stocker=new CommercialModel();
		stocker.setStockName(stockName);
		stocker.setNumOfShares(numOfShares);
		System.out.println("Enter the Share Price: ");
		double sharePrice=sc.nextDouble();
		stocker.setSharePrice(sharePrice);
		list.insert(list, stocker);
		System.out.println("New Shares added successfully to"+stockName);
		}
		}

	@Override
	public void sell(int numOfShares, String stockName) {
		
		Node<CommercialModel> temp=list.head;
		boolean found=false;
		
		while(temp!=null)
		{
			if(temp.data.getStockName().equalsIgnoreCase(stockName))
			{

				found=true;
				
				if(temp.data.getNumOfShares()>=numOfShares)
				{
				temp.data.setNumOfShares(temp.data.getNumOfShares()-numOfShares);
				}
				else
				{
					System.out.println("FAILED! You only have "+temp.data.getNumOfShares()+" shares");
					break;
				}
				
				System.out.println("Shares removed successfully from "+stockName);
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
		if(!found)
		{
			System.out.println("Oops! You don't have any shares of "+stockName+" to sell");
		}

	}

	@Override
	public void save(String fileName) {
		
		Node<CommercialModel> currNode=list.head;
		arrayList.clear();
		
		while (currNode != null) {
			arrayList.add(currNode.data);
			currNode = currNode.next;
		}
		
		
		GsonBuilder builder=new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson=builder.create();
		
		try
		{
			FileWriter fw=new FileWriter(fileName);
			fw.write(gson.toJson(arrayList));
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

	@Override
	public void printReport() {
		
		Node<CommercialModel> temp=list.head;
		while(temp!=null)
		{
			String stockName = temp.data.getStockName();
			int numOfShares = temp.data.getNumOfShares();
			double sharePrice = temp.data.getSharePrice();
			
			System.out.println("Stock Name: "+stockName);
			System.out.println("You have: "+numOfShares+" shares");
			System.out.println("Share Price: "+sharePrice);
			temp=temp.next;
			System.out.println();
		}
		

	}

}
