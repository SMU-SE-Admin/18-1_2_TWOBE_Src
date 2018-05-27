package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AddSubject implements Serializable{
	
  public static Subject add(String subUrl,String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester) {
     Subject sub = new Subject(subjectName,professer,subjectDay,subjectTime,runYear, semester);
     
     try {   
         ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(subUrl,true));
         writer.writeObject(sub);
         writer.close();   
         
      }catch (Exception e) {
         e.printStackTrace();
      }
     
     return sub;
   }
}