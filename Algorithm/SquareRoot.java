import java.util.Scanner;

public class SquareRoot {
	
	static double sqrt(double c)
	{
		double t=c;
		double elipson=1e-15;
		while(Math.abs(t-c/t)>elipson*t)
		{
			t=(c/t+t)/2;
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the square roots: ");
		double n=sc.nextDouble();
		System.out.println("Square roots of "+n+" is "+SquareRoot.sqrt(n));
		
	}

}
