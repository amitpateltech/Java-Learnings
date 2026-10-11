package ifelse;
import java.util.Scanner;
public class Profit_loss {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CP : ");
		double cp=sc.nextDouble();
		System.out.println("Enter the SP : ");
		double sp=sc.nextDouble();
		if(sp>cp) {
			double profit=sp-cp;
			double percentage=(profit/cp)*100;
			System.out.println("Profit is : "+ percentage+"%");
		}
		else if(sp==cp){
			System.out.println("No Profit No Loss");
		}
		else {
			double loss=cp-sp;
			double percentage=(loss/cp)*100;
			System.out.println("Loss is : " + percentage+"%");
		}
		}

}
