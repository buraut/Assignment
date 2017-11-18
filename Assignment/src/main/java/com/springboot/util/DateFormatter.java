package com.springboot.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class DateFormatter {

	 public static boolean isValidDate(String inDate) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		    //yyyy-MM-dd
		    dateFormat.setLenient(false);
		    try {
		      dateFormat.parse(inDate.trim());
		    } catch (ParseException pe) {
		      return false;
		    }
		    return true;
		  }
}




