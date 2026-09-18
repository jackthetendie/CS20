package skillbuilder;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//create a scanner object
				Scanner input = new Scanner(System.in);

			System.out.print("Enter grade 1: ");
			int grade1 = input.nextInt();

			System.out.print("Enter grade 2: ");
			int grade2 = input.nextInt();

			System.out.print("Enter grade 3: ");
			int grade3 = input.nextInt();

			System.out.print("Enter grade 4: ");
			int grade4 = input.nextInt();

			System.out.print("Enter grade 5: ");
			int grade5 = input.nextInt();

			double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

			System.out.printf("Average: %.2f%n", average);
	}

}
