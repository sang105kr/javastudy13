package day2;
// 문) 구구단 2~9단까지 한번에 출력하는 프로그램을 구현하시오.
//  
public class Gugudan4 {
  public static void main(String[] args) {

    for (int dansu = 2; dansu <= 4 ; dansu++) {    // 단 수

      for (int i = 1; i <= 3 ; i++) {

        System.out.println( dansu + " * " + i + " = " + ( dansu * i) );

      }

    }
  }
}
