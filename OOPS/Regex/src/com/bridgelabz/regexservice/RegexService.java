package com.bridgelabz.regexservice;

import com.bridgelabz.regexmodel.RegexModel;

public interface RegexService {
	
	 public String readFile();
	 public String replace(RegexModel userInput, String message);
	 public String getFormattedDate();
	

}
