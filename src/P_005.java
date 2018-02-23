/**
 * Project Euler, Problem 005
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class P_005 {
    public static void main(String[] args) {
       int n = 1;
       while(!divisible(n)){
            n++;
       }
        System.out.println(n);

    }

    static boolean divisible(int n){
        for(int i = 11; i <= 20; i++){
            if(n % i != 0){
                return false;
            }
        }
        return true;
    }
}
