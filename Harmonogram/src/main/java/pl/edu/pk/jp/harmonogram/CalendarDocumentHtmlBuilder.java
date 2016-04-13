package pl.edu.pk.jp.harmonogram;

public class CalendarDocumentHtmlBuilder extends TextFile implements CalendarDocumentBuilder{

	HtmlDocument html;
	
	public CalendarDocumentHtmlBuilder(){
		
		this.html = new HtmlDocument();
	}
	
	public void startDocument(){
		
		this.html.createHeader();
	}
	
	public void createTableStart(int withPercent){
		
		this.html.appendBody("<table style='float:left;width:"+withPercent+"%'>");
	}
	
	public void createRowStart(){
		
		this.html.appendBody("<tr>");
	}
	
	public void createUserLabel(CalendarElement element,int colspan){
		this.html.appendBody("<td colspan='"+colspan+"' style='color:white;background-color:"+element.getColor()+"'>"+element.getText()+"</td>");
	}
	
	public void createRowLabel(CalendarElement element){
		
		this.html.appendBody("<td style='width:50px;background-color:"+element.getColor()+"'>"+element.getText()+"</td>");
	}
	
	public void createColumnLabel(CalendarElement element,int withPercent){
		
		this.html.appendBody("<td style='width:"+withPercent+"%;background-color:"+element.getColor()+"'>"+element.getText()+"</td>");
	}
	
	public void createEmpty(CalendarElement element){
		
		this.html.appendBody("<td>&nbsp;</td>");
	}
	
	public void createTask(CalendarElement element){
		
		this.html.appendBody("<td style='font-size:10px;background-color:"+element.getColor()+"'>"+element.getText()+"</td>");
	}
	
	public void createRowEnd(){
		
		this.html.appendBody("</tr>");
	}
	
	public void createTableEnd(){
		
		this.html.appendBody("</table>");
	}
	
	public void closeDocument(){
		
		this.html.createFooter();
	}
	
	public void createFile(String filename){
		
		TextFile textFile = new TextFile();
		textFile.create(filename+".html",this.html.getHtml());	
	}
}
