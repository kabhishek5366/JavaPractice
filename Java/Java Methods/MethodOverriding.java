/**
 * A
 */
class A {

  void show() {
    System.out.println("Inside A show method.");
  }

  void config() {
    System.out.println("Inside A config method.");
  }
}

/**
 * B
 */
class B extends A {

  void show() {
    System.out.println("Inside B show method.");
  }
}

public class MethodOverriding {

  public static void main(String[] args) {
    B obj = new B();
    obj.show();
    obj.config();
  }
}
