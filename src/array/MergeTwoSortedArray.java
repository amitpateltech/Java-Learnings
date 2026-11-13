package array;

public class MergeTwoSortedArray {
	public static void main(String []args) {
		int []a= {1,5,6,9};
		int []b= {2,3,4,5,7,8,};
		int n=a.length+b.length;
		int []c=new int[n];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		for(int ele:c) {
			System.out.print(ele+" ");
		}
	}
}
