package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EditSubjectWindow extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	
	public EditSubjectWindow() {
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
		
		JLabel title = new JLabel("수강과목 편집 (課程編輯)");
		c.add(title);
		title.setLocation(420, 8);
		title.setSize(350,40);
		title.setFont(f);
		
		
		
		JLabel subjectName = new JLabel("과목이름(課程名稱)");
		subjectName.setLocation(100,70);
		subjectName.setSize(150,40);
		subjectName.setBackground(new Color(255,255,255));
		c.add(subjectName);
		JTextField subjectName2 = new JTextField();
		subjectName2.setLocation(300,70);
		subjectName2.setSize(650,40);
		subjectName2.setBackground(new Color(255,255,255));
		c.add(subjectName2);
		
		JLabel subjectProf = new JLabel("담당교수(教授)");
		subjectProf.setLocation(100,120);
		subjectProf.setSize(150,40);
		subjectProf.setBackground(new Color(255,255,255));
		c.add(subjectProf);
		JTextField subjectProf2 = new JTextField();
		subjectProf2.setLocation(300,120);
		subjectProf2.setSize(650,40);
		subjectProf2.setBackground(new Color(255,255,255));
		c.add(subjectProf2);

		JLabel subjectDay = new JLabel("요일(星期幾)");
		subjectDay.setLocation(100,170);
		subjectDay.setSize(150,40);
		subjectDay.setBackground(new Color(255,255,255));
		c.add(subjectDay);
		JTextField subjectDay2 = new JTextField();
		subjectDay2.setLocation(300,170);
		subjectDay2.setSize(650,40);
		subjectDay2.setBackground(new Color(255,255,255));
		c.add(subjectDay2);
		
		JLabel subjectTime = new JLabel("시간(時間)");
		subjectTime.setLocation(100,220);
		subjectTime.setSize(150,40);
		subjectTime.setBackground(new Color(255,255,255));
		c.add(subjectTime);
		JTextField subjectTime2 = new JTextField();
		subjectTime2.setLocation(300,220);
		subjectTime2.setSize(650,40);
		subjectTime2.setBackground(new Color(255,255,255));
		c.add(subjectTime2);
		
		JLabel subjectYear = new JLabel("수강년도(學習年份)");
		subjectYear.setLocation(100,270);
		subjectYear.setSize(150,40);
		subjectYear.setBackground(new Color(255,255,255));
		c.add(subjectYear);
		JTextField subjectYear2 = new JTextField();
		subjectYear2.setLocation(300,270);
		subjectYear2.setSize(650,40);
		subjectYear2.setBackground(new Color(255,255,255));
		c.add(subjectYear2);
		
		JLabel subjectSemester = new JLabel("학기(會議)");
		subjectSemester.setLocation(100,320);
		subjectSemester.setSize(150,40);
		subjectSemester.setBackground(new Color(255,255,255));
		c.add(subjectSemester);
		JTextField subjectSemester2 = new JTextField();
		subjectSemester2.setLocation(300,320);
		subjectSemester2.setSize(650,40);
		subjectSemester2.setBackground(new Color(255,255,255));
		c.add(subjectSemester2);

		
		JButton subjectConfirm = new JButton("편집(彙編)");
		c.add(subjectConfirm);
		subjectConfirm.setLocation(820,430);
		subjectConfirm.setBackground(new Color(255,255,255));
		subjectConfirm.setSize(120,40);
		JButton subjectCancel = new JButton("취소(取消)");
		c.add(subjectCancel);
		subjectCancel.setLocation(940,430);
		subjectCancel.setBackground(new Color(255,255,255));
		subjectCancel.setSize(120,40);

		setSize(1080, 520);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		EditSubjectWindow editSubjectWindow = new EditSubjectWindow();
	}

}
