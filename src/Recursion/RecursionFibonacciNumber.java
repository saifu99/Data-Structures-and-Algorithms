//Leetcode 509
public class RecursionFibonacciNumber {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            int last = fib(n - 1);
            int secondlast = fib(n - 2);
            return last + secondlast;
        }
    }

    public static void main(String[] args) {
        int n=4;    //0,1,1,2,3,5,8....
        System.out.println(fib(n));
    }
}

