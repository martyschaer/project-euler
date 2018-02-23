import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project Euler, Problem 003
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P_003 {
    private static List<Long> factors = new ArrayList<>();

    public static void main(String[] args) {
        long n = 600851475143L;
        long factor = 2;
        while ( n > 1){
            if(n % factor == 0){
                factors.add(factor);
                n /= factor;
            }else{
                factor++;
            }
        }
        System.out.println(Collections.max(factors));
    }
}
