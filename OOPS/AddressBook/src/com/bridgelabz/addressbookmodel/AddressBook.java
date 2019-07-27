package com.bridgelabz.addressbookmodel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class AddressBook {
	
	private String firstName,lastName;
	private long phnNo;
	private	int houseNo,pincode;
	private String streetName,area,city,state;
	
	
}
