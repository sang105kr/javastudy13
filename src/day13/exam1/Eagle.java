package day13.exam1;

public class Eagle extends Bird implements AdvancedSwimmable{
  @Override
  public void fly() {
    System.out.println("더 높이 날다");
  }

  @Override
  public void swin() {
    System.out.println("더 오래 수정하다");
  }

  @Override
  public void dive() {
    System.out.print("독수리가 다이빙하다");
  }
}

