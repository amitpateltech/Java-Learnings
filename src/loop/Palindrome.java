package loop;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int original=n;
		int r=0;
		while(n!=0) {
			int a=n%10;
			r=r*10+a;
			n=n/10;
		}
		if(original==r) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not Palindrome");
		}
	}
}
