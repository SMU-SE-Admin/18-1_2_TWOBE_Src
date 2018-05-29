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
			for (int j=0;j<count;j++){
				if (t_arr[j]==null){
					continue;
				}
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
		}
		
		Arrays.sort(arr);
		
		for (int i=0;i<count;i++){
			for (int j=0;j<count;j++){
				if (t_arr[j]==null){
					continue;
				}
				if (arr[i].equals(t_arr[j].gettdlDeadline())){
					narr[i] = t_arr[j];
					t_arr[j] = null;
					break;
				}
			}
		}
	
		return narr;
	};
	
	public static Todolist[] FinishDate_sort(Todolist[] t_arr,int count){
		String arr[] = new String[count];
		Todolist narr[] = new Todolist[100];
		
		for (int i=0;i<count;i++){
				arr[i] = t_arr[i].gettdlFinishDate();
				
		}
		
		Arrays.sort(arr);
		for (int i=0;i<count;i++){
			
			for (int j=0;j<count;j++){
				if (t_arr[j]==null){
		               continue;
		            }
				if (arr[i].equals(t_arr[j].gettdlFinishDate())){
					narr[i] = t_arr[j];
					t_arr[j] = null;
					break;
				}
			}
		}
		return narr;
     
	   }
	public static Todolist[] Completed_sort(Todolist[] t_arr,int count){
		Boolean arr[] = new Boolean[count];
		Todolist narr[] = new Todolist[100];
		
		for (int i=0;i<count;i++){
				arr[i] = t_arr[i].gettdlCompleted();
				
		}
		
		Arrays.sort(arr);
		for (int i=0;i<count;i++){	
			for (int j=0;j<count;j++){
				if (t_arr[j]==null){
		               continue;
		            }
				if (arr[i].equals(t_arr[j].gettdlCompleted())){
					narr[i] = t_arr[j];
					t_arr[j] = null;
					break;
				}
			}
		}
		return narr;
     
	   }
}