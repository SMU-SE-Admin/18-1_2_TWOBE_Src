package se.smu;

import java.util.Arrays;
import java.io.Serializable; //추가한 부분


public class Student{
	int StudentNum;
	int t_arrcount=0;
	int s_arrcount=0;
	Todolist t_arr[] = new Todolist[100];
	Subject s_arr[] = new Subject[100];
	String tdlUrl;
	String subUrl;
	//수정 시작 부분
	int si_arrcount=0;
	User si_arr[] = new User[100];
	String siUrl;
	

	//수정 끝나는 부분
	
	public Student(int num){
		this.StudentNum = num;
		this.tdlUrl = num+"_todo.txt";
		this.subUrl = num+"_sub.txt";
		//수정 시작 부분
		this.siUrl = num+"_user.txt";
		//수정 끝나는 부분
	}
	
	public void edit_sub(String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester,String oldsub){
		EditSubject.edit(subjectName,professer,subjectDay,subjectTime,runYear,semester,this.s_arr,this.s_arrcount,this.subUrl,oldsub);
	}
	public void del_sub(String subUrl,Subject[] arr ,int count,String del_subname){
		this.s_arr=DeleteSubject.delete(this.subUrl, this.s_arr, this.s_arrcount, del_subname);
		this.s_arrcount--;
		return;
		
	}
	
	//수정 시작 부분
	
	public void add_user(String s) {
		//User user = AddUser.add(this.siUrl, s);
		//this.si_arr[this.si_arrcount] = user;
		//this.si_arrcount++;
		//return;
	}
	
	
	//수정 끝나는 부분
	
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
