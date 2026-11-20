package sorting;

public class BubbleSortAllCases {
	public static void main(String []args) {
		int arr[]= {1,1,2,1,5};
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {	
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}
}
