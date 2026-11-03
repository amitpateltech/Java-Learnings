package loop;

import java.util.Scanner;

public class NonNegative {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		int sum=0;
		while(n>=0) {
			sum=sum+n;
		  n=sc.nextInt();
		}
		System.out.println(sum);
	}
}
