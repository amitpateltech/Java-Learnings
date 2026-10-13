package ifelse;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[]main) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length : ");
		double length=sc.nextDouble();
		System.out.println("Enter Width : ");
		double width=sc.nextDouble();
		double area=length*width;
		double perimeter=2*(length+width);
		if(area>perimeter) {
			System.out.println("Area is Greater");	
		}
		else {
			System.out.println("Perimeter is Greater");
		}
		}
}
