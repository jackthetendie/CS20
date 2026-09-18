package skillbuilder;

import java.util.Scanner;

public class digits {

	public static void main(String[] args)
	{
	
	//declare variables
	int number, onePlace, tensPlace;
	
	//create a scanner object
	Scanner userinput = new Scanner(System.in);

	//ask the user to enter two digit number
	System.out.println("enter two digit number");
	
	//record what the user entered
	number = userinput.nextInt();
	
	//Ones place
	onePlace = number % 10;
	
	//tens Place
	tensPlace = number / 10;
	
	//display the ones and tens digits
	System.out.println("the tens-digit is "
					    + tensPlace
					    + " and the one-digit is "
					    + onePlace);
			
	}

}
