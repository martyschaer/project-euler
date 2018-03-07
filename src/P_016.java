import java.math.BigInteger;

/**
 * Project Euler, Problem 016
 *
 * What's the sum of the digits of the number 2¹⁰⁰⁰
 */
public class P_016 {
    public static void main(String[] args) {
        BigInteger base = BigInteger.valueOf(2);
        int power = 1000;
        String result = base.pow(power).toString();

        long sum = 0;

        for(char c : result.toCharArray()){
            int i = Integer.valueOf(""+c);
            sum += i;
        }

        System.out.println(sum);
    }
}
