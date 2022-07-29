import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 짝수인지 홀수인지 확인하는 것
		String str;
		do{
			System.out.print("정수 하나를 입력하세요 : " );
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("number : " + ((num % 2 == 1)? "홀수" : "짝수"));
			
			System.out.print("Again?(y/n) :");
			str = sc.nextLine();
		}while((str.equals("y") || str.equals("Y")));
		System.out.println("끝!");
	}
}
