package ifelse;
import java.util.Scanner;
public class Divisible {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%5==0  && n%3==0) {
			System.out.println("Number is Divisible by 5 and 3 ");
		}
		else if(n%3==0) {
			System.out.println("Number is Divisible by 3 ");
		}
		else if(n%5==0) {
			System.out.println("Number is Divisible by 5 ");
		}
		else {
			System.out.println("Number is Not Divisible by 5 and 3 Both ");
		}
		}
	
}
