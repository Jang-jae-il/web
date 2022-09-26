package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = JOptionPane.showInputDialog("가로의 길이를 입력하세요.");
		String y = JOptionPane.showInputDialog("세로의 길이를 입력하세요.");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 : " + (x1*y1)+"m");
	}

}
