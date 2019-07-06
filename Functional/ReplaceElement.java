import java.util.Scanner;
public class ReplaceElement {

	public static void main(String[] args) {
		String str="Hello <<UserName>>, How are you?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s=sc.nextLine();
		String st=str.replace("<<UserName>>",s);
		System.out.println(st);
		

	}

}
