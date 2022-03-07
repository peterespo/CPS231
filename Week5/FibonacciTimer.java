public class FibonacciTimer {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String args[]) {
        final long startTime = System.nanoTime();
        for(int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }


        final long elapsedTimeMillis = System.nanoTime() - startTime;
        System.out.println(elapsedTimeMillis/1000000 + " ms");
    }
}
