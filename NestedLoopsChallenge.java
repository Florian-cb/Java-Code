/************************************************  * Florian Celibashi  * COP 2800 86397  * NestedLoopsChallenge  ************************************************/

import java.util.Scanner;

public class NestedLoopsChallenge {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your grade (0-100): ");
      int grade = scanner.nextInt();
      int digit = grade / 10;

      switch (digit) {
         case 10:
            System.out.println("Excellent! You have a perfect score.");
            break;
         case 9:
            System.out.println("You are rocking it! Bravo!");
            break;
         case 8:
            System.out.println("Well done. Keep it up!");
            break;
         case 7:
            System.out.println("Good job. Be careful your grade does not begin to slip.");
            break;
         case 6:
            System.out.println("Tutoring services are available. Please schedule an appointment.");
            break;
         default:
            System.out.println("Not passing. Please see your advisor for support services.");
            break;
      }
   }
}
