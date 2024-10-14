package day2;
// 문) 1 ~ 10 까지의 짝수의 합을 구하는 프로그램을 작성하시오
public class Test5 {
  public static void main(String[] args) {

    int count = 0;
    int sum = 0;
    while(count <= 10){
      count = count + 1;
      if( count % 2 == 1) {
        sum = sum + count;
      }
    }
    System.out.println("1 ~ 10 까지의 합 = " + sum);
  }
}
