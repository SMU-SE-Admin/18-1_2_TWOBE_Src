package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubjectConfirm2 extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	
	public AddSubjectConfirm2(Student st) {
		setTitle("Subject");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);

			
		JLabel title = new JLabel(" 다시입력해주세요.(请重新输入)");
		c.add(title);
		title.setLocation(100, 40);
		title.setSize(350,40);
		title.setFont(f);
		JLabel title2 = new JLabel("시간,수강년도,학기는 숫자로 입력해주세요");
		c.add(title2);
		JLabel title3 = new JLabel("(时间,听课年度,学期请用数字输入)");
		c.add(title3);
		title2.setLocation(100, 80);
		title2.setSize(500,40);
		title3.setLocation(100,100);
		title3.setSize(500,40);

		
		JButton btn1 = new JButton("네(是)");
		c.add(btn1);
		btn1.setLocation(100,130);
		btn1.setSize(150,50);
		
		btn1.setBackground(new Color(255,255,255));
		
		setSize(520, 290);
		setVisible(true);
	
	
		btn1.addActionListener(new Listener(st));
		
	}
	
	private class Listener implements ActionListener{
		Student st;
		
		public Listener(Student st){
			this.st = st;
		}
		
		public void actionPerformed(ActionEvent e){
			dispose();
			
		}
		
	}


}