package array;

public class RunningSumOf1dArray {
	public static void main(String []args) {
		int arr[]= {1,1,1,1};
		int n=arr.length;
		int sum=0;
		int []arr1=new int[n];
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=sum;
			
			System.out.println(arr[i]);
		}
	}
}
