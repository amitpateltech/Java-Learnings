package ifelse;
import java.util.Scanner;
public class UpperCase_LowerCase_Number_SpecialCharacter {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character : ");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("Upper Case");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println("Lower Case");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
