public class Inheritence1 {

  public static void main(String[] args) {
    InnerInheritence1 obj = new InnerInheritence1();

    int additionOfTwoNum = obj.add(5, 4);
    int subtractionOfTwoNum = obj.add(9, 4);

    System.out.println(additionOfTwoNum + " " + subtractionOfTwoNum);
  }
}
