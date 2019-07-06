import java.util.Scanner;
public class SearchAndSort {

	public static void main(String[] args) {
	/*	
		Scanner sc=new Scanner(System.in);
		int r[]=Utility.readArr();
		Utility.dispArr(r);
		System.out.println("Which element do you want to search?");
		int x=sc.nextInt();
		int a=Utility.binarySearchInteger(r,x);
		if(a==-1)
			System.out.println("Element not Found");
		else
		System.out.println("Position of searched element is: "+a);
		
		String s[]=Utility.readStringArr();
		Utility.dispStringArr(s);
		System.out.println("Which String do you want to search?");
		String y=sc.next();
		int str=Utility.binarySearchString(s,y);
		if(str==-1)
			System.out.println("String not Found");
		else
		System.out.println("Postion of searched string is: "+str);
		
		int i[]=Utility.readArr();
		System.out.print("Array before insertion sort: ");
		Utility.dispArr(i);
		Utility.insertionSort(i);
		System.out.println("Array after insertion sort: ");
		Utility.dispArr(i);
			
		String s1[]=Utility.readStringArr();
		System.out.println("Array before insertion sort for String: ");
		Utility.dispStringArr(s1);
		Utility.insertionSortString(s1);
		System.out.println("Array after insertion sort for String: ");
		Utility.dispStringArr(s1);
	*/
		int b[]=Utility.readArr();
		System.out.println("Array before Bubble Sort for Integer: ");
		Utility.dispArr(b);
		Utility.bubbleSortInteger(b);
		System.out.println("Array after Bubble Sort for Integer: ");
		Utility.dispArr(b);
		
		String b1[]=Utility.readStringArr();
		System.out.println("Array before Bubble Sort for Integer: ");
		Utility.dispStringArr(b1);
		Utility.bubbleSortString(b1);
		System.out.println("Array after Bubble Sort for Integer: ");
		Utility.dispStringArr(b1);
		

	}

}
