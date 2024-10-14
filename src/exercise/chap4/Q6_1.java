package exercise.chap4;

public class Q6_1 {

  public static void main(String[] args) {

    boolean stop = false;
    for (int i = 0; i < 10; i++) {

      if ( stop ) {
        break;
      }

      for (int j = 0; j < 5; j++) {
        if (i == 3 && j == 2) {
          stop = true;
          break;
        }
        System.out.printf("i=%d, j=%d \n", i, j);
      }
    }
  }
}
