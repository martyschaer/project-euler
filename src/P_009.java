/**
 * Project Euler, Problem 009
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
 * a^2 + b^2 = c^2
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class P_009 {
  static int n = 1000;
  public static void main(String[] args) {
    for(int c = 0; c < n; c++){
      for(int b = 0; b < c; b++){
        for(int a = 0; a < b; a++){
          if(sq(a) + sq(b) == sq(c) && a + b + c == n){
            System.out.println(a*b*c);
          }
        }
      }
    }
  }

  static int sq(int n){
    return n*n;
  }
}
