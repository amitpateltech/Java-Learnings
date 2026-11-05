package array;

public class SecondLargestElement {
	public static void main(String []args) {
		int []arr= {1,4,10,10,8};
		int max=arr[0];
		int smax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>smax && arr[i]!=max) {
				smax=arr[i];
			}
		}
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				smax=max;
//				max=arr[i];
//			}
//			else if(arr[i]>smax && arr[i]!=max) {
//				smax=arr[i];
//			}
//		}
		  System.out.println("Max"+max);
		  System.out.println("Smax "+smax);
	}
}
