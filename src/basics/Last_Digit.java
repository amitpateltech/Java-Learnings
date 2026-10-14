package basics;
import java.util.Scanner;
public class Last_Digit {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x=sc.nextInt();
		int last_digit=x%10;
		System.out.println("Last Digit Number Is : "+last_digit);
	}
}
