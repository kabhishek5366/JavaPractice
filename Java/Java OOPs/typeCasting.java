class A {

  public void show1() {
    System.out.println("In A show");
  }
}

class B extends A {

  public void show2() {
    System.out.println("In B show");
  }
}

public class typeCasting {

  public static void main(String[] args) {
    A obj = new A();
    obj.show1();

    // UpCasting
    obj = (A) new B(); // (A) is optoin by default it applies
    obj.show1();


    // DownCasting
    B obj1 = (B) obj;
    obj1.show2();

  }
}
