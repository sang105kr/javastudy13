package exercise.chap10.q10;

public class B extends A{
  B() {
    super();
    System.out.println("B 생성자1");
  }
  B(int a) {
    super(a);
    System.out.println("B 생성자2");
  }
}
