package pl.edu.pk.jp.harmonogram;

interface CalendarDocumentBuilder {
	
	void startDocument();
	
	void createTableStart(int withPercent);
	
	void createRowStart();
	
	void createUserLabel(CalendarElement element,int collspan);
	
	void createRowLabel(CalendarElement element);
	
	void createColumnLabel(CalendarElement element,int withPercent);
	
	void createTask(CalendarElement element);
	
	void createEmpty(CalendarElement element);
	
	void createRowEnd();
	
	void createTableEnd();
	
	void closeDocument();
	
	void createFile(String path);
}
