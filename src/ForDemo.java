import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0 ;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("SUM = " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 factorial? : ");
		int num = sc.nextInt();
		int result = 1;
		
		for(int i = num; i >= 1; i--) {
			result *= i;
		}
		System.out.println(num + " Factorial = " + result);
	}
}
