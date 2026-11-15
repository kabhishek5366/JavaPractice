import java.util.Scanner;

public class PrimeNumberTest {

  public static void main(String[] args) {
    System.out.println("Enter the number to find is Prime number : ");
    Scanner sc = new Scanner(System.in);
    int isInputIsPrimeNumber = sc.nextInt();
    boolean isPrime = true;

    sc.close();

    if (isInputIsPrimeNumber<=1) {
        isPrime=false;
    } else {
        for (int i = 2; i < isInputIsPrimeNumber; i++) {
            if (isInputIsPrimeNumber%i==0) {
                isPrime=false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println(isInputIsPrimeNumber+ " is Prime.");
    } else {
        System.out.println(isInputIsPrimeNumber+ " is not Prime.");
    }
  }
}
