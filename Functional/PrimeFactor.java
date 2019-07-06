import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		while(n%2==0)
		{
			System.out.println(2);
			n=n/2;
		}
		for(int i=3;i*i<=n;i=i+2)
		{
			while(n%i==0)
			{
			System.out.println(i);
			n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
	}

}
