package sorting;

public class FirstAndLastOccurance {
	public static void main(String []args) {
		int arr[]= {24,69,100,99,79,78,67,36,26,19};
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
				System.out.print("Found ->"+arr[mid]);
				break;
			}
			else if(arr[mid]<arr[mid+1]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
	}
}
