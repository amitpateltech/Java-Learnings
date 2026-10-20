package loop;

public class Prime_1_to_100 {
	public static void main(String[]args) {
		int count=1;
		for(int i=2;i<=100;i++) {
			count=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			
			if(count==1) {
				System.out.print(" "+i);
			}
			
		}
	}

}
