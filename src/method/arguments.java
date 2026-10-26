package method;

public class arguments {
	public static void sum(int a,int b) {//parameters for receiving arguments
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		arguments.sum(5,10);//passing arguments
	}
}
