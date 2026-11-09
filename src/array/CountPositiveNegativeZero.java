package array;

import java.util.Scanner;

public class CountPositiveNegativeZero {
	public static void main(String []args) {
		int []arr= {2,3,0,-3,0,-5,4};
		int positive=0;
		int negative=0;
		int zero=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>0) {
				 positive++;
			 }
			 else if(arr[i]<0) {
				 negative++;
			 }
			 else {
				 zero++;
			 }
		  }
		 System.out.println("POSITVE NUMBER "+positive);
		 System.out.println("NEGATIVE NUMBER "+negative);
		 System.out.println("ZERO "+zero);
	}
}
