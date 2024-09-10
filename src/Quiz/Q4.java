package Quiz;

import java.util.Scanner;

/* 문제)
 n개의 과목수를 입력받아서 n개 과목의 합계와 평균을 구하는 프로그램을 구현하시오.
 ( 단, 평균은 소수점 2자리 까지만 표현)
 과목수 : 3
 과목1 :
 과목2 :
 과목3 :
 합계 :    , 평균 :
 계속(y/n) : y
 과목수 : 2
 과목1 :
 과목2 :
 합계:  , 평균:
 계속(y/n) : n
 프로그램 종료!
 */
public class Q4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String yesOrNo = null;
    boolean stop = false;
    do {

      // 과목수 입력
      System.out.print("과목수 : ");
      int countOfSubject = scanner.nextInt();

      // 합계 계산
      int sum = 0; // 합계
      for (int i = 0; i < countOfSubject; i++) {
        System.out.print("과목" + (i + 1) + " : ");
        int score = scanner.nextInt();
        sum += score; // sum = sum + score;
      }

      // 평균 계산
      double average =  (double)sum / countOfSubject;

      // 출력 결과
      System.out.printf("합계 : %d, 평균 : %.2f \n", sum, average );

      scanner.nextLine(); // "\n" 소비를 위해 라인 추가

      // 계속 여부확인
      System.out.print("계속(y/n) : ");
      yesOrNo = scanner.nextLine();

//    }while ( yesOrNo.equals("y") ||  yesOrNo.equals("Y"));
      if(!yesOrNo.equalsIgnoreCase("y")){
        stop = true;
        continue;
      }
     }while (!stop);
    System.out.println("프로그램 종료!!");
  }
}
