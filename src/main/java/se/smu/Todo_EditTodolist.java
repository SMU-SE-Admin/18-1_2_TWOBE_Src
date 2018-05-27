package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Todo_EditTodolist implements Serializable {
	public static Todolist[] Edit(String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant,int i,String tdlUrl,Todolist[] arr,int count){
		
		Todolist todo = new Todolist(arr[i].getSubjectName(),tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant);

		arr[i] = todo;
		
		try{
			// 수정된 배열을 파일에 통째로 덮어씌움
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(tdlUrl));
			
			for (int j=0;j<count;j++){
				writer.writeObject(arr[j]);
			}
			
			writer.close();	
						
		}catch (Exception e){
			e.printStackTrace();
		}
	
		return arr;
	}
}