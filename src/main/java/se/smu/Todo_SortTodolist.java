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
	public static Comparator<Todolist> FinishDateComparator=new Comparator<Todolist>(){
		public int compare(Todolist d1, Todolist d2){
			return d1.gettdlFinishDate().compareTo(d2.gettdlFinishDate());
		}
	};
//	public static Comparator<Todolist> CompletedComparator=new Comparator<Todolist>(){
//		public int compare(Todolist d1, Todolist d2){
//			return d1.gettdlCompleted().compareTo(d2.gettdlCompleted());
//		}
//	};
    
}