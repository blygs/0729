import java.util.Scanner;

public class MyCalendar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year : ");
		int year = sc.nextInt();
		
		System.out.print("Month : ");
		int month = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < year; i++) {
			if(getLeapYear(i)) {
				sum += 366;
			}
			else {
				sum += 365;
			}
		}
		
		
		for(int i = 1; i < month; i++) {
			sum += getLastDay(year, i);
		}
		sum++;	// 입력 7월 일경우 7월1일은 6월 마지막날 다음날
		
//		switch(sum % 7) {
//		case 0 : System.out.println("일요일"); break;
//		case 1 : System.out.println("월요일"); break;
//		case 2 : System.out.println("화요일"); break;
//		case 3 : System.out.println("수요일"); break;
//		case 4 : System.out.println("목요일"); break;
//		case 5 : System.out.println("금요일"); break;
//		case 6 : System.out.println("토요일"); break;
//		}
		int space = sum % 7;
		
		showCalendar(year, month, space);
	}
	
	
	static int getLastDay(int year, int month) {
		int lastday = 0;
		
		if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastday = 31;
		}
		else if(month == 2) {
			if(getLeapYear(year)) {
				lastday = 29;
			}
			else {
				lastday = 28;
			}
		}else {
			lastday = 30;
		}
		
		return lastday;
	}
	
	
	static boolean getLeapYear(int year) {
		return ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) )? true : false);
	}
	
	
	static void showCalendar(int year, int month, int space) {
		int cnt = 0;
		
		System.out.println("\t\t "+year+"년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < space ; i++) {
			System.out.print("*\t");
			cnt++;
		}
		
		for(int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			cnt++;
			if(cnt % 7 == 0) {
				System.out.println();
			}
		}
		
		for(int i = cnt; i%7 != 0; i++) {
			System.out.print("*\t");
		}
	}
	
}