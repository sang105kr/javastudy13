package day2;

public class Test1 {

  public static void main(String[] args) {
//    System.out.println( add(10,20) );
    int result = add(10,20);
    System.out.println("result=" + result);

    result = add(20,30);
    System.out.println("result=" + result);

    System.out.println("result=" + (minus(10,5) + add(10,20)) );
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int minus(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int devide(int x, int y) {
    return x / y;
  }


}
