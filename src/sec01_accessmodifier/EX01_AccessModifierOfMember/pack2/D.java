package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {
  public void print() {
    //멤버 활용
    System.out.print(a + " ");
    System.out.print(b + " ");
//    System.out.print(c + " ");
//    System.out.print(d+ " ");
    System.out.println();
  }
}
