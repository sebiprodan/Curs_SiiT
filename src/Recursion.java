import java.util.*;

public class Recursion {

    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        System.out.println(Fibonacci(n));

    }
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
}