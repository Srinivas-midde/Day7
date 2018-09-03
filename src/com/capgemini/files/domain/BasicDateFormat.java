package com.capgemini.files.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateFormat {

	public static String convert1(String date) throws ParseException {
		
		Date date1 = new SimpleDateFormat("ddMMyyyy").parse(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		String strDate = formatter.format(date1);
		System.out.println("Date Format with MM/dd/yyyy : " + strDate);
		return strDate;
	}

	public static String convert2(String date) throws ParseException {
		
		Date date2 = new SimpleDateFormat("ddMMyyyy").parse(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, YYYY");
		String strDate = formatter.format(date2);
		System.out.println("Date Format with dd MMMM, YYYY : " + strDate);
		return strDate;
	}
	
	

}
