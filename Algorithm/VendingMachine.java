import java.util.Scanner;
public class VendingMachine {
	
	int i=0;
	 int total=0;

	 int calculateMoney(int notes[],int money)
		{
		if(money==0)
		{
			return total;
		}
		else if(money>=notes[i])
		{
			int calNotes=money/notes[i];
			int rem=money%notes[i];
			money=rem;
			total=total+calNotes;
			System.out.println(notes[i]+ "Notes--->" +calNotes);
		}
		i++;
		return calculateMoney(notes,money);
		}
	 
	 public static void main(String[] args) {
		 
		    
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Amount: ");
			int money=sc.nextInt();
			VendingMachine vm=new VendingMachine();
			int notes[]={1000,500,100,50,10,5,2,1};
			int c=vm.calculateMoney(notes, money);
			System.out.println("The number of minimum Note needed to give the change: "+c);
			
		}
}