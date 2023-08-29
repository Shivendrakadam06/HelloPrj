package com.day6.defaultmethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateOperation {
public static void main(String[] args) {
	LocalDate date= LocalDate.now();
	System.out.println(date);
	LocalTime time= LocalTime.now();
	System.out.println(time);
	LocalDateTime datetime=LocalDateTime.now();
	System.out.println(datetime);
	Month mon= datetime.getMonth();
	int dayofmonth=datetime.getDayOfMonth();
	DateTimeFormatter formate=DateTimeFormatter.ofPattern("MM-dd-YYY HH:MM:SS");
	String Fdate=datetime.format(formate);
	System.out.println(Fdate);
}
}
