package question.chap7.q1;

import java.util.Scanner;

public class PersonDriver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    (1) "성을 입력하세요: ”라는 메시지를 출력한다.
    System.out.print("성을 입력하세요: ");
//    (2) 성을 읽어 들여 lname에 저장한다.
    String lname = scanner.nextLine();
//    (3) "이름을 입력하세요: " 라는 메시지를 출력한다.
    System.out.print("이름을 입력하세요: ");
//    (4) 이름을 읽어 들여 fname에 저장한다.
    String fname = scanner.nextLine();
//    (5) Person 객체를 생성하여 person1이 가리키게 한다.
    Person person1 = new Person();
//    (6) person1 객체의 성을 lname으로 한다
    person1.lastName = lname;
//    (7) person1 객체의 이름을 fname으로 한다
    person1.firstName = fname;
//    (8) person1 객체의 성, 이름과 성명의 길이를 출력한다.
    System.out.println(person1.getLength());
//    (9) "성을 입력하세요: ”라는 메시지를 출력한다.
    System.out.print("성을 입력하세요: ");
//    (10) 성을 읽어 들여 lname에 저장한다.
    lname = scanner.nextLine();
//    (11) "이름을 입력하세요: " 라는 메시지를 출력한다.
    System.out.print("이름을 입력하세요: ");
//    (12) 이름을 읽어 들여 fname에 저장한다.
    fname = scanner.nextLine();
//    (13) Person 객체를 생성하여 person2가 가리키게 한다.
    Person person2 = new Person();
//    (14) person2 객체의 성을 lname으로 한다
    person2.lastName = lname;
//    (15) person2 객체의 이름을 fname으로 한다
    person2.firstName = fname;
//    (16) person2 객체의 성, 이름과 성명의 길이를 출력한다.
    System.out.println(person2.getLength());
  }
}
