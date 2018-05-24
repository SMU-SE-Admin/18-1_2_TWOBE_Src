package se.smu;

import java.io.*;

public class EditSubject {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";

		System.out.print("수정하려는 정보 : ");
		String del=bw.readLine();

		while((line = reader.readLine()) != null)
			if(line.contains(del)) {
				System.out.print(line);
			}


		System.out.print("수정된 정보 : " );
		String replacement=bw.readLine();


		if(line.contains(del)) {
			line= replacement.replace(del,line);
		}

		FileWriter writer = new FileWriter("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubjectafter.txt");
		writer.write(line);
		reader.close();
		writer.close();
	}
}