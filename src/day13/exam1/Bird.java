package day13.exam1;

public class Bird implements Flyable,CanSwim{
  @Override
  public void fly() {
    System.out.println("새가 날다");
  }

  @Override
  public void swin() {
    System.out.println("새가 수영하다");
  }
}
