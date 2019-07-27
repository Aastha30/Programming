package com.bridgelabz.addressbookmain;

import java.util.Scanner;

import com.bridgelabz.addressbookserviceimpl.AddressBookServiceImpl;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBookServiceImpl impl = new AddressBookServiceImpl();
		impl.readFile();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Address Book");
			System.out.println("Enter 1 to Add a new Address");
			System.out.println("Enter 2 to Edit the address");
			System.out.println("Enter 3 to Delete the address");
			System.out.println("Enter 4 Done");
			int selection = sc.nextInt();
			switch (selection) {

			case 1:
				impl.addAddress();
				break;
			case 2:
				impl.editAddress();
				break;
			case 3:
				impl.deleteAddress();
				break;
			case 4:
				flag = false;
				System.out.println("Bye!!");
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
