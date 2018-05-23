package se.smu;
import javax.swing.*;
import javax.swing.event.*;

import ver2.ConfirmDp;

import java.awt.*;
import java.awt.event.*;

public class DeleteSubjectConfirm extends JFrame{
	public static void main(String[] args) {
		ConfirmDp deleteSubjectConfirm = new ConfirmDp("수강과목을 삭제하시겠습니까?", "(你想刪除課程嗎？)");
	}

}
