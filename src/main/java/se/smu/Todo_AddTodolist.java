package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Todo_AddTodolist implements Serializable{
	
	public static Todolist add(String tdlUrl,String s){
		
		//  확인을 위해 tdl이름만 넘겨받도록 구현,추후 GUI에서 넘겨받기
		Todolist n = new Todolist("a",s,"c",null,true,true);
		
		// 파일에 저장
		try {	
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(tdlUrl,true));
			writer.writeObject(n);
			writer.close();	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return n;

 	}
}
