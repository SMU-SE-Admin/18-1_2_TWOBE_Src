package se.smu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class AddUser {
	 
    private String filePath;
    private User user;
//    public static void main(String[] args){
         
//    	AddUser main = new AddUser();
//       try {
//            main.init();
//            main.doSerializable();
//            User user = (User) main.undoSerializable();
//             
           // System.out.println(user.getStudentName());
//
//             
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
     
    public void init() {
 
 
         
        user = new User();
       // user.setName("kim dong");
       // user.setAge(50);
       // user.setPhoneNumber("010-9858-9985");
        
        filePath = "C:\\Users\\aaaaaa\\eclipse-workspace\\TWOBE\\"+user.getStudentNum()+".ser";
    }
     
    // 마샬링(marshalling) 수행, 직렬화
    public void doSerializable() throws IOException {
 
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();
    }
     
    // 언마샬링(unmarshalling) 수행, 역직렬화
    public Object undoSerializable() throws IOException, ClassNotFoundException {
 
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object user = (User) ois.readObject();
        ois.close();
         
        return user;
    }
}


