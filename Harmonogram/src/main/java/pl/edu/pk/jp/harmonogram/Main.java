package pl.edu.pk.jp.harmonogram;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		//Użytkownik 1 + jego harmonogram zadań
		User user1 = new User("Karolina","Kowalska");
		//Zadania na dzien 23.2.2015
		user1.addTask(new Task("Pobudka","#40E0D0",23,2,2015,7));
		user1.addTask(new Task("Odprowadzenie dziecka do przedszkola","#FF0000",23,2,2015,8));
		user1.addTask(new Task("Opłaty rachunków","#40E0D0",23,2,2015,9));
		user1.addTask(new Task("Zakupy","#40E0D0",23,2,2015,10));
		user1.addTask(new Task("Ugotowanie obiadu","#40E0D0",23,2,2015,12));
		user1.addTask(new Task("Serial w TV","#DBC44C",23,2,2015,14));
		user1.addTask(new Task("Odpoczynek","#40E0D0",23,2,2015,15));
		user1.addTask(new Task("Zabawa z dzieckiem","#00ff00",23,2,2015,17));
		user1.addTask(new Task("Przygotowanie kolacji","#40E0D0",23,2,2015,19));
		user1.addTask(new Task("Do spania","#40E0D0",23,2,2015,22));
		//Zadania na 24.02.2015
		user1.addTask(new Task("Pobudka","#40E0D0",24,2,2015,7));
		
		//Użytkownik 2 + jego harmonogram zadań
		User user2 = new User("Jan","Kowalski");
		user2.addTask(new Task("Pobudka","#40E0D0",23,2,2015,7));
		user2.addTask(new Task("W pracy","#40E0D0",23,2,2015,8));
		user2.addTask(new Task("Odbiór dziecka z przedszkola","#FF0000",23,2,2015,15));
		user2.addTask(new Task("Zabawa z dzieckiem","#00ff00",23,2,2015,17));
		user2.addTask(new Task("Oglądanie filmu","#DBC44C",23,2,2015,20));
		user2.addTask(new Task("Do spania","#40E0D0",23,2,2015,23));
		
		ArrayList<ArrayList<ArrayList<CalendarElement>>> calendars = new ArrayList<ArrayList<ArrayList<CalendarElement>>>();
		//I SCENARIUSZ - GENEROWANIE HARMONOGRAMU DLA DWOCH DNI JEDNEGO UZYTKOWNIKA
		//calendars.add(user1.getCalendar().getArrayList(23,2,2015 , 2, 7, 23));
		
		//II SCENARIUSZ - GENEROWANIE W JEDNYM WIDOKU ZESTAWIENIA HARMONOGRAMU DWOCH UZYTKOWNIKOW
		calendars.add(user1.getCalendar().getArrayList(23,2,2015 , 1, 7, 23));
		calendars.add(user2.getCalendar().getArrayList(23,2,2015 , 1, 7, 23));
		
		CalendarDocumentDirector director = new CalendarDocumentDirector();
		CalendarDocumentBuilder builder = new CalendarDocumentHtmlBuilderDecorator(new CalendarDocumentHtmlBuilder());
		director.construct(builder, calendars);
		
		builder.createFile("harmonogram");
		
	}
	
	public String toBeTested(){
		return "result";
	}
}
