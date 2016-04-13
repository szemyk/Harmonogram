package pl.edu.pk.jp.harmonogram;

public class CalendarDocumentHtmlBuilderDecorator implements CalendarDocumentBuilder{

	CalendarDocumentHtmlBuilder decoratedCalendarDocumentHtmlBuilder;
	
	public CalendarDocumentHtmlBuilderDecorator(CalendarDocumentHtmlBuilder decoratedCalendarDocumentHtmlBuilder){
		
		this.decoratedCalendarDocumentHtmlBuilder = decoratedCalendarDocumentHtmlBuilder;
	}
	
	public void startDocument(){
		
		this.decoratedCalendarDocumentHtmlBuilder.startDocument();
		this.decoratedCalendarDocumentHtmlBuilder.html.appendBody("<h2 style='text-align:center'>Harmonogram zadań</h2>");
	}
	
	public void closeDocument(){
		
		this.decoratedCalendarDocumentHtmlBuilder.html.appendBody("<br style='clear:both'/>");
		this.decoratedCalendarDocumentHtmlBuilder.closeDocument();
	}
	
	
	public void createTableStart(int withPercent){
		
		this.decoratedCalendarDocumentHtmlBuilder.createTableStart(withPercent);
	}
	
	public void createRowStart(){
		
		this.decoratedCalendarDocumentHtmlBuilder.createRowStart();
	}
	
	public void createUserLabel(CalendarElement element,int collspan){
		
		this.decoratedCalendarDocumentHtmlBuilder.createUserLabel(element,collspan);
	}
	
	public void createRowLabel(CalendarElement element){
		
		this.decoratedCalendarDocumentHtmlBuilder.createRowLabel(element);
	}
	
	public void createColumnLabel(CalendarElement element,int withPercent){
		
		this.decoratedCalendarDocumentHtmlBuilder.createColumnLabel(element,withPercent);
	}
	
	public void createTask(CalendarElement element){
		
		this.decoratedCalendarDocumentHtmlBuilder.createTask(element);
	}
	
	public void createEmpty(CalendarElement element){
		
		this.decoratedCalendarDocumentHtmlBuilder.createEmpty(element);
	}
	
	public void createRowEnd(){
		
		this.decoratedCalendarDocumentHtmlBuilder.createRowEnd();
	}
	
	public void createTableEnd(){
		
		this.decoratedCalendarDocumentHtmlBuilder.createTableEnd();
	}
	
	public void createFile(String path){
		
		this.decoratedCalendarDocumentHtmlBuilder.createFile(path);
	}
}
