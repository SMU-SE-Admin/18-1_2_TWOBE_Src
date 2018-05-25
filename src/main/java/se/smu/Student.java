package se.smu;

import java.util.Arrays;



public class Student{
	int StudentNum;
	int t_arrcount=0;
	int s_arrcount=0;
	Todolist t_arr[] = new Todolist[100];
	Subject s_arr[] = new Subject[100];
	String tdlUrl;
	String subUrl;
	
	public Student(int num){
		this.StudentNum = num;
		this.tdlUrl = num+"_todo.txt";
		this.subUrl = num+"_sub.txt";
	}
	
	public void edit_sub(String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester,String oldsub){
		EditSubject.edit(subjectName,professer,subjectDay,subjectTime,runYear,semester,this.s_arr,this.s_arrcount,this.subUrl,oldsub);
	}
	
	public void add_tdl(String s){
		Todolist todo = Todo_AddTodolist.add(this.tdlUrl,s);
		this.t_arr[this.t_arrcount] = todo;
		this.t_arrcount++;
		return;
	}
	
	public void del_tdl(String a){
		this.t_arr = Todo_DeleteTodolist.Delete(this.tdlUrl,this.t_arr,this.t_arrcount,a);
		this.t_arrcount--;
		return;
	}
	
	public void edit_tdl(String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant,String oldtd){
		this.t_arr = Todo_EditTodolist.Edit(subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant,oldtd,this.tdlUrl,this.t_arr,this.t_arrcount);
		return;
	}
	
	public int getSN(){
		return this.StudentNum;
	}
	
	public int getcount(){
		return this.t_arrcount;
	}
	
	public Todolist[] getarr(){
		return this.t_arr;
	}
	
	public void sort(String s){
		switch(s){
			case "name" :
				Arrays.sort(this.t_arr,Todo_SortTodolist.NameComparator);
				System.out.println(Arrays.toString(this.t_arr));
				break;
			case "deadline"  :
				Arrays.sort(this.t_arr,Todo_SortTodolist.DeadlineComparator);
				System.out.println(Arrays.toString(this.t_arr));
				break;
			case "finishDate" :
				Todo_SortTodolist.FinishDate_sort(this.t_arr);
				System.out.println(Arrays.toString(this.t_arr));
				
				break;
			case "completed" :
				Todo_SortTodolist.Completed_sort(this.t_arr);
				System.out.println(Arrays.toString(this.t_arr));
		
		}	
	}
	public void bookMark(){
		Todo_BookmarkTodolist.bookMark(this.t_arr);
		System.out.println(Arrays.toString(this.t_arr));
	}
}
