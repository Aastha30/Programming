import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
class BinarySearchList
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("C:\\Users\\Aastha Shree\\Desktop\\Bridgelabz\\Practice\\src\\Text.txt");
		BufferedReader br=new BufferedReader(fr);
		String in,word="";
		while((in=br.readLine())!=null)
		{
			word=word+in+" ";
		}
		System.out.println(word);
		fr.close();
		br.close();
		ArrayList<String> list=new ArrayList<String>();
		String arr[]=word.split(" ");
		bubbleSortString(arr);
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		System.out.println("After Sorting: ");
		System.out.println(list);
		System.out.println("Which word do you want to search?");
		Scanner sc=new Scanner(System.in);
		String searchWord=sc.next();
		int pos=binarySearch(arr,searchWord);
		if(pos==-1)
		System.out.println("Word not found in the list");
		else
		System.out.println("Word found in the list in position "+pos);
	}

	static void bubbleSortString(String arr[])
	{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=1;j<arr.length-i;j++)
		{
			if(arr[j-1].compareTo(arr[j])>0)
			{
				String t=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=t;
			}
		}

	}
	}

	static int binarySearch(String a[],String word)
	{
		int l=0,r=a.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			int x=word.compareTo(a[mid]);
			if(x==0)
			return mid;
			if(x>0)
			 l=mid+1;
			else
			r=mid-1;
		}
		return -1;
			
	}
}

