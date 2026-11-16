package array;

public class RemoveDuplicate {
	public static void main(String []args) {
		int []arr= {0,0,1,1,1,2,2,3,3,4};
		int i=0;
		int j=1;
		int count=1;
		while(j<arr.length) {
			if(arr[i]==arr[j]) {
				j++;
			}
			else {
				arr[i+1]=arr[j];
				i++;
				j++;
				count++;
			}
		}
		System.out.println(" "+count);
		for(int ele:arr) {
			System.out.print(" "+ele);
		}
	}
}
