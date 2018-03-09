import java.util.HashMap;

/**
 * Project Euler, Problem 17
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class P_017 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 1000; i++){
            System.out.printf("%d -> %s%n", i, toString(i));
            sb.append(toString(i));
        }
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }

    private static String toString(int n){
        if(numbers.containsKey(n) && n != 100){
            return numbers.get(n);
        }else if(n > 100){
            if(n % 100 == 0){
                return numbers.get(n/100) + "hundred";
            }
            return String.format("%shundredand%s", numbers.get(n/100), toString(n%100));
        }else if(n == 100){
            return "onehundred";
        }
        return  String.format("%s%s", get((n/10)*10), get(n%10));
    }

    private final static String get(int n){
        if(numbers.containsKey(n)){
            return numbers.get(n);
        }else{
            return "";
        }
    }

    private final static HashMap<Integer, String> numbers = new HashMap<Integer, String>(){{
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
        put(20, "twenty");
        put(30, "thirty");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
        put(100, "hundred");
        put(1000, "onethousand");
    }};
}
