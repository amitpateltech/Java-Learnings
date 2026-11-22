package array;

public class AllDisapearedNumbersInArray {
	public static void main(String[]args) {
		int arr[]= {4,3,2,7,8,2,3,1};
		int n=arr.length;
		int notFound=1;
//		for(int i=0;i<n;i++) {
//			boolean flag=false;
//			for(int j=0;j<n;j++) {
//				if(notFound==arr[j]) {
//					flag=true;
//					break;
//				}
//			}
//			if(flag==false) {
//				System.out.print(notFound+" ");
//			}
//			notFound++;
//		}
		for(int i=0;i<n;i++) {
			int a=arr[i];
			a=a-1;
			arr[a]=-arr[a];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>0){
				System.out.print(i+1+" ");
			}
		}
		
	}
}
