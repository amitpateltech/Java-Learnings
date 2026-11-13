package array;

public class ConcatenationOfArray {
	public static void main(String []args) {
		int []arr= {1,2,3,4};
		int n=arr.length*2;
		int []ans=new int[n]; 
		int s=0;
		for(int i=0;i<n;i++) {
			if(s==arr.length) {
				s=0;
			}
			ans[i]=arr[s];
			s++;
		}
		for(int ele:ans) {
			System.out.print(ele+" ");
		}
	}
}
