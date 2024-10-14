package exercise.chap5;

import java.lang.*;

public class Q8 {
  public static void main(String[] args) {
    String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
    String name;
    int age;

    int pos1 = str.indexOf('[');
    int pos2 = str.indexOf(']');
    String substring = str.substring(pos1+1, pos2);
    System.out.println(substring);

    pos1 = str.lastIndexOf('[');
    pos2 = str.lastIndexOf(']');
    substring = str.substring(pos1+1, pos2);
    System.out.println(substring);
//    System.out.println(name);  //홍길동
//    System.out.println(age);   //15
  }
}
