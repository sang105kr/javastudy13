package exercise.chap7.q5;

// 가변길이 자료형 : 타입...  , 배열로 사용됨, 배개변수중 제일 마지막에 위치해야함
public class A {

//  void averageScore(int v1) {
//    System.out.println( (double)v1 / 1);
//  }
//  void averageScore(int v1,int v2) {
//    System.out.println( (double)(v1+v2) / 2);
//  }
//  void averageScore(int v1, int v2, int v3) {
//    System.out.println( (double)(v1+v2+v3) / 3);
//  }
//  void averageScore(int v1, int v2, int v3, int v4) {
//    System.out.println( (double)(v1+v2+v3+v4) / 4);
//  }

  void averageScore( String str,int... v) {
//    System.out.println(v.length); // 매개값 갯수확인
//    for (int i = 0; i < v.length; i++) {
//      System.out.printf("%s " , v[i]);
//    }
//    System.out.println();
    int sum = 0;
    for (int i = 0; i < v.length; i++) {
      sum += v[i];
    }
    double average = (double)sum / v.length;
    System.out.printf("%.1f",average);
    System.out.println();
  }
}
