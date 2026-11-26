package array;

public class IntersectionOfArray {
	public static void main(String []args) {
		int []nums1= {4,9,4};
		int []nums2= {4,9};
		int n=nums1.length;
		int m=nums2.length;
		
		int a=0;
		int result[]=new int [n];
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=0;j<m;j++) {
				if(nums1[i]==nums2[j]) {
					for(int k=0;k<a;k++) {
						if(nums1[i]==result[k]) {
							flag=true;
							break;
						}
					}
					if(flag==false) {
						result[a++]=nums1[i];
					}
					break;
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.print(result[i]);
		}
	}
}
