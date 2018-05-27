package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubject1 extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	
	public AddSubject1() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(520, 3);
		wl.setLocation(0,70);
		wl.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("수강과목 등록(課程註冊)");
		c.add(title);
		title.setLocation(140, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("상명대과목(桑明大学 课程)");
		JButton btn2 = new JButton("직접입력(直接输入)");
		c.add(btn1);
		c.add(btn2);
		btn1.setLocation(40,130);
		btn1.setSize(200,100);
		btn2.setLocation(270,130);
		btn2.setSize(200,100);
		btn1.setBackground(new Color(255,255,255));
		btn2.setBackground(new Color(255,255,255));
		
		setSize(520, 390);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//AddSubject1 addSubject1 = new AddSubject1();
	}

}
