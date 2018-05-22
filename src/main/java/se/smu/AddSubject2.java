package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubject2 extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public AddSubject2() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1080, 3);
		wl.setLocation(0,50);
		wl.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("수강과목 (課程)");
		c.add(title);
		title.setLocation(460, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("로그아웃(退出)");
		c.add(btn1);
		btn1.setLocation(930,10);
		btn1.setSize(120,25);
		btn1.setBackground(new Color(255,255,255));
		
		JLabel subjectProf = new JLabel("담당교수(教授)");
		subjectProf.setLocation(360,80);
		subjectProf.setSize(150,40);
		subjectProf.setBackground(new Color(255,255,255));
		c.add(subjectProf);
		JLabel subjectName = new JLabel("과목명(课程名称)");
		subjectName.setLocation(530,80);
		subjectName.setSize(200,40);
		subjectName.setBackground(new Color(255,255,255));
		c.add(subjectName);
		JLabel subjectDay = new JLabel("요일/시간(星期几)");
		subjectDay.setLocation(750,80);
		subjectDay.setSize(130,40);
		subjectDay.setBackground(new Color(255,255,255));
		c.add(subjectDay);
		JLabel subjectSem = new JLabel("학기(会议)");
		subjectSem.setLocation(900,80);
		subjectSem.setSize(130,40);
		subjectSem.setBackground(new Color(255,255,255));
		c.add(subjectSem);
								
		JButton subjectedit1 = new JButton("편집(汇编)");
		c.add(subjectedit1);
		subjectedit1.setLocation(10,130);
		subjectedit1.setSize(95,40);
		subjectedit1.setBackground(new Color(255,255,255));		
		JButton subjectdel1 = new JButton("삭제(删除)");
		c.add(subjectdel1);
		subjectdel1.setLocation(115,130);
		subjectdel1.setSize(95,40);
		subjectdel1.setBackground(new Color(255,255,255));
		JButton subjectadd1 = new JButton("To-do 등록(注册)");
		c.add(subjectadd1);
		subjectadd1.setLocation(220,130);
		subjectadd1.setSize(130,40);
		subjectadd1.setBackground(new Color(255,255,255));
		JTextField subjectProf1 = new JTextField();
		subjectProf1.setLocation(360,130);
		subjectProf1.setSize(150,40);
		subjectProf1.setBackground(new Color(255,255,255));
		c.add(subjectProf1);
		JTextField subjectName1 = new JTextField();
		subjectName1.setLocation(530,130);
		subjectName1.setSize(200,40);
		subjectName1.setBackground(new Color(255,255,255));
		c.add(subjectName1);
		JTextField subjectDay1 = new JTextField();
		subjectDay1.setLocation(750,130);
		subjectDay1.setSize(130,40);
		subjectDay1.setBackground(new Color(255,255,255));
		c.add(subjectDay1);
		JTextField subjectSem1 = new JTextField();
		subjectSem1.setLocation(900,130);
		subjectSem1.setSize(130,40);
		subjectSem1.setBackground(new Color(255,255,255));
		c.add(subjectSem1);
		
		JButton subjectedit2 = new JButton("편집(汇编)");
		c.add(subjectedit2);
		subjectedit2.setLocation(10,230);
		subjectedit2.setSize(95,40);
		subjectedit2.setBackground(new Color(255,255,255));		
		JButton subjectdel2 = new JButton("삭제(删除)");
		c.add(subjectdel2);
		subjectdel2.setLocation(115,230);
		subjectdel2.setSize(95,40);
		subjectdel2.setBackground(new Color(255,255,255));
		JButton subjectadd2 = new JButton("To-do 등록(注册)");
		c.add(subjectadd2);
		subjectadd2.setLocation(220,230);
		subjectadd2.setSize(130,40);
		subjectadd2.setBackground(new Color(255,255,255));
		JTextField subjectProf2 = new JTextField();
		subjectProf2.setLocation(360,230);
		subjectProf2.setSize(150,40);
		subjectProf2.setBackground(new Color(255,255,255));
		c.add(subjectProf2);
		JTextField subjectName2 = new JTextField();
		subjectName2.setLocation(530,230);
		subjectName2.setSize(200,40);
		subjectName2.setBackground(new Color(255,255,255));
		c.add(subjectName2);
		JTextField subjectDay2 = new JTextField();
		subjectDay2.setLocation(750,230);
		subjectDay2.setSize(130,40);
		subjectDay2.setBackground(new Color(255,255,255));
		c.add(subjectDay2);
		JTextField subjectSem2 = new JTextField();
		subjectSem2.setLocation(900,230);
		subjectSem2.setSize(130,40);
		subjectSem2.setBackground(new Color(255,255,255));
		c.add(subjectSem2);
		
		JButton subjectedit3 = new JButton("편집(汇编)");
		c.add(subjectedit3);
		subjectedit3.setLocation(10,330);
		subjectedit3.setSize(95,40);
		subjectedit3.setBackground(new Color(255,255,255));		
		JButton subjectdel3 = new JButton("삭제(删除)");
		c.add(subjectdel3);
		subjectdel3.setLocation(115,330);
		subjectdel3.setSize(95,40);
		subjectdel3.setBackground(new Color(255,255,255));
		JButton subjectadd3 = new JButton("To-do 등록(注册)");
		c.add(subjectadd3);
		subjectadd3.setLocation(220,330);
		subjectadd3.setSize(130,40);
		subjectadd3.setBackground(new Color(255,255,255));
		JTextField subjectProf3 = new JTextField();
		subjectProf3.setLocation(360,330);
		subjectProf3.setSize(150,40);
		subjectProf3.setBackground(new Color(255,255,255));
		c.add(subjectProf3);
		JTextField subjectName3 = new JTextField();
		subjectName3.setLocation(530,330);
		subjectName3.setSize(200,40);
		subjectName3.setBackground(new Color(255,255,255));
		c.add(subjectName3);
		JTextField subjectDay3 = new JTextField();
		subjectDay3.setLocation(750,330);
		subjectDay3.setSize(130,40);
		subjectDay3.setBackground(new Color(255,255,255));
		c.add(subjectDay3);
		JTextField subjectSem3 = new JTextField();
		subjectSem3.setLocation(900,330);
		subjectSem3.setSize(130,40);
		subjectSem3.setBackground(new Color(255,255,255));
		c.add(subjectSem3);
		
		JButton subjectedit4 = new JButton("편집(汇编)");
		c.add(subjectedit4);
		subjectedit4.setLocation(10,430);
		subjectedit4.setSize(95,40);
		subjectedit4.setBackground(new Color(255,255,255));		
		JButton subjectdel4 = new JButton("삭제(删除)");
		c.add(subjectdel4);
		subjectdel4.setLocation(115,430);
		subjectdel4.setSize(95,40);
		subjectdel4.setBackground(new Color(255,255,255));
		JButton subjectadd4 = new JButton("To-do 등록(注册)");
		c.add(subjectadd4);
		subjectadd4.setLocation(220,430);
		subjectadd4.setSize(130,40);
		subjectadd4.setBackground(new Color(255,255,255));
		JTextField subjectProf4 = new JTextField();
		subjectProf4.setLocation(360,430);
		subjectProf4.setSize(150,40);
		subjectProf4.setBackground(new Color(255,255,255));
		c.add(subjectProf4);
		JTextField subjectName4 = new JTextField();
		subjectName4.setLocation(530,430);
		subjectName4.setSize(200,40);
		subjectName4.setBackground(new Color(255,255,255));
		c.add(subjectName4);
		JTextField subjectDay4 = new JTextField();
		subjectDay4.setLocation(750,430);
		subjectDay4.setSize(130,40);
		subjectDay4.setBackground(new Color(255,255,255));
		c.add(subjectDay4);
		JTextField subjectSem4 = new JTextField();
		subjectSem4.setLocation(900,430);
		subjectSem4.setSize(130,40);
		subjectSem4.setBackground(new Color(255,255,255));
		c.add(subjectSem4);
		
		JButton subjectplus = new JButton("+");
		c.add(subjectplus);
		subjectplus.setLocation(10,530);
		subjectplus.setBackground(new Color(255,255,255));
		subjectplus.setSize(95,40);

		setSize(1080, 720);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		AddSubject2 addSubject2 = new AddSubject2();
	}

}
