package com.bridgelabz.addressbookserviceimpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.addressbookmodel.AddressBook;
import com.bridgelabz.addressbookservice.AddressBookService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AddressBookServiceImpl implements AddressBookService {

	ArrayList<AddressBook> list = new ArrayList<>();
	JSONParser parser = new JSONParser();
	Scanner sc = new Scanner(System.in);

	@Override
	public void readFile() {

		try {
			FileReader fr = new FileReader(
					"/home/admin1/Desktop/Bridgelabz/AddressBook/src/com/bridgelabz/addressbookserviceimpl/AddressBook.json");
			JSONArray array = (JSONArray) parser.parse(fr);
			for (Object obj : array) {
				AddressBook employee = new AddressBook();
				JSONObject address = (JSONObject) obj;
				employee.setFirstName((String) address.get("firstName"));
				employee.setLastName((String) address.get("lastName"));
				employee.setPhnNo((Long) address.get("phnNo"));
				employee.setHouseNo(((Number) address.get("houseNo")).intValue());
				employee.setPincode(((Number) address.get("pincode")).intValue());
				employee.setStreetName((String) address.get("streetName"));
				employee.setArea((String) address.get("area"));
				employee.setCity((String) address.get("city"));
				employee.setState((String) address.get("state"));
				list.add(employee);

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void addAddress() {

		AddressBook employee = new AddressBook();
		System.out.println("Enter the First Name of the employee:");
		String firstName = sc.next();
		employee.setFirstName(firstName);
		System.out.println("Enter the Last Name of the employee:");
		employee.setLastName(sc.next());
		System.out.println("Enter the Phone Number of the employee:");
		employee.setPhnNo(sc.nextLong());
		System.out.println("Enter the House Number:");
		employee.setHouseNo(sc.nextInt());
		System.out.println("Enter the Street Name:");
		employee.setStreetName(sc.next());
		System.out.println("Enter the Area:");
		employee.setArea(sc.next());
		System.out.println("Enter the City:");
		employee.setCity(sc.next());
		System.out.println("Enter the State:");
		employee.setState(sc.next());
		System.out.println("Enter the Pincode:");
		employee.setPincode(sc.nextInt());
		list.add(employee);
		writeToFile();

	}

	@Override
	public void editAddress() {

		AddressBook editData = getEditData();

		for (int i = 0; i < list.size(); i++) {
			AddressBook emp = list.get(i);

			if (emp.getFirstName().equalsIgnoreCase(editData.getFirstName())
					&& emp.getLastName().equalsIgnoreCase(editData.getLastName())) {
				
				if (editData.getPhnNo() != 0)
					emp.setPhnNo(editData.getPhnNo());

				if (editData.getHouseNo() != 0)
					emp.setHouseNo(editData.getHouseNo());

				if (editData.getStreetName() != null)
					emp.setStreetName(editData.getStreetName());

				if (editData.getArea() != null)
					emp.setArea(editData.getArea());

				if (editData.getCity() != null)
					emp.setCity(editData.getCity());

				if (editData.getState() != null)
					emp.setState(editData.getState());

				if (editData.getPincode() != 0)
					emp.setPincode(editData.getPincode());
				
				list.set(i,emp);
				writeToFile();

			}

		}

	}

	public AddressBook getEditData() {
		AddressBook employee = new AddressBook();
		System.out.println("Enter the First Name: ");
		employee.setFirstName(sc.next());
		System.out.println("Enter the Last Name: ");
		employee.setLastName(sc.next());

		boolean flag = true;

		while (flag) {
			System.out.println("Enter 1 to Change the Phone Number");
			System.out.println("Enter 2 to Change the House Number");
			System.out.println("Enter 3 to Change the Street Name");
			System.out.println("Enter 4 to Change the Area");
			System.out.println("Enter 5 to Change the City");
			System.out.println("Enter 6 to Change the State");
			System.out.println("Enter 7 to Change the Pincode");
			System.out.println("Enter 8 to finalize");
			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Entre the Phone Number:");
				employee.setPhnNo(sc.nextLong());
				break;

			case 2:
				System.out.println("Enter the House Number: ");
				employee.setHouseNo(sc.nextInt());
				break;

			case 3:
				System.out.println("Enter the Street Name: ");
				employee.setStreetName(sc.next());
				break;

			case 4:
				System.out.println("Enter the Area: ");
				employee.setArea(sc.next());
				break;

			case 5:
				System.out.println("Enter the City: ");
				employee.setCity(sc.next());
				break;

			case 6:
				System.out.println("Enter the State: ");
				employee.setState(sc.next());
				break;

			case 7:
				System.out.println("Enter the Pincode: ");
				employee.setPincode(sc.nextInt());
				break;

			case 8:
				flag = false;
				break;

			default:
				System.out.println("Invalid Input");
				break;

			}

		}
		
		return employee;
		
	}

	@Override
	public void deleteAddress() {
		
		System.out.println("Enter the First Name: ");
		String firstName=sc.next();
		System.out.println("Enter the Last Name: ");
		String lastName=sc.next();
		
		for(int i=0;i<list.size();i++)
		{
			AddressBook emp=list.get(i);
			 if(emp.getFirstName().equalsIgnoreCase(firstName)&&emp.getLastName().equalsIgnoreCase(lastName))
			 {
				 list.remove(i);
				 writeToFile();
			 }
		}
	}

	@Override
	public void sortByName() {

	}

	@Override
	public void sortByZip() {

	}

	@Override
	public void writeToFile() {

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();

		try {
			FileWriter fw = new FileWriter(
					"/home/admin1/Desktop/Bridgelabz/AddressBook/src/com/bridgelabz/addressbookserviceimpl/AddressBook.json");
			fw.write(gson.toJson(list));
			fw.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void display() {

	}

}
