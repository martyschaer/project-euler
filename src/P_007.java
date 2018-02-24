/**
 * Project Euler, Problem 007
 *
 * What is the 10001st prime number?
 */
public class P_007 {

  public static void main(String[] args) {
    int i = 0;
    long n = 1;
    while(i < 10001){
      n++;
      if(isPrime(n)){
        i++;
      }
    }
    System.out.println(n);
  }

  static boolean isPrime(long n){
    for(long i = 2; i <= n/2 ; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
