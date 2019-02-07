package model;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day {
	private String finalDay;
	private String date;
	
	public Day() {
		super();
	}
	
	public Day(String date) throws ParseException{
		super();
		setFinalDay(date);
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setFinalDay(String date) throws ParseException{
		DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date2 = LocalDate.parse(date, formatter);
		DayOfWeek dayOfWeek = date2.getDayOfWeek();
	    finalDay = dayOfWeek.name(); // SATURDAY
	}
	
	public String getDay() {
		return finalDay;
	}
	
	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Day [date=" + finalDay + "]";
	}
}
