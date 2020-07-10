package problemStatement1;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbersTest {

	public static void main(String[] args) {
		EvenNumbers e=new EvenNumbers();
		System.out.println("Enter N");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList a1=e.storeEvenNumbers(n);
		System.out.println("ArrayList 1");
		System.out.println(a1);
		ArrayList a2=e.printEvenNumbers(a1);
		System.out.println("ArrayList 2");
		System.out.println(a2);
		System.out.println("Enter a number to search ");
		n=sc.nextInt();
		int res=e.retrieveEvenNumber(n, a1);
		if(res!=0)
		{System.out.println("Exists in the list");
		
		}
		else
		{
			System.out.println("It does not exist in the Arraylist 1");
		}
		
	}

}
