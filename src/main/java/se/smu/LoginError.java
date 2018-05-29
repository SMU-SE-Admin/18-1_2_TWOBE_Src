package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LoginError extends JFrame{
	//private Font f = new Font("돋움", Font.BOLD, 20);
	
	public LoginError() {
		setTitle("실행 오류");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JLabel em = new JLabel("아이디와 비밀번호를 확인해주세요");
		JButton ob = new JButton("확인");
		
		c.add(em);
		c.add(ob);
		
		em.setLocation(70, 15);
		em.setSize(250, 50);
		ob.setLocation(140, 85);
		ob.setSize(70, 25);
		
		JLabel em2 = new JLabel("(请检查您的ID和密码。)");
		c.add(em2);
		em2.setLocation(110, 35);
		em2.setSize(250, 50);
		
		JLabel em3 = new JLabel("(确认。)");
		c.add(em3);
		em3.setLocation(155, 95);
		em3.setSize(150, 50);

		setSize(360, 180);
		setVisible(true);
		
		
		ob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(true) {
					dispose();		      
				}

			}
		});
		
	}

}
