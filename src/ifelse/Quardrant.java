package ifelse;
import java.util.Scanner;
public class Quardrant {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value : ");
		double v1=sc.nextDouble();
		System.out.println("Enter second value : ");
		double v2=sc.nextDouble();
		if(v1==0&&v2==0) {
			System.out.println("Origin");
		}
		else if(v1>0&&v2>0) {
			System.out.println("First Quadrant");
		}
		else if(v1<0&&v2>0) {
			System.out.println("Second Quadrant");
		}
		else if(v1<0&&v2<0) {
			System.out.println("Third Quadrant");
		}
		else if(v1>0&&v2<0) {
			System.out.println("Fourth Quadrant");
		}
		else if (v1==0&&v2!=0) {
			System.out.println("Y axis");
		}
		else if (v1!=0&&v2==0) {
			System.out.println("X axis");
		}
	}
}
