package se.smu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EditSubject {
	public static Subject[] edit(String subjectName,String professer,String subjectDay,int subjectTime,int runYear, int semester,Subject[] arr,int count,String subUrl,int i){
		Subject sj = new Subject(subjectName,professer,subjectDay,subjectTime,runYear,semester);
		
		arr[i] = sj;
		
		try{
			// 수정된 배열을 파일에 통째로 덮어씌움
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(subUrl));
			
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