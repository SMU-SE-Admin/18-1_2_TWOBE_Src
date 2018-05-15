import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EditSubjectConfirm extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	
	public EditSubjectConfirm() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
	
		JLabel title = new JLabel("수강과목을 편집하시겠습니까?");
		c.add(title);
		title.setLocation(110, 40);
		title.setSize(350,40);
		title.setFont(f);
		JLabel title2 = new JLabel("(你想編輯課程嗎？)");
		c.add(title2);
		title2.setLocation(200, 80);
		title2.setSize(350,40);
		
		JButton btn1 = new JButton("네(是)");
		JButton btn2 = new JButton("아니오(沒有)");
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
		EditSubjectConfirm editSubjectConfirm = new EditSubjectConfirm();
	}

}
