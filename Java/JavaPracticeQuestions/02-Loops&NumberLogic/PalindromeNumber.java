import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println("Enter the Number to find is Palindrome or not : ");
    Scanner sc = new Scanner(System.in);
    int inputPalindrome = sc.nextInt();
    int inputPalindromeClone = inputPalindrome;
    int inputPalindromeOutput = 0;
    sc.close();

    if (inputPalindromeClone <= 0) {
      System.out.println("Invalid Input.");
      return;
    }

    while (inputPalindromeClone > 0) {
      inputPalindromeOutput =
        inputPalindromeOutput * 10 + (inputPalindromeClone % 10);
      inputPalindromeClone /= 10;
    }
    System.out.println(inputPalindromeOutput == inputPalindrome ? "Palindrome" : "Not Palindrome");
  }
}
