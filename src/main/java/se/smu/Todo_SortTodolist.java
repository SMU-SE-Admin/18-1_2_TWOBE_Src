package se.smu;

import java.util.Comparator;

import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Todo_SortTodolist  {

	public static Comparator<Todolist> NameComparator=new Comparator<Todolist>(){
		public int compare(Todolist d1, Todolist d2){
			return d1.gettdlName().compareTo(d2.gettdlName());
		}
	};
	public static Comparator<Todolist> DeadlineComparator=new Comparator<Todolist>(){
		public int compare(Todolist d1, Todolist d2){
			return d1.gettdlDeadline().compareTo(d2.gettdlDeadline());
		}
	};
	public static void FinishDate_sort(Todolist[] arr){
	      List<Todolist> finishList=Stream.of(arr)
	            .filter(s->s.gettdlFinishDate()!=null)
	            .collect(Collectors.toList());
	      finishList.stream()
	         .forEach(s->System.out.println(s.gettdlFinishDate()));
	      
	         
	   }
	public static void Completed_sort(Todolist[] arr){
		List<Todolist> completedList=Stream.of(arr)
				.filter(s->s.gettdlCompleted()==true)
				.collect(Collectors.toList());
		completedList.stream()
			.forEach(s->System.out.println(s.gettdlCompleted()));
		
	}
}