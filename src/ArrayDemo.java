
public class ArrayDemo {
	public static void main(String[] args) {
//		int a; // declaration	선언
//		a = 5; // Assignment	할당
//		int b = 10; // initialization	초기화
//		
//		int[] arr;		// 배열 선언, declaration
//		arr = new int[4];	// 할당, Assignment
//		
//		int[] arr1 = {1, 2, 3, 4}; // initialization 초기화
		
		
		// 1st way
//		int[] array;
//		array = new int[4];
//		array[0] = 4;
//		array[1] = 2;
//		array[2] = 9;
//		array[3] = 5;
		
		// 2nd way
//		int[] array;
//		array = new int[] {4, 2, 9, 5};
		
		// 3rd way
//		int[] array = {4, 2, 9, 5};
		
		
		// 1st way
//		double[] weights;
//		weights = new double[3];
//		weights[0] = 67.9;
//		weights[1] = 43.7;
//		weights[2] = 56.2;
		
		// 2nd way
//		double[] weights;
//		weights = new double[] {67.9, 43.7, 56.2};
		
		// 3rd way
//		double[] weights = {67.9, 43.7, 56.2};
		
		
		// 1st way
//		char[] arr;
//		arr = new char[5];
//		arr[0] = 'A';
//		arr[1] = 'C';
//		arr[2] = 'B';
//		arr[3] = 'F';
//		arr[4] = 'A';
		
		
		// 2nd way
//		char[] arr;
//		arr = new char[] {'A', 'C', 'B', 'F', 'A' };
		
		
		// 3rd way
//		char[] arr = {'A', 'C', 'B', 'F', 'A' };
		
		
		
		// 1st way
//		boolean[] arr;
//		arr = new boolean[3];
//		arr[0] = true;
//		arr[1] = false;
//		arr[2] = false;
		
		
		// 2nd way
//		boolean[] arr;
//		arr = new boolean[] {true, false, false};
		
		
		// 3rd way
		boolean[] arr = {true, false, false};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[ "+ i + " ] = " + arr[i]);
		}
		
		
		// 1st way
//		String[] names;
//		names = new String[4];
//		names[0] = "한지민";
//		names[1] = "박지민";
//		names[2] = "헨리";
//		names[3] = "마이클";
		
		// 2nd way
//		String[] names;
//		names = new String[] {"한지민", "박지민", "헨리", "마이클"};
		
		// 3rd way
//		String[] names = {"한지민", "박지민", "헨리", "마이클"};
		
	}
}
