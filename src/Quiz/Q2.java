package Quiz;

import java.util.Scanner;

/*
  문) 1~10까지의 임의의 정수값 맞추기
  제약조건 : 3번의 기회가 주어짐. 3번의 기호를 놓치면 꽝! 맞추면 빙고!출력
 */
public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1~10까지의 임의의 정수값 맞추기");
    System.out.print("정답 : ");
    int answer = scanner.nextInt();

  }
}
