

public class PrimePalindrome {

	public static void main(String[] args) {
		
		for(int i=0;i<=1000;i++)
		{
		if(Util.isPrime(i))
		{
		if(Util.isPalindrome(i))
		System.out.println(i);
		}
		
		}
	}
}
