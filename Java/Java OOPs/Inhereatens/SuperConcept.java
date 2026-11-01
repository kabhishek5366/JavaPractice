// By Default "super();" will be used in all the constructor if you not mention in the constructor also that will be used that is the build-in in java if the class is the super
// of the parent class in that case the super(); refers to Object class in the java
// for example like this class A extends Object {

// }

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
    // super(); default super is used here if you want to use parameterized then we need to pass the value in the super only if parameterized constructor ispresent in the super class of this present class
    super(n);
    System.out.println("Parameterized Constructor of B class " + n);
  }
}

public class SuperConcept {

  public static void main(String[] args) {
    // Lets create an Object for an B class

    B myObj = new B();
    // For the above line the output is below
    // Output :
    // Default Construuctor of A class
    // Default Construuctor of B class

    B myObj1 = new B(5);
    // For the above line the output is below
    // Output :
    // Default Construuctor of A class
    // Parameterized Constructor of B class 5
  }
}
