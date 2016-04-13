package pl.edu.pk.jp.harmonogram;

public class EmptyCalendarElement implements CalendarElement {
	
	public CalendarElementType getType(){
		
		return CalendarElementType.EMPTY;
	}
	
	public String getColor(){
		
		return "";
	}
	
	public String getText(){
		
		return "";
	}
}
