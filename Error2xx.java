/************************************************  * Florian Celibashi  * COP 2800 86397  * Error 2  ************************************************/



import java.util.Scanner;

public class Error2xx {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

         System.out.print("Enter a degree in Celsius:   ");   
         double celsius = sc.nextDouble();
         double fahrenheit = (9/5) * celsius + 32;       
         System.out.println(celsius + " celsius is " + fahrenheit +  "  degrees in Fahrenheit" ); 

   }
}