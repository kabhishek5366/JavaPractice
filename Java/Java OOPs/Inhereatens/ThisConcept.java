// this(); this keyword is used to exicuite the constructor of the same class super method is used for to exicuite method of the super class.

class A {

  // default constructor of A class
  A() {
    System.out.println("Default Construuctor of A class");
  }

  // Parameterized Constructor of A class
  A(int n) {
    System.out.println("Parameterized Constructor of A class " + n);
  }
}

class B extends A {

  // Default constructor of B class
  B() {
    System.out.println("Default Construuctor of B class");
  }

  // Parameterized Constructor of B class
  B(int n) {
    this();
    System.out.println("Parameterized Constructor of B class " + n);
  }
}

public class ThisConcept {

  public static void main(String[] args) {
    B obj = new B(10);
    // For example i am calling the parameterized constructor in that i have used this keyword So here this keyword calls the default constructor of the samme class & in that by default super keyword will get exicuiuted then the super class default method gets calls

    // Output of the above is
    // Default Construuctor of A class
    // Default Construuctor of B class
    // Parameterized Constructor of B class 10
  }
}
