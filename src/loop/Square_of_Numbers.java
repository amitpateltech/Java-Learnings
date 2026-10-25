package loop;
import java.util.Scanner;
public class Square_of_Numbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int s=0;
		for (int i=1;i<=n;i++) {
			s=i*i;
		}
		System.out.println(s);
	}
}
