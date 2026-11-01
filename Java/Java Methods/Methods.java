public class Methods {

  // In this Method class it includes example of Method Overloading

  public static void callMe() {
    System.out.println("Thanks for Calling Me.!");
  }

  public static void callMe(String name) {
    System.out.println(name + " Thanks for Calling Me.!");
  }

  //   normal method with parameters
  static void callMeWithName(String name) {
    System.out.println("Hello Mr." + name);
  }

  public static void main(String[] args) {
    callMe();
    callMe("Abhishek");
    callMeWithName("Abhishek");
  }
}
