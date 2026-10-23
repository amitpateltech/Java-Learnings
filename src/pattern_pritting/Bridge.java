package pattern_pritting;
import java.util.Scanner;
public class Bridge {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int nst=n;
		int nsp=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			for(int k=1;k<nsp;k++) {
				System.out.print("#");
			}
			System.out.println();
			nsp++;
			nst--;
		}
	}

}
