package ifelse;
import java.util.Scanner;
public class Armstrong_if_else {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int a=n%10;
		int m=a*a*a;
		int x=n/10;
		int b=x%10;
		int o=b*b*b;
		int y=x/10;
		int p=y*y*y;
		int s=(p+m+o);
		if(n==s) {
			System.out.println("Armstrong Number : "+s);
		}
		else {
			System.out.println("Not Armstrong Number : "+s);
		}
	}
}
