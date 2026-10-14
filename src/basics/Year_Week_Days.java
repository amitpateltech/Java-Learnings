package basics;
import java.util.Scanner;
public class Year_Week_Days {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days");
		int a=sc.nextInt();
		int year=a/365;
		int r=a%365;
		int week=r/7;
		int days=r%7;
		System.out.println("Year : "+year);
		System.out.println("Week : "+week);
		System.out.println("Days : "+days);
	}
}
