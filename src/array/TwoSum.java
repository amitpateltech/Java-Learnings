package array;
import java.util.Scanner;
public class TwoSum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {2,5,11,-3};
		int target=-1;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("Not Found!");
		}
	}
}
