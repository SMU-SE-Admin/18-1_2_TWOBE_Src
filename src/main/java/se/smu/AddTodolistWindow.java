package se.smu;
import javax.swing.*;
import javax.swing.event.*;


import java.awt.*;
import java.awt.event.*;

public class AddTodolistWindow extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public AddTodolistWindow(Student st,int i) {
		
		String subjectName;
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
		
		JLabel title = new JLabel("To do list 등록 (To-do list 註冊)");
		c.add(title);
		title.setLocation(370, 8);
		title.setSize(350,40);
		title.setFont(f);
		
		
		
		JLabel todoName = new JLabel("항목이름(項目名稱)");
		todoName.setLocation(100,70);
		todoName.setSize(150,40);
		todoName.setBackground(new Color(255,255,255));
		c.add(todoName);
		JTextField todoName2 = new JTextField();
		todoName2.setLocation(300,70);
		todoName2.setSize(650,40);
		todoName2.setBackground(new Color(255,255,255));
		c.add(todoName2);
		
		JLabel todoDeadline = new JLabel("마감기한(期限)");
		todoDeadline.setLocation(100,120);
		todoDeadline.setSize(150,40);
		todoDeadline.setBackground(new Color(255,255,255));
		c.add(todoDeadline);
		JTextField todoDeadline2 = new JTextField();
		todoDeadline2.setLocation(300,120);
		todoDeadline2.setSize(650,40);
		todoDeadline2.setBackground(new Color(255,255,255));
		c.add(todoDeadline2);

		JLabel todoFinishDate = new JLabel("실제마감일(實際截止日期)");
		todoFinishDate.setLocation(100,170);
		todoFinishDate.setSize(250,40);
		todoFinishDate.setBackground(new Color(255,255,255));
		c.add(todoFinishDate);
		JTextField todoFinishDate2 = new JTextField();
		todoFinishDate2.setLocation(300,170);
		todoFinishDate2.setSize(650,40);
		todoFinishDate2.setBackground(new Color(255,255,255));
		c.add(todoFinishDate2);
		
		JLabel todoCompleted = new JLabel("완료여부(狀態完成)");
		todoCompleted.setLocation(100,220);
		todoCompleted.setSize(150,40);
		todoCompleted.setBackground(new Color(255,255,255));
		c.add(todoCompleted);
		JTextField todoCompleted2 = new JTextField();
		todoCompleted2.setLocation(300,220);
		todoCompleted2.setSize(650,40);
		todoCompleted2.setBackground(new Color(255,255,255));
		c.add(todoCompleted2);
		
		JLabel todoImportant = new JLabel("중요여부(也罷)");
		todoImportant.setLocation(100,270);
		todoImportant.setSize(150,40);
		todoImportant.setBackground(new Color(255,255,255));
		c.add(todoImportant);
		JTextField todoImportant2 = new JTextField();
		todoImportant2.setLocation(300,270);
		todoImportant2.setSize(650,40);
		todoImportant2.setBackground(new Color(255,255,255));
		c.add(todoImportant2);

		JButton todoConfirm = new JButton("등록(註冊)");
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
		todoConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tdlUrl=st.tdlUrl;
				String subjectName=st.getSarrName(i);
				String tdlName=todoName2.getText();
				String tdlDeadline=todoDeadline2.getText();
				String tdlFinishDate=todoFinishDate2.getText();
				Boolean tdlCompleted=Boolean.valueOf(todoCompleted2.getText()).booleanValue();
				Boolean tdlImportant=Boolean.valueOf(todoImportant2.getText()).booleanValue();
				
			    
			    st.add_tdl(tdlUrl,subjectName,tdlName,tdlDeadline,tdlFinishDate,tdlCompleted,tdlImportant);
			    MainUI m=new MainUI(st);
			  
			    dispose();
			    
		
			}
		});
		
		todoCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				MainUI m;
				m=new MainUI(st);
				dispose();
				
			}
		});
	}
	
	public static void main(String[] args) {
		//AddTodolistWindow addTodolistWindow = new AddTodolistWindow();
	}

}

