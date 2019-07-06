import java.util.Scanner;
public class Util {
	
	static boolean isPalindrome(int n)
	{
		int t=n,rev=0;
		do
		{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}while(n!=0);
		if(rev==t)
			return true;
		else
			return false;
	}
	static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
		if(n%i==0)
		return false;
		i++;
		}
		return true;
	}
	
	static boolean isAnagram(String s1,String s2)
	{
		int c1[]=new int[26];
		int c2[]=new int[26];
		for(int i=0;i<s1.length();i++)
		{
		 char ch=s1.charAt(i);
		if(ch>='A'&&ch<='Z')
			c1[ch-65]++;
		if(ch>='a'&&ch<='z')
		   c1[ch-97]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch>='A'&&ch<='Z')
				c2[ch-65]++;
			if(ch>='a'&&ch<='z')
				c2[ch-97]++;
		}
		for(int i=0;i<c1.length;i++)
		{
		if(c1[i]!=c2[i])
			return false;
		}
			return true;
	}
	
	static int dayOfWeek(int d,int m,int y)
	{
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		
		return d0;
	}
	static void temperaturConversion(float temp,char ch)
	{
		float c=(temp-32)*5/9;
		float f=(temp*9/5)+32;
		
		String chr=(ch=='C'||ch=='c')?"The temperature in ºF: "+f+"ºF":(ch=='F'||ch=='f')?"The temperature in ºC: "+c+"ºC":"Invalid Temperature";
		//if(ch=='C'||ch=='c')
		//System.out.println("The temperature in ºF: "+f+"ºF");
		//else if
		//(ch=='F'||ch=='f')
		//System.out.println("The temperature in ºC: "+c+"ºC");
		System.out.println(chr);
		
	}
	
	static  double monthlyPayment(float P,float R,int Y)
	{
		double n=12*Y;
		double r=R/(12*100);
		double payment=P*r/(1-Math.pow(1+r,-n));
		return payment;
	}
	
}
