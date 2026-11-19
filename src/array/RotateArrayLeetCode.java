package array;

public class RotateArrayLeetCode {
	 public static  void swap(int []nums,int i, int j){
         while(i<j){
             int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
             i++;
             j--;
         }
	 }
	public static void main(String []args) {
		int nums[]= {1,2,3,4,5,6,7};
		int k=3;
		 int n=nums.length;
         swap(nums,0,n-1);
         swap(nums,0,k-1);
         swap(nums,k,n-1); 
         for(int ele:nums) {
        	 System.out.print(ele+" ");
         }
	}
	
}
