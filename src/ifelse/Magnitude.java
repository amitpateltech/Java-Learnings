package ifelse;
import java.util.Scanner;
public class Magnitude {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
//		if(n<69 && n>-69)
		if((-n)<69)  {
			System.out.println("Magnitude is less than 69");
		}
		else {
			System.out.println(" Mgnitude is not less than 69");
		}
		
	}
}

