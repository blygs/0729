import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇줄? :");
		int n = sc.nextInt();
		
		int line = n / 2;
		
		for(int i = 1; i<= line; i++) {
			int space = line - i; 
			if(n % 2 == 1) {
				spaceprint();
			}
			for(int j = 0; j < line; j++) {
				
				if(j < space) {
					spaceprint();
				}
				else {
					starprint();
				}
			}
			System.out.println();
		}
		
		// 홀수일 경우 제일 중간 줄
		if(n %2 == 1) {
			for(int i = 0; i < line+1; i++) {
				starprint();
			}
			System.out.println();
		}
		
		for(int i = line; i>= 1; i--) {
			int space = line - i;
			if(n % 2 == 1) {
				spaceprint();
			}
			for(int j = 0; j < line; j++) {
				if(j < space) {
					spaceprint();
				}
				else {
					starprint();
				}
			}
			System.out.println();
		}
	}
	
	
	static void spaceprint() {
		System.out.print("    ");
	}
	static void starprint() {
		System.out.print("*      ");
	}
}
