package 변수;

import javax.swing.JOptionPane;

public class 친구정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String add = "연제구";
		int age = 100;
		char gender = '여';
		String name = "박서현";
		
		String tel ="01079797272";
		String sn = "880101-2045142";
		
		String data = JOptionPane.showInputDialog("이름을 입력해주세요");
		System.out.println("당신이 입력한 이름은 "+data + "입니다.");
		
		if(data == name){
			System.out.println("당신의 번호는 "+ tel + "입니다.");
			System.out.println("당신의 성별은 "+ gender + "입니다.");
			System.out.println("당신의 나이는 "+ age + "입니다.");
			System.out.println("당신의 주소는 "+ add + "입니다.");
		}
	}

}
