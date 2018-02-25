/**
 * Project Euler, Problem 010
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class P_010 {
  static int n = 2_000_000;
  public static void main(String[] args) {
    long sum = 0;
    for(int i = 2; i < n; i++){
      if(Util.isPrime(i)){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
