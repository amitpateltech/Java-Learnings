package loop;
import java.util.Scanner;
public class Prime_or_not {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		int count=1;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}		
		}
		if(count>1) {
			System.out.println("Not Prime");
			
		}
		else if (n<=1){
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
			
	}
}
