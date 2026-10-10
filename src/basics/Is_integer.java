package basics;
import java.util.Scanner;
public class Is_integer {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		double x =sc.nextDouble();
//		int a =(int)x;
//		if(x-a ==0) {
//			System.out.print("Interger : "+ x);
//		}
//		else {
//			System.out.print("Not Integer : "+ x);
//		}
//	}
		if(x%1==0) {
			System.out.print("Interger : "+ x);
		}
		else {
			System.out.print("Not Integer : "+ x);
		}
	}

}
