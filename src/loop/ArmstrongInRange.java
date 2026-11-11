package loop;
import java.util.Scanner;
public class ArmstrongInRange {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++) {
			int sum=0;
			int o=i;
			int n=i;
			int count=0;
			while(n!=0) {
				n=n/10;
				count++;
			}
			int x=i;
			while(x!=0) {
				int p=1;
				int a=x%10;
				for(int j=1;j<=count;j++) {
					p=p*a;
				}
				sum=sum+p;
				x=x/10;
			}
			if(sum==o) {
				System.out.print(i+" ");
			}
			
		}
		
	}

}
