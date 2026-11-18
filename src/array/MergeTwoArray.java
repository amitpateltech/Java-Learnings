package array;

public class MergeTwoArray {
	public static void main(String []args) {
	int []nums1 = {0,0};
	int	[]nums2 = {1,2};
		int m=0;
		int n=2;
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0 || j>=0) {
		if(i>=0 && j>=0) {
			if(nums2[j]>nums1[i]) {
				nums1[k]=nums2[j];
				j--;
			}
			else {
				nums1[k]=nums1[i];
				i--;
			}
			
		}
		else if(i>=0) {
			nums1[k]=nums1[i];
			i--;
		}
		else {
			nums1[k]=nums2[j];
			j--;
		}
		k--;
	}
		for(int e=0;e<m+n;e++) {
			System.out.println(nums1[e]);
		}
	}
}
