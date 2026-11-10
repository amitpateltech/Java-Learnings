package array;

import java.util.Scanner;

public class InsertElementAtPosition {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {10,20,30,40,50,0};
		int target=25;
		 
		int n=arr.length-1;
		int p=2;
		for(int i=n-1;i>=p;i--) {
			arr[i+1]=arr[i];
		}
		arr[p]=target;
		n++;
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
