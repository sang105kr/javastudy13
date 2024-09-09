package day2;

import java.util.Scanner;

// 문) 사용자로부터 단수를 입력받아 구구단 출력하는 프로그램을 작성하시오
public class Gugudan2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(">> 구구단 출력하기 <<");
    System.out.print("단수입력(1~9단) : ");
    int dansu = scanner.nextInt();

    for (int i = 1; i <= 9; i++) {
      System.out.println(dansu + " * " + i + " = " + (3 * i));
    }
  }
}
