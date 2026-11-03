package loop;

import java.util.Scanner;

public class InputPassword {
	public static void main(String[]args) {
		int a=123;
		Scanner sc=new Scanner(System.in);
		for (int i=1;i<=3;i++) {
			System.out.println("Enter Password : ");
			int n =sc.nextInt();
			if(a==n) {
				System.out.println("Correct Password ");
				break;
			}
			else if(i!=3) {
				System.out.println("Incorrect Password ");
			}
			else {
				System.out.println("Access Denied! ");
			}
		}
		
		}
}
