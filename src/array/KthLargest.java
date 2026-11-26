package array;

public class KthLargest {
	public static void main(String[]args) {
		int arr[]= {3,2,1,5,6,5};
		int k=4;
		int s=0;
		boolean[] visited = new boolean[arr.length];
		int a=0;
		int kthmax=0;
		for(int i=0;i<k;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max && visited[j]==false) {
					max=arr[j];
					kthmax=max;
					s=j;
					
				}
				
			}
			visited[s]=true;
			
		}
	}
}
