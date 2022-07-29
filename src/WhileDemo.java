
public class WhileDemo {
	public static void main(String[] args) {

//		int y =1;
		// while은 for와 달리 언제까지 반복을 돌려야할지 모르는 상황에서 쓴다.
//		while(y < 11) {
//			System.out.print(y + "\t");
//			y++;
//		}
		
		
//		int x = 1;
//		while(x < 10) {
//			int y = 2;
//			while(y < 10) {
//				System.out.printf("%d * %d = %d \t", y, x, y*x);
//				y++;
//			}
//			System.out.println();
//			x++;
//		}
		
		int x = 65;
		int cnt = 0;
		while(x < 91) {
			
			if((cnt/5)%2 == 0) {
				System.out.printf("%c\t", x);
			}
			else {
				System.out.printf("%c\t", x+32);
			}
			
			cnt++;
			if(cnt % 5 == 0) {
				System.out.println();
			}
			
			x++;
		}
	}
}
