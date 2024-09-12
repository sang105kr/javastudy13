package day7;

import util.Line;

// {"김유진","김준우","박이담","이삼상","이휘재","장현승","정재만","홍정오"}
public class Array5 {
  public static void main(String[] args) {
    String[] students = new String[8];
//    for (int i = 0; i < students.length; i++) {
//      System.out.printf("%-5s",students[i]);
//    }
    printElemetValue(students);

    students[0] = "김유진";
    students[1] = "김준우";
    students[2] = "박이담";
    students[3] = "이삼상";
    students[4] = "이휘재";
    students[5] = "장현승";
    students[6] = "정재만";
    students[7] = "홍정오";

    Line.printLine('*',10);

    printElemetValue(students);

    String[] students2 = new String[]{"김유진","김준우","박이담","이삼상","이휘재","장현승","정재만","홍정오"};

    Line.printLine('*',10);

    printElemetValue(students2);
  }

  public static void printElemetValue(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.printf("%-5s", args[i]);
    }
    System.out.println();
  }
}
