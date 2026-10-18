package basics;
import java.util.Scanner;
public class Middle_Value {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a =sc.nextInt();
		System.out.println("Enter the second Number");
		int b =sc.nextInt();
		System.out.println("Enter the third Number");
		int c =sc.nextInt();
		if(a>b && a<c || a<b && a>c) {
			System.out.println("a is the middle value : "+a);
		}
		else if(b>a && b<c || b<a && b>c) {
			System.out.println("b is the middle value : "+b);
		}
		else {
			System.out.println("c is the middle value : "+c);
		}
	}
}
