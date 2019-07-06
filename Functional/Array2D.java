import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
	public static int[][] readInteger2D()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows do you have?");
		int M=sc.nextInt();
		System.out.println("How many columns do you have?");
		int N=sc.nextInt();
		int x[][]=new int[M][N];
		System.out.println("Enter "+M*N+" elements row wise");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
	    return x;
	}
	public static void dispInteger2D(int intArr[][])
	{
            PrintWriter pw=new PrintWriter(System.out, true);
		for(int i=0;i<intArr.length;i++)
		{
			for(int j=0;j<intArr[i].length;j++)
			{
				pw.print(intArr[i][j]+" ");
			}
			pw.println();
		}
	}
	
	public static double[][] readDouble2D()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows do you have?");
		int M=sc.nextInt();
		System.out.println("How many columns do you have?");
		int N=sc.nextInt();
		double x[][]=new double[M][N];
		System.out.println("Enter "+M*N+" elements row wise");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextDouble();
			}
		}
		return x;
	}
	 
	public static void dispDouble2D(double doubleArr[][])
	{
		PrintWriter pw=new PrintWriter(System.out, true);
		for(int i=0;i<doubleArr.length;i++)
		{
			for(int j=0;j<doubleArr[i].length;j++)
			{
				pw.print(doubleArr[i][j]+" ");
			}
			pw.println();
		}
	}
	public static boolean[][] readBoolean2D()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows do you have?");
		int M=sc.nextInt();
		System.out.println("How many columns do you have?");
		int N=sc.nextInt();
		boolean x[][]=new boolean[M][N];
		System.out.println("Enter "+M*N+" elements row wise");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextBoolean();
			}
		}
		return x;
	}
	public static void dispBoolean2D(boolean booleanArr[][])
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0;i<booleanArr.length;i++)
		{
			for(int j=0;j<booleanArr[i].length;j++)
			{
				pw.print(booleanArr[i][j]+" ");	
			}
			pw.println();
		}
	}
	public static void main(String[] args) {

	
	System.out.println("The Integer Array: ");
	int[][] intArr=readInteger2D();
	dispInteger2D(intArr);
	System.out.println("The Double Array: ");
	double[][] doubleArr=readDouble2D();
	dispDouble2D(doubleArr);
	System.out.println("The Boolean Array: ");
    boolean[][] booleanArr=readBoolean2D();
	dispBoolean2D(booleanArr);

			
	}

}
