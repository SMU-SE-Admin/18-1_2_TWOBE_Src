package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;


public class Todo_DeleteTodolist implements Serializable{
	
	public static Todolist[] Delete(String tdlUrl,Todolist[] arr,int count,String del_tdlname){
		// 넘겨받은 tdl이름과 일치하는 tdl을 배열에서 찾아 삭제
		int index=0;
		
		while (!arr[index].gettdlName().equals(del_tdlname)){ index++; }
		
		for (int i=index;i<count-1;i++){
			arr[i]=arr[i+1];
		}
		
		arr[count-1]=null;
		
		try{
			// 삭제된 배열을 통쨰로 파일에 덮어씌움
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(tdlUrl));
			
			for (int j=0;j<count-1;j++){
				writer.writeObject(arr[j]);
			}
			
			writer.close();	
				
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return arr;
	}
}