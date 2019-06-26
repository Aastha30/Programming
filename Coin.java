import java.util.Scanner;
public class Coin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times you wish to flip a coin");
		int n=sc.nextInt();
		if(n<0)
		System.out.println("ERROR: The number of times to flip a coin must be positive number");
		else
		{
		int h=0,t=0;
		for(int i=1;i<=n;i++)
		{
			
			double r=Math.random();
			if(r<0.5)
			{
				System.out.println(r);
				t++;
			}
			else
			{
				System.out.println(r);
				h++;
			}
				
		}
		double headperc=h*100/n;
		double tailperc=100-headperc;
		System.out.println("Head Percentage: " +headperc+ "vs Tail Percentage" +tailperc);
		}
	}

}
