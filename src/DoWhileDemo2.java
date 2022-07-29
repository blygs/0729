import java.util.LinkedList;
import java.util.List;

public class DoWhileDemo2 {
	public static void main(String[] args) {
		// 1부터 6을 중에 2개를 출력하되 서로 다른 숫자여야 한다.
		int a, b, c, d, e, f;
		
//		System.out.println("<<do~while>>");
//		do {
//			a = (int)((Math.random() * 6 ) + 1);
//			b = (int)((Math.random() * 6 ) + 1);
//		}while(a == b);
//		System.out.println("서로 다른 두 숫자 a = "+ a+ " b = " +b );
//		
//		
//		System.out.println("<<while>>");
//		while(true) {
//			a = (int)((Math.random() * 6 ) + 1);
//			b = (int)((Math.random() * 6 ) + 1);
//			
//			if( a != b ) {
//				System.out.println("서로 다른 두 숫자 a = "+ a+ " b = " +b );
//				break;
//			}
//		}
//		a = b = 0;
//		while(a==b) {
//			a = (int)((Math.random() * 6 ) + 1);
//			b = (int)((Math.random() * 6 ) + 1);
//		}
//		System.out.println("서로 다른 두 숫자 a = "+ a+ " b = " +b );
//		
//		
//		System.out.println("<<for>>");
//		for(int i = 0 ; i < 100; i++) {
//			a = (int)((Math.random() * 6 ) + 1);
//			b = (int)((Math.random() * 6 ) + 1);
//			
//			if( a != b ) {
//				System.out.println("서로 다른 두 숫자 a = "+ a+ " b = " +b );
//				break;
//			}
//		}
		
		System.out.println("<<do~while>>");
		do {
			a = (int)((Math.random() * 45 ) + 1);
			b = (int)((Math.random() * 45 ) + 1);
			c = (int)((Math.random() * 45 ) + 1);
			d = (int)((Math.random() * 45 ) + 1);
			e = (int)((Math.random() * 45 ) + 1);
			f = (int)((Math.random() * 45 ) + 1);
		}while(false);
		System.out.println("서로 다른  로또 숫자 a = "+ a + " b = " + b +" c = "+ c + " d = " + d +" e = "+ e + " f = " + f);
		
		
		List<Integer> list = new LinkedList<>();
		do {
			int num = (int)((Math.random() * 45 ) + 1);
			if(!list.contains(num)) {
				list.add(num);
			}
		}while(list.size() < 6);
		System.out.print("서로 다른 로또 숫자 ==> ");
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
//		System.out.println(list.toString());
		
	}
}
