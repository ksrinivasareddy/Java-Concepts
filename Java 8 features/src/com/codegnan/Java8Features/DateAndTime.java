package com.codegnan.Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

	public static void main(String[] args) {
		// write a java program to display system date and time
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		//current date
		System.out.println(dd);
		// current month
		System.out.println(mm);
		// current year
		System.out.println(yy);
		System.out.printf("\nformmated date is : %d-%d-%d",dd,mm,yy);
		System.out.println();
		
		// time
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ms = time.getNano();
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.println(ms);
		System.out.printf("\nformmated time is : %d-%d-%d-%d",h,m,s,ms);
		
		// print date and time at a time
		System.out.println();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println();
		DateTimeFormatter f= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = dt.format(f);
		System.out.println(formattedDateTime);
		
		// Adding months
		System.out.println();
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("After Six mon: " + dt1.plusMonths(6));
		System.out.println();
		
		// Zone Id
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		System.out.println();
		
		ZoneId z1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(z1);
		System.out.println(zt);
		
		//
		System.out.println();
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2001, 06, 20);
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d year %d Months %d days ",p.getYears(),p.getMonths(),p.getDays());
		
		long days = ChronoUnit.DAYS.between(birthday, today);
		System.out.printf("Age is %d days %n",days);
		
	}

}
