package skillbuilder;

import java.util.Scanner;

public class rectangle {

	
	public static void main(String[] args) 
	{
	     //declare variables
		int length;
		int width; 
		
	    //create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//ask the user to enter the width
		System.out.print("enter the width");
		
		//get width value from the user
		width = userinput.nextInt();
		
		
		//ask the user to enter the length
		System.out.print("enter the length");
		
		//get width value from the user
		length = userinput.nextInt();
		
	    
		
		
		//display the width and length on the console
		System.out.println("width is: " + width);
		System.out.print("length is: " + length);
		
		
		
	}

}
