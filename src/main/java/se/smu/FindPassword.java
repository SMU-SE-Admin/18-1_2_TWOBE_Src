package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FindPassword extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	//private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public FindPassword() {
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
		setSize(1080, 320);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//FindPassword findPassword = new FindPassword();
	}

}

