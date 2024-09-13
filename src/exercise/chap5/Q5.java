package exercise.chap5;

import util.Line;

public class Q5 {
  public static void main(String[] args) {
    method1();
    method2();
  }
  public static void method1(){
    int[][] a = new int[2][];

    System.out.println(a);
    System.out.println(a[0]);
    System.out.println(a[1]);

    a[0] = new int[3];
    a[1] = new int[2];

    System.out.println(a);
    System.out.println(a[0]);
    System.out.println(a[1]);

    printArray(a);
    Line.printLine('-',20);

    a[0][0] = 1;
    a[0][1] = 3;
    a[0][2] = 5;
    a[1][0] = 7;
    a[1][1] = 9;

    printArray(a);
    Line.printLine('-',20);
  }
  public static void method2(){
    int[][] a = new int[2][];
    a[0] = new int[]{1,3,5};
    a[1] = new int[]{7,9};

    printArray(a);
  }

  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%2d",arr[i][j]);
      }
      System.out.println();
    }
  }
}
