package pl.edu.pk.jp.harmonogram;

import java.util.Calendar;
import java.util.Date;

public class Task implements CalendarElement{
	
	private String color;
	
	private String title;
	
	private Date date;
	
	public Task(String title, String color, int day, int month, int year, int hour){
		
		this.title = title;
		this.color = color;
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(year, month-1, day, hour, 0, 0);
		this.date = cal.getTime(); 
	}
	
	public CalendarElementType getType(){
		
		return CalendarElementType.TASK;
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public String getText(){
		
		return this.title;
	}
	
	
	public void setTitle(String title){
		
		this.title = title;
	}
	
	public void setDate(Date date){
		
		this.date = date;
	}
	
	public void setColor(String color){
		
		this.color = color;
	}
	
	public Date getDate(){
		
		return this.date;
	}
	
	
}
