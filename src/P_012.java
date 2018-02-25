import java.util.stream.IntStream;

/**
 * Project Euler, Problem 012
 *
 * Smallest triangle number (7th triangle number = 7! = 28)
 * with 500 divisors.
 */
public class P_012 {
  public static void main(String[] args) {
    long factorial = 0;
    for(int i = 1; i < Integer.MAX_VALUE; i++){
      factorial = factorial(i);
      int divisors = 0;
      for(int test = 1; test <= factorial/2; test++){
        if(factorial % test == 0){
          divisors++;
        }
      }
      if(divisors >= 500){
        break;
      }
    }
    System.out.println(factorial);
  }

  static long factorial(int n){
    return IntStream.rangeClosed(1,n).sum();
  }
}
