package se.smu;

import java.io.*;

public class DeleteSubject {
    public static void main(String[] args) throws IOException {
        //삭제된 후의 사용자의 수강과목 목록
        PrintWriter pw = new PrintWriter("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubjectafter.txt"); //파일 경로
        //삭제되기 전의 사용자의 수강과목 목록
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt")); //파일 경로
        String line1 = br1.readLine();
        //삭제되기 전의 사용자의 수강과목 루프
        while(line1 != null)
        {
            boolean flag = false;
            // 삭제하려는 수강과목
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\delete.txt")); //파일 경로
            String line2 = br2.readLine();
       
            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                 
                line2 = br2.readLine();
            }    
            // 삭제하려는 수강과목이 삭제되는 부분
            if(!flag)
                pw.println(line1);   
            line1 = br1.readLine();
        }
        pw.flush();
        br1.close();
        pw.close();
         
        System.out.println("삭제가 완료되었습니다.");
    }
}