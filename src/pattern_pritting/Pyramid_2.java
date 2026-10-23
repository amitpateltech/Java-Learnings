package pattern_pritting;

import java.util.Scanner;

public class Pyramid_2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		int nsp=n-1;
		int nst=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*");
			}
			System.out.println();
			nsp--;
			nst+=2;;
		}
	}

}
