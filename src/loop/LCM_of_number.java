package loop;
import java.util.Scanner;
public class LCM_of_number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		int s=0;
		int LCM=0;
		if(a>b) {
			s=a;
		}
		else {
			s=b;
		}
		for(int i=s;i<=a*b;i++) {
			if(i%a==0 && i%b==0) {
				LCM=i;
				break;
			}
		}
		System.out.println("The LCM number of "+a+" and "+b+" is : "+LCM);
	}
}

