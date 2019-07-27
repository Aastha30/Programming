package com.bridgelabz.commercial.main;

import java.util.Scanner;

import com.bridgelabz.commercial.serviceimpl.StockAccount;

public class CommercialMain {

	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
		
		StockAccount stock=new StockAccount("CommercialData.json");
		boolean flag=true;
		while(flag)
		{
			System.out.println("Commercial Data Processing");
			System.out.println("Enter 1 to check the total value of account");
			System.out.println("Enter 2 to buy/add shares of stock to account");
			System.out.println("Enter 3 to sell/substract shares of stock from account");
			System.out.println("Enter 4 to save the account to file");
			System.out.println("Enter 5 to print the detailed report of stocks and values");
			System.out.println("Enter 6 Done");
			
			int selection=sc.nextInt();
			
			switch(selection)
			{
			case 1: double totalValue =stock.valueOf();
					break;
					
			case 2: System.out.println("Enter the Stock Name you wish to buy/add: ");
					String stockName=sc.next();
					System.out.println("Enter the Number Of Shares you wish to buy/add: ");
					int numOfShares=sc.nextInt();
					stock.buy(numOfShares, stockName);
					break;
					
			case 3: System.out.println("Enter the Stock Name you wish to sell");
					String stockName1=sc.next();
					System.out.println("Enter the Number of Shares you wish to sell");
					int numOfShares1=sc.nextInt();
					stock.sell(numOfShares1, stockName1);
					break;
					
			case 4: stock.save("CommercialData.json");
					break;
					
			case 5: stock.printReport();
					break;
					
			case 6: flag=false;
					System.out.println("Bye!!");
					break;
					
			default: System.out.println("Invalid Input! Please try again.");		
				
			
			}
			
		}
		
		
		
		

	}

}
