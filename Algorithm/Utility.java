
import java.util.Scanner;

public class Utility {
	static int binarySearchInteger(int arr[],int x) //leftside=l,rightside=r,searchElement=x
	{
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]<x)
			l=mid+1;
		else
			r=mid-1;
		}
		return -1;
	}
	static int binarySearchString(String arr[],String x)
	{
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int mid=l+r/2;
			int y=x.compareTo(arr[mid]);
			if(y==0)
				return mid;
			if(y>0)
				l=mid+1;
			else 
				r=mid-1;
			
		}
			return -1;
	}
	static void insertionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int k=a[i];
			int j=i-1;
			while(j>=0&&k<a[j])
			{
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				j--;
			}
		}
	}
	static void insertionSortString(String a[])
	{
		for(int i=1;i<a.length;i++)
		{
			String k=a[i];
			int j=i-1;
			while(j>=0&&k.compareTo(a[j])<0)
			{
			String t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
			j--;
			}
		}
	}
	
	static void bubbleSortInteger(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;	
				}
			}
		}
	}
	static void bubbleSortString(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1].compareTo(a[j])>0)
				{
					String t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;	
				}
			}
		}
	}
	
	static int[] readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values do yo have?");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int x[]=new int[n];
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		return x;
	}
	static void dispArr(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	
	static String[] readStringArr()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("How many values do you have?");
	int n=sc.nextInt();
	System.out.println("Enter the String: ");
	String str[]=new String[n];
	for(int i=0;i<str.length;i++)
	{
		str[i]=sc.next();
	}
	return str;
	}
	static void dispStringArr(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
}
