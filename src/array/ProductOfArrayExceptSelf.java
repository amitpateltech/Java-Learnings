package array;

public class ProductOfArrayExceptSelf {
	public static void main(String []args) {
		int arr[]= {-1,1,0,-3,3};
		int n=arr.length;
		int pro[]=new int[n];
		for(int i=0;i<n;i++) {
			int p=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					p=p*arr[j];
				}
			}
			pro[i]=p;
		}
		for(int i=0;i<n;i++) {
			System.out.print(pro[i]+" ");
		}
	}
}
