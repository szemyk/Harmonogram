package pl.edu.pk.jp.harmonogram;

public class LabelUserCalendarElement implements CalendarElement {

	private String label;
	
	public LabelUserCalendarElement(String label){
		
		this.label = label;
	}
	
	public CalendarElementType getType(){
		
		return CalendarElementType.USERLABEL;
	}
	
	public String getColor(){
		
		return "#262626";
	}
	
	public String getText(){
		
		return this.label;
	}
}

