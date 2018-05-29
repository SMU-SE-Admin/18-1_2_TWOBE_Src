package se.smu;

import java.util.Arrays;


import java.io.Serializable; 


public class Student{
	int StudentNum;
	int t_arrcount=0;
	int s_arrcount=0;
	Todolist t_arr[] = new Todolist[100];
	Subject s_arr[] = new Subject[100];
	String tdlUrl;
	String subUrl;
	Boolean check=false;
	public Student(int num){
		this.StudentNum = num;
		this.tdlUrl = num+"_todo.txt";
		this.subUrl = num+"_sub.txt";
	}
	public boolean getBoolean(){
		return this.check;
	}
	//return
	public int getSN(){
		return this.StudentNum;
	}
	
	public int getcount(){
		return this.t_arrcount;
	}
	public Todolist[] gettd(){
		return this.t_arr;
	}
	public boolean getImp(int i){
		return this.t_arr[i].gettdlImportant();
	}
	public String getTarrName(int i){
		if (t_arrcount==0){
			return null;
		}
		return t_arr[i].gettdlName();
	}
	public String getSarrPro(int i){
		return s_arr[i].getProfesser();
	}
	public String getSarrName(int i){
		if (s_arrcount==0){
			return null;
		}
		return s_arr[i].getSubjectName();
		
	}
    public String getSarrDay(int i){
        return s_arr[i].getSubjectDay();
     }
     public int getSarrSem(int i){
        return s_arr[i].getSemester();
     }

	//subject
	public void add_sub(String s,String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester){
	      Subject sub = AddSubject.add(this.subUrl,subjectName, professer, subjectDay, subjectTime, runYear, semester);
	      this.s_arr[this.s_arrcount] = sub;
	      this.s_arrcount++;
	      return;
	   }
	public void edit_sub(String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester,int i){
		this.s_arr = EditSubject.edit(subjectName,professer,subjectDay,subjectTime,runYear,semester,this.s_arr,this.s_arrcount,this.subUrl,i);
		return;
	}
	public void del_sub(int i){
		this.s_arr=DeleteSubject.delete(this.subUrl, this.s_arr, this.s_arrcount,i);
		this.s_arrcount--;
		return;
		
	}

	//todo
	public void add_tdl(String s,String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant){
		Todolist todo = Todo_AddTodolist.add(this.tdlUrl,subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant);
		this.t_arr[this.t_arrcount] = todo;
		this.t_arrcount++;
		return;
	}
	public void del_tdl(int num){
		this.t_arr = Todo_DeleteTodolist.Delete(this.tdlUrl,this.t_arr,this.t_arrcount,num);
		this.t_arrcount--;
		return;
	}
	
	public void edit_tdl(String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant,int i){
		this.t_arr = Todo_EditTodolist.Edit(tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant,i,this.tdlUrl,this.t_arr,this.t_arrcount);
		return;
	}
	
	//sort
	public void sort(String s){
		switch(s){
			case "name" :
				this.t_arr = Todo_SortTodolist.Name_sort(this.t_arr,this.t_arrcount);
				break;
			case "deadline"  :
				this.t_arr = Todo_SortTodolist.Deadline_sort(this.t_arr,this.t_arrcount);
				break;
			case "finishDate" :
				this.t_arr=Todo_SortTodolist.FinishDate_sort(this.t_arr,this.t_arrcount);
				
				break;
			case "completed" :
				this.t_arr=Todo_SortTodolist.Completed_sort(this.t_arr,this.t_arrcount);
			
		
		}	
	}
	
	//bookmark
	public void bookMark(){
		Todo_BookmarkTodolist.bookMark(this.t_arr);
		System.out.println(Arrays.toString(this.t_arr));
	}
}
