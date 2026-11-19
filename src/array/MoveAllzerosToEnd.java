package array;

public class MoveAllzerosToEnd {
	public static void main(String []args) {
		int arr[]= {1, 0, 0, 5, 8};
		int i=0;
		int j=1;
		while(j<arr.length) {
			if(arr[i]==0 && arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				i++;
			}
			else if(arr[j]==0) {
				j++;
			}
			else {
				j++;
				i++;
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
