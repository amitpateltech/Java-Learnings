package array;

public class SmallestElement {
	public static void main(String []args) {
		int []arr= {2,1,4,10,10,8};
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin && arr[i]!=min) {
				smin=arr[i];
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<smin && arr[i]!=min) {
//				smin=arr[i];
//			
//			}
//		}
		System.out.print(smin+" ");
		
	}
}
