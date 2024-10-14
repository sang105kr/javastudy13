package day11.exam1;

public class Student extends Person{
  private String hakbun;
  public Student(){
    super(); // 부모생성자 호출
  }
  public Student(String hakbun){
    //super();
    this.hakbun = hakbun;
  }

  void study(){
    System.out.println("공부하다");
  }
}
