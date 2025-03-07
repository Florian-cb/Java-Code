What is the output of the following code?

public class Test {  
  public static void main(String[] args) {
    String s1 = new String("Welcome to Java!");
    String s2 = new String("Welcome to Java!");

    if (s1 == s2)
      System.out.println("s1 and s2 reference to the same String object");
    else
      System.out.println("s1 and s2 reference to different String objects");
  }
}