package com.day6.defaultmethod;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class DateTime2 {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2016, 5, 23);
		Period gap=Period.between(date1, date2);
		System.out.println("Gap between two dates are "+gap);
		LocalTime time1=LocalTime.now();
		Duration fivehours=Duration.ofHours(5);
		LocalTime time2=time1.plus(fivehours);
		System.out.println("Time after five hours are "+time2);
		Duration gapdata=Duration.between(time1, time2);
		System.out.println("Gap is "+gapdata);
		LocalDate newyear=date1.plus(2,ChronoUnit.YEARS);
		System.out.println("DATE WTH NEW YEAR"+newyear);
		LocalDate withnewmonths=date1.plus(4,ChronoUnit.MONTHS);
		System.out.println("With new month"+withnewmonths);
		LocalDate firstdayofnextmonth=date1.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First datay of month is "+firstdayofnextmonth);
		ZoneId zone = ZoneId.systemDefault();     
	    System.out.println(zone);  
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
		  ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
		    LocalTime id1 = LocalTime.now(zoneid1);  
		    LocalTime id2 = LocalTime.now(zoneid2);  
		    System.out.println(id1);  
		    System.out.println(id2);  
		    System.out.println(id1.isBefore(id2));  
		    
		    Calendar calendar = Calendar.getInstance();  
		    int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
		    System.out.println("Maximum number of days in week: " + maximum);  
		    maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
		    System.out.println("Maximum number of weeks in year: " + maximum);  
		    
	}

}
