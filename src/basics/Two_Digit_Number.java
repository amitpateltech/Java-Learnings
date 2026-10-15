package basics;
import java.util.Scanner;
public class Two_Digit_Number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x=sc.nextInt();
		int a=x%10;
		int b=x/10;
		System.out.println("Sum of Two Digit Number is : "+ (a+b));
	}
}
