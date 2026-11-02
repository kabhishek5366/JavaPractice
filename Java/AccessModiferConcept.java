class C extends comjava.Car {

  public void show() {
    System.out.println(carModal);
  }
}

public class AccessModiferConcept {


  public static void main(String[] args) {
    // Car car = new Car();
    // car.showCar();
    
    C cc = new C();
    cc.show();
    // System.out.println(carModal); // this will not work until we need to extent to that Car class if not extends it wont work.
  }
}
