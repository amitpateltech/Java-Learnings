package loop;

import java.util.Scanner;

public class EvenOddDigitCount {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		int even=0;
		int odd=0;
		if(n==0) {
			even=1;
		}
		while(n!=0) {
			int a=n%10;
			if(a%2==0) {
				even++;
			}
			else {
				odd++;
			}
			n=n/10;
		}
		System.out.println("Even Digits : "+even);
		System.out.println("Odd Digits : "+odd);
	}
}
