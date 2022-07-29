import java.util.Scanner;

public class ForDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("구구단 몇 단을 출력할까요? : " );
//		int dan = sc.nextInt();
//		
//		for(int i = 1 ; i < 9; i++) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("★\t");
			}
			System.out.println();
		}
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("★\t");
			}
			System.out.println();
		}

		int s = 5;
		for(int i = 1; i <= 5; i++) {
			int space = s - i;
			for(int j = 0; j <5; j++) {
				if(j < space) {
					System.out.print("\t");
				}
				else {
					System.out.print("★\t");
				}
			}
			System.out.println();
		}
		
		for(int i = 5; i >= 1; i--) {
			int space = s - i;
			for(int j = 0; j <5; j++) {
				if(j < space) {
					System.out.print("\t");
				}
				else {
					System.out.print("★\t");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("%c\t", (j + 65));
			}
			System.out.println();
		}
		
		
		for(int i = 1; i < 10; i++){
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);
			}
			System.out.println();
		}
	}
}
