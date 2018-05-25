package se.smu;

import java.util.Arrays;



public class Student{
	int StudentNum;
	int arrcount=0;
	Todolist arr[] = new Todolist[100];
	String tdlUrl;
	String subUrl;
	
	public Student(int num){
		this.StudentNum = num;
		this.tdlUrl = num+"_todo.txt";
		this.subUrl = num+"_sub.txt";
	}
	
	public void add_tdl(String s){
		Todolist todo = Todo_AddTodolist.add(this.tdlUrl,s);
		this.arr[this.arrcount] = todo;
		this.arrcount++;
		return;
	}
	
	public void del_tdl(String a){
		this.arr = Todo_DeleteTodolist.Delete(this.tdlUrl,this.arr,this.arrcount,a);
		this.arrcount--;
		return;
	}
	
	public void edit_tdl(String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant,String oldtd){
		this.arr = Todo_EditTodolist.Edit(subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant,oldtd,this.tdlUrl,this.arr,this.arrcount);
		return;
	}
	
	public int getSN(){
		return this.StudentNum;
	}
	
	public int getcount(){
		return this.arrcount;
	}
	
	public Todolist[] getarr(){
		return this.arr;
	}
	public void sort(String s){
		switch(s){
			case "name" :
				Arrays.sort(this.arr,Todo_SortTodolist.NameComparator);
				System.out.println(Arrays.toString(this.arr));
				break;
			case "deadline"  :
				Arrays.sort(this.arr,Todo_SortTodolist.DeadlineComparator);
				System.out.println(Arrays.toString(this.arr));
				break;
			case "finishDate" :
				Todo_SortTodolist.FinishDate_sort(this.arr);
				System.out.println(Arrays.toString(this.arr));
				
				break;
			case "completed" :
				Todo_SortTodolist.Completed_sort(this.arr);
				System.out.println(Arrays.toString(this.arr));
		
		}	
	}
	public void bookMark(){
		Todo_BookmarkTodolist.bookMark(this.arr);
		System.out.println(Arrays.toString(this.arr));
	}
}
