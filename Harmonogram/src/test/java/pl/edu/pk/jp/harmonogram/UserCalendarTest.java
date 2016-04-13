package pl.edu.pk.jp.harmonogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserCalendarTest {

	protected UserCalendar userCalendar;
	
	@org.junit.Before
	public void init() {
		User user = new User("Jan","Kowalski");
		Task task = new Task("Test","#F8F5E0",20,2,2015,8);
		this.userCalendar = new UserCalendar(user);
		this.userCalendar.addTask(task);
	}
	
	@Test
	public void testGetTasks() {
		
		assertEquals(this.userCalendar.getTasks().size(),1);
	}

}
