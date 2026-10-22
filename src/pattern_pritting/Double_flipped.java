package pattern_pritting;

import java.util.Scanner;

public class Double_flipped{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n+1-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
