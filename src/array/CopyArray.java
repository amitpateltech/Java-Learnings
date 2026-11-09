package array;

import java.util.Scanner;

public class CopyArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Size of  Array ");
		int n=sc.nextInt();
		int []arr= new int[n];
		int []brr=new int[arr.length];
		 System.out.print("Enter Arrays Elements ");
		 for(int i=0;i<arr.length;i++) {
			  arr[i]=sc.nextInt();
			  brr[i]=arr[i];
		  }
//	  for(int i=0;i<brr.length;i++) {
//		      
//
//	  }
	  for(int i=0;i<brr.length;i++) {
	      
			 System.out.print(brr[i]+" ");
	  }
	 }
}
