package day11.exam1;
//import java.lang.*;
public class Person extends Object{
   private String name;
   private int age;
  Person(){
    super();
  }
   void smile(){
     System.out.println(name+"가 웃다");
   } 

   void eat(){
     System.out.println(name+"가 먹다");
   }

   public String toString(){
     return "이름 : " + name + " " + "나이 : " + age;
   }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
