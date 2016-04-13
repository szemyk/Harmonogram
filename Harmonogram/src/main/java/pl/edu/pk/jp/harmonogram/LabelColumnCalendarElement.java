package pl.edu.pk.jp.harmonogram;

public class LabelColumnCalendarElement implements CalendarElement {

	private String label;
	
	public LabelColumnCalendarElement(String label){
		
		this.label = label;
	}
	
	public CalendarElementType getType(){
		
		return CalendarElementType.COLUMNLABEL;
	}
	
	public String getColor(){
		
		return "#F8F5E0";
	}
	
	public String getText(){
		
		return this.label;
	}
}
