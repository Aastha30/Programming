import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the harmonic value: ");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("Invalid input");
		else	
		System.out.print(nthHarmonic(n));
	}
		static double nthHarmonic(int n)
		{
			double sum=0,h=1;
			for(double i=1;i<=n;i++)
				sum=sum+h/i;
		     return sum;
		}
		
	}

