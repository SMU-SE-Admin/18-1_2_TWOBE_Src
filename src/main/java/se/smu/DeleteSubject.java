package se.smu;

import java.io.*;

public class DeleteSubject   {
	public static  Subject[] delete(String subUrl,Subject[] arr ,int count,String del_subname){
		int index=0;
		
		while (!arr[index].getSubjectName().equals(del_subname)){ index++; }
		
		for (int i=index;i<count-1;i++){
			arr[i]=arr[i+1];
		}
		
		
		arr[count-1]=null;
		
		try{
			// 삭제된 배열을 통쨰로 파일에 덮어씌움
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(subUrl));
			
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