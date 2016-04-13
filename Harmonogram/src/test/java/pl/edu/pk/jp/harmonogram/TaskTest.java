package pl.edu.pk.jp.harmonogram;

import static org.junit.Assert.*;

public class TaskTest {

	private Task task;
	
	@org.junit.Before
	public void init() {
		this.task = new Task("Test","#F8F5E0",20,2,2015,8);
	}
	
	@org.junit.Test
	public void testGetType(){
		
		assertEquals(CalendarElementType.TASK,this.task.getType());
	}
}
