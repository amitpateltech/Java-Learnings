package loop;
import java.util.Scanner;
public class GCD_number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		int s;
		int GCD=0;
		if(a<b) {
			s=a;
		}
		else {
			s=b;
		}
		for(int i=1;i<=s;i++) {
			if(a%i==0 && b%i==0) {
				GCD=i;
			}
		}
		System.out.println("The GCD number of "+a+" and "+b+" is : "+GCD);
	}
}
