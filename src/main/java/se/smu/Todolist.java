package se.smu;

import java.io.Serializable;

public class Todolist implements Serializable{
	 private String subjectName;
	 private String tdlName;
	 private String tdlDeadline;
	 private String tdlFinishDate=null;
	 private Boolean tdlCompleted=false;
	 private Boolean tdlImportant=false;
	   
	 public Todolist(String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant){
	      this.subjectName = subjectName;
	      this.tdlName = tdlName;
	      this.tdlDeadline = tdlDeadline;
	      this.tdlFinishDate = tdlFinishDate;
	      this.tdlCompleted = tdlCompleted;
	      this.tdlImportant = tdlImportant;
	 }
	   
	 public String getSubjectName(){
		 return this.subjectName;
	 }
	 
	 public String gettdlName(){
	    return this.tdlName;
	 }
	 public String gettdlDeadline(){
	    return this.tdlDeadline;
	 }
	 public String gettdlFinishDate(){
		 return this.tdlFinishDate;
	 }
	 public boolean gettdlCompleted(){
	    return this.tdlCompleted;
	 }
	 public boolean gettdlImportant (){
		 return this.tdlImportant;
	 }
}