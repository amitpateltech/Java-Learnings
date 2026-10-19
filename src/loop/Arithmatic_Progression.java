package loop;
import java.util.Scanner;
public class Arithmatic_Progression {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		int a=99;
		int d=4;
//		for(int i=2;i<=3*n-1;i=i+3) {
//			System.out.print(" "+i);
//		}
		for(int i=a;i>0;i=i-4) {
			System.out.print(" "+a);
			a=a-d;
			
		}
	}
}
