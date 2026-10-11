package ifelse;
import java.util.Scanner;
public class FourDigitNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
				if(n>999 && n<10000) {
					System.out.println("Four Digit Number ");
				}
				else {
					System.out.println("Not Four Digit Number ");
				}
;	}
}
