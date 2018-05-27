package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;


public class Todo_DeleteTodolist implements Serializable{
	
	public static Todolist[] Delete(String tdlUrl,Todolist[] arr,int count,int num){

		
		for (int i=num;i<count-1;i++){
			arr[i]=arr[i+1];
		}
		
		arr[count-2]=null;
		
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