package pattern_pritting;
import java.util.Scanner;
public class Number_Spiral {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i<j) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}

