package array;

public class CommonElements {
	 static int common(int nums1[],int nums2[],int m,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(nums1[i]==nums2[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String []args) {
//		int nums1[]= {2,3,2};
//		int nums2[]= {1,2};
		int nums1[]= {4,3,2,3,1};
		int nums2[]= {1,8,5,8,5,6};
		int m=nums1.length;
		int n=nums2.length;
		int a=common(nums1,nums2,n,m);
		int b=common(nums2,nums1,m,n);
		System.out.println(a+" "+b);
		
	}
}
