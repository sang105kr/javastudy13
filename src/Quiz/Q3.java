package Quiz;
// 문) 가위, 바위, 보 게임 구현하기

import java.util.Random;
import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println(">> 가위 바위 보 게임 <<");
    boolean stop = false;

    while (!stop) {
      int computerChoice = random.nextInt(3) + 1;

      System.out.println("---------------------------");
      System.out.println("메뉴 1.가위 2.바위 3.보 4.종료");
      System.out.println("---------------------------");
      System.out.print("선택 : ");
      int humanChoice = scanner.nextInt();

      // 메뉴가 잘못 입력된 경우
      if (humanChoice < 1 || humanChoice > 4) {
        System.out.println("메뉴를 다시 선택 바랍니다.(1-4)");
        continue;
      }

      //종료
      if (humanChoice == 4) {
        stop = true;
        continue;
      }

      System.out.printf("컴퓨터 : %s, 사용자 : %s \n", getText(computerChoice), getText(humanChoice));

      //case1) 비김
      if (computerChoice == humanChoice) {
        System.out.println("비겼습니다!!");
        continue;
      }

      //case2) computer win!
      if ((computerChoice == 1 && humanChoice == 3) ||
              (computerChoice == 2 && humanChoice == 1) ||
              (computerChoice == 3 && humanChoice == 2)) {

        System.out.println("컴퓨터가 이겼습니다!");

        //case3) human win!
      } else {

        System.out.println("사용자가 이겼습니다!");
      }

    }// end of while
    System.out.println("프로그램 종료!!");
  }// end of main
  
  public static String getText(int choice){
    String text = null; 
    switch (choice) {
      case 1 :
        text = "가위";
        break;
      case 2 :
        text = "바위";
        break;
      case 3 :
        text = "보";
        break;
    }
    return text;
  }
}// end of class