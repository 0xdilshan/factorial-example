public class FactorialRecursion {

// Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
          return 1; // Base case
       }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
       int number = 5;
       long result = factorial(number);

       System.out.println("Factorial of " + number + " is: " + result);
    }
}