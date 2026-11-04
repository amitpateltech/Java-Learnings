package loop;

import java.util.Scanner;

public class ThreeDigitsSum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target : ");
		int target =sc.nextInt();
		int n;
		for(int i=100;i<1000;i++) {
			int sum=0;
			 n=i;
			while(n!=0) {
				int a=n%10;
				sum=sum+a;
				n=n/10;
			}
			if(target==sum) {
				System.out.println(i);
			}
		}
	}
}
