package sorting;

public class BinarySearchOnDescendingOrderArray {
	public static void main(String []args) {
		int arr[]= {7,6,5,4,3,2,1};
		int n=arr.length;
		int l=n-1;
		int h=0;
		int t=9;
		boolean found=false;
		while(h<=l) {
			int mid=(h+l)/2;
			if(arr[mid]==t) {
				System.out.print("Found -> idx : "+mid+" Value : "+ arr[mid]);
				found=true;
				break;
			}
			else if(arr[mid]>t) {
				h=mid+1;
			}
			else {
				l=mid-1;
			}
		}
		if(found==false) {
			System.out.print("Not Found");
		}
	}
}
