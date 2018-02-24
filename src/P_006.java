import java.util.stream.IntStream;

/**
 * Project Euler, Problem 006
 *
 * The sum of the squares of the first ten natural numbers is 385.
 * The square of the sum of the first ten natural numbers is 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 - 385 = 2640
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class P_006 {
  static long sumOfSquares = 0;
  static long squareOfSum = 0;
  static int n = 100;

  public static void main(String[] args) {
    IntStream.rangeClosed(1, n).forEach(i -> {
      sumOfSquares += (i * i);
      squareOfSum += i;
    });
    squareOfSum *= squareOfSum;

    System.out.println(squareOfSum - sumOfSquares);
  }
}
