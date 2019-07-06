import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stake value: ");
		int stake=sc.nextInt();
		System.out.println("Enter the Goal value: ");
		int goal=sc.nextInt();
		System.out.println("Enter the trial you wish to play: ");
		int trial=sc.nextInt();
		int bet=0;
		int win=0;
		for(int i=0;i<trial;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bet++;
				if(Math.random()>0.5)
				cash++;
				else
				cash--;
			}
			if(cash==goal)
				win++;
		}
		double winperc=win*100.0/trial;	
		double lossperc=100.0-winperc;
		System.out.println("Number of wins: "+win);
		System.out.println("Percentage of Win: "+winperc);
		System.out.println("Percentage of Loss: "+lossperc);

	}

}
