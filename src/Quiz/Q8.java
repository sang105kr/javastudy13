package Quiz;

import java.util.Random;

/*
  교실내 교육생중 반장,부반장 임의로 선출하는 프로그램을 구현하시오.
  (단, 겸임 불가)
  데이터 구조 : 2차원 비정방행열
 */
public class Q8 {
  public static void main(String[] args) {
    String[][] students = new String[][]{
            {"박이담", "이휘재"},
            {"김유진", "홍정오", "김준우"},
            {"이삼상", "정재만"},
            {"장현승"}
    };

//    System.out.println(students.length);      4
//    System.out.println(students[0].length);   2
//    System.out.println(students[1].length);   3
//    System.out.println(students[2].length);   2
//    System.out.println(students[3].length);   1

    Random random = new Random();
    int row = random.nextInt(students.length);  // 0 <=  ? < students.length
    int col = random.nextInt(students[row].length);
    String name1 = students[row][col];   //반장
    System.out.println("반장 : " + name1);

    boolean stop = false;
    while (!stop) {

      int row2 = random.nextInt(students.length);
      int col2 = random.nextInt(students[row2].length);

      // 반장 인덱스 값 중복체크
      if( !(row == row2 && col == col2) ) {
        System.out.println("부반장 : " + students[row2][col2]);
        stop = true;
        continue;
      }
    }
  }
}
