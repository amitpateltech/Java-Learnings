package sorting;

public class BasicSorting {
	public static void main(String []args) {
		int []arr= {3,2,-1,5,3,1};
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j+1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
