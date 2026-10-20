package loop;
import java.util.Scanner;
public class a_power_b {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		System.out.println("Enter the power : ");
		int b=sc.nextInt();
		int p=1;
		for(int i=1;i<=b;i++) {
			p=p*a;
		}
		System.out.println(p);
	}
}
