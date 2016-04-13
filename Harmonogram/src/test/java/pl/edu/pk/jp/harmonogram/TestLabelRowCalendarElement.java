package pl.edu.pk.jp.harmonogram;

import static org.junit.Assert.*;

public class TestLabelRowCalendarElement {

private LabelRowCalendarElement labelRowCalendarElement;
	
	@org.junit.Before
	public void init() {
		
		this.labelRowCalendarElement = new LabelRowCalendarElement("Przykladowa tresc");
	}
	
	@org.junit.Test
	public void testGetType(){
		
		assertEquals(CalendarElementType.ROWLABEL,this.labelRowCalendarElement .getType());
	}

}
