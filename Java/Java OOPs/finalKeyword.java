/**
 * final = const
 *
 * Variables, Methods, Class
 *
 * once a Class is used as final no one can extends it.
 */

class Calc {

  public final void show() {
    System.out.println("In Clac Show");
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class AdvCalc extends Calc {

  // in super class show is final so you can't override the method or use it
  //   public void show() {
  //     System.out.println("In AdvClac Show");
  //   }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

public class finalKeyword {

  public static void main(String[] args) {
    // Variables
    final double pie = 3.14;
    // pie = 5.1; // we can't change  the value because that is fixed value
    System.out.println(pie);

    // Methods

    Calc cal = new Calc();
    cal.show();
    cal.add(3, 7);
  }
}
