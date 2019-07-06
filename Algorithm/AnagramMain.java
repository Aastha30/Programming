import java.util.Scanner;

public class AnagramMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the 1st String: ");
	    String s1=sc.nextLine();
	    System.out.println("Enter the 2nd String: ");
	    String s2=sc.nextLine();
	    if(Util.isAnagram(s1,s2))
	    	System.out.println("String is Anagram");
	    else
	    	System.out.println("String is not an Anagram");

	}

}
