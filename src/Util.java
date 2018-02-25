/**
 * Util class for common tasks within Project Euler
 */
public class Util {
  public static boolean isPrime(long n){
    for(long i = 2; i <= n/2 ; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
