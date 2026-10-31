package method;
import java.util.Scanner;
public class Permutation {
	public static int fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("Enter the number : ");
		int r=sc.nextInt();
		int permutation = fact(n)/fact(n-r);
		System.out.println(permutation);
	}
}
