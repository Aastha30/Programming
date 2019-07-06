
public class MonthlyPaymentMain {

	public static void main(String[] args) {
		float p=Float.parseFloat(args[0]);
		System.out.println("Principle amount: "+p);
		float r=Float.parseFloat(args[1]);
		System.out.println("Rate of interest: "+r);
		int y=Integer.parseInt(args[2]);
		System.out.println("Year: "+y);
		double d=Util.monthlyPayment(p,r,y);
		System.out.println("Monthly Payment: "+d);
		
		

	}

}
