package com.bridgelabz.regexserviceimpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

import com.bridgelabz.regexmodel.RegexModel;
import com.bridgelabz.regexservice.RegexService;

public class RegexServiceImpl implements RegexService {

	@Override
	public String readFile() {
		
		String line=" ";
		try
		{
		FileReader fr=new FileReader("/home/admin1/Desktop/Bridgelabz/Regex/src/Intro.txt");
		BufferedReader br=new BufferedReader(fr);
		String in;
		while ((in = br.readLine()) != null) {
			line = line + in+" ";
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		return line;
	}

	@Override
	public String replace(RegexModel userInput, String message) {
		
		Pattern p= Pattern.compile("<<name>>");
		Matcher m=p.matcher(message);
		message=m.replaceAll(userInput.getName());
		
		p=Pattern.compile("<<full name>>");
		m=p.matcher(message);
		message=m.replaceAll(userInput.getFullName());
		
		p=Pattern.compile("91-xxxxxxxxxx");
		m=p.matcher(message);
		message=m.replaceAll(userInput.getMobNo());
		
		p=Pattern.compile("01/01/2016");
		m=p.matcher(message);
		message=m.replaceAll(userInput.getDate());
		
		return message;
	}

	@Override
	public String getFormattedDate() {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		Date date =new Date();
		return sdf.format(date);
	}



}
