package pl.edu.pk.jp.harmonogram;

import static org.junit.Assert.assertEquals;

public class TestLabelColumnCalendarElement {
	
	private LabelColumnCalendarElement labelColumnCalendarElement;
	
	@org.junit.Before
	public void init() {
		
		this.labelColumnCalendarElement = new LabelColumnCalendarElement("Przykladowa tresc");
	}
	
	@org.junit.Test
	public void testGetType(){
		
		assertEquals(CalendarElementType.COLUMNLABEL,this.labelColumnCalendarElement .getType());
	}
}

