import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coupon Number: ");
		int c=sc.nextInt();
	}
	static double random(int n)
	{
		return (Math.random()*n);
	}

}
