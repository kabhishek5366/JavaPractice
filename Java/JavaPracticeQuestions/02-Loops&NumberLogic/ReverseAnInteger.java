import java.util.Scanner;

public class ReverseAnInteger {

  public static void main(String[] args) {
    System.out.println("Enter the Number to reverse it. : ");
    Scanner sc = new Scanner(System.in);
    int reverseNumberInteger = sc.nextInt();
    int reverseNumberIntegerOutput = 0;
    sc.close();

    if (reverseNumberInteger <= 0) {
      System.out.println("Invalid Input.");
      return;
    }

    while (reverseNumberInteger > 0) {
      reverseNumberIntegerOutput =
        reverseNumberIntegerOutput * 10 + (reverseNumberInteger % 10);
      reverseNumberInteger /= 10;
    }
    System.out.println(reverseNumberIntegerOutput);
  }
}
