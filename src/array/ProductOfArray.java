package array;

public class ProductOfArray {
	static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void main(String []args) {
		int []arr= {3,4,7,8,5};
		print(arr);
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=arr[i]*2;
			}
			else {
				arr[i]=arr[i]+10;
			}
		}
		System.out.println();
		print(arr);
	}
}
