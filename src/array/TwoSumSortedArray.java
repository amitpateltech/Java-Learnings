package array;

public class TwoSumSortedArray {
	public static void main(String[]args) {
		int arr[]= {2,7,11,15};
		int target =18;
		int i=0;
		int j=arr.length-1;
		boolean flag=false;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				System.out.println("Found");
				flag=true;
				break;
			}
			else if(arr[i]+arr[j]>target) {
				j--;
				
			}
			else {
				i++;
			}
		}
		if(flag==false) {
			System.out.println("Not Found");
		}
	}
}
