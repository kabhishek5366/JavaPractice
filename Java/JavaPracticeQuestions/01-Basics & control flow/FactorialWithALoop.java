import java.util.Scanner;

public class FactorialWithALoop {

  public static void main(String[] args) {
    System.out.println("Enter the number to find the Factorial : ");
    Scanner sc = new Scanner(System.in);
    int takeTheFactorialNumber = sc.nextInt();
    int takeTheFactorialNumberOutput = 1;

    sc.close();

    for (int i = takeTheFactorialNumber; i > 0; i--) {
      takeTheFactorialNumberOutput *= i;
    }
    System.out.println(
      "The Factorial of " +
        takeTheFactorialNumber +
        " is " +
        takeTheFactorialNumberOutput
    );
  }
}
