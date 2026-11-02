/**
 * polymorphismConcept
 *
 * poly - Many
 * morphism - behaviour
 *
 * As a human we act as different in different situation in the same way this concept acts
 *
 * types:
 * Compile time (Early binding) -> Overloading
 * Run time (late binding) -> Overriding
 *
 * this will check using Dynamic Method Dispatch.
 */

class A {
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A {
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A {
    public void show(){
        System.out.println("In C show");
    }
}

class D{
    public void show(){
        System.out.println("In D show");
    }
}


public class polymorphismConcept {
    public static void main(String[] args) {
        // A is a Type of class variable creation & new B is an Object
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // obj = new D(); // this wont work because this D class is not inhearit of A class
    }
}