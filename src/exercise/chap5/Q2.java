package exercise.chap5;

import util.Line;

import java.sql.SQLOutput;

public class Q2 {
  public static void main(String[] args) {
    int[] a;
    a = new int[3];

    for (int i : a) {
      System.out.printf("a = %d,", i);
    }
    System.out.println();

    a[0] = 3;
    a[1] = 4;
    a[2] = 5;

    for (int i : a) {
      System.out.printf("a = %d,", i);
    }
    System.out.println();
  }
}
