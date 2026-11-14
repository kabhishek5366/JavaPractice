import java.util.Scanner;

public class LeapYearChecker {

  public static void main(String[] args) {
    System.out.println("Enter year to check it is leap year or not : ");
    Scanner sc = new Scanner(System.in);
    int inputFieldYear = sc.nextInt();

    sc.close();

    if ((inputFieldYear%4==0 && inputFieldYear%100!=0) || inputFieldYear%400==0 ) {
        System.out.println("The Year "+ inputFieldYear + " is Leap Year.");
    } else {
        System.out.println("The Year "+ inputFieldYear + " is not a Leap Year.");
    }
  }
}
