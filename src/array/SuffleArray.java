package array;

public class SuffleArray {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		int n=3;
        int ans[]=new int[2*n];
		int s=0;
	for(int i=0;i<n;i++){
		   ans[2*i]=arr[i];
		   ans[2*i+1]=arr[n+i];	
	 }
	for(int ele:ans) {
		System.out.print(ele+" ");
		}
   }
}
