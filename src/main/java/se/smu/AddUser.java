package se.smu;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AddUser implements Serializable{
	
	//수정 전 public static User add(String siUrl,String s){
		public static User add(String siUrl, String a, String b, String c, String d) {
		//  확인을 위해 tdl이름만 넘겨받도록 구현,추후 GUI에서 넘겨받기
		User n = new User(a,b,c,d);
		
		// 파일에 저장
		try {	
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(siUrl,true));
			writer.writeObject(n);
			writer.close();	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return n;

 	}
}
