package array;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {1,2,3,4,5,6};
		boolean flag=false;
		System.out.println("Enter the target");
		int found=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==found) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
