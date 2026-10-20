package loop;
import java.util.Scanner;
public class Composite_Number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int count=1;
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("Composite Number ");
		}
		else if(n<=1){
			System.out.println("Not Comoposite Number ");
		}
		else {
			System.out.println("Not Comoposite Number ");
		}
	}
}
