package basics;
import java.util.Scanner;
public class Fahrenheit_Celsius {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tempreture : ");
		double c=sc.nextDouble();
		double fah=(9.0/5*c)+32;
		System.out.println(fah);
		}
}
