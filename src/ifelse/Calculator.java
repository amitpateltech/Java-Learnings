package ifelse;
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		double a=sc.nextInt();
	    char ch=sc.next().charAt(0);
		System.out.println("Enter the Second Number : ");
		double b=sc.nextInt();
	   if(ch=='+') {
			System.out.println(a+b);
	   }
	   else if(ch=='-') {
			System.out.println(a-b);
	   }
	   else if(ch=='*') {
			System.out.println(a*b);
	   }
	   else if(ch=='/') {
			if(b==0) {
				System.out.println("Cannot divide by Zero");
			}
			else {
				System.out.println(a/b);
			}
	   }
	   else {
			System.out.println("Enter the Valid Character");
	   }
	
	}
}
