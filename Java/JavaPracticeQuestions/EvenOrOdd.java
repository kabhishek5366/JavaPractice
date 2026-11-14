import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String[] args) {
    System.out.println("Enter the number to find Even or Odd : ");
    Scanner sc = new Scanner(System.in);
    int evenOrOddFinder = sc.nextInt();

    if(evenOrOddFinder % 2 == 0){
        System.out.println("The Entered Number is Even.");
    }else{
        System.out.println("The Entered Number is Odd.");
    }
  }
}
