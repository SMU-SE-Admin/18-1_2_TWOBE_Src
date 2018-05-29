package se.smu;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Todo_SortTodolist  {

	public static Todolist[] Name_sort(Todolist[] t_arr,int count){
		String arr[] = new String[count];
		Todolist narr[] = new Todolist[100];
		
		for (int i=0;i<count;i++){
			arr[i] = t_arr[i].getSubjectName();
		}
		
		Arrays.sort(arr);
		
		for (int i=0;i<count;i++){
			System.out.println(arr[i]);
			for (int j=0;j<count;j++){
				if (arr[i].equals(t_arr[j].getSubjectName())){
					narr[i] = t_arr[j];
					t_arr[j] = null;
					break;
				}
			}
		}
	
		return narr;
	};
	
	
	public static Todolist[] Deadline_sort(Todolist[] t_arr,int count){
		String arr[] = new String[count];
		Todolist narr[] = new Todolist[100];
		
		for (int i=0;i<count;i++){
			arr[i] = t_arr[i].gettdlDeadline();
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		for (int i=0;i<count;i++){
			System.out.println(arr[i]);
			for (int j=0;j<count;j++){
				if (arr[i].equals(t_arr[j].gettdlDeadline())){
					narr[i] = t_arr[j];
					t_arr[j] = null;
					break;
				}
			}
		}
	
		return narr;
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