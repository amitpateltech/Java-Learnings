package array;

import java.util.ArrayList;
public class UnionOfSortedArray {
	public static void main(String[]args) {
		int nums1[]= {1,2,3,4,5,6};
		int nums2[]= {1,2,6,7};
		ArrayList<Integer> ans=new ArrayList<>();
		int n=nums1.length;
		int m=nums2.length;
		int element =0;
		int i=0;
		int j=0;
		while(i<n && j<m) {
			if(nums1[i]<nums2[j]) {
				element=nums1[i];
				i++;
			}
			else if(nums2[j]<nums1[i]) {
				element=nums2[j];
				j++;
			}
			else {
				element=nums1[i];
				i++;
				j++;
			}
			if(ans.isEmpty() || ans.get(ans.size()-1)!=element) {
				ans.add(element);
			}
		}
		if(i==n) {
			while(j<m) {
				if(ans.isEmpty() || ans.get(ans.size()-1)!=nums2[j]) {
					ans.add(nums2[j]);
				}
				j++;
			}
		}
		if(j==m) {
			while(i<n) {
				if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i]) {
					ans.add(nums1[i]);
				}
				i++;
			}
		}
		for(int ele:ans) {
			System.out.print(ele+" ");
		}
	}
}
