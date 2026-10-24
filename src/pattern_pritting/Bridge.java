package pattern_pritting;
import java.util.Scanner;
public class Bridge {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int nst=n;
		int nsp=1;
		int nsp1=0;
		for(int i=1;i<=2*n+1;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=nsp;j++) {
				System.out.print("  ");
			}
			for(int m=1;m<=nsp1;m++) {
				System.out.print("");
			}
			
			for(int l=1;l<=nst;l++) {
				System.out.print("* ");
			}
			System.out.println();
			nsp=nsp+2;
			nst--;
			nsp1++;
		}
	}

}
