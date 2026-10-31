package loop;

import java.util.Scanner;

public class Product_of_Digits {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int product=1;
		while(n!=0) {
			int a=n%10;
			 product=product*a;
			n=n/10;
		}
		System.out.println(product);
	}
}
