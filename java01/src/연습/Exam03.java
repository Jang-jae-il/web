package 연습;

import javax.swing.JOptionPane;

public class Exam03 {
	public static void main(String[] args) {
		String telecom = JOptionPane.showInputDialog("통신사를 입력하세요.(skt,kt,lg)");
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String name = JOptionPane.showInputDialog("가입자 이름울 입력하세요.");
		
		JOptionPane.showMessageDialog(null, name + "님은 " + telecom+"에" + tel + "로 가입되었습니다.");
		
	}
}
