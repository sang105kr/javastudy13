package exercise.chap12.q8;

public class B implements A,C{
  @Override
  public void abc() {
//    System.out.println("A인터페이스의 abc()");
    A.super.abc();
    System.out.println("B 클래스의 abc()");
  }
}
