package question.chap6.q1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("첫번째 자연수 : ");
    int a = scanner.nextInt();
    System.out.print("두번째 자연수 : ");
    int b = scanner.nextInt();

    CalculateProduct cProduct = new CalculateProduct();
    int prod1 = cProduct.product1(a, b);
    int prod2 = cProduct.product2(a, b);
    int prod3 = cProduct.product3(a, b);

    System.out.println("prod1 = " + prod1);
    System.out.println("prod2 = " + prod2);
    System.out.println("prod3 = " + prod3);
  }
}
