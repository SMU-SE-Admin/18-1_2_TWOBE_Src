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
     
    public void init(String num, String a, String b, String c, String d) {
 
 
         
        user = new User();
        user.setStudentNum(num);
        user.setStudentName(a);
        user.setMajor(b);
        user.setPassword(c);
        user.setQues(d);
        filePath = num+".ser";
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


