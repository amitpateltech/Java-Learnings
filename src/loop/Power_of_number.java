package loop;
import java.util.Scanner;
public class Power_of_number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("Enter the Power : ");
		int power=sc.nextInt();
		int result =1;
		for (int i=1;i<=power;i++) {
			result=result*n;
		}
		System.out.println(result);
	}
}
