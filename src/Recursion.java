import java.util.*;

public class Recursion {

    public static void main (String[] args){
        Double n = Double.parseDouble(args[0]);
        System.out.println(String.format("%.2f", Fibonacci(n)));

    }
    public static Double Fibonacci(Double n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
}