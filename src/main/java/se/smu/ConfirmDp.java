package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmDp extends JFrame{
	private Font f = new Font("µ¸¿ò", Font.BOLD, 20);
	
	public ConfirmDp(String str1, String str2) {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
	
		JLabel title = new JLabel(str1);
		c.add(title);
		title.setLocation(110, 40);
		title.setSize(350,40);
		title.setFont(f);
		JLabel title2 = new JLabel(str2);
		c.add(title2);
		
		title2.setLocation(200, 80);
		title2.setSize(350,40);

		
		JButton btn1 = new JButton("³×(ãÀ)");
		JButton btn2 = new JButton("¾Æ´Ï¿À(ÙÒêó)");
		c.add(btn1);
		c.add(btn2);
		btn1.setLocation(100,130);
		btn1.setSize(150,50);
		btn2.setLocation(250,130);
		btn2.setSize(150,50);
		btn1.setBackground(new Color(255,255,255));
		btn2.setBackground(new Color(255,255,255));
		
		setSize(520, 290);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	//	ConfirmDp confirmDp = new ConfirmDp(str1, str2);
	}

}
