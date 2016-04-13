package pl.edu.pk.jp.harmonogram;

import java.util.ArrayList;

public class User {

	private String firstname;
	
	private String lastname;
	
	private UserCalendar calendar;
	
	public User(String firstname, String lastname){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.calendar = new UserCalendar(this);
	}
	
	public String getFirstname(){
		
		return this.firstname;
	}
	
	public String getLastname(){
		
		return this.lastname;
	}
	
	public void addTask(Task task){
		
		this.calendar.addTask(task);
	}
	
	public ArrayList<Task> getTasks(){
		
		return this.calendar.getTasks();
	}
	
	public UserCalendar getCalendar(){
		
		return this.calendar;
	}
	
	
}
