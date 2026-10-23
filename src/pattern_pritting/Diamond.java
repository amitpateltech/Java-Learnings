package pattern_pritting;

import java.util.Scanner;

public class Diamond {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		int nsp1=n-1;
		int nst1=1;
		int nsp2=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=nst1;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			nsp1--;
			nst1+=2;;
		}
		int nst2=nst1-4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp2;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=nst2;k++) {
				System.out.print("* ");
			}
			System.out.println();
			nsp2++;
			nst2-=2;;
		}
	}

}

