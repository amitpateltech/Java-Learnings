package loop;
import java.util.Scanner;
public class GCD_while {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		int x=a;
		int y=b;
		while(y!=0) {
			int remainder=x%y;
			x=y;
			y=remainder;
		}
		int gcd=x;
		int lcm=(a/gcd)*b;
        System.out.println("LCM = " + lcm);
	}
}
