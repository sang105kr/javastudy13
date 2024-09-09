package Quiz;

import java.util.Scanner;

/*
    도형의 넓이 구하기
    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 1
    가로 : 20
    세로 : 30
    넓이 : 600

    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 2
    반지름 : 5
    넓이 : ****

    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 3

    프로그램 종료!!

 */
public class Q1_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("도형의 넓이 구하기");

    boolean stop = false;
    for( ; !stop; ) {
      System.out.println("---------------------------");
      System.out.println(" 메뉴 : 1. 사각형 2.원 3.종료 ");
      System.out.println("---------------------------");
      System.out.print("구하고자하는 도형 : ");

      int menu = scanner.nextInt();
//    System.out.println("menu=" + menu);

      // 사각형 넗이 구하기
      if (menu == 1) {
        System.out.print("가로 : ");
        int width = scanner.nextInt();
        System.out.print("세로 : ");
        int height = scanner.nextInt();

//      System.out.printf("width=%d, height=%d", width, height);
        System.out.println("넓이 : " + (width * height));
        // 원의 넒이 구하기
      } else if (menu == 2) {
        System.out.print("반지름 : ");
        int radius = scanner.nextInt();
        System.out.println("넓이 : " + (radius * radius * 3.14));

        // 종료
      } else if (menu == 3) {
        stop = true;
        continue;
//        break;
      }
    }while(!stop);
    System.out.println("프로그램 종료!!");

  } // end of main

}
