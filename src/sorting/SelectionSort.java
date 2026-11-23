package sorting;

public class SelectionSort {
	public static void main(String[]args) {
		int arr[]= {2,3,6,-5,1};
		//int n=arr.length; Using Minimum Value
		int n=arr.length-1;// Using maximum Way
		
		//Selection Sort Using Minimum Value
//		for(int i=0;i<n-1;i++) {
//			int s=Integer.MAX_VALUE;
//		 	int idx=0;
//			for(int j=i;j<n;j++) {
//				if(arr[j]<s) {
//					s=arr[j];
//					idx=j;
//				}
//			}
//			int temp=arr[i];
//			arr[i]=arr[idx];
//			arr[idx]=temp;
//		}
		//Selection Sort Using Maximmum Value
		for(int i=n;i>=0;i--) {
			int idx=i;
			for(int j=i;j>=0;j--) {
				if(arr[j]>arr[idx]) {
					idx=j;
				}
			
				
			}	
			//break;
			
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
