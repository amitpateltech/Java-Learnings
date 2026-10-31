package loop;

import java.util.Scanner;

public class Digits_to_Binary {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		while(n!=0) {
			int a=n%2;
			n=n/2;
			System.out.print(a+" ");
		}
	}
}
