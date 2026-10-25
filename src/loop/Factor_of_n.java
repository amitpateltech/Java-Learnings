package loop;

import java.util.Scanner;

public class Factor_of_n {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.print("The Factors of "+n+" are : " );
		int count=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
		
		}
		System.out.println();
		System.out.print("Total Number Factors are : "+count);
	}
}
