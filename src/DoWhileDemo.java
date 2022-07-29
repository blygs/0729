
public class DoWhileDemo {
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();	System.out.println();
		
		
		int i = 1;
		while(i < 11) {
			System.out.print(i + "\t");
			i++;
		}
		System.out.println();	System.out.println();
		
		int j = 1;
		do {
			System.out.print(j + "\t");
			j++;
		}while(j < 11);
		
	}
}
