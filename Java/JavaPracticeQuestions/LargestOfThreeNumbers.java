import java.util.Scanner;

public class LargestOfThreeNumbers {

  public static void main(String[] args) {
    System.out.println("Enter the numbers to find the Maximum number : ");
    Scanner sc = new Scanner(System.in);

    String largestOfThreeNumbers = sc.nextLine();
    int theMaxNumber = Integer.MIN_VALUE;
    int theMaxNumberOutput = 0;
    String[] largestOfThreeNumbersArray = largestOfThreeNumbers
      .trim()
      .split("\\s+");

    sc.close();
    for (String elem : largestOfThreeNumbersArray) {
      //   System.out.println(elem + theMaxNumber);
      int num = Integer.parseInt(elem);
      if (num > theMaxNumber) {
        theMaxNumberOutput = num;
      }
    }
    System.out.println("The Largest Number is : " + theMaxNumberOutput);
  }
}
