import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 짝수인지 홀수인지 확인하는 것
		while(true) {
			System.out.print("정수 하나를 입력하세요 : " );
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("number : " + ((num % 2 == 1)? "홀수" : "짝수"));
			
			System.out.print("Again?(종료 : n) :");
			String str = sc.nextLine();
			if(str.equals("n") || str.equals("N")) break;
		}
		System.out.println("끝!");
	}
}
