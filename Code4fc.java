/************************************************  * Florian Celibashi  * COP 2800 86397  * 4th Exercise  ************************************************/

public class Code4fc {
    public static void main(String[] args) {
      
	double a = 3.4;
        double b = 50.2;
	double e = 44.5;
	double c= 2.1;
	double d= 0.55;
	double f= 5.9;

        double x = ((e*d)-(b*f)) / ((a*d)-(b*c));
	double y = ((a*f)-(e*c)) / ((a*d)-(b*c));

        // Print the result
        System.out.println("x is: " + x);
	System.out.println("y is: " + y);
    }
}