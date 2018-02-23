import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project Euler, Problem 004
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P_004 {
    private static List<Long> palindromes = new ArrayList<>();
    public static void main(String[] args) {
        for(int i = 999; i > 99; i--){
            for(int j = 999; j > 99; j--){
                long num = i * j;
                String val = String.valueOf(num);
                if(val.equals(new StringBuilder(val).reverse().toString())){
                    palindromes.add(num);
                }
            }
        }
        Collections.sort(palindromes);
        System.out.println(palindromes.get(palindromes.size()-1));
    }
}
