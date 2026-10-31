package loop;

import java.util.Scanner;

public class Largest_digit {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int x=0;
		while(n!=0) {
			int a=n%10;
			if(a>x) {
				x=a;
			}
			n=n/10;
		}
		System.out.println(x);
	}
}
