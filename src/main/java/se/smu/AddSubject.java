package se.smu;

import java.io.*;

public class AddSubject {
  public static void main(String[] args) {
	  //������� �������� ����� �ҷ��� ȭ�鿡 ���� ������ ������ �߰���Ű�� ������� �������� ��� text���Ͽ� �߰��Ǵ� �ڵ�
	  //������� ���������� �ҷ����� �ڵ�
	  BufferedReader br = null;
	  try {
		  String s;
		  File file = new File("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt"); //���� ���
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
	  //�Է¹��� ���������� �߰��ϰ� �����ϴ� �ڵ�
	  BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter pw = null;

	  try {
		  pw = new PrintWriter(new FileWriter("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt",true));
			
		  while (true) {
			  String input = bw.readLine();
			  if(input == null)
				  break;
			  if (input.equals("�Ϸ�")) //�Ϸ� ��ư�� Ŭ���ϸ� ����ǵ���
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