import java.util.Scanner;
public class TemperatureConv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature in C or F: ");
		float c=sc.nextFloat();
		char ch=sc.next().charAt(0);
		Util.temperaturConversion(c, ch);

		

	}

}
