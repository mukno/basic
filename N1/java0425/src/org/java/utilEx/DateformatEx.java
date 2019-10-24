package org.java.utilEx;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateformatEx {

	public static void main(String[] args) {
		System.out.println("Dateformat");
		
		Date now=new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		
		DateFormat dfTime=DateFormat.getDateTimeInstance(
				DateFormat.LONG,DateFormat.LONG,Locale.KOREA);
		System.out.println(dfTime.format(now));
		
		Date now2=new Date(2018,6,21);
		System.out.println(now2);
		
		Date now3=new Date(2018,6,21,1,01,30);
		System.out.println(now3);
				
	}
}
