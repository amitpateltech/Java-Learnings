package array;

public class ReverseArray {
	public static void main(String[]args) {
		int[]arr= {3,19,56,9,83,18,24,85,14};
		int j=arr.length-1;
		int i=0;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;		
			i++;
			j--;
		}
//		for(int k=0;k<(arr.length/2);k++) {
//			int temp=arr[k];
//			arr[k]=arr[arr.length-1-k];
//			arr[arr.length-1-k]=temp;		
//		}
		for(int ele:arr) {
		System.out.print(ele+" ");
		}
	}
}
