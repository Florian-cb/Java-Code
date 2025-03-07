/************************************************  * Florian Celibashi  * COP 2800 86397  * W6 Code Exercise  ************************************************/

import java.util.Scanner;
import java.util.InputMismatchException; // Importing the InputMismatchException class

public class week6ExerciseFl {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number of tests: ");
      int numTests = scanner.nextInt();
      
      int[] testScores = new int[numTests]; // Creating an array to hold the number of test scores
      
      // Getting the test scores from the user
      for (int i = 0; i < numTests; i++) {
         System.out.print("Enter test score #" + (i + 1) + ": ");
         try {
            testScores[i] = scanner.nextInt();
         } catch (InputMismatchException e) { // Adding a try-catch block to handle InputMismatchException
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // Clear the input buffer
            i--; // Decrement i to repeat the current iteration
         }
      }
      
      // Displaying the test scores
      System.out.println("Test scores entered:");
      for (int i = 0; i < numTests; i++) {
         System.out.println("Test score #" + (i + 1) + ": " + testScores[i]);
      }
      
      // Finding the highest test score
      int highestScore = testScores[0];
      for (int i = 1; i < numTests; i++) {
         if (testScores[i] > highestScore) {
            highestScore = testScores[i];
         }
      }
      
      // Displaying the highest test score
      System.out.println("Highest test score: " + highestScore);
      
      // Finding the lowest test score
      int lowestScore = testScores[0];
      for (int i = 1; i < numTests; i++) {
         if (testScores[i] < lowestScore) {
            lowestScore = testScores[i];
         }
      }
      
      // Displaying the lowest test score
      System.out.println("Lowest test score: " + lowestScore);
      
      scanner.close();
   }
}
