package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubject3 extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	//private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public AddSubject3() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1080, 3);
		wl.setLocation(0,60);
		wl.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("수강과목 등록(課程註冊)");
		c.add(title);
		title.setLocation(430, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("로그아웃(退出)");
		c.add(btn1);
		btn1.setLocation(930,10);
		btn1.setSize(120,25);
		btn1.setBackground(new Color(255,255,255));
		
		JLabel subjectN = new JLabel("과목명(课程名称)");
		subjectN.setLocation(160,120);
		subjectN.setSize(150,40);
		subjectN.setBackground(new Color(255,255,255));
		c.add(subjectN);		
		JTextField findSubject = new JTextField();
		findSubject.setLocation(320,120);
		findSubject.setSize(500,40);
		findSubject.setBackground(new Color(255,255,255));
		c.add(findSubject);		
		JButton findButton = new JButton("검색(取回)");
		c.add(findButton);
		findButton.setLocation(825,120);
		findButton.setSize(150,40);
		findButton.setBackground(new Color(255,255,255));
		
		JLabel subjectProf = new JLabel("담당교수(教授)");
		subjectProf.setLocation(100,220);
		subjectProf.setSize(150,40);
		subjectProf.setBackground(new Color(255,255,255));
		c.add(subjectProf);
		JLabel subjectName = new JLabel("과목명(课程名称)");
		subjectName.setLocation(270,220);
		subjectName.setSize(200,40);
		subjectName.setBackground(new Color(255,255,255));
		c.add(subjectName);
		JLabel subjectDay = new JLabel("요일(星期几)");
		subjectDay.setLocation(430,220);
		subjectDay.setSize(130,40);
		subjectDay.setBackground(new Color(255,255,255));
		c.add(subjectDay);
		JLabel subjectTime = new JLabel("시간(时间)");
		subjectTime.setLocation(560,220);
		subjectTime.setSize(130,40);
		subjectTime.setBackground(new Color(255,255,255));
		c.add(subjectTime);
		JLabel subjectYear = new JLabel("수강년도(学习年份)");
		subjectYear.setLocation(680,220);
		subjectYear.setSize(130,40);
		subjectYear.setBackground(new Color(255,255,255));
		c.add(subjectYear);
		JLabel subjectSem = new JLabel("학기(会议)");
		subjectSem.setLocation(850,220);
		subjectSem.setSize(130,40);
		subjectSem.setBackground(new Color(255,255,255));
		c.add(subjectSem);
		
		JTextField subjectProf1 = new JTextField();
		subjectProf1.setLocation(80,270);
		subjectProf1.setSize(140,40);
		subjectProf1.setBackground(new Color(255,255,255));
		c.add(subjectProf1);
		JTextField subjectName1 = new JTextField();
		subjectName1.setLocation(220,270);
		subjectName1.setSize(200,40);
		subjectName1.setBackground(new Color(255,255,255));
		c.add(subjectName1);
		JTextField subjectDay1 = new JTextField();
		subjectDay1.setLocation(420,270);
		subjectDay1.setSize(100,40);
		subjectDay1.setBackground(new Color(255,255,255));
		c.add(subjectDay1);
		JTextField subjectTime1 = new JTextField();
		subjectTime1.setLocation(520,270);
		subjectTime1.setSize(120,40);
		subjectTime1.setBackground(new Color(255,255,255));
		c.add(subjectTime1);
		JTextField subjectYear1 = new JTextField();
		subjectYear1.setLocation(640,270);
		subjectYear1.setSize(180,40);
		subjectYear1.setBackground(new Color(255,255,255));
		c.add(subjectYear1);
		JTextField subjectSem1 = new JTextField();
		subjectSem1.setLocation(820,270);
		subjectSem1.setSize(130,40);
		subjectSem1.setBackground(new Color(255,255,255));
		c.add(subjectSem1);
		
		JButton subjectplus = new JButton("등록(註冊)");
		c.add(subjectplus);
		subjectplus.setLocation(950,270);
		subjectplus.setBackground(new Color(255,255,255));
		subjectplus.setSize(95,40);
		
		
		
		
		
		setSize(1080, 420);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//AddSubject3 addSubject3 = new AddSubject3();
	}

}
