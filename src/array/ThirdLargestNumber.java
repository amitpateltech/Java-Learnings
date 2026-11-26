package array;

public class ThirdLargestNumber {
	public static void main(String []args) {
		int arr[]= {1,2,2};
		int max=0;
		int smax=0;
		int tmax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>smax && arr[i]!=max ) {
				smax=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>tmax && arr[i]!=smax && arr[i]<smax) {
				tmax=arr[i];
			}
		}
		System.out.print(tmax);
	}
}
