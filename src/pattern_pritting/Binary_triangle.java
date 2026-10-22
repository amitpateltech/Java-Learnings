package pattern_pritting;

import java.util.Scanner;

public class Binary_triangle {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			if((i+j)%2==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
				k++;
			}
			System.out.println();
		}
	}
}
