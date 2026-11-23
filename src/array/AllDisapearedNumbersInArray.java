package array;

public class AllDisapearedNumbersInArray {
	public static void main(String[]args) {
		int arr[]= {4,3,2,7,8,4,4,4};
		int n=arr.length;
		int notFound=1;
//		for(int i=0;i<n;i++) {
//			boolean flag=false;
//			for(int j=0;j<n;j++) {
//				if(notFound==arr[j]) {
//					flag=true;
//					break;3,2,7,8,4,4,4};
	
//		for(int i=0;i<n;i++) {
//			boolean flag=false;
//			for(int j=0;j<n;j++) {
//				if(notFound==arr[j]) {
//					flag=true;
//					br
//				}
//			}
//			if(flag==false) {
//				System.out.print(notFound+" ");
//			}
//			notFound++;
//		}
		

		for (int i = 0; i < n; i++) {

		    int a = arr[i];

		    if (a < 0) {
		        a = -a;
		    }

		    a = a - 1;

		    if (arr[a] > 0) {
		        arr[a] = -arr[a];
		    }
		}

		for (int i = 0; i < n; i++) {
		    if (arr[i] > 0) {
		       // System.out.println(i + 1);
		    }
		    System.out.println(arr[i]);
		}
		
	}
}
