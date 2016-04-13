package pl.edu.pk.jp.harmonogram;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import pl.edu.pk.jp.harmonogram.Task;

public class UserCalendar {

	private User user;
	private ArrayList<Task> tasks;
	
	public UserCalendar(User user){
		
		this.user = user;
		this.tasks = new ArrayList<Task>();
	}
	
	public void addTask(Task task){
		
		this.tasks.add(task);
	}
	
	public ArrayList<Task> getTasks(){
		
		return this.tasks;
	}
	
	public ArrayList<ArrayList<CalendarElement>> getArrayList(int dayFrom, int monthFrom, int yearFrom, int daysCnt, int hoursFrom,int hoursTo){
		
		int i,j;
		ArrayList<CalendarElement> row;
		Task task;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<ArrayList<CalendarElement>> table = new ArrayList<ArrayList<CalendarElement>>();
		
		
		//wiersz z danymi usera
		row = new ArrayList<CalendarElement>();
		row.add(new EmptyCalendarElement());
		row.add(new LabelUserCalendarElement(this.user.getFirstname()+" "+this.user.getLastname()));
		table.add(row);
		
		//wiersz z dniami;
		row = new ArrayList<CalendarElement>();
		row.add(new EmptyCalendarElement());
		for(i = 0; i < daysCnt; i++){
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(0);
			cal.set(yearFrom,monthFrom-1,dayFrom,0,0,0);
			cal.add(Calendar.DATE, i);
			row.add(new LabelColumnCalendarElement(dateFormat.format(cal.getTime())));
		}
		table.add(row);
		
		//wiersze z zadaniami
		for(j = hoursFrom; j <= hoursTo; j++){
			row = new ArrayList<CalendarElement>();
			//kolumna z godzinami
			row.add(new LabelRowCalendarElement(j+":00"));
			for(i = 0; i < daysCnt; i++){
				
				//Szukamy zadania ktore powiazane z danym dniem i godzina
				Iterator<Task> taskIterator = this.tasks.iterator();
				task = null;

				//rozpatrywana data + godzina
				Calendar cal = Calendar.getInstance();
				cal.setTimeInMillis(0);
				cal.set(yearFrom,monthFrom-1,dayFrom,j,0,0);
				cal.add(Calendar.DATE, i);
				
				while (taskIterator.hasNext()) {
					task = taskIterator.next();
					//jesli znaleziono zadanie wyjdz z petli
					if(task.getDate().compareTo(cal.getTime()) == 0){
						break;
					}
					task = null;
				}
				//jesli jest zadanie
				if(task != null){
					row.add(task);
				}else{
					row.add(new EmptyCalendarElement());
				}
			}
			table.add(row);
		}
		
		return table;
	}
}
