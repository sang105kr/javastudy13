package Quiz;
/*
  문) 로또 생성기(1~45)중 6개 출력(단, 중복불가)
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q6_1 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("생성할 로또 수 : ");
    int countOfLotto = scanner.nextInt();

    for (int i = 0; i < countOfLotto; i++) {

      int[] lotto = new int[6];

      int cnt = 0;
      do {
        lotto[cnt] = random.nextInt(45) + 1;
        if (cnt == 0) {
          continue;
        }

        // 중복체크
        for (int j = 0; j < cnt; j++) {
          if (lotto[cnt] == lotto[j]) {
            cnt--;
            break;
          }
        }

      } while (++cnt != lotto.length);

      // 로또 번호 정렬
      Arrays.sort(lotto);

      // 로또 번호 출력
      for (int number : lotto) {
        System.out.printf("%2d ", number);
      }
      System.out.println();
    }
  }
}
