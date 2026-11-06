package array;

public class RotateArray {
	public static void main(String[]args) {
		int []arr= {1,2,3,4,5};
		int d=2;
		int []brr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[(i+d)%arr.length];
		}
		for(int ele:brr) {
			System.out.print(ele+" ");
		}
	}
}
