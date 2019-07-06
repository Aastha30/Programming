import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st value: ");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd value: ");
	int b=sc.nextInt();
	System.out.println("Enter the 3rd value: ");
	int c=sc.nextInt();
	int delta=b*b-4*a*c;
	double root1=(-b+Math.sqrt(delta))/(2*a);
	double root2=(-b-Math.sqrt(delta))/(2*a);
	System.out.println(root1);
	System.out.println(root2);
	}

}
