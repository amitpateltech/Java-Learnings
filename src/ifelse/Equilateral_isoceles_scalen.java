package ifelse;

import java.util.Scanner;

public class Equilateral_isoceles_scalen {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Side : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Side : ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Side : ");
		int c=sc.nextInt();
		 if(a==b && b==c && c==a) {
			System.out.println("Equilateral Triangle ");
		}
		else if(a==b && b==c && c!=a || a==b && a==c && a!=b || b==a && b==c && b!=a) {
			System.out.println("Isoceles Triangle ");
		}
		else {
			System.out.println("Invalid Triangle");
		}
		}
}
