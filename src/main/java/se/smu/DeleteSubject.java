package se.smu;

import java.io.*;

public class DeleteSubject {
    public static void main(String[] args) throws IOException {
        //������ ���� ������� �������� ���
        PrintWriter pw = new PrintWriter("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubjectafter.txt"); //���� ���
        //�����Ǳ� ���� ������� �������� ���
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\usersubject.txt")); //���� ���
        String line1 = br1.readLine();
        //�����Ǳ� ���� ������� �������� ����
        while(line1 != null)
        {
            boolean flag = false;
            // �����Ϸ��� ��������
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Wan\\eclipse-workspace\\SE_project\\src\\main\\java\\se\\smu\\delete.txt")); //���� ���
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
            // �����Ϸ��� ���������� �����Ǵ� �κ�
            if(!flag)
                pw.println(line1);   
            line1 = br1.readLine();
        }
        pw.flush();
        br1.close();
        pw.close();
         
        System.out.println("������ �Ϸ�Ǿ����ϴ�.");
    }
}