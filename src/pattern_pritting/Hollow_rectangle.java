package pattern_pritting;
import java.util.Scanner;
public class Hollow_rectangle {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		System.out.println("Enter Coulmn");
		int x=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=x;j++) {
				if(i==1 || i==n || j==1 || j==x) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
