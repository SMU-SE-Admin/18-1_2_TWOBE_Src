package se.smu;
import javax.swing.*;
import javax.swing.event.*;


import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Login extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Container c;
	String stdNum = "201411096";
	String password = "10301030";
	int id;


	//수정 시작부분

	//try {
	//File src = new File("C:\\Users\\aaaaaa\\eclipse-workspace\\TWOBE" + siUrl +"_uer.txt");
	//FileInputStream fi = new FileInputStream(src);
	//ObjectInputStream writer = new ObjectInputStream(fi);
	//User user = (User)(writer.readObject());
	//}
	//catch(FileNotFoundException e) {
	//	e.printStackTrace();
	//}


	//수정 끝부분
	
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
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindPassword f; //1
				
				JButton btn = (JButton)e.getSource();
				
				if(true) {      
					f = new FindPassword(); //2
							      
				}

			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp s; //1
				
				JButton btn2 = (JButton)e.getSource();
				
				if(true) {      
					s = new SignUp(); //2
						      
				}

			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				MainUI m; //1
				LoginError l;
				JButton btn2 = (JButton)e.getSource();
				AddUser main = new AddUser();
				String num = studentNum3.getText();
				User user=null;
				try {
				FileInputStream fileStream = new FileInputStream(num+".ser"); // 직렬화해서 썼던 파일을 다시 읽오는 역할
				ObjectInputStream is = new ObjectInputStream(fileStream); // 읽어온 직렬화된 내용을 역직렬화 하는 역할

				user = (User)is.readObject(); 
				} catch (ClassNotFoundException o) {
		            o.printStackTrace();
		        } catch (IOException n) {
		            n.printStackTrace();
		        }
				
				String check = user.getPassword();
				
				
				String password = password3.getText();

				if(password.equals(check)) {
					id = Integer.parseInt(num);
					m = new MainUI(id); //2
					dispose();	
				}
				else {
					l = new LoginError();
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

