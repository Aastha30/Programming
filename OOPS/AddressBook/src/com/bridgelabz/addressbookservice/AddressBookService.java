package com.bridgelabz.addressbookservice;

public interface AddressBookService {
	
    void readFile();

	void addAddress();

	void editAddress();

	void deleteAddress();

	void sortByName();

	void sortByZip();

	void writeToFile();

	void display();
	

}
