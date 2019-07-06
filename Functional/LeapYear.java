import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int y=sc.nextInt();
		int c=countDigits(y);
		if(c<4)
			System.out.println("Invalid Year");
		else if(y%400==0 || y%4==0&&y%100!=0)
		System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
		static int countDigits(int n)
		{
			int count=0;
			do
			{
				count++;
				n=n/10;
			}while(n!=0);
			return count;
		}
		
	}

