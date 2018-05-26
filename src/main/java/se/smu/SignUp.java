package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public SignUp() {
		setTitle("To do list");
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1080, 3);
		wl.setLocation(0,50);
		wl.setBackground(new Color(255,255,255));
		
		JLabel title = new JLabel("회원가입 (報名)");
		c.add(title);
		title.setLocation(500, 8);
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
		
		JLabel todoDeadline = new JLabel("이름(名)");
		todoDeadline.setLocation(100,120);
		todoDeadline.setSize(150,40);
		todoDeadline.setBackground(new Color(255,255,255));
		c.add(todoDeadline);
		JTextField todoDeadline2 = new JTextField();
		todoDeadline2.setLocation(300,120);
		todoDeadline2.setSize(650,40);
		todoDeadline2.setBackground(new Color(255,255,255));
		c.add(todoDeadline2);

		JLabel todoFinishDate = new JLabel("학과(教訓)");
		todoFinishDate.setLocation(100,170);
		todoFinishDate.setSize(250,40);
		todoFinishDate.setBackground(new Color(255,255,255));
		c.add(todoFinishDate);
		JTextField todoFinishDate2 = new JTextField();
		todoFinishDate2.setLocation(300,170);
		todoFinishDate2.setSize(650,40);
		todoFinishDate2.setBackground(new Color(255,255,255));
		c.add(todoFinishDate2);
		
		JLabel todoCompleted = new JLabel("비밀번호(密碼)");
		todoCompleted.setLocation(100,220);
		todoCompleted.setSize(150,40);
		todoCompleted.setBackground(new Color(255,255,255));
		c.add(todoCompleted);
		JTextField todoCompleted2 = new JTextField();
		todoCompleted2.setLocation(300,220);
		todoCompleted2.setSize(650,40);
		todoCompleted2.setBackground(new Color(255,255,255));
		c.add(todoCompleted2);
		
		JLabel todoImportant = new JLabel("가장 존경하는 교수님 성함(最尊敬的名字)");
		todoImportant.setLocation(50,270);
		todoImportant.setSize(250,40);
		todoImportant.setBackground(new Color(255,255,255));
		c.add(todoImportant);
		JTextField todoImportant2 = new JTextField();
		todoImportant2.setLocation(300,270);
		todoImportant2.setSize(650,40);
		todoImportant2.setBackground(new Color(255,255,255));
		c.add(todoImportant2);

		JButton todoConfirm = new JButton("가입(註冊)");
		c.add(todoConfirm);
		todoConfirm.setLocation(820,360);
		todoConfirm.setBackground(new Color(255,255,255));
		todoConfirm.setSize(120,40);
		JButton todoCancel = new JButton("취소(取消)");
		c.add(todoCancel);
		todoCancel.setLocation(940,360);
		todoCancel.setBackground(new Color(255,255,255));
		todoCancel.setSize(120,40);

		setSize(1080, 470);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SignUp signUp = new SignUp();
	}

}

