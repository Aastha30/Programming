package com.bridgelabz.cardimpl;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
	
	String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	String[] cards=new String[52];
	String[][] playersAndCards=new String[4][9];
	int pos=0;
	
	public DeckOfCards() {
		
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<4;j++)
			{
				cards[pos++]=rank[i]+ "-" +suits[j];
			}
		}
	}
	
	public void shuffleCards()
	{
		Random rdm=new Random();
		for(int i=cards.length-1;i>0;i--)
		{
			int index=rdm.nextInt(i+1);
			
			String card=cards[index];
			cards[index]=cards[i];
			cards[i]=card;
		}
		
	}
	
	public void distributeCards()
	{
		int row=0;
		int col=0;
		for(String card: cards)
		{
			if(col<9)
			{
				playersAndCards[row++][col]=card;
				if(row==4)
				{
					row=0;
					col++;
				}
			}
			else
				break;
		}
		displayCards();
		
	}

	public void displayCards()
	{
		int index=1;
		for(String[] cards: playersAndCards)
		{
			System.out.println("Player "+  "   Cards");
			System.out.println(index+ "   " +Arrays.toString(cards) );
			index++;
		}
	}
	
}
