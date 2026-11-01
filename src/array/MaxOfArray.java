package array;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {-10,-2,-3,-41,-5,-6};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		 System.out.print(""+max);
	}
}
