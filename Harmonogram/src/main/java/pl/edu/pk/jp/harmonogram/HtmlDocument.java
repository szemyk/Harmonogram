package pl.edu.pk.jp.harmonogram;

public class HtmlDocument implements Document{

	private String html = "";
	
	public void createHeader(){
		
		this.html = "<html>"
					+ "<head>"
						+ "<meta charset='UTF-8'>"
						+ "<style>"
							+ "body{font-family:arial;font-size:12px}"
							+ "table td{padding:5px;text-align:center}"
						+ "</style>"
					+ "</head>"
				+ "<body>";
	};
	
	public void appendBody(String text){
		
		this.html += text;
	};
	
	public void createFooter(){
		
		this.html += "</body></html>";
	}
	
	public String getHtml(){
		
		return this.html;
	}
}
