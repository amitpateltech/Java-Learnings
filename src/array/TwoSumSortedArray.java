package array;

public class TwoSumSortedArray {
	public static void main(String[]args) {
		int arr[]= {3,2,4};
		int target =6;
		int i=0;
		int j=arr.length-1;
		boolean flag=false;
		while(i<=j) {
			if(arr[i]+arr[j]==target) {
				System.out.print(i+" " +" "+j);
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
