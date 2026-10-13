package basics;
import java.util.Scanner;
public class Swap_of_two {
	public static void main(String []args) {
		int a=5;
		int b=10;
//		int swap=a;//swap=10
//		a=b;//a=10
//		b=swap;//b=5
//		System.out.println("a = "+a +" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a +" b = "+b);
	}
}
