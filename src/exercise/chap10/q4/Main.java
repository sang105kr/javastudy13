package exercise.chap10.q4;

public class Main {
  public static void main(String[] args) {
    A a1 = new A();
    B b1 = (B)a1; //
    B c1 = (C)a1; //
    B d1 = (D)a1; //
    B e1 = (E)a1; //

    A a2 = new B();
    B b2 = (B)a2; //
    B c2 = (C)a2; //
    B d2 = (D)a2; //
    B e2 = (E)a2; //

    A a3 = new C();
    B b3 = (B)a3; //
    B c3 = (C)a3; //
    B d3 = (D)a3; //
    B e3 = (E)a3; //
  }
}
