import java.util.Scanner;

public class BranchDeomo {
	public static void main(String[] args) {
		// continue : 계속된 반복을 위해
		// break : 반복을 멈추기 위해
		// label : 이중 반복문등에서 continue, break 사용시 범위를 지정하기 위해
		
//		Loop1 :
//			for(int i = 1 ; i < 10; i ++) {
//				int j = 1;
//				while(j < 10) {
//					System.out.println("i = " + i + "  j = " + j);
////				if(i == 2 && j == 2) break Loop1;
//					if(i == 2 && j == 2) continue Loop1;
//					j++;
//				}
//			}
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input password : ");
		String userPassword = sc.nextLine();
		int i;
		for(i = 0; i < 4; i++) {
			if(systemPassword.charAt(i) == userPassword.charAt(i)) continue;
			else break;
		}
		if(i == 4) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
	}
}
