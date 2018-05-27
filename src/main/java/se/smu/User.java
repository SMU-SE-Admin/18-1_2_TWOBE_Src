package se.smu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User {
    private static final long serialVersionUID = 2L;
     private String studentNum;
	 private String studentName;
	 private String major;
	 private String password;
	 private String ques;
     
	 
	public String getStudentNum() {
	    return studentName;
	}
	public void setStudentNum(String studentNum) {
	    this.studentNum = studentNum;
	}
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getQues() {
        return ques;
    }
    public void setQues(String password) {
        this.ques = ques;
    }
}
