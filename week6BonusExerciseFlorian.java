/************************************************
 * Florian Celibashi
 * COP 2800 86397
 * Loop Bonus Exercise
 ************************************************/

import java.util.Scanner;

public class week6BonusExerciseFlorian {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int number = scanner.nextInt();

      System.out.print("Enter the limit: ");
      int limit = scanner.nextInt();

      System.out.println("Multiples of " + number + " up to " + limit + ":");

      int count = 0; // Counter for number of multiples printed on current line

      for (int i = 1; i <= limit; i++) {
         if (i % number == 0) {
            System.out.print(i + "\t");
            count++;

            if (count == 5) {
               System.out.println(); // Start a new line after printing 5 multiples
               count = 0; // Reset the counter
            }
         }
      }

      scanner.close();
   }
}
