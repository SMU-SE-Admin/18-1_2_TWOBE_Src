package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class AddSubject {
  public static Subject add(String subUrl) {
     Subject sub = new Subject("a","c","v",3,6,7);
     
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