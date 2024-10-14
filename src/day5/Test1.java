package day5;

public class Test1 {
  public static void main(String[] args) {
    // 배열의 선언
    int[] arr;

    // 배열의 생성 및 초기화
    // 초기화 : int=>0, double=>0.0, boolean=>false, 참조형=>null
    arr = new int[3];

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
    System.out.println("==");

    // 배열참조변수.length : 배열의 길이
    System.out.println("arr.length = " + arr.length);

    // 배열의 요소는 for문을 통해 순차적으로 접근할 수 있다.
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("==");
    
    // 향상된 for문
    for( int value : arr ){
      System.out.println(value);
    }
  }
}
