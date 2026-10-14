package basics;
import java.util.Scanner;
public class Hour_minute_second {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Seconds : ");
		int x=sc.nextInt();
		int seconds=x%60;
		int minutes=(x/60)%60;
		int hour=x/3600;
		System.out.println("Hour : "+hour);
		System.out.println("Minutes : "+minutes);
		System.out.println("Seconds : "+seconds);
		}
}
