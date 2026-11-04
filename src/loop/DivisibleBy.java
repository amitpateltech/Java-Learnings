package loop;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int A =sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int B =sc.nextInt();
		for(int i=2;i<=A*B;i++) {
			if(i%A==0 && i%B==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
