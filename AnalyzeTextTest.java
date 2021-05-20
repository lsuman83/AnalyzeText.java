/* Sean Bordelon
 * COP 3330 0R02 Assignment #6
 * 3/10/2018
 * AnalyzeText.jar Program compilation used to analyze text and examine them with three different methods
 */

import java.util.Scanner;

public class AnalyzeTextTest {


	public static void main(String[] args)
	{

		System.out.println ("""
				Welcome to our text examiner. You have three different methods to analyze your text.\s
				Pick a method and then enter your text.
				""");
		
		
		int choice = getMenuChoice();
	
		
		while (choice != 4)
		{
		
			AnalyzeText[] say = new AnalyzeText [3];
			
			
			for (AnalyzeText words: say)
			{


				switch (choice) {
					case 1 -> say[0] = new LetterFrequency("To be or not to be that is the question");
					case 2 -> System.out.println("hey");
					case 3 -> System.out.println("hola");
				}
				
				System.out.println(words);
			}
			
			choice = getMenuChoice();
			
		}
			
	}
	
	private static int  getMenuChoice() 
	{
	      Scanner input = new Scanner(System.in);
	      
	      
	      System.out.println("\nEnter 1: Letter Frequency");
	      System.out.println("Enter 2: Word Length count");
	      System.out.println("Enter 3: Word Frequency");
	      System.out.println("Enter 4: Exit");
	      System.out.println("Choice:");
	      
	      int selection = input.nextInt();
	      
	      input.nextLine(); // clear newline from input
	      
	      return selection;
	   }

}
