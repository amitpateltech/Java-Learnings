package array;

public class DuplicateArray {
	public static void main(String []args) {
		int []arr= {1,2,3,4};
		int n=arr.length;
		boolean a[]=new boolean [n];
		for(int i=0;i<n;i++) { 
			int ele=arr[i];
			if(a[ele]==true) {
				System.out.println("Found : "+arr[i]);
			}
			else {
				a[ele]=true;
			}
		}
	}
}
