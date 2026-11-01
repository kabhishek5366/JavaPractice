class Main {

  String constructor = "Hello Constructor.";
  int x;

  public Main() {
    System.out.println("Main Constructor.");
  }

//   public Main(int x) {
//     System.out.println("Main Constructor. "+x);
//   }

//   this below methon is used for 'this' key word example 
  public Main(int x) {
    this.x=x;
  }
}

public class Constructors {

  public static void main(String[] args) {
    Main myObj = new Main();
    Main myObj1 = new Main(2);
    System.out.println(myObj1.x);
  }
}
