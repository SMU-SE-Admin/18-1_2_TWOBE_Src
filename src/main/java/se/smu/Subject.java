package se.smu;

import java.io.Serializable;

public class Subject  implements Serializable{
	 private String subjectName;
	 private String professer;
	 private String subjectDay;
	 private int subjectTime;
	 private int runYear;
	 private int semester;
	 
	 public Subject(String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester){
	      this.subjectName = subjectName;
	      this.professer=professer;
	      this.subjectDay=subjectDay;
	      this.subjectTime=subjectTime;
	      this.runYear=runYear;
	      this.semester=semester;
	 }
	   
	 public String getSubjectName(){
		 return this.subjectName;
	 }
	 public String getProfesser(){
	    return this.professer;
	 }
	 public String getSubjectDay(){
	    return this.subjectDay;
	 }
	 public int getSubjectTime(){
		 return this.subjectTime;
	 }
	 public int getRunYear(){
	    return this.runYear;
	 }
	 public int getSemester(){
		 return this.semester;
	 }
	 
}
