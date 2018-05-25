package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


class Login extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Container c;
	String stdNum="201411096";
	String password="10301030";
	
	public Login() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(520, 3);
		wl.setLocation(0,70);
		wl.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("로그인(注册)");
		JLabel studentNum = new JLabel("학번");
		JLabel password = new JLabel("비밀번호");
		JLabel studentNum2 = new JLabel("(学号)");
		JLabel password2 = new JLabel("(密码)");
		final JTextField studentNum3 = new JTextField();
		final JPasswordField password3 = new JPasswordField();
		JButton btn1 = new JButton("비밀번호찾기(查找密码)");
		JButton btn2 = new JButton("회원가입(报名)");
		JButton btn3 = new JButton("로그인(注册)");
		
		c.add(title);
		c.add(studentNum);
		c.add(password);
		c.add(studentNum2);
		c.add(password2);
		c.add(studentNum3);
		c.add(password3);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);

		
		title.setLocation(200, 12);
		title.setSize(150,40);
		studentNum.setLocation(60,110);
		studentNum.setSize(60,20);
		password.setLocation(50,190);
		password.setSize(60,20);
		studentNum2.setLocation(57,130);
		studentNum2.setSize(60,20);
		password2.setLocation(60,210);
		password2.setSize(60,20);
		studentNum3.setLocation(150,120);
		studentNum3.setSize(260,20);
		password3.setLocation(150,200);
		password3.setSize(260,20);
		btn1.setLocation(50,300);
		btn1.setSize(200,20);
		btn2.setLocation(250,300);
		btn2.setSize(130,20);
		btn3.setLocation(380,300);
		btn3.setSize(120,20);
		


		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainUI m; //1
				JButton btn2 = (JButton)e.getSource();
				
				if(studentNum3.getText().equals("201411096") && password3.getText().equals("10301030")) {      
					m = new MainUI(); //2
					dispose();		      
				}
			}
		});

		title.setFont(f);
		
		setSize(520, 390);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Login login = new Login();
	}

}

