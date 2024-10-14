package Quiz;

import java.util.Scanner;

/* 문제) 배열을 사용해서 구현하기
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
public class Q5_1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String yesOrNo = null;
    boolean stop = false;
    do {

      // 과목수 입력
      System.out.print("과목수 : ");
      int countOfSubject = scanner.nextInt();

      // 과목점수 저장
      int[] subjects = new int[countOfSubject];
      int sum = 0;
      for (int i = 0; i < subjects.length; i++) {
        System.out.print("과목" + (i + 1) + " : ");
        subjects[i] = scanner.nextInt();
        sum += subjects[i];
      }
      double average = (double)sum / subjects.length;

      // 과목 합계, 평균 출력
      System.out.printf("합계 : %d, 평균 : %.2f \n", sum, average );
      scanner.nextLine();

      // 계속 여부확인
      System.out.print("계속(y/n) : ");
      yesOrNo = scanner.nextLine();

      if(!yesOrNo.equalsIgnoreCase("y")){
        stop = true;
        continue;
      }
    }while (!stop);
    System.out.println("프로그램 종료!!");
  }
}