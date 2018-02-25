import java.time.LocalTime;
import java.util.*;

/**
 * Project Euler, Problem 014
 *
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 */
public class P_014 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    long maxSize = 0;
    long maxStart = 0;
    for(long i = 1; i < 1_000_000; i++){
      int size = 0;
      long current = i;
      do{
        size++;
        current = current % 2 == 0 ? current/2 : ((current * 3) + 1);
      }while (current != 1);
      size++;
      if(size > maxSize){
        maxSize = size;
        maxStart = i;
      }
    }
    System.out.printf("len=%d, start=%d%n", maxSize, maxStart);
    long stop = System.currentTimeMillis();
    LocalTime t = LocalTime.ofNanoOfDay((stop-start)*1000);
    System.out.printf("Took %d ms", t.getNano()/1000);
  }
}
