package basics;
import java.util.Scanner;
public class Absolute_value {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int x =sc.nextInt();
		if(x<0) {
			x=x*-1;
		}
		System.out.println(x);
	}
}
