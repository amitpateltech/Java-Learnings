package loop;
import java.util.Scanner;
public class Armstron_Number {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		int count=0;
		int o=n;
		int x=n;
		int s=0;
		while(n!=0) {	
			n=n/10;
			count++;
		}
		while(o!=0) {	
			int a=o%10;
			int p=1;
			for(int i=1;i<=count;i++) {
				p=p*a;
			}
			 s=s+p;
			 o=o/10;
		}
		if(s==x) {
			System.out.println("Armstrong Number ");
		}
		else {
			System.out.println(" Not Armstrong Number " );
		}
	}
}
