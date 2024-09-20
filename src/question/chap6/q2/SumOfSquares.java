package question.chap6.q2;

public class SumOfSquares {
  int sumWhile(int n) {
    int i = 0;
    int result = 0;
    if(n > 0){
      while (i <= n) {
        result = result + i * i;
        i++;
      }
    }
    return result;
  }

  int sumRecursive(int n){
    if(n == 1) {
      return 1;
    }
    return sumRecursive(n-1) + n * n;
  }
}
