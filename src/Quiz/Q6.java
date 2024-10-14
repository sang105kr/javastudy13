package Quiz;
/*
  문) 로또 생성기(1~45)중 6개 출력(단, 중복불가)
*/


import java.util.Random;

public class Q6 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] lotto = new int[6];

    for (int i = 0; i < lotto.length; i++) {
      lotto[i] = random.nextInt(45) + 1;
      System.out.println("lotto[" + i + "] = " + lotto[i]);
      if (i == 0) {
        continue;
      }

      // 이전에 생성된 번호와의 중복 체크
      for (int j = 0; j < i; j++) {
        System.out.printf("i = %d, j = %d \n", i, j);

        if (lotto[i] == lotto[j]) {
          System.out.println("중복 발생" + lotto[i]);
          System.out.printf("i = %d, j = %d \n", i, j);
          i--;
          break;
        }
      }
    }

    for (int i : lotto) {
      System.out.print(i + " ");
    }
  }
}
