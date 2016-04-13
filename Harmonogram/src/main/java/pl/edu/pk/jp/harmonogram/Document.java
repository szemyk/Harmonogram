package pl.edu.pk.jp.harmonogram;

public interface Document {

	void createHeader();
	
	void appendBody(String text);
	
	void createFooter();
}
