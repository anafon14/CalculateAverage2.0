/**

 * Name: Ana Luiza Fonseca Teixeira

 * Teacher: Mr. Hardman 

 * Assignment #3, Program #1

 * Date Last Modified: 10/26/2016

 */

import java.util.Scanner;

public class CalculateAverage {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		double mark5;
		double totalAverage;
		
		System.out.println("Please, enter your grades below:");
		
		System.out.print("Grade 1: ");
		mark1 = userInput.nextDouble();
		
		System.out.print("Grade 2: ");
		mark2 = userInput.nextDouble();
		
		System.out.print("Grade 3: ");
		mark3 = userInput.nextDouble();
		
		System.out.print("Grade 4: ");
		mark4 = userInput.nextDouble();
		
		System.out.print("Grade 5: ");
		mark5 = userInput.nextDouble();
		
		
		totalAverage = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
		
		
		System.out.println("\n" + String.format("Grade 1: %10.2f", mark1) );
		System.out.println(String.format("Grade 2: %10.2f", mark2) );
		System.out.println(String.format("Grade 3: %10.2f", mark3) );
		System.out.println(String.format("Grade 4: %10.2f", mark4) );
		System.out.println(String.format("Grade 5: %10.2f", mark5) );
		
		System.out.println(String.format("Average: %10.4f", totalAverage) );
		
		userInput.close();
		

	}

}
