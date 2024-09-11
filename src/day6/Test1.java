package day6;

public class Test1 {
  public static void main(String[] args) {
    byte x = 127;
    x = -128;
//    x = 128;

    char ch = '가';
    String str = "a";
    System.out.println((int)ch);

    char ch2 = 97;
    System.out.println(ch2);

    System.out.println("==");
    long y = 0L;

//    int z = 3000000000;
    long z = 3_000_000_000L;

    double i = 3.14;
    float j = 3.14f;
  }
}
