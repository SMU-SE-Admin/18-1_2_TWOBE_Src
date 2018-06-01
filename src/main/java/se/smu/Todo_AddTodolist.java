package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Todo_AddTodolist implements Serializable{
	
	public static Todolist add(String tdlUrl,String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant){
		
		Todolist n = new Todolist(subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant);
		
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
