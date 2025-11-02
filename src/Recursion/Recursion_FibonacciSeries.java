public class Recursion_FibonacciSeries {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int last = fibonacci(n - 1);
            int slast = fibonacci(n - 2);
            return last + slast;
        }
    }

    public static void main(String[] args) {
        int n=4;    //0,1,1,2,3,5,8....
        System.out.println(fibonacci(n));
    }
}

