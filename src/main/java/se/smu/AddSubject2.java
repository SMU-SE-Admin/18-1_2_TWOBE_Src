package se.smu;
import javax.swing.*;
import javax.swing.event.*;



import java.awt.*;
import java.awt.event.*;

public class AddSubject2 extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	Student st;
	int i=0;
	public AddSubject2(Student st) {
		this.st = st;
	    
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
		
		JLabel title = new JLabel("수강과목 (課程)");
		c.add(title);
		title.setLocation(460, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("로그아웃(退出)");
		c.add(btn1);
		btn1.setLocation(930,10);
		btn1.setSize(120,25);
		btn1.setBackground(new Color(255,255,255));
		
		JLabel subjectProf = new JLabel("담당교수(教授)");
		subjectProf.setLocation(360,80);
		subjectProf.setSize(150,40);
		subjectProf.setBackground(new Color(255,255,255));
		c.add(subjectProf);
		JLabel subjectName = new JLabel("과목명(课程名称)");
		subjectName.setLocation(530,80);
		subjectName.setSize(200,40);
		subjectName.setBackground(new Color(255,255,255));
		c.add(subjectName);
		JLabel subjectDay = new JLabel("요일/시간(星期几)");
		subjectDay.setLocation(750,80);
		subjectDay.setSize(130,40);
		subjectDay.setBackground(new Color(255,255,255));
		c.add(subjectDay);
		JLabel subjectSem = new JLabel("학기(会议)");
		subjectSem.setLocation(900,80);
		subjectSem.setSize(130,40);
		subjectSem.setBackground(new Color(255,255,255));
		c.add(subjectSem);
								
		JButton subjectedit1 = new JButton("편집(汇编)");
		c.add(subjectedit1);
		subjectedit1.setLocation(10,130);
		subjectedit1.setSize(95,40);
		subjectedit1.setBackground(new Color(255,255,255));		
		JButton subjectdel1 = new JButton("삭제(删除)");
		c.add(subjectdel1);
		subjectdel1.setLocation(115,130);
		subjectdel1.setSize(95,40);
		subjectdel1.setBackground(new Color(255,255,255));
		JButton subjectadd1 = new JButton("To-do 등록(注册)");
		c.add(subjectadd1);
		subjectadd1.setLocation(220,130);
		subjectadd1.setSize(130,40);
		subjectadd1.setBackground(new Color(255,255,255));
		JTextField subjectProf1 = new JTextField();
		subjectProf1.setLocation(360,130);
		subjectProf1.setSize(150,40);
		subjectProf1.setBackground(new Color(255,255,255));
		c.add(subjectProf1);
		JTextField subjectName1 = new JTextField();
		subjectName1.setLocation(530,130);
		subjectName1.setSize(200,40);
		subjectName1.setBackground(new Color(255,255,255));
		c.add(subjectName1);
		JTextField subjectDay1 = new JTextField();
		subjectDay1.setLocation(750,130);
		subjectDay1.setSize(130,40);
		subjectDay1.setBackground(new Color(255,255,255));
		c.add(subjectDay1);
		JTextField subjectSem1 = new JTextField();
		subjectSem1.setLocation(900,130);
		subjectSem1.setSize(130,40);
		subjectSem1.setBackground(new Color(255,255,255));
		c.add(subjectSem1);
		if(st.s_arr[i]!=null){
			subjectProf1.setText(st.getSarrPro(i));
			
			
			i++;
		}
		
		JButton subjectedit2 = new JButton("편집(汇编)");
		c.add(subjectedit2);
		subjectedit2.setLocation(10,230);
		subjectedit2.setSize(95,40);
		subjectedit2.setBackground(new Color(255,255,255));		
		JButton subjectdel2 = new JButton("삭제(删除)");
		c.add(subjectdel2);
		subjectdel2.setLocation(115,230);
		subjectdel2.setSize(95,40);
		subjectdel2.setBackground(new Color(255,255,255));
		JButton subjectadd2 = new JButton("To-do 등록(注册)");
		c.add(subjectadd2);
		subjectadd2.setLocation(220,230);
		subjectadd2.setSize(130,40);
		subjectadd2.setBackground(new Color(255,255,255));
		JTextField subjectProf2 = new JTextField();
		subjectProf2.setLocation(360,230);
		subjectProf2.setSize(150,40);
		subjectProf2.setBackground(new Color(255,255,255));
		c.add(subjectProf2);
		JTextField subjectName2 = new JTextField();
		subjectName2.setLocation(530,230);
		subjectName2.setSize(200,40);
		subjectName2.setBackground(new Color(255,255,255));
		c.add(subjectName2);
		JTextField subjectDay2 = new JTextField();
		subjectDay2.setLocation(750,230);
		subjectDay2.setSize(130,40);
		subjectDay2.setBackground(new Color(255,255,255));
		c.add(subjectDay2);
		JTextField subjectSem2 = new JTextField();
		subjectSem2.setLocation(900,230);
		subjectSem2.setSize(130,40);
		subjectSem2.setBackground(new Color(255,255,255));
		c.add(subjectSem2);
		
		JButton subjectedit3 = new JButton("편집(汇编)");
		c.add(subjectedit3);
		subjectedit3.setLocation(10,330);
		subjectedit3.setSize(95,40);
		subjectedit3.setBackground(new Color(255,255,255));		
		JButton subjectdel3 = new JButton("삭제(删除)");
		c.add(subjectdel3);
		subjectdel3.setLocation(115,330);
		subjectdel3.setSize(95,40);
		subjectdel3.setBackground(new Color(255,255,255));
		JButton subjectadd3 = new JButton("To-do 등록(注册)");
		c.add(subjectadd3);
		subjectadd3.setLocation(220,330);
		subjectadd3.setSize(130,40);
		subjectadd3.setBackground(new Color(255,255,255));
		JTextField subjectProf3 = new JTextField();
		subjectProf3.setLocation(360,330);
		subjectProf3.setSize(150,40);
		subjectProf3.setBackground(new Color(255,255,255));
		c.add(subjectProf3);
		JTextField subjectName3 = new JTextField();
		subjectName3.setLocation(530,330);
		subjectName3.setSize(200,40);
		subjectName3.setBackground(new Color(255,255,255));
		c.add(subjectName3);
		JTextField subjectDay3 = new JTextField();
		subjectDay3.setLocation(750,330);
		subjectDay3.setSize(130,40);
		subjectDay3.setBackground(new Color(255,255,255));
		c.add(subjectDay3);
		JTextField subjectSem3 = new JTextField();
		subjectSem3.setLocation(900,330);
		subjectSem3.setSize(130,40);
		subjectSem3.setBackground(new Color(255,255,255));
		c.add(subjectSem3);
		
		JButton subjectedit4 = new JButton("편집(汇编)");
		c.add(subjectedit4);
		subjectedit4.setLocation(10,430);
		subjectedit4.setSize(95,40);
		subjectedit4.setBackground(new Color(255,255,255));		
		JButton subjectdel4 = new JButton("삭제(删除)");
		c.add(subjectdel4);
		subjectdel4.setLocation(115,430);
		subjectdel4.setSize(95,40);
		subjectdel4.setBackground(new Color(255,255,255));
		JButton subjectadd4 = new JButton("To-do 등록(注册)");
		c.add(subjectadd4);
		subjectadd4.setLocation(220,430);
		subjectadd4.setSize(130,40);
		subjectadd4.setBackground(new Color(255,255,255));
		JTextField subjectProf4 = new JTextField();
		subjectProf4.setLocation(360,430);
		subjectProf4.setSize(150,40);
		subjectProf4.setBackground(new Color(255,255,255));
		c.add(subjectProf4);
		JTextField subjectName4 = new JTextField();
		subjectName4.setLocation(530,430);
		subjectName4.setSize(200,40);
		subjectName4.setBackground(new Color(255,255,255));
		c.add(subjectName4);
		JTextField subjectDay4 = new JTextField();
		subjectDay4.setLocation(750,430);
		subjectDay4.setSize(130,40);
		subjectDay4.setBackground(new Color(255,255,255));
		c.add(subjectDay4);
		JTextField subjectSem4 = new JTextField();
		subjectSem4.setLocation(900,430);
		subjectSem4.setSize(130,40);
		subjectSem4.setBackground(new Color(255,255,255));
		c.add(subjectSem4);
		
		JButton subjectedit5 = new JButton("편집(汇编)");
		c.add(subjectedit5);
		subjectedit5.setLocation(10,530);
		subjectedit5.setSize(95,40);
		subjectedit5.setBackground(new Color(255,255,255));		
		JButton subjectdel5 = new JButton("삭제(删除)");
		c.add(subjectdel5);
		subjectdel5.setLocation(115,530);
		subjectdel5.setSize(95,40);
		subjectdel5.setBackground(new Color(255,255,255));
		JButton subjectadd5 = new JButton("To-do 등록(注册)");
		c.add(subjectadd5);
		subjectadd5.setLocation(220,530);
		subjectadd5.setSize(130,40);
		subjectadd5.setBackground(new Color(255,255,255));
		JTextField subjectProf5 = new JTextField();
		subjectProf5.setLocation(360,530);
		subjectProf5.setSize(150,40);
		subjectProf5.setBackground(new Color(255,255,255));
		c.add(subjectProf5);
		JTextField subjectName5 = new JTextField();
		subjectName5.setLocation(530,530);
		subjectName5.setSize(200,40);
		subjectName5.setBackground(new Color(255,255,255));
		c.add(subjectName5);
		JTextField subjectDay5 = new JTextField();
		subjectDay5.setLocation(750,530);
		subjectDay5.setSize(130,40);
		subjectDay5.setBackground(new Color(255,255,255));
		c.add(subjectDay5);
		JTextField subjectSem5 = new JTextField();
		subjectSem5.setLocation(900,530);
		subjectSem5.setSize(130,40);
		subjectSem5.setBackground(new Color(255,255,255));
		c.add(subjectSem5);
		
		JButton subjectedit6 = new JButton("편집(汇编)");
		c.add(subjectedit6);
		subjectedit6.setLocation(10,630);
		subjectedit6.setSize(95,40);
		subjectedit6.setBackground(new Color(255,255,255));		
		JButton subjectdel6 = new JButton("삭제(删除)");
		c.add(subjectdel6);
		subjectdel6.setLocation(115,630);
		subjectdel6.setSize(95,40);
		subjectdel6.setBackground(new Color(255,255,255));
		JButton subjectadd6 = new JButton("To-do 등록(注册)");
		c.add(subjectadd6);
		subjectadd6.setLocation(220,630);
		subjectadd6.setSize(130,40);
		subjectadd6.setBackground(new Color(255,255,255));
		JTextField subjectProf6 = new JTextField();
		subjectProf6.setLocation(360,630);
		subjectProf6.setSize(150,40);
		subjectProf6.setBackground(new Color(255,255,255));
		c.add(subjectProf6);
		JTextField subjectName6 = new JTextField();
		subjectName6.setLocation(530,630);
		subjectName6.setSize(200,40);
		subjectName6.setBackground(new Color(255,255,255));
		c.add(subjectName6);
		JTextField subjectDay6 = new JTextField();
		subjectDay6.setLocation(750,630);
		subjectDay6.setSize(130,40);
		subjectDay6.setBackground(new Color(255,255,255));
		c.add(subjectDay6);
		JTextField subjectSem6 = new JTextField();
		subjectSem6.setLocation(900,630);
		subjectSem6.setSize(130,40);
		subjectSem6.setBackground(new Color(255,255,255));
		c.add(subjectSem6);
		
		JButton subjectedit7 = new JButton("편집(汇编)");
		c.add(subjectedit7);
		subjectedit7.setLocation(10,730);
		subjectedit7.setSize(95,40);
		subjectedit7.setBackground(new Color(255,255,255));		
		JButton subjectdel7 = new JButton("삭제(删除)");
		c.add(subjectdel7);
		subjectdel7.setLocation(115,730);
		subjectdel7.setSize(95,40);
		subjectdel7.setBackground(new Color(255,255,255));
		JButton subjectadd7 = new JButton("To-do 등록(注册)");
		c.add(subjectadd7);
		subjectadd7.setLocation(220,730);
		subjectadd7.setSize(130,40);
		subjectadd7.setBackground(new Color(255,255,255));
		JTextField subjectProf7 = new JTextField();
		subjectProf7.setLocation(360,730);
		subjectProf7.setSize(150,40);
		subjectProf7.setBackground(new Color(255,255,255));
		c.add(subjectProf7);
		JTextField subjectName7 = new JTextField();
		subjectName7.setLocation(530,730);
		subjectName7.setSize(200,40);
		subjectName7.setBackground(new Color(255,255,255));
		c.add(subjectName7);
		JTextField subjectDay7 = new JTextField();
		subjectDay7.setLocation(750,730);
		subjectDay7.setSize(130,40);
		subjectDay7.setBackground(new Color(255,255,255));
		c.add(subjectDay7);
		JTextField subjectSem7 = new JTextField();
		subjectSem7.setLocation(900,730);
		subjectSem7.setSize(130,40);
		subjectSem7.setBackground(new Color(255,255,255));
		c.add(subjectSem7);
		
		
		JButton subjectplus = new JButton("+");
		c.add(subjectplus);
		subjectplus.setLocation(10,830);
		subjectplus.setBackground(new Color(255,255,255));
		subjectplus.setSize(95,40);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				Login l = new Login();
				dispose();
			}
		});
		
		// 메인화면으로
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				MainUI l = new MainUI(st);
				dispose();
			}
		});
		setSize(1080, 960);
		setVisible(true);
		//for문으로 출력하기
//		for(int z=1;z==7;z++){
//			if(st.s_arr[i]!=null){
//				subjectName+z.setText(st.getSarrName(i));
//				i++;
//			}
//		}
		subjectplus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddSubjectWindow asw = new AddSubjectWindow(st);
				dispose();
				
			}
		});
		//이거 subject개수 만큼 달아주기
		subjectadd1.addActionListener(new AddListener(0));
		subjectadd2.addActionListener(new AddListener(1));
		subjectadd3.addActionListener(new AddListener(2));
		subjectadd4.addActionListener(new AddListener(3));
		subjectadd5.addActionListener(new AddListener(4));
		subjectadd6.addActionListener(new AddListener(5));
		subjectadd7.addActionListener(new AddListener(6));
	}
	
	private class AddListener implements ActionListener{
		int i;
		
		public AddListener(int i){
			this.i= i;
		}
		
		public void actionPerformed(ActionEvent e){
			AddTodolistWindow adw=new AddTodolistWindow(st,i);
			dispose();
			
		}
	}

}
