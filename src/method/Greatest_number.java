package method;

public class Greatest_number {
	public static int max(int a,int b,int c) {
		if(a>=b && a>=c) {
//			System.out.println(a);
			return a;
		}
		else if(b>=a && b>=c){
//			System.out.println(b);
			return b;
		}
		else {
//			System.out.println(c);
			return c;
		}
//		if(a>=b) {
//			if(a>=c) {
//				System.out.println(a);
//			}
//			else {
//				System.out.println(a);
//			}
//			
//		}
//		else if(b>=c) {
//			System.out.println(b);
//		}
//		else {
//			
//				System.out.println(c);
//		}
	}
	public static void main(String[]args) {
		
		System.out.println(max(10,50,60));
	}
}
