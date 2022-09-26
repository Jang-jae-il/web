package 변수;

import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prompt(),입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		//자주 안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어쓴다
		//JFrame, Date, ....
		//alert(), null : 없음
		JOptionPane.showMessageDialog(null,"나의 나이는"+ age);
	}

}
