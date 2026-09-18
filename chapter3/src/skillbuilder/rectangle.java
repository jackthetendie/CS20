package skillbuilder;

import java.util.Scanner;

public class rectangle {

	
	public static void main(String[] args) 
	{
	     //declare variables
		int length;
		int width; 
		int area;
		int perimeter;
		//Jack
		
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
		System.out.println("length is: " + length);
		
		//calculate the area
		area = length * width;
		
		//display the area on the screen
		System.out.println("Area = "+ area);
		
		//calculate the perimeter
		perimeter = (2 * length + 2 * width);
				
		//display the perimeter on the screen
		System.out.println("perimeter = "+ perimeter);
		
		
		
	}

}
