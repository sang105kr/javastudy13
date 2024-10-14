package day2;
// 문) 1~10까지의 총계를 구하는 프로그램을 작성하시오
//     (단, while문, do~while문, for문을 각각 이용)
public class Test7 {
  public static void main(String[] args) {
    int result1 = useWhile();
    int result2 = useDoWhile();
    int result3 = useFor();

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);
  }

  // while
  public static int useWhile(){
    int i = 1;
    int sum = 0;
    while (i <= 10) {
      i++;
      sum = sum + i;
    }
    return sum;
  }
  // doWhile
  public static int useDoWhile(){
    int i = 1;
    int sum = 0;
    do{
      sum += i;  // sum = sum + i;
      i++;
    }while (i <= 10);
    return sum;
  }
  // for
  public static int useFor(){
    int sum = 0;
    for (int i = 1; i <= 10 ; i++) {
      sum += i;  // sum = sum + i;
    }
    return sum;
  }

}
