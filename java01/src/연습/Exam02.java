package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("키를 입력하세요.(ex 199.9)");
		
		double x = Double.parseDouble(height);
		
		double avr = (x-100)*0.9;
		
		JOptionPane.showMessageDialog(null, "적정 몸무게는 : " + (avr)+"kg");
		
	}

}
