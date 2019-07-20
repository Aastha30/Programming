package com.bridgelabz.regexmain;

import java.util.Scanner;

import com.bridgelabz.regexmodel.RegexModel;
import com.bridgelabz.regexserviceimpl.RegexServiceImpl;

public class RegexMain {

	public static void main(String[] args) {
		RegexModel userInput=new RegexModel();
		RegexServiceImpl impl=new RegexServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your first name: ");
		String name=sc.next();
		System.out.println("Enter Your Full name: ");
		String fullName=sc.next();
		System.out.println("Enter Your Mobile Number: ");
		String mobNo=sc.next();
		userInput.setName(name);
		userInput.setFullName(fullName);
		userInput.setMobNo(mobNo);
		userInput.setDate(impl.getFormattedDate());
		String line=impl.readFile();
		System.out.println(impl.replace(userInput,line));

		
		
		
	}

	
		
	

}
