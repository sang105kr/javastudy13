package util;

public class Line {
  /**
   * 구분선 출력합니다.
   * @param ch 출력문자
   * @param cnt 출력문자 수
   */
  public static void printLine(char ch, int cnt){
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }
}
