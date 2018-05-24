package se.smu;

import java.io.*;

public class AddSubject {
  public static void main(String[] args) {
	  //사용자의 수강과목 목록을 불러와 화면에 띄우고 수강할 과목을 추가시키면 사용자의 수강과목 목록 text파일에 추가되는 코드
	  //사용자의 수강과목을 불러오는 코드
	  BufferedReader br = null;
	  try {
		  String s;
		  File file = new File("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt"); //파일 경로
		  br = new BufferedReader(new FileReader(file));
		  
		  while((s = br.readLine()) != null) {
			  System.out.println(s);	  
			
		  }
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  finally {
		  try {
			  if(br != null) br.close();
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	  }
	  //입력받은 수강과목을 추가하고 저장하는 코드
	  BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter pw = null;

	  try {
		  pw = new PrintWriter(new FileWriter("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt",true));
			
		  while (true) {
			  String input = bw.readLine();
			  if(input == null)
				  break;
			  if (input.equals("완료")) //완료 버튼을 클릭하면 저장되도록
				  break;
			  pw.println(input);
		  }
		  pw.flush();
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
	  finally{
		  if(bw != null){
			  try {
				  bw.close();
			  } catch (IOException e) {
				  e.printStackTrace();
			  }
		  }
		  if (pw != null){
			  pw.close();
		  	}
	  	}
	}
}