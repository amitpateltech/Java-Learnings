package method;
import java.util.Scanner;
public class Factorial_using_method {
	public static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
	    System.out.println(	Factorial_using_method.fact(n));
		}

}
