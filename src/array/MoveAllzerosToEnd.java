package array;

public class MoveAllzerosToEnd {
	public static void main(String []args) {
		int arr[]= {1, 0, 0, 5, 8};
		int i=0;
		int j=0;
		int s=0;
		while(i<arr.length) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
				
			}
			else {
				i++;
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
