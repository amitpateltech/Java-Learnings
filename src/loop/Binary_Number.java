package loop;

import java.util.Scanner;

public class Binary_Number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		int p=1;
		int c=0;
		while(n!=0) {
			int a=n%2;
			n=n/2;
		    c = c+a*p; 
			p=p*10;
		}
		 System.out.print(c);
	}
}
