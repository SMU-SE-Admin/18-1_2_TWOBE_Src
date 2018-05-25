package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Todo_EditTodolist implements Serializable {
	public static Todolist[] Edit(String subjectName,String tdlName,String tdlDeadline,String tdlFinishDate,Boolean tdlCompleted,Boolean tdlImportant,String oldtd,String tdlUrl,Todolist[] arr,int count){
		// 넘겨받은 tdl 정보를 새로운 td객체에 저장
		Todolist todo = new Todolist(subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant);
		int index = 0;
		
		// 예전 tdl이름과 같은 tdl을 배열에서 찾아 수정
		while(true){
			if(arr[index].gettdlName().equals(oldtd)){
				arr[index]=todo;
				break;
			};
			index++;
		}
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