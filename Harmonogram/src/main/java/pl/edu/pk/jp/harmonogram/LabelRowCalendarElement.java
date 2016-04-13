package pl.edu.pk.jp.harmonogram;

public class LabelRowCalendarElement implements CalendarElement {

	private String label;
	
	public LabelRowCalendarElement(String label){
		
		this.label = label;
	}
	
	public CalendarElementType getType(){
		
		return CalendarElementType.ROWLABEL;
	}
	
	public String getColor(){
		
		return "#F8F5E0";
	}
	
	public String getText(){
		
		return this.label;
	}
}
