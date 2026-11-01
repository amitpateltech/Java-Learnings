package array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
//		 System.out.print("Enter Size of  Array ");
		int n=0;
		int []arr= {1,2,-6,4,5};	
		 for(int i=0;i<arr.length;i++) {
			 n=n+arr[i];
		
	  }
		 System.out.print(n+" ");
		
	}
}
