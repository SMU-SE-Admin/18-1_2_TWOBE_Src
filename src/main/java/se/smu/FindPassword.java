package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FindPassword extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	//private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public FindPassword() {
		setTitle("To do list");
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1080, 3);
		wl.setLocation(0,50);
		wl.setBackground(new Color(255,255,255));
		
		JPanel wl2 = new JPanel();
		c.add(wl2);
		wl2.setSize(1080, 3);
		wl2.setLocation(0,280);
		wl2.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("비밀번호 찾기 (查找密码)");
		c.add(title);
		title.setLocation(430, 8);
		title.setSize(350,40);
		title.setFont(f);
		
		
		
		JLabel todoName = new JLabel("학번(學生人數)");
		todoName.setLocation(100,70);
		todoName.setSize(150,40);
		todoName.setBackground(new Color(255,255,255));
		c.add(todoName);
		JTextField todoName2 = new JTextField();
		todoName2.setLocation(300,70);
		todoName2.setSize(650,40);
		todoName2.setBackground(new Color(255,255,255));
		c.add(todoName2);

		
		JLabel todoImportant = new JLabel("가장 존경하는 교수님 성함(最尊敬的名字)");
		todoImportant.setLocation(50,120);
		todoImportant.setSize(250,40);
		todoImportant.setBackground(new Color(255,255,255));
		c.add(todoImportant);
		JTextField todoImportant2 = new JTextField();
		todoImportant2.setLocation(300,120);
		todoImportant2.setSize(650,40);
		todoImportant2.setBackground(new Color(255,255,255));
		c.add(todoImportant2);

		JButton todoConfirm = new JButton("찾기(找到)");
		c.add(todoConfirm);
		todoConfirm.setLocation(820,210);
		todoConfirm.setBackground(new Color(255,255,255));
		todoConfirm.setSize(120,40);
		JButton todoCancel = new JButton("취소(取消)");
		c.add(todoCancel);
		todoCancel.setLocation(940,210);
		todoCancel.setBackground(new Color(255,255,255));
		todoCancel.setSize(120,40);
		setSize(1080, 440);
		setVisible(true);
		
		JLabel todoImportant1 = new JLabel("찾는 비밀번호(寻找密码)");
		todoImportant1.setLocation(50,320);
		todoImportant1.setSize(250,40);
		todoImportant1.setBackground(new Color(255,255,255));
		c.add(todoImportant1);
		JTextField todoImportant21 = new JTextField();
		todoImportant21.setLocation(300,320);
		todoImportant21.setSize(650,40);
		todoImportant21.setBackground(new Color(255,255,255));
		c.add(todoImportant21);
		
		
		todoConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				MainUI m; //수정 시작
				FindPasswordError l;
				JButton btn2 = (JButton)e.getSource();
				AddUser main = new AddUser();
				String num = todoName2.getText();
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
				
				String check = user.getQues();
				
				String p = todoImportant2.getText();

				if(p.equals(check)) {
					todoImportant21.setText(user.getPassword());
	
				}
				else {
					l = new FindPasswordError();

				}					      
			} //수정 끝
		});
		
		todoCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
					dispose();						      
			}
		});
	}

}

