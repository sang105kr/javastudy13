package day6;

import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    System.out.println(arr);

    //case1)
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    //case2)
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    //case3)
    for (int i : arr) {
      System.out.println(i);
    }

    //case4)
    String str = Arrays.toString(arr);
    System.out.println(str);

    System.out.println(Arrays.toString(arr));
  }
}
