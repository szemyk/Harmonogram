package pl.edu.pk.jp.harmonogram;

import java.util.Iterator;
import java.util.ArrayList;

public class CalendarDocumentDirector {

	public void construct(CalendarDocumentBuilder builder,ArrayList<ArrayList<ArrayList<CalendarElement>>> elements){
		
		builder.startDocument();
		
		Iterator<ArrayList<ArrayList<CalendarElement>>> calendarIterator = elements.iterator();
		
		while (calendarIterator.hasNext()) {
		
			Iterator<ArrayList<CalendarElement>> rowIterator = calendarIterator.next().iterator();
			
			builder.createTableStart((int) (100 / elements.size()));
			
			while (rowIterator.hasNext()) {
				
				builder.createRowStart();
				
				ArrayList<CalendarElement> columns = rowIterator.next();
				Iterator<CalendarElement> columnIterator = columns.iterator();
				
				while (columnIterator.hasNext()) {
					
					CalendarElement element = columnIterator.next();
						
					switch(element.getType()){
						case TASK:
							builder.createTask(element);
							break;
						case ROWLABEL:
							builder.createRowLabel(element);
							break;
						case COLUMNLABEL:
							builder.createColumnLabel(element,(int) (100 / (columns.size()-1)));
							break;
						case USERLABEL:
							builder.createUserLabel(element,columns.size());
							break;
						case EMPTY:
							builder.createEmpty(element);
					}
				}
				
				builder.createRowEnd();
			}
			
			builder.createTableEnd();
		}
		
		builder.closeDocument();
	}
}
