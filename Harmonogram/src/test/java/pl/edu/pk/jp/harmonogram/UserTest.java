package pl.edu.pk.jp.harmonogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	protected User user;
	
	@org.junit.Before
	public void init() {
		this.user = new User("Jan","Kowalski");
		Task task = new Task("Test","#F8F5E0",20,2,2015,8);
		user.addTask(task);
		Task task1 = new Task("Test1","#F8F5E0",20,2,2015,8);
		user.addTask(task1);
	}
	
	@Test
	public void test() {
		
		assertEquals(this.user.getTasks().size(),2);
	}
}
