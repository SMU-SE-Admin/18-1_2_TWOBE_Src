package se.smu;
import java.io.Serializable;

public class User implements Serializable{
	 private String studentName;
	 private String major;
	 private String password;
	 private String ques;

	   
	 public User(String studentName,String major, String password,String ques){
	      this.studentName = studentName;
	      this.major = major;
	      this.password = password;
	      this.ques = ques;
	 }
	 
	   
	 public String getStudentName(){
		 return this.studentName;
	 }
	 public String getMajor(){
	    return this.major;
	 }
	 public String getPassword(){
	    return this.password;
	 }
	 public String getQues(){
		 return this.ques;
	 }


}