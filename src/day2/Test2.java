package day2;

public class Test2 {
  public static void main(String[] args) {
    // 그리고 &&  : 둘다 true 일때 true
    System.out.println( true && true);    // true
    System.out.println( false && false);  // false
    System.out.println( true && false);   // false
    System.out.println( false && true);   // false

    printStart(10);

    // 또는 ||  : 둘중에 하나라도 true면 true
    System.out.println( true || true);    // true
    System.out.println( false || false);  // false
    System.out.println( true || false);   // true
    System.out.println( false || true);   // true

    printStart(10);

    // 부정 !
    System.out.println( !true );    // false
    System.out.println( !false );   // true

    printStart(10);

    // 배타적 연산 ^  : 피연산자가 다르면 true
    System.out.println( true ^ true);    // false
    System.out.println( false ^ false);  // false
    System.out.println( true ^ false);   // true
    System.out.println( false ^ true);   // true
  }

  public static void printStart(int count){
    for (int i = 1; i <= count; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
