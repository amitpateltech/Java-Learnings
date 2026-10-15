package ifelse;
import java.util.Scanner;
public class Vowel_Consonant {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'|| ch=='u'|| ch=='A' || ch=='E'||ch=='I'||ch=='O'|| ch=='U') {
				System.out.println("This is vowel");
			}
			else {
				System.out.println("This is consonant");
			}
		}
		else {
			System.out.println("Enter Valid Caracter");
		}

		}

}