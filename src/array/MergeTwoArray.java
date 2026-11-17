package array;

public class MergeTwoArray {
	public static void main(String []args) {
	int []nums1 = {0};
	int	[]nums2 = {1};
		int m=0;
		int n=1;
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		if(m==0) {
			nums1[0]=nums2[0];
		}
		
		while(i<0) {
			if(nums2[j]>nums1[i]) {
				nums1[k]=nums2[j];
				if(j>=0) {
					j--;
				}
			}
			else {
				nums1[k]=nums1[i];
				if(i>=0) {
					i--;
				}
				
			}
			k--;
		}
		for(int e=0;e<m+n;e++) {
			System.out.println(nums1[e]);
		}
	}
}
