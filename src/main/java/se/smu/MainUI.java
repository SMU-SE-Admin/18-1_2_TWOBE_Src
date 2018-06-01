package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MainUI extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	Container c;
	Student st;
	
	public MainUI(Student st) {
		this.st = st;
		int i=0;
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1300, 3);
		wl.setLocation(0,60);
		wl.setBackground(new Color(255,255,255));
		
		
		
		JLabel title = new JLabel("                  To - Do List");
		c.add(title);
		title.setLocation(430, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("로그아웃(退出)");
		c.add(btn1);
		btn1.setLocation(1130,10);
		btn1.setSize(120,25);
		btn1.setBackground(new Color(255,255,255));
		JButton btn2 = new JButton("수강과목(课程)");
		c.add(btn2);
		btn2.setLocation(20,10);
		btn2.setSize(120,25);
		btn2.setBackground(new Color(255,255,255));
		ImageIcon image = new ImageIcon("images/pic1.png");
	
		JButton SubjectName = new JButton("과목명(课程名称)");
		c.add(SubjectName);
		SubjectName.setLocation(220,80);
		SubjectName.setSize(150,40);
		SubjectName.setBackground(new Color(255,255,255));
		JButton todolistDeadline = new JButton("마감기한(期限)");
		c.add(todolistDeadline);
		todolistDeadline.setLocation(400,80);
		todolistDeadline.setSize(170,40);
		todolistDeadline.setBackground(new Color(255,255,255));
		JButton todolistFinishDate = new JButton("실제마감일(实际截止日期)");
		c.add(todolistFinishDate);
		todolistFinishDate.setLocation(600,80);
		todolistFinishDate.setSize(200,40);
		todolistFinishDate.setBackground(new Color(255,255,255));		
		JButton todolistCompleted = new JButton("완료여부(状态完)");
		c.add(todolistCompleted);
		todolistCompleted.setLocation(830,80);
		todolistCompleted.setSize(190,40);
		todolistCompleted.setBackground(new Color(255,255,255));
		
		
		JLabel todoName = new JLabel("항목이름(項目名稱)");
		todoName.setLocation(360,150);
		todoName.setSize(150,40);
		todoName.setBackground(new Color(255,255,255));
		c.add(todoName);
		JLabel todoDeadline = new JLabel("마감기한(期限)");
		todoDeadline.setLocation(600,150);
		todoDeadline.setSize(200,40);
		todoDeadline.setBackground(new Color(255,255,255));
		c.add(todoDeadline);
		JLabel todoFinishDate = new JLabel("실제마감일(實際截止日期)");
		todoFinishDate.setLocation(750,150);
		todoFinishDate.setSize(200,40);
		todoFinishDate.setBackground(new Color(255,255,255));
		c.add(todoFinishDate);
		JLabel todoCompleted = new JLabel("완료여부(狀態完成)");
		todoCompleted.setLocation(940,150);
		todoCompleted.setSize(200,40);
		todoCompleted.setBackground(new Color(255,255,255));
		c.add(todoCompleted);
		JLabel todoImportant = new JLabel("중요여부(也罷)");
		todoImportant.setLocation(1120,150);
		todoImportant.setSize(200,40);
		todoImportant.setBackground(new Color(255,255,255));
		c.add(todoImportant);
		
		
		JButton todoedit1 = new JButton("편집(汇编)");
		c.add(todoedit1);
		todoedit1.setLocation(10,200);
		todoedit1.setSize(95,40);
		todoedit1.setBackground(new Color(255,255,255));		
		JButton tododel1 = new JButton("삭제(删除)");
		c.add(tododel1);
		tododel1.setLocation(130,200);
		tododel1.setSize(95,40);
		tododel1.setBackground(new Color(255,255,255));
		JLabel label1 = new JLabel(image, SwingConstants.CENTER);
		c.add(label1);
		label1.setLocation(240, 196);
		label1.setSize(50,50);
		JTextField text1 = new JTextField();
		JTextField todoDeadline1 = new JTextField();
		JTextField todoFinishDate1 = new JTextField();
		JTextField todoCompleted1 = new JTextField();
		JTextField todoImportant1 = new JTextField();
		c.add(text1);
		c.add(todoDeadline1);
		c.add(todoFinishDate1);
		c.add(todoCompleted1);
		c.add(todoImportant1);
		text1.setLocation(350, 196);
		text1.setSize(180,50);
		todoDeadline1.setLocation(590, 196);
		todoDeadline1.setSize(130,50);
		todoFinishDate1.setLocation(760, 196);
		todoFinishDate1.setSize(130,50);
		todoCompleted1.setLocation(930, 196);
		todoCompleted1.setSize(130,50);
		todoImportant1.setLocation(1100, 196);
		todoImportant1.setSize(130,50);

		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text1.setText("");
			}else{
				text1.setText(st.getTarrName(i));
				todoDeadline1.setText(st.getDaeadline(i));
				todoFinishDate1.setText(st.getFinishDate(i));
				todoCompleted1.setText(st.getCompleted(i));
				todoImportant1.setText(st.getImportant(i));
				
			}
         i++;
		}

		JButton todoedit2 = new JButton("편집(汇编)");
		c.add(todoedit2);
		todoedit2.setLocation(10,300);
		todoedit2.setSize(95,40);
		todoedit2.setBackground(new Color(255,255,255));		
		JButton tododel2 = new JButton("삭제(删除)");
		c.add(tododel2);
		tododel2.setLocation(130,300);
		tododel2.setSize(95,40);
		tododel2.setBackground(new Color(255,255,255));
		JLabel label2 = new JLabel(image, SwingConstants.CENTER);
		c.add(label2);
		label2.setLocation(240, 296);
		label2.setSize(50,50);
		JTextField text2 = new JTextField();
		JTextField todoDeadline2 = new JTextField();
		JTextField todoFinishDate2 = new JTextField();
		JTextField todoCompleted2 = new JTextField();
		JTextField todoImportant2 = new JTextField();
		c.add(text2);
		c.add(todoDeadline2);
		c.add(todoFinishDate2);
		c.add(todoCompleted2);
		c.add(todoImportant2);
		text2.setLocation(350, 296);
		text2.setSize(180,50);
		todoDeadline2.setLocation(590, 296);
		todoDeadline2.setSize(130,50);
		todoFinishDate2.setLocation(760, 296);
		todoFinishDate2.setSize(130,50);
		todoCompleted2.setLocation(930, 296);
		todoCompleted2.setSize(130,50);
		todoImportant2.setLocation(1100, 296);
		todoImportant2.setSize(130,50);

		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text2.setText("");
			}else{
				text2.setText(st.getTarrName(i));
				todoDeadline2.setText(st.getDaeadline(i));
				todoFinishDate2.setText(st.getFinishDate(i));
				todoCompleted2.setText(st.getCompleted(i));
				todoImportant2.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JButton todoedit3 = new JButton("편집(汇编)");
		c.add(todoedit3);
		todoedit3.setLocation(10,400);
		todoedit3.setSize(95,40);
		todoedit3.setBackground(new Color(255,255,255));		
		JButton tododel3 = new JButton("삭제(删除)");
		c.add(tododel3);
		tododel3.setLocation(130,400);
		tododel3.setSize(95,40);
		tododel3.setBackground(new Color(255,255,255));
		JLabel label3 = new JLabel(image, SwingConstants.CENTER);
		c.add(label3);
		label3.setLocation(240, 396);
		label3.setSize(50,50);
		JTextField text3 = new JTextField();
		JTextField todoDeadline3 = new JTextField();
		JTextField todoFinishDate3 = new JTextField();
		JTextField todoCompleted3 = new JTextField();
		JTextField todoImportant3 = new JTextField();
		c.add(text3);
		c.add(todoDeadline3);
		c.add(todoFinishDate3);
		c.add(todoCompleted3);
		c.add(todoImportant3);
		text3.setLocation(350, 396);
		text3.setSize(180,50);
		todoDeadline3.setLocation(590, 396);
		todoDeadline3.setSize(130,50);
		todoFinishDate3.setLocation(760, 396);
		todoFinishDate3.setSize(130,50);
		todoCompleted3.setLocation(930, 396);
		todoCompleted3.setSize(130,50);
		todoImportant3.setLocation(1100, 396);
		todoImportant3.setSize(130,50);

		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text3.setText("");
			}else{
				text3.setText(st.getTarrName(i));
				todoDeadline3.setText(st.getDaeadline(i));
				todoFinishDate3.setText(st.getFinishDate(i));
				todoCompleted3.setText(st.getCompleted(i));
				todoImportant3.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JButton todoedit4 = new JButton("편집(汇编)");
		c.add(todoedit4);
		todoedit4.setLocation(10,500);
		todoedit4.setSize(95,40);
		todoedit4.setBackground(new Color(255,255,255));		
		JButton tododel4 = new JButton("삭제(删除)");
		c.add(tododel4);
		tododel4.setLocation(130,500);
		tododel4.setSize(95,40);
		tododel4.setBackground(new Color(255,255,255));
		JLabel label4 = new JLabel(image, SwingConstants.CENTER);
		c.add(label4);
		label4.setLocation(240, 496);
		label4.setSize(50,50);
		JTextField text4 = new JTextField();
		JTextField todoDeadline4 = new JTextField();
		JTextField todoFinishDate4 = new JTextField();
		JTextField todoCompleted4 = new JTextField();
		JTextField todoImportant4 = new JTextField();
		c.add(text4);
		c.add(todoDeadline4);
		c.add(todoFinishDate4);
		c.add(todoCompleted4);
		c.add(todoImportant4);
		text4.setLocation(350, 496);
		text4.setSize(180,50);
		todoDeadline4.setLocation(590, 496);
		todoDeadline4.setSize(130,50);
		todoFinishDate4.setLocation(760, 496);
		todoFinishDate4.setSize(130,50);
		todoCompleted4.setLocation(930, 496);
		todoCompleted4.setSize(130,50);
		todoImportant4.setLocation(1100, 496);
		todoImportant4.setSize(130,50);
		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text4.setText("");
			}else{
				text4.setText(st.getTarrName(i));
				todoDeadline4.setText(st.getDaeadline(i));
				todoFinishDate4.setText(st.getFinishDate(i));
				todoCompleted4.setText(st.getCompleted(i));
				todoImportant4.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JButton todoedit5 = new JButton("편집(汇编)");
		c.add(todoedit5);
		todoedit5.setLocation(10,600);
		todoedit5.setSize(95,40);
		todoedit5.setBackground(new Color(255,255,255));		
		JButton tododel5 = new JButton("삭제(删除)");
		c.add(tododel5);
		tododel5.setLocation(130,600);
		tododel5.setSize(95,40);
		tododel5.setBackground(new Color(255,255,255));
		JLabel label5 = new JLabel(image, SwingConstants.CENTER);
		c.add(label5);
		label5.setLocation(240, 596);
		label5.setSize(50,50);
		JTextField text5 = new JTextField();
		JTextField todoDeadline5 = new JTextField();
		JTextField todoFinishDate5 = new JTextField();
		JTextField todoCompleted5 = new JTextField();
		JTextField todoImportant5 = new JTextField();
		c.add(text5);
		c.add(todoDeadline5);
		c.add(todoFinishDate5);
		c.add(todoCompleted5);
		c.add(todoImportant5);
		text5.setLocation(350, 596);
		text5.setSize(180,50);
		todoDeadline5.setLocation(590, 596);
		todoDeadline5.setSize(130,50);
		todoFinishDate5.setLocation(760, 596);
		todoFinishDate5.setSize(130,50);
		todoCompleted5.setLocation(930, 596);
		todoCompleted5.setSize(130,50);
		todoImportant5.setLocation(1100, 596);
		todoImportant5.setSize(130,50);

		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text5.setText("");
			}else{
				text5.setText(st.getTarrName(i));
				todoDeadline5.setText(st.getDaeadline(i));
				todoFinishDate5.setText(st.getFinishDate(i));
				todoCompleted5.setText(st.getCompleted(i));
				todoImportant5.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JButton todoedit6 = new JButton("편집(汇编)");
		c.add(todoedit6);
		todoedit6.setLocation(10,700);
		todoedit6.setSize(95,40);
		todoedit6.setBackground(new Color(255,255,255));		
		JButton tododel6 = new JButton("삭제(删除)");
		c.add(tododel6);
		tododel6.setLocation(130,700);
		tododel6.setSize(95,40);
		tododel6.setBackground(new Color(255,255,255));
		JLabel label6 = new JLabel(image, SwingConstants.CENTER);
		c.add(label6);
		label6.setLocation(240, 696);
		label6.setSize(50,50);
		JTextField text6 = new JTextField();
		JTextField todoDeadline6 = new JTextField();
		JTextField todoFinishDate6 = new JTextField();
		JTextField todoCompleted6 = new JTextField();
		JTextField todoImportant6 = new JTextField();
		c.add(text6);
		c.add(todoDeadline6);
		c.add(todoFinishDate6);
		c.add(todoCompleted6);
		c.add(todoImportant6);
		text6.setLocation(350, 696);
		text6.setSize(180,50);
		todoDeadline6.setLocation(590, 696);
		todoDeadline6.setSize(130,50);
		todoFinishDate6.setLocation(760, 696);
		todoFinishDate6.setSize(130,50);
		todoCompleted6.setLocation(930, 696);
		todoCompleted6.setSize(130,50);
		todoImportant6.setLocation(1100, 696);
		todoImportant6.setSize(130,50);
		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text6.setText("");
			}else{
				text6.setText(st.getTarrName(i));
				todoDeadline6.setText(st.getDaeadline(i));
				todoFinishDate6.setText(st.getFinishDate(i));
				todoCompleted6.setText(st.getCompleted(i));
				todoImportant6.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JButton todoedit7 = new JButton("편집(汇编)");
		c.add(todoedit7);
		todoedit7.setLocation(10,800);
		todoedit7.setSize(95,40);
		todoedit7.setBackground(new Color(255,255,255));		
		JButton tododel7 = new JButton("삭제(删除)");
		c.add(tododel7);
		tododel7.setLocation(130,800);
		tododel7.setSize(95,40);
		tododel7.setBackground(new Color(255,255,255));
		JLabel label7 = new JLabel(image, SwingConstants.CENTER);
		c.add(label7);
		label7.setLocation(240, 796);
		label7.setSize(50,50);
		JTextField text7 = new JTextField();
		JTextField todoDeadline7 = new JTextField();
		JTextField todoFinishDate7 = new JTextField();
		JTextField todoCompleted7 = new JTextField();
		JTextField todoImportant7 = new JTextField();
		c.add(text7);
		c.add(todoDeadline7);
		c.add(todoFinishDate7);
		c.add(todoCompleted7);
		c.add(todoImportant7);
		text7.setLocation(350, 796);
		text7.setSize(180,50);
		todoDeadline7.setLocation(590, 796);
		todoDeadline7.setSize(130,50);
		todoFinishDate7.setLocation(760, 796);
		todoFinishDate7.setSize(130,50);
		todoCompleted7.setLocation(930, 796);
		todoCompleted7.setSize(130,50);
		todoImportant7.setLocation(1100, 796);
		todoImportant7.setSize(130,50);
		if(st.t_arr[i]!=null){
            // 완료항목 숨기기여부 체크   // 
			if (st.getBoolean() && st.t_arr[i].gettdlCompleted()){
				text7.setText("");
			}else{
				text7.setText(st.getTarrName(i));
				todoDeadline7.setText(st.getDaeadline(i));
				todoFinishDate7.setText(st.getFinishDate(i));
				todoCompleted7.setText(st.getCompleted(i));
				todoImportant7.setText(st.getImportant(i));
				
			}
         i++;
		}

		
		JCheckBox hideTodo = new JCheckBox("  완료된 To do 항목 숨기기");
		c.add(hideTodo);
		hideTodo.setLocation(1050, 850);
		hideTodo.setSize(200, 50);
		hideTodo.setBackground(new Color(184,255,255));
		
		JLabel hideTodo2 = new JLabel("(已完成 To-do list 藏)");
		c.add(hideTodo2);
		hideTodo2.setLocation(1080, 880);
		hideTodo2.setSize(300,50);
		
		setSize(1300, 960);
		setVisible(true);
		//완료항목 숨기기
	     hideTodo.addItemListener(new ItemListener() {
	          @Override
	          public void itemStateChanged(ItemEvent e) {
	              if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
	            	  	st.check=true;
	            	  	MainUI l=new MainUI(st);
	            	  	
	              } else {//checkbox has been deselected
	            	  st.check=false;
	                 MainUI l=new MainUI(st);
	             
	              };
	          }
	      });
		
		// 로그아웃
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				Login l = new Login();
				dispose();
			}
		});
		
		// 수강과목
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				AddSubject2 l = new AddSubject2(st);
				dispose();
			}
		});
		
		
		// 편집
		todoedit1.addActionListener(new EditListener(0));
		todoedit2.addActionListener(new EditListener(1));
		todoedit3.addActionListener(new EditListener(2));
		todoedit4.addActionListener(new EditListener(3));
		todoedit5.addActionListener(new EditListener(4));
		todoedit6.addActionListener(new EditListener(5));
		todoedit7.addActionListener(new EditListener(6));
		
		// 삭제
		tododel1.addActionListener(new DelListener(0));
		tododel2.addActionListener(new DelListener(1));
		tododel3.addActionListener(new DelListener(2));
		tododel4.addActionListener(new DelListener(3));
		tododel5.addActionListener(new DelListener(4));
		tododel6.addActionListener(new DelListener(5));
		tododel7.addActionListener(new DelListener(6));
		

	      //과목명 정렬
	      SubjectName.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e)  {
	             st.sort("name");
	             dispose();
	     		 MainUI l = new MainUI(st);
	          }
	       });
	     
	      
	      //마감기한 정렬
	      todolistDeadline.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e)  {
	              st.sort("deadline");
	              MainUI l = new MainUI(st);
	              dispose();
	          }
	       });
	    
	      //실제마감일 정렬
	      todolistFinishDate.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e){
	            st.sort("finishDate");
	            MainUI l=new MainUI(st);
	            dispose();
	         }
	      });
	      
	      //완료여부 정렬
	
	      todolistCompleted.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e){
		            st.sort("completed");
		            MainUI l=new MainUI(st);
		            dispose();
		         }
	      });
	
	}
	
	// 편집
	private class EditListener implements ActionListener{
		int i;
		
		public EditListener(int i){
			this.i = i;
		}
		
		public void actionPerformed(ActionEvent e) {
			if(st.getTarrName(i)==null){
				TodoAddFirstError l = new TodoAddFirstError(st);
			}else{
				EditTodolistWindow l = new EditTodolistWindow(st,i);
				
			}
			dispose();
		}
	}
	
	// 삭제
	private class DelListener implements ActionListener{
		int i;
		
		public DelListener(int i){
			this.i = i;
		}
		
		public void actionPerformed(ActionEvent e) {
			if(st.getTarrName(i)==null){
				TodoAddFirstError l = new TodoAddFirstError(st);
			}else{
				DeleteTodoConfirm l = new DeleteTodoConfirm(st,i);
			}
			dispose();
		}
	}


}
