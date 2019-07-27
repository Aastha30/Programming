package com.bridgelabz.cardmain;

import java.util.Scanner;

import com.bridgelabz.cardimpl.DeckOfCards;

public class DeckOfCardsMain {

	public static void main(String[] args) {
		
		DeckOfCards cards=new DeckOfCards();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Enter 1 to shuffle cards");
			System.out.println("Enter 2 to distribute cards");
			System.out.println("Enter 3 to exit the game");
			int selection=sc.nextInt();
			
			switch(selection)
			{
			case 1: cards.shuffleCards();
					break;
					
			case 2: cards.distributeCards();
					break;
					
			case 3: flag=false;
					break;
					
			default: System.out.println("Invalid Input! Please try again.");		
			}
			
		}


	}

}
