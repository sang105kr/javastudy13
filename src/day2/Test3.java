package day2;

public class Test3 {
  public static void main(String[] args) {
    int value = 6;

    // 2 그리고 3 으로 나누어지는 수인지 체크
    if(value % 2 == 0 && value % 3 == 0 ) {
      System.out.println(value + "는 2 그리고 3 으로 나누어지는 수입니다.");
    }

    // 2 또는 3 으로 나누어지는 수인지 체크
    if(value % 2 == 0 || value % 3 == 0 ) {
      System.out.println(value + "는 2 또는 3 으로 나누어지는 수입니다.");
    }

    if(value % 2 == 0) {
      if(value % 3 == 0) {
        System.out.println(value + "는 2 그리고 3 으로 나누어지는 수입니다.");
      }
    }

    boolean result = value % 2 == 0 && value % 3 == 0;
    System.out.println(result);
  }
}
